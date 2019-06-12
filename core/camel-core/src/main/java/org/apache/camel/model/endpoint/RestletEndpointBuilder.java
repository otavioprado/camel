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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * Component for consuming and producing Restful resources using Restlet.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestletEndpointBuilder {


    /**
     * Base class for the Restlet component builders.
     */
    public static class RestletCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        RestletCommonBuilder(String path) {
            super("restlet", path);
        }
        /**
         * The protocol to use which is http or https.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T protocol(String protocol) {
            this.properties.put("protocol", protocol);
            return (T) this;
        }
        /**
         * The hostname of the restlet service.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * The port number of the restlet service.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * The port number of the restlet service.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * The resource pattern such as /customer/{id}.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T uriPattern(String uriPattern) {
            this.properties.put("uriPattern", uriPattern);
            return (T) this;
        }
        /**
         * On a producer endpoint, specifies the request method to use. On a
         * consumer endpoint, specifies that the endpoint consumes only
         * restletMethod requests.
         * The option is a <code>org.restlet.data.Method</code> type.
         * @group common
         */
        public T restletMethod(Object restletMethod) {
            this.properties.put("restletMethod", restletMethod);
            return (T) this;
        }
        /**
         * On a producer endpoint, specifies the request method to use. On a
         * consumer endpoint, specifies that the endpoint consumes only
         * restletMethod requests.
         * The option will be converted to a
         * <code>org.restlet.data.Method</code> type.
         * @group common
         */
        public T restletMethod(String restletMethod) {
            this.properties.put("restletMethod", restletMethod);
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
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * The option is a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * @group advanced
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * @group advanced
         */
        public T headerFilterStrategy(String headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * To use a custom RestletBinding to bind between Restlet and Camel
         * message.
         * The option is a
         * <code>org.apache.camel.component.restlet.RestletBinding</code> type.
         * @group advanced
         */
        public T restletBinding(Object restletBinding) {
            this.properties.put("restletBinding", restletBinding);
            return (T) this;
        }
        /**
         * To use a custom RestletBinding to bind between Restlet and Camel
         * message.
         * The option will be converted to a
         * <code>org.apache.camel.component.restlet.RestletBinding</code> type.
         * @group advanced
         */
        public T restletBinding(String restletBinding) {
            this.properties.put("restletBinding", restletBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>java.lang.Boolean</code> type.
         * @group advanced
         */
        public T synchronous(Boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group advanced
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * To configure the security realms of restlet as a map.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.String&gt;</code> type.
         * @group security
         */
        public T restletRealm(Map<String, String> restletRealm) {
            this.properties.put("restletRealm", restletRealm);
            return (T) this;
        }
        /**
         * To configure the security realms of restlet as a map.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.String&gt;</code>
         * type.
         * @group security
         */
        public T restletRealm(String restletRealm) {
            this.properties.put("restletRealm", restletRealm);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        public T sslContextParameters(String sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the Restlet component.
     */
    public static class RestletConsumerBuilder
            extends
                RestletCommonBuilder<RestletConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public RestletConsumerBuilder(String path) {
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
        public RestletConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (RestletConsumerBuilder) this;
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
        public RestletConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (RestletConsumerBuilder) this;
        }
        /**
         * Specify one or more methods separated by commas (e.g.
         * restletMethods=post,put) to be serviced by a restlet consumer
         * endpoint. If both restletMethod and restletMethods options are
         * specified, the restletMethod setting is ignored. The possible methods
         * are: ALL,CONNECT,DELETE,GET,HEAD,OPTIONS,PATCH,POST,PUT,TRACE.
         * The option is a <code>org.restlet.data.Method[]</code> type.
         * @group consumer
         */
        public RestletConsumerBuilder restletMethods(Object[] restletMethods) {
            this.properties.put("restletMethods", restletMethods);
            return (RestletConsumerBuilder) this;
        }
        /**
         * Specify one or more methods separated by commas (e.g.
         * restletMethods=post,put) to be serviced by a restlet consumer
         * endpoint. If both restletMethod and restletMethods options are
         * specified, the restletMethod setting is ignored. The possible methods
         * are: ALL,CONNECT,DELETE,GET,HEAD,OPTIONS,PATCH,POST,PUT,TRACE.
         * The option will be converted to a
         * <code>org.restlet.data.Method[]</code> type.
         * @group consumer
         */
        public RestletConsumerBuilder restletMethods(String restletMethods) {
            this.properties.put("restletMethods", restletMethods);
            return (RestletConsumerBuilder) this;
        }
        /**
         * Determines whether or not the raw input stream from Restlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Restlet input
         * stream to support reading it multiple times to ensure Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultRestletBinding will copy the request input stream into a
         * stream cache and put it into message body if this option is false to
         * support reading the stream multiple times.
         * The option is a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public RestletConsumerBuilder disableStreamCache(
                boolean disableStreamCache) {
            this.properties.put("disableStreamCache", disableStreamCache);
            return (RestletConsumerBuilder) this;
        }
        /**
         * Determines whether or not the raw input stream from Restlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Restlet input
         * stream to support reading it multiple times to ensure Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultRestletBinding will copy the request input stream into a
         * stream cache and put it into message body if this option is false to
         * support reading the stream multiple times.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public RestletConsumerBuilder disableStreamCache(
                String disableStreamCache) {
            this.properties.put("disableStreamCache", disableStreamCache);
            return (RestletConsumerBuilder) this;
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
        public RestletConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (RestletConsumerBuilder) this;
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
        public RestletConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (RestletConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public RestletConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (RestletConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public RestletConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (RestletConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Restlet component.
     */
    public static class RestletProducerBuilder
            extends
                RestletCommonBuilder<RestletProducerBuilder>
            implements
                EndpointProducerBuilder {
        public RestletProducerBuilder(String path) {
            super(path);
        }
        /**
         * The Client will give up connection if the connection is timeout, 0
         * for unlimited wait.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public RestletProducerBuilder connectTimeout(int connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (RestletProducerBuilder) this;
        }
        /**
         * The Client will give up connection if the connection is timeout, 0
         * for unlimited wait.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public RestletProducerBuilder connectTimeout(String connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (RestletProducerBuilder) this;
        }
        /**
         * Configure a cookie handler to maintain a HTTP session.
         * The option is a
         * <code>org.apache.camel.http.common.cookie.CookieHandler</code> type.
         * @group producer
         */
        public RestletProducerBuilder cookieHandler(Object cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (RestletProducerBuilder) this;
        }
        /**
         * Configure a cookie handler to maintain a HTTP session.
         * The option will be converted to a
         * <code>org.apache.camel.http.common.cookie.CookieHandler</code> type.
         * @group producer
         */
        public RestletProducerBuilder cookieHandler(String cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (RestletProducerBuilder) this;
        }
        /**
         * The Client socket receive timeout, 0 for unlimited wait.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public RestletProducerBuilder socketTimeout(int socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (RestletProducerBuilder) this;
        }
        /**
         * The Client socket receive timeout, 0 for unlimited wait.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public RestletProducerBuilder socketTimeout(String socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (RestletProducerBuilder) this;
        }
        /**
         * Whether to throw exception on a producer failure. If this option is
         * false then the http status code is set as a message header which can
         * be checked if it has an error value.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public RestletProducerBuilder throwExceptionOnFailure(
                boolean throwExceptionOnFailure) {
            this.properties.put("throwExceptionOnFailure", throwExceptionOnFailure);
            return (RestletProducerBuilder) this;
        }
        /**
         * Whether to throw exception on a producer failure. If this option is
         * false then the http status code is set as a message header which can
         * be checked if it has an error value.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public RestletProducerBuilder throwExceptionOnFailure(
                String throwExceptionOnFailure) {
            this.properties.put("throwExceptionOnFailure", throwExceptionOnFailure);
            return (RestletProducerBuilder) this;
        }
        /**
         * Whether to auto close the stream representation as response from
         * calling a REST service using the restlet producer. If the response is
         * streaming and the option streamRepresentation is enabled then you may
         * want to auto close the InputStream from the streaming response to
         * ensure the input stream is closed when the Camel Exchange is done
         * being routed. However if you need to read the stream outside a Camel
         * route, you may need to not auto close the stream.
         * The option is a <code>boolean</code> type.
         * @group producer (advanced)
         */
        public RestletProducerBuilder autoCloseStream(boolean autoCloseStream) {
            this.properties.put("autoCloseStream", autoCloseStream);
            return (RestletProducerBuilder) this;
        }
        /**
         * Whether to auto close the stream representation as response from
         * calling a REST service using the restlet producer. If the response is
         * streaming and the option streamRepresentation is enabled then you may
         * want to auto close the InputStream from the streaming response to
         * ensure the input stream is closed when the Camel Exchange is done
         * being routed. However if you need to read the stream outside a Camel
         * route, you may need to not auto close the stream.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer (advanced)
         */
        public RestletProducerBuilder autoCloseStream(String autoCloseStream) {
            this.properties.put("autoCloseStream", autoCloseStream);
            return (RestletProducerBuilder) this;
        }
        /**
         * Whether to support stream representation as response from calling a
         * REST service using the restlet producer. If the response is streaming
         * then this option can be enabled to use an java.io.InputStream as the
         * message body on the Camel Message body. If using this option you may
         * want to enable the autoCloseStream option as well to ensure the input
         * stream is closed when the Camel Exchange is done being routed.
         * However if you need to read the stream outside a Camel route, you may
         * need to not auto close the stream.
         * The option is a <code>boolean</code> type.
         * @group producer (advanced)
         */
        public RestletProducerBuilder streamRepresentation(
                boolean streamRepresentation) {
            this.properties.put("streamRepresentation", streamRepresentation);
            return (RestletProducerBuilder) this;
        }
        /**
         * Whether to support stream representation as response from calling a
         * REST service using the restlet producer. If the response is streaming
         * then this option can be enabled to use an java.io.InputStream as the
         * message body on the Camel Message body. If using this option you may
         * want to enable the autoCloseStream option as well to ensure the input
         * stream is closed when the Camel Exchange is done being routed.
         * However if you need to read the stream outside a Camel route, you may
         * need to not auto close the stream.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer (advanced)
         */
        public RestletProducerBuilder streamRepresentation(
                String streamRepresentation) {
            this.properties.put("streamRepresentation", streamRepresentation);
            return (RestletProducerBuilder) this;
        }
    }
    /**
     * Component for consuming and producing Restful resources using Restlet.
     * Creates a builder to build a consumer endpoint for the Restlet component.
     */
    public default RestletConsumerBuilder fromRestlet(String path) {
        return new RestletConsumerBuilder(path);
    }
    /**
     * Component for consuming and producing Restful resources using Restlet.
     * Creates a builder to build a producer endpoint for the Restlet component.
     */
    public default RestletProducerBuilder toRestlet(String path) {
        return new RestletProducerBuilder(path);
    }
}