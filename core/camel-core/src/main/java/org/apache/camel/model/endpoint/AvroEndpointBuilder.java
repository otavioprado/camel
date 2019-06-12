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
 * Working with Apache Avro for data serialization.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AvroEndpointBuilder {


    /**
     * Base class for the Avro component builders.
     */
    public static class AvroCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        AvroCommonBuilder(String path) {
            super("avro", path);
        }
        /**
         * Transport to use, can be either http or netty.
         * The option is a
         * <code>org.apache.camel.component.avro.AvroTransport</code> type.
         * @group common
         */
        public T transport(AvroTransport transport) {
            this.properties.put("transport", transport);
            return (T) this;
        }
        /**
         * Transport to use, can be either http or netty.
         * The option will be converted to a
         * <code>org.apache.camel.component.avro.AvroTransport</code> type.
         * @group common
         */
        public T transport(String transport) {
            this.properties.put("transport", transport);
            return (T) this;
        }
        /**
         * Port number to use.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Port number to use.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Hostname to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * The name of the message to send.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T messageName(String messageName) {
            this.properties.put("messageName", messageName);
            return (T) this;
        }
        /**
         * Avro protocol to use.
         * The option is a <code>org.apache.avro.Protocol</code> type.
         * @group common
         */
        public T protocol(Object protocol) {
            this.properties.put("protocol", protocol);
            return (T) this;
        }
        /**
         * Avro protocol to use.
         * The option will be converted to a
         * <code>org.apache.avro.Protocol</code> type.
         * @group common
         */
        public T protocol(String protocol) {
            this.properties.put("protocol", protocol);
            return (T) this;
        }
        /**
         * Avro protocol to use defined by the FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T protocolClassName(String protocolClassName) {
            this.properties.put("protocolClassName", protocolClassName);
            return (T) this;
        }
        /**
         * Avro protocol location.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T protocolLocation(String protocolLocation) {
            this.properties.put("protocolLocation", protocolLocation);
            return (T) this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T reflectionProtocol(boolean reflectionProtocol) {
            this.properties.put("reflectionProtocol", reflectionProtocol);
            return (T) this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T reflectionProtocol(String reflectionProtocol) {
            this.properties.put("reflectionProtocol", reflectionProtocol);
            return (T) this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T singleParameter(boolean singleParameter) {
            this.properties.put("singleParameter", singleParameter);
            return (T) this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T singleParameter(String singleParameter) {
            this.properties.put("singleParameter", singleParameter);
            return (T) this;
        }
        /**
         * Authority to use (username and password).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T uriAuthority(String uriAuthority) {
            this.properties.put("uriAuthority", uriAuthority);
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
     * Builder for endpoint consumers for the Avro component.
     */
    public static class AvroConsumerBuilder
            extends
                AvroCommonBuilder<AvroConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public AvroConsumerBuilder(String path) {
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
        public AvroConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AvroConsumerBuilder) this;
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
        public AvroConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AvroConsumerBuilder) this;
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
        public AvroConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AvroConsumerBuilder) this;
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
        public AvroConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AvroConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public AvroConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AvroConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public AvroConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AvroConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Avro component.
     */
    public static class AvroProducerBuilder
            extends
                AvroCommonBuilder<AvroProducerBuilder>
            implements
                EndpointProducerBuilder {
        public AvroProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.avro.AvroTransport</code>
     * enum.
     */
    public static enum AvroTransport {
        http, netty;
    }
    /**
     * Working with Apache Avro for data serialization. Creates a builder to
     * build a consumer endpoint for the Avro component.
     */
    public default AvroConsumerBuilder fromAvro(String path) {
        return new AvroConsumerBuilder(path);
    }
    /**
     * Working with Apache Avro for data serialization. Creates a builder to
     * build a producer endpoint for the Avro component.
     */
    public default AvroProducerBuilder toAvro(String path) {
        return new AvroProducerBuilder(path);
    }
}