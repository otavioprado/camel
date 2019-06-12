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
 * The Thrift component allows to call and expose remote procedures (RPC) with
 * Apache Thrift data format and serialization mechanism
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ThriftEndpointBuilder {


    /**
     * Base class for the Thrift component builders.
     */
    public static class ThriftCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        ThriftCommonBuilder(String path) {
            super("thrift", path);
        }
        /**
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * The Thrift server port.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * The Thrift server port.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T service(String service) {
            this.properties.put("service", service);
            return (T) this;
        }
        /**
         * Protocol compression mechanism type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        public T compressionType(ThriftCompressionType compressionType) {
            this.properties.put("compressionType", compressionType);
            return (T) this;
        }
        /**
         * Protocol compression mechanism type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
         * type.
         * @group common
         */
        public T compressionType(String compressionType) {
            this.properties.put("compressionType", compressionType);
            return (T) this;
        }
        /**
         * Exchange protocol serialization type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        public T exchangeProtocol(ThriftExchangeProtocol exchangeProtocol) {
            this.properties.put("exchangeProtocol", exchangeProtocol);
            return (T) this;
        }
        /**
         * Exchange protocol serialization type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
         * type.
         * @group common
         */
        public T exchangeProtocol(String exchangeProtocol) {
            this.properties.put("exchangeProtocol", exchangeProtocol);
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
        /**
         * Security negotiation type.
         * The option is a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        public T negotiationType(ThriftNegotiationType negotiationType) {
            this.properties.put("negotiationType", negotiationType);
            return (T) this;
        }
        /**
         * Security negotiation type.
         * The option will be converted to a
         * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
         * type.
         * @group security
         */
        public T negotiationType(String negotiationType) {
            this.properties.put("negotiationType", negotiationType);
            return (T) this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        public T sslParameters(Object sslParameters) {
            this.properties.put("sslParameters", sslParameters);
            return (T) this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        public T sslParameters(String sslParameters) {
            this.properties.put("sslParameters", sslParameters);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the Thrift component.
     */
    public static class ThriftConsumerBuilder
            extends
                ThriftCommonBuilder<ThriftConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public ThriftConsumerBuilder(String path) {
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
        public ThriftConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (ThriftConsumerBuilder) this;
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
        public ThriftConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * Client timeout for consumers.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        public ThriftConsumerBuilder clientTimeout(int clientTimeout) {
            this.properties.put("clientTimeout", clientTimeout);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * Client timeout for consumers.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        public ThriftConsumerBuilder clientTimeout(String clientTimeout) {
            this.properties.put("clientTimeout", clientTimeout);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * The Thrift server consumer max thread pool size.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        public ThriftConsumerBuilder maxPoolSize(int maxPoolSize) {
            this.properties.put("maxPoolSize", maxPoolSize);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * The Thrift server consumer max thread pool size.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        public ThriftConsumerBuilder maxPoolSize(String maxPoolSize) {
            this.properties.put("maxPoolSize", maxPoolSize);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * The Thrift server consumer initial thread pool size.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        public ThriftConsumerBuilder poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * The Thrift server consumer initial thread pool size.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        public ThriftConsumerBuilder poolSize(String poolSize) {
            this.properties.put("poolSize", poolSize);
            return (ThriftConsumerBuilder) this;
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
        public ThriftConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (ThriftConsumerBuilder) this;
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
        public ThriftConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public ThriftConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (ThriftConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public ThriftConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (ThriftConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Thrift component.
     */
    public static class ThriftProducerBuilder
            extends
                ThriftCommonBuilder<ThriftProducerBuilder>
            implements
                EndpointProducerBuilder {
        public ThriftProducerBuilder(String path) {
            super(path);
        }
        /**
         * The Thrift invoked method name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public ThriftProducerBuilder method(String method) {
            this.properties.put("method", method);
            return (ThriftProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.thrift.ThriftCompressionType</code>
     * enum.
     */
    public static enum ThriftCompressionType {
        NONE, ZLIB;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.thrift.ThriftExchangeProtocol</code>
     * enum.
     */
    public static enum ThriftExchangeProtocol {
        BINARY, JSON, SJSON, COMPACT;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.thrift.ThriftNegotiationType</code>
     * enum.
     */
    public static enum ThriftNegotiationType {
        PLAINTEXT, SSL, SASL;
    }
    /**
     * The Thrift component allows to call and expose remote procedures (RPC)
     * with Apache Thrift data format and serialization mechanism Creates a
     * builder to build a consumer endpoint for the Thrift component.
     */
    public default ThriftConsumerBuilder fromThrift(String path) {
        return new ThriftConsumerBuilder(path);
    }
    /**
     * The Thrift component allows to call and expose remote procedures (RPC)
     * with Apache Thrift data format and serialization mechanism Creates a
     * builder to build a producer endpoint for the Thrift component.
     */
    public default ThriftProducerBuilder toThrift(String path) {
        return new ThriftProducerBuilder(path);
    }
}