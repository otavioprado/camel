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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The jgroups component provides exchange of messages between Camel and JGroups
 * clusters.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JGroupsEndpointBuilder {


    /**
     * Base class for the JGroups component builders.
     */
    public static class JGroupsCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        JGroupsCommonBuilder(String path) {
            super("jgroups", path);
        }
        /**
         * The name of the JGroups cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T clusterName(String clusterName) {
            this.properties.put("clusterName", clusterName);
            return (T) this;
        }
        /**
         * Specifies configuration properties of the JChannel used by the
         * endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T channelProperties(String channelProperties) {
            this.properties.put("channelProperties", channelProperties);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the JGroups component.
     */
    public static class JGroupsConsumerBuilder
            extends
                JGroupsCommonBuilder<JGroupsConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public JGroupsConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public JGroupsConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public JGroupsConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * If set to true, the consumer endpoint will receive org.jgroups.View
         * messages as well (not only org.jgroups.Message instances). By default
         * only regular messages are consumed by the endpoint.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public JGroupsConsumerBuilder enableViewMessages(
                boolean enableViewMessages) {
            this.properties.put("enableViewMessages", enableViewMessages);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * If set to true, the consumer endpoint will receive org.jgroups.View
         * messages as well (not only org.jgroups.Message instances). By default
         * only regular messages are consumed by the endpoint.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public JGroupsConsumerBuilder enableViewMessages(
                String enableViewMessages) {
            this.properties.put("enableViewMessages", enableViewMessages);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        public JGroupsConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        public JGroupsConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public JGroupsConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JGroupsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public JGroupsConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JGroupsConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the JGroups component.
     */
    public static class JGroupsProducerBuilder
            extends
                JGroupsCommonBuilder<JGroupsProducerBuilder>
            implements
                EndpointProducerBuilder {
        public JGroupsProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The jgroups component provides exchange of messages between Camel and
     * JGroups clusters. Creates a builder to build a consumer endpoint for the
     * JGroups component.
     */
    public default JGroupsConsumerBuilder fromJGroups(String path) {
        return new JGroupsConsumerBuilder(path);
    }
    /**
     * The jgroups component provides exchange of messages between Camel and
     * JGroups clusters. Creates a builder to build a producer endpoint for the
     * JGroups component.
     */
    public default JGroupsProducerBuilder toJGroups(String path) {
        return new JGroupsProducerBuilder(path);
    }
}