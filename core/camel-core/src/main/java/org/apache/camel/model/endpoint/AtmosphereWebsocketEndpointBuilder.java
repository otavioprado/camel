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
 * To exchange data with external Websocket clients using Atmosphere.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtmosphereWebsocketEndpointBuilder {


    /**
     * Base class for the Atmosphere Websocket component builders.
     */
    public static class AtmosphereWebsocketCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        AtmosphereWebsocketCommonBuilder(String path) {
            super("atmosphere-websocket", path);
        }
        /**
         * Name of websocket endpoint. The option is a
         * <code>java.lang.String</code> type.
         */
        public T servicePath(String servicePath) {
            this.properties.put("servicePath", servicePath);
            return (T) this;
        }
        /**
         * Whether to send to all (broadcast) or send to a single receiver. The
         * option is a <code>boolean</code> type.
         */
        public T sendToAll(boolean sendToAll) {
            this.properties.put("sendToAll", sendToAll);
            return (T) this;
        }
        /**
         * Whether to send to all (broadcast) or send to a single receiver. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T sendToAll(String sendToAll) {
            this.properties.put("sendToAll", sendToAll);
            return (T) this;
        }
        /**
         * To enable streaming to send data as multiple text fragments. The
         * option is a <code>boolean</code> type.
         */
        public T useStreaming(boolean useStreaming) {
            this.properties.put("useStreaming", useStreaming);
            return (T) this;
        }
        /**
         * To enable streaming to send data as multiple text fragments. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T useStreaming(String useStreaming) {
            this.properties.put("useStreaming", useStreaming);
            return (T) this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http/http4 producer will by default cache the
         * response body stream. If setting this option to true, then the
         * producers will not cache the response body stream but use the
         * response stream as-is as the message body. The option is a
         * <code>boolean</code> type.
         */
        public T disableStreamCache(boolean disableStreamCache) {
            this.properties.put("disableStreamCache", disableStreamCache);
            return (T) this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http/http4 producer will by default cache the
         * response body stream. If setting this option to true, then the
         * producers will not cache the response body stream but use the
         * response stream as-is as the message body. The option will be
         * converted to a <code>boolean</code> type.
         */
        public T disableStreamCache(String disableStreamCache) {
            this.properties.put("disableStreamCache", disableStreamCache);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         */
        public T headerFilterStrategy(String headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient. The option is a
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         */
        public T httpBinding(Object httpBinding) {
            this.properties.put("httpBinding", httpBinding);
            return (T) this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient. The option will be converted to a
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         */
        public T httpBinding(String httpBinding) {
            this.properties.put("httpBinding", httpBinding);
            return (T) this;
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response. The option is a
         * <code>boolean</code> type.
         */
        public T chunked(boolean chunked) {
            this.properties.put("chunked", chunked);
            return (T) this;
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response. The option will be
         * converted to a <code>boolean</code> type.
         */
        public T chunked(String chunked) {
            this.properties.put("chunked", chunked);
            return (T) this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk. The option is a <code>boolean</code> type.
         */
        public T transferException(boolean transferException) {
            this.properties.put("transferException", transferException);
            return (T) this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk. The option will be converted to a <code>boolean</code> type.
         */
        public T transferException(String transferException) {
            this.properties.put("transferException", transferException);
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
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping. The option is a <code>boolean</code> type.
         */
        public T mapHttpMessageBody(boolean mapHttpMessageBody) {
            this.properties.put("mapHttpMessageBody", mapHttpMessageBody);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping. The option will be converted to a <code>boolean</code> type.
         */
        public T mapHttpMessageBody(String mapHttpMessageBody) {
            this.properties.put("mapHttpMessageBody", mapHttpMessageBody);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping. The option is a <code>boolean</code>
         * type.
         */
        public T mapHttpMessageFormUrlEncodedBody(
                boolean mapHttpMessageFormUrlEncodedBody) {
            this.properties.put("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T mapHttpMessageFormUrlEncodedBody(
                String mapHttpMessageFormUrlEncodedBody) {
            this.properties.put("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping. The option is a <code>boolean</code> type.
         */
        public T mapHttpMessageHeaders(boolean mapHttpMessageHeaders) {
            this.properties.put("mapHttpMessageHeaders", mapHttpMessageHeaders);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T mapHttpMessageHeaders(String mapHttpMessageHeaders) {
            this.properties.put("mapHttpMessageHeaders", mapHttpMessageHeaders);
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
     * Builder for endpoint consumers for the Atmosphere Websocket component.
     */
    public static class AtmosphereWebsocketConsumerBuilder
            extends
                AtmosphereWebsocketCommonBuilder<AtmosphereWebsocketConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public AtmosphereWebsocketConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Configure the consumer to work in async mode. The option is a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder async(boolean async) {
            this.properties.put("async", async);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Configure the consumer to work in async mode. The option will be
         * converted to a <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder async(String async) {
            this.properties.put("async", async);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Used to only allow consuming if the HttpMethod matches, such as
         * GET/POST/PUT etc. Multiple methods can be specified separated by
         * comma. The option is a <code>java.lang.String</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder httpMethodRestrict(
                String httpMethodRestrict) {
            this.properties.put("httpMethodRestrict", httpMethodRestrict);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found. The option is a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder matchOnUriPrefix(
                boolean matchOnUriPrefix) {
            this.properties.put("matchOnUriPrefix", matchOnUriPrefix);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found. The option will
         * be converted to a <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder matchOnUriPrefix(
                String matchOnUriPrefix) {
            this.properties.put("matchOnUriPrefix", matchOnUriPrefix);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * To use a custom buffer size on the javax.servlet.ServletResponse. The
         * option is a <code>java.lang.Integer</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder responseBufferSize(
                Integer responseBufferSize) {
            this.properties.put("responseBufferSize", responseBufferSize);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * To use a custom buffer size on the javax.servlet.ServletResponse. The
         * option will be converted to a <code>java.lang.Integer</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder responseBufferSize(
                String responseBufferSize) {
            this.properties.put("responseBufferSize", responseBufferSize);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Name of the servlet to use. The option is a
         * <code>java.lang.String</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder servletName(String servletName) {
            this.properties.put("servletName", servletName);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whether to automatic bind multipart/form-data as attachments on the
         * Camel Exchange. The options attachmentMultipartBinding=true and
         * disableStreamCache=false cannot work together. Remove
         * disableStreamCache to use AttachmentMultipartBinding. This is turn
         * off by default as this may require servlet specific configuration to
         * enable this when using Servlet's. The option is a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder attachmentMultipartBinding(
                boolean attachmentMultipartBinding) {
            this.properties.put("attachmentMultipartBinding", attachmentMultipartBinding);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whether to automatic bind multipart/form-data as attachments on the
         * Camel Exchange. The options attachmentMultipartBinding=true and
         * disableStreamCache=false cannot work together. Remove
         * disableStreamCache to use AttachmentMultipartBinding. This is turn
         * off by default as this may require servlet specific configuration to
         * enable this when using Servlet's. The option will be converted to a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder attachmentMultipartBinding(
                String attachmentMultipartBinding) {
            this.properties.put("attachmentMultipartBinding", attachmentMultipartBinding);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whether to eager check whether the HTTP requests has content if the
         * content-length header is 0 or not present. This can be turned on in
         * case HTTP clients do not send streamed data. The option is a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder eagerCheckContentAvailable(
                boolean eagerCheckContentAvailable) {
            this.properties.put("eagerCheckContentAvailable", eagerCheckContentAvailable);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whether to eager check whether the HTTP requests has content if the
         * content-length header is 0 or not present. This can be turned on in
         * case HTTP clients do not send streamed data. The option will be
         * converted to a <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder eagerCheckContentAvailable(
                String eagerCheckContentAvailable) {
            this.properties.put("eagerCheckContentAvailable", eagerCheckContentAvailable);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public AtmosphereWebsocketConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Whitelist of accepted filename extensions for accepting uploaded
         * files. Multiple extensions can be separated by comma, such as
         * txt,xml. The option is a <code>java.lang.String</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder fileNameExtWhitelist(
                String fileNameExtWhitelist) {
            this.properties.put("fileNameExtWhitelist", fileNameExtWhitelist);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Specifies whether to enable HTTP OPTIONS for this Servlet consumer.
         * By default OPTIONS is turned off. The option is a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder optionsEnabled(
                boolean optionsEnabled) {
            this.properties.put("optionsEnabled", optionsEnabled);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Specifies whether to enable HTTP OPTIONS for this Servlet consumer.
         * By default OPTIONS is turned off. The option will be converted to a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder optionsEnabled(
                String optionsEnabled) {
            this.properties.put("optionsEnabled", optionsEnabled);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Specifies whether to enable HTTP TRACE for this Servlet consumer. By
         * default TRACE is turned off. The option is a <code>boolean</code>
         * type.
         */
        public AtmosphereWebsocketConsumerBuilder traceEnabled(
                boolean traceEnabled) {
            this.properties.put("traceEnabled", traceEnabled);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
        /**
         * Specifies whether to enable HTTP TRACE for this Servlet consumer. By
         * default TRACE is turned off. The option will be converted to a
         * <code>boolean</code> type.
         */
        public AtmosphereWebsocketConsumerBuilder traceEnabled(
                String traceEnabled) {
            this.properties.put("traceEnabled", traceEnabled);
            return (AtmosphereWebsocketConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Atmosphere Websocket component.
     */
    public static class AtmosphereWebsocketProducerBuilder
            extends
                AtmosphereWebsocketCommonBuilder<AtmosphereWebsocketProducerBuilder>
            implements
                EndpointProducerBuilder {
        public AtmosphereWebsocketProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * To exchange data with external Websocket clients using Atmosphere.
     * Creates a builder to build a consumer endpoint for the Atmosphere
     * Websocket component.
     */
    public default AtmosphereWebsocketConsumerBuilder fromAtmosphereWebsocket(
            String path) {
        return new AtmosphereWebsocketConsumerBuilder(path);
    }
    /**
     * To exchange data with external Websocket clients using Atmosphere.
     * Creates a builder to build a producer endpoint for the Atmosphere
     * Websocket component.
     */
    public default AtmosphereWebsocketProducerBuilder toAtmosphereWebsocket(
            String path) {
        return new AtmosphereWebsocketProducerBuilder(path);
    }
}