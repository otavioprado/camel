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
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The direct-vm component provides direct, synchronous call to another endpoint
 * from any CamelContext in the same JVM.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DirectVmEndpointBuilder {


    /**
     * Base class for the Direct VM component builders.
     */
    public static class DirectVmCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        DirectVmCommonBuilder(String path) {
            super("direct-vm", path);
        }
        /**
         * Name of direct-vm endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T name(String name) {
            this.properties.put("name", name);
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
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T propagateProperties(boolean propagateProperties) {
            this.properties.put("propagateProperties", propagateProperties);
            return (T) this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T propagateProperties(String propagateProperties) {
            this.properties.put("propagateProperties", propagateProperties);
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
     * Builder for endpoint consumers for the Direct VM component.
     */
    public static class DirectVmConsumerBuilder
            extends
                DirectVmCommonBuilder<DirectVmConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public DirectVmConsumerBuilder(String path) {
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
        public DirectVmConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DirectVmConsumerBuilder) this;
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
        public DirectVmConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DirectVmConsumerBuilder) this;
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
        public DirectVmConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DirectVmConsumerBuilder) this;
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
        public DirectVmConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DirectVmConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public DirectVmConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DirectVmConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public DirectVmConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DirectVmConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Direct VM component.
     */
    public static class DirectVmProducerBuilder
            extends
                DirectVmCommonBuilder<DirectVmProducerBuilder>
            implements
                EndpointProducerBuilder {
        public DirectVmProducerBuilder(String path) {
            super(path);
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public DirectVmProducerBuilder block(boolean block) {
            this.properties.put("block", block);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public DirectVmProducerBuilder block(String block) {
            this.properties.put("block", block);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a Direct-VM endpoint with no active consumers.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public DirectVmProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            this.properties.put("failIfNoConsumers", failIfNoConsumers);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a Direct-VM endpoint with no active consumers.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public DirectVmProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            this.properties.put("failIfNoConsumers", failIfNoConsumers);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * The timeout value to use if block is enabled.
         * The option is a <code>long</code> type.
         * @group producer
         */
        public DirectVmProducerBuilder timeout(long timeout) {
            this.properties.put("timeout", timeout);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * The timeout value to use if block is enabled.
         * The option will be converted to a <code>long</code> type.
         * @group producer
         */
        public DirectVmProducerBuilder timeout(String timeout) {
            this.properties.put("timeout", timeout);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * Sets a HeaderFilterStrategy that will only be applied on producer
         * endpoints (on both directions: request and response). Default value:
         * none.
         * The option is a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * @group producer (advanced)
         */
        public DirectVmProducerBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (DirectVmProducerBuilder) this;
        }
        /**
         * Sets a HeaderFilterStrategy that will only be applied on producer
         * endpoints (on both directions: request and response). Default value:
         * none.
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * @group producer (advanced)
         */
        public DirectVmProducerBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (DirectVmProducerBuilder) this;
        }
    }
    /**
     * The direct-vm component provides direct, synchronous call to another
     * endpoint from any CamelContext in the same JVM. Creates a builder to
     * build a consumer endpoint for the Direct VM component.
     */
    public default DirectVmConsumerBuilder fromDirectVm(String path) {
        return new DirectVmConsumerBuilder(path);
    }
    /**
     * The direct-vm component provides direct, synchronous call to another
     * endpoint from any CamelContext in the same JVM. Creates a builder to
     * build a producer endpoint for the Direct VM component.
     */
    public default DirectVmProducerBuilder toDirectVm(String path) {
        return new DirectVmProducerBuilder(path);
    }
}