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
 * The cometd component is a transport for working with the Jetty implementation
 * of the cometd/bayeux protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CometdEndpointBuilder {


    /**
     * Base class for the CometD component builders.
     */
    public static class CometdCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        CometdCommonBuilder(String path) {
            super("cometd", path);
        }
        /**
         * Hostname.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Host port number.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Host port number.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * The channelName represents a topic that can be subscribed to by the
         * Camel endpoints.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T channelName(String channelName) {
            this.properties.put("channelName", channelName);
            return (T) this;
        }
        /**
         * The origins domain that support to cross, if the crosssOriginFilterOn
         * is true.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T allowedOrigins(String allowedOrigins) {
            this.properties.put("allowedOrigins", allowedOrigins);
            return (T) this;
        }
        /**
         * The root directory for the web resources or classpath. Use the
         * protocol file: or classpath: depending if you want that the component
         * loads the resource from file system or classpath. Classpath is
         * required for OSGI deployment where the resources are packaged in the
         * jar.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T baseResource(String baseResource) {
            this.properties.put("baseResource", baseResource);
            return (T) this;
        }
        /**
         * If true, the server will support for cross-domain filtering.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T crossOriginFilterOn(boolean crossOriginFilterOn) {
            this.properties.put("crossOriginFilterOn", crossOriginFilterOn);
            return (T) this;
        }
        /**
         * If true, the server will support for cross-domain filtering.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T crossOriginFilterOn(String crossOriginFilterOn) {
            this.properties.put("crossOriginFilterOn", crossOriginFilterOn);
            return (T) this;
        }
        /**
         * The filterPath will be used by the CrossOriginFilter, if the
         * crosssOriginFilterOn is true.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T filterPath(String filterPath) {
            this.properties.put("filterPath", filterPath);
            return (T) this;
        }
        /**
         * The client side poll timeout in milliseconds. How long a client will
         * wait between reconnects.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T interval(int interval) {
            this.properties.put("interval", interval);
            return (T) this;
        }
        /**
         * The client side poll timeout in milliseconds. How long a client will
         * wait between reconnects.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T interval(String interval) {
            this.properties.put("interval", interval);
            return (T) this;
        }
        /**
         * If true, the server will accept JSON wrapped in a comment and will
         * generate JSON wrapped in a comment. This is a defence against Ajax
         * Hijacking.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T jsonCommented(boolean jsonCommented) {
            this.properties.put("jsonCommented", jsonCommented);
            return (T) this;
        }
        /**
         * If true, the server will accept JSON wrapped in a comment and will
         * generate JSON wrapped in a comment. This is a defence against Ajax
         * Hijacking.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T jsonCommented(String jsonCommented) {
            this.properties.put("jsonCommented", jsonCommented);
            return (T) this;
        }
        /**
         * Logging level. 0=none, 1=info, 2=debug.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T logLevel(int logLevel) {
            this.properties.put("logLevel", logLevel);
            return (T) this;
        }
        /**
         * Logging level. 0=none, 1=info, 2=debug.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T logLevel(String logLevel) {
            this.properties.put("logLevel", logLevel);
            return (T) this;
        }
        /**
         * The max client side poll timeout in milliseconds. A client will be
         * removed if a connection is not received in this time.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T maxInterval(int maxInterval) {
            this.properties.put("maxInterval", maxInterval);
            return (T) this;
        }
        /**
         * The max client side poll timeout in milliseconds. A client will be
         * removed if a connection is not received in this time.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T maxInterval(String maxInterval) {
            this.properties.put("maxInterval", maxInterval);
            return (T) this;
        }
        /**
         * The client side poll timeout, if multiple connections are detected
         * from the same browser.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T multiFrameInterval(int multiFrameInterval) {
            this.properties.put("multiFrameInterval", multiFrameInterval);
            return (T) this;
        }
        /**
         * The client side poll timeout, if multiple connections are detected
         * from the same browser.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T multiFrameInterval(String multiFrameInterval) {
            this.properties.put("multiFrameInterval", multiFrameInterval);
            return (T) this;
        }
        /**
         * The server side poll timeout in milliseconds. This is how long the
         * server will hold a reconnect request before responding.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T timeout(int timeout) {
            this.properties.put("timeout", timeout);
            return (T) this;
        }
        /**
         * The server side poll timeout in milliseconds. This is how long the
         * server will hold a reconnect request before responding.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T timeout(String timeout) {
            this.properties.put("timeout", timeout);
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
     * Builder for endpoint consumers for the CometD component.
     */
    public static class CometdConsumerBuilder
            extends
                CometdCommonBuilder<CometdConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public CometdConsumerBuilder(String path) {
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
        public CometdConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CometdConsumerBuilder) this;
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
        public CometdConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CometdConsumerBuilder) this;
        }
        /**
         * Whether to include the server session headers in the Camel message
         * when creating a Camel Message for incoming requests.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public CometdConsumerBuilder sessionHeadersEnabled(
                boolean sessionHeadersEnabled) {
            this.properties.put("sessionHeadersEnabled", sessionHeadersEnabled);
            return (CometdConsumerBuilder) this;
        }
        /**
         * Whether to include the server session headers in the Camel message
         * when creating a Camel Message for incoming requests.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public CometdConsumerBuilder sessionHeadersEnabled(
                String sessionHeadersEnabled) {
            this.properties.put("sessionHeadersEnabled", sessionHeadersEnabled);
            return (CometdConsumerBuilder) this;
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
        public CometdConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CometdConsumerBuilder) this;
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
        public CometdConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CometdConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public CometdConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CometdConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public CometdConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CometdConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the CometD component.
     */
    public static class CometdProducerBuilder
            extends
                CometdCommonBuilder<CometdProducerBuilder>
            implements
                EndpointProducerBuilder {
        public CometdProducerBuilder(String path) {
            super(path);
        }
        /**
         * Whether to disconnect local sessions after publishing a message to
         * its channel. Disconnecting local session is needed as they are not
         * swept by default by CometD, and therefore you can run out of memory.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public CometdProducerBuilder disconnectLocalSession(
                boolean disconnectLocalSession) {
            this.properties.put("disconnectLocalSession", disconnectLocalSession);
            return (CometdProducerBuilder) this;
        }
        /**
         * Whether to disconnect local sessions after publishing a message to
         * its channel. Disconnecting local session is needed as they are not
         * swept by default by CometD, and therefore you can run out of memory.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public CometdProducerBuilder disconnectLocalSession(
                String disconnectLocalSession) {
            this.properties.put("disconnectLocalSession", disconnectLocalSession);
            return (CometdProducerBuilder) this;
        }
    }
    /**
     * The cometd component is a transport for working with the Jetty
     * implementation of the cometd/bayeux protocol. Creates a builder to build
     * a consumer endpoint for the CometD component.
     */
    public default CometdConsumerBuilder fromCometd(String path) {
        return new CometdConsumerBuilder(path);
    }
    /**
     * The cometd component is a transport for working with the Jetty
     * implementation of the cometd/bayeux protocol. Creates a builder to build
     * a producer endpoint for the CometD component.
     */
    public default CometdProducerBuilder toCometd(String path) {
        return new CometdProducerBuilder(path);
    }
}