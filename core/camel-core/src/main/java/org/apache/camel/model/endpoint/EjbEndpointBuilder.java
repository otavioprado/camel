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
package org.apache.camel.model.endpoint;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The ejb component is for invoking EJB Java beans from Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EjbEndpointBuilder {


    /**
     * Base class for the EJB component builders.
     */
    public static class EjbCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        EjbCommonBuilder(String path) {
            super("ejb", path);
        }
        /**
         * Sets the name of the bean to invoke. The option is a
         * <code>java.lang.String</code> type.
         */
        public T beanName(String beanName) {
            this.properties.put("beanName", beanName);
            return (T) this;
        }
        /**
         * Sets the name of the method to invoke on the bean. The option is a
         * <code>java.lang.String</code> type.
         */
        public T method(String method) {
            this.properties.put("method", method);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a <code>boolean</code> type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * If enabled, Camel will cache the result of the first Registry
         * look-up. Cache can be enabled if the bean in the Registry is defined
         * as a singleton scope. The option is a <code>java.lang.Boolean</code>
         * type.
         */
        public T cache(Boolean cache) {
            this.properties.put("cache", cache);
            return (T) this;
        }
        /**
         * If enabled, Camel will cache the result of the first Registry
         * look-up. Cache can be enabled if the bean in the Registry is defined
         * as a singleton scope. The option will be converted to a
         * <code>java.lang.Boolean</code> type.
         */
        public T cache(String cache) {
            this.properties.put("cache", cache);
            return (T) this;
        }
        /**
         * Used for configuring additional properties on the bean. The option is
         * a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public T parameters(Map<String, Object> parameters) {
            this.properties.put("parameters", parameters);
            return (T) this;
        }
        /**
         * Used for configuring additional properties on the bean. The option
         * will be converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public T parameters(String parameters) {
            this.properties.put("parameters", parameters);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a <code>boolean</code> type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a <code>boolean</code> type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint producers for the EJB component.
     */
    public static class EjbProducerBuilder
            extends
                EjbCommonBuilder<EjbProducerBuilder>
            implements
                EndpointProducerBuilder {
        public EjbProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The ejb component is for invoking EJB Java beans from Camel. Creates a
     * builder to build a producer endpoint for the EJB component.
     */
    public default EjbProducerBuilder toEjb(String path) {
        return new EjbProducerBuilder(path);
    }
}