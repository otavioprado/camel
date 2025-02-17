/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor;

import org.apache.camel.AsyncCallback;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.Traceable;
import org.apache.camel.spi.IdAware;
import org.apache.camel.spi.RouteIdAware;
import org.apache.camel.spi.VariableRepository;
import org.apache.camel.spi.VariableRepositoryFactory;
import org.apache.camel.support.AsyncProcessorSupport;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.StringHelper;

/**
 * A processor which sets the variable with an {@link Expression}
 */
public class SetVariableProcessor extends AsyncProcessorSupport implements Traceable, IdAware, RouteIdAware, CamelContextAware {

    private CamelContext camelContext;
    private String id;
    private String routeId;
    private final Expression variableName;
    private final Expression expression;
    private VariableRepositoryFactory factory;

    public SetVariableProcessor(Expression variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
        ObjectHelper.notNull(variableName, "variableName");
        ObjectHelper.notNull(expression, "expression");
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public boolean process(Exchange exchange, AsyncCallback callback) {
        try {
            Object newVariable = expression.evaluate(exchange, Object.class);

            if (exchange.getException() != null) {
                // the expression threw an exception so we should break-out
                callback.done(true);
                return true;
            }

            String key = variableName.evaluate(exchange, String.class);
            String id = StringHelper.before(key, ":");
            if (id != null) {
                VariableRepository repo = factory.getVariableRepository(id);
                if (repo != null) {
                    key = StringHelper.after(key, ":");
                    repo.setVariable(key, newVariable);
                } else {
                    exchange.setException(
                            new IllegalArgumentException("VariableRepository with id: " + id + " does not exist"));
                }
            } else {
                exchange.setVariable(key, newVariable);
            }
        } catch (Exception e) {
            exchange.setException(e);
        }

        callback.done(true);
        return true;
    }

    @Override
    protected void doBuild() throws Exception {
        super.doBuild();
        factory = getCamelContext().getCamelContextExtension().getContextPlugin(VariableRepositoryFactory.class);
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public String getTraceLabel() {
        return "setVariable[" + variableName + ", " + expression + "]";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getRouteId() {
        return routeId;
    }

    @Override
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getVariableName() {
        return variableName.toString();
    }

    public Expression getExpression() {
        return expression;
    }

}
