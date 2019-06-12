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
 * The cxf component is used for SOAP WebServices using Apache CXF.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CxfEndpointBuilder {


    /**
     * Base class for the CXF component builders.
     */
    public static class CxfCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        CxfCommonBuilder(String path) {
            super("cxf", path);
        }
        /**
         * To lookup an existing configured CxfEndpoint. Must used bean: as
         * prefix.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T beanId(String beanId) {
            this.properties.put("beanId", beanId);
            return (T) this;
        }
        /**
         * The service publish address.
         * The option is a <code>java.lang.String</code> type.
         * @group service
         */
        public T address(String address) {
            this.properties.put("address", address);
            return (T) this;
        }
        /**
         * The data type messages supported by the CXF endpoint.
         * The option is a
         * <code>org.apache.camel.component.cxf.DataFormat</code> type.
         * @group common
         */
        public T dataFormat(DataFormat dataFormat) {
            this.properties.put("dataFormat", dataFormat);
            return (T) this;
        }
        /**
         * The data type messages supported by the CXF endpoint.
         * The option will be converted to a
         * <code>org.apache.camel.component.cxf.DataFormat</code> type.
         * @group common
         */
        public T dataFormat(String dataFormat) {
            this.properties.put("dataFormat", dataFormat);
            return (T) this;
        }
        /**
         * The WSDL style that describes how parameters are represented in the
         * SOAP body. If the value is false, CXF will chose the document-literal
         * unwrapped style, If the value is true, CXF will chose the
         * document-literal wrapped style.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public T wrappedStyle(Boolean wrappedStyle) {
            this.properties.put("wrappedStyle", wrappedStyle);
            return (T) this;
        }
        /**
         * The WSDL style that describes how parameters are represented in the
         * SOAP body. If the value is false, CXF will chose the document-literal
         * unwrapped style, If the value is true, CXF will chose the
         * document-literal wrapped style.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public T wrappedStyle(String wrappedStyle) {
            this.properties.put("wrappedStyle", wrappedStyle);
            return (T) this;
        }
        /**
         * This option controls whether the CXF component, when running in
         * PAYLOAD mode, will DOM parse the incoming messages into DOM Elements
         * or keep the payload as a javax.xml.transform.Source object that would
         * allow streaming in some cases.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group advanced
         */
        public T allowStreaming(Boolean allowStreaming) {
            this.properties.put("allowStreaming", allowStreaming);
            return (T) this;
        }
        /**
         * This option controls whether the CXF component, when running in
         * PAYLOAD mode, will DOM parse the incoming messages into DOM Elements
         * or keep the payload as a javax.xml.transform.Source object that would
         * allow streaming in some cases.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group advanced
         */
        public T allowStreaming(String allowStreaming) {
            this.properties.put("allowStreaming", allowStreaming);
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
         * To use a custom configured CXF Bus.
         * The option is a <code>org.apache.cxf.Bus</code> type.
         * @group advanced
         */
        public T bus(Object bus) {
            this.properties.put("bus", bus);
            return (T) this;
        }
        /**
         * To use a custom configured CXF Bus.
         * The option will be converted to a <code>org.apache.cxf.Bus</code>
         * type.
         * @group advanced
         */
        public T bus(String bus) {
            this.properties.put("bus", bus);
            return (T) this;
        }
        /**
         * This option is used to set the CXF continuation timeout which could
         * be used in CxfConsumer by default when the CXF server is using Jetty
         * or Servlet transport.
         * The option is a <code>long</code> type.
         * @group advanced
         */
        public T continuationTimeout(long continuationTimeout) {
            this.properties.put("continuationTimeout", continuationTimeout);
            return (T) this;
        }
        /**
         * This option is used to set the CXF continuation timeout which could
         * be used in CxfConsumer by default when the CXF server is using Jetty
         * or Servlet transport.
         * The option will be converted to a <code>long</code> type.
         * @group advanced
         */
        public T continuationTimeout(String continuationTimeout) {
            this.properties.put("continuationTimeout", continuationTimeout);
            return (T) this;
        }
        /**
         * To use a custom CxfBinding to control the binding between Camel
         * Message and CXF Message.
         * The option is a
         * <code>org.apache.camel.component.cxf.CxfBinding</code> type.
         * @group advanced
         */
        public T cxfBinding(Object cxfBinding) {
            this.properties.put("cxfBinding", cxfBinding);
            return (T) this;
        }
        /**
         * To use a custom CxfBinding to control the binding between Camel
         * Message and CXF Message.
         * The option will be converted to a
         * <code>org.apache.camel.component.cxf.CxfBinding</code> type.
         * @group advanced
         */
        public T cxfBinding(String cxfBinding) {
            this.properties.put("cxfBinding", cxfBinding);
            return (T) this;
        }
        /**
         * This option could apply the implementation of
         * org.apache.camel.component.cxf.CxfEndpointConfigurer which supports
         * to configure the CXF endpoint in programmatic way. User can configure
         * the CXF server and client by implementing configure{ServerClient}
         * method of CxfEndpointConfigurer.
         * The option is a
         * <code>org.apache.camel.component.cxf.CxfEndpointConfigurer</code>
         * type.
         * @group advanced
         */
        public T cxfEndpointConfigurer(Object cxfEndpointConfigurer) {
            this.properties.put("cxfEndpointConfigurer", cxfEndpointConfigurer);
            return (T) this;
        }
        /**
         * This option could apply the implementation of
         * org.apache.camel.component.cxf.CxfEndpointConfigurer which supports
         * to configure the CXF endpoint in programmatic way. User can configure
         * the CXF server and client by implementing configure{ServerClient}
         * method of CxfEndpointConfigurer.
         * The option will be converted to a
         * <code>org.apache.camel.component.cxf.CxfEndpointConfigurer</code>
         * type.
         * @group advanced
         */
        public T cxfEndpointConfigurer(String cxfEndpointConfigurer) {
            this.properties.put("cxfEndpointConfigurer", cxfEndpointConfigurer);
            return (T) this;
        }
        /**
         * Will set the default bus when CXF endpoint create a bus by itself.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T defaultBus(boolean defaultBus) {
            this.properties.put("defaultBus", defaultBus);
            return (T) this;
        }
        /**
         * Will set the default bus when CXF endpoint create a bus by itself.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T defaultBus(String defaultBus) {
            this.properties.put("defaultBus", defaultBus);
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
         * Whether to merge protocol headers. If enabled then propagating
         * headers between Camel and CXF becomes more consistent and similar.
         * For more details see CAMEL-6393.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T mergeProtocolHeaders(boolean mergeProtocolHeaders) {
            this.properties.put("mergeProtocolHeaders", mergeProtocolHeaders);
            return (T) this;
        }
        /**
         * Whether to merge protocol headers. If enabled then propagating
         * headers between Camel and CXF becomes more consistent and similar.
         * For more details see CAMEL-6393.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T mergeProtocolHeaders(String mergeProtocolHeaders) {
            this.properties.put("mergeProtocolHeaders", mergeProtocolHeaders);
            return (T) this;
        }
        /**
         * To enable MTOM (attachments). This requires to use POJO or PAYLOAD
         * data format mode.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T mtomEnabled(boolean mtomEnabled) {
            this.properties.put("mtomEnabled", mtomEnabled);
            return (T) this;
        }
        /**
         * To enable MTOM (attachments). This requires to use POJO or PAYLOAD
         * data format mode.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T mtomEnabled(String mtomEnabled) {
            this.properties.put("mtomEnabled", mtomEnabled);
            return (T) this;
        }
        /**
         * To set additional CXF options using the key/value pairs from the Map.
         * For example to turn on stacktraces in SOAP faults,
         * properties.faultStackTraceEnabled=true.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group advanced
         */
        public T properties(Map<String, Object> properties) {
            this.properties.put("properties", properties);
            return (T) this;
        }
        /**
         * To set additional CXF options using the key/value pairs from the Map.
         * For example to turn on stacktraces in SOAP faults,
         * properties.faultStackTraceEnabled=true.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        public T properties(String properties) {
            this.properties.put("properties", properties);
            return (T) this;
        }
        /**
         * Sets whether SOAP message validation should be disabled.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T skipPayloadMessagePartCheck(boolean skipPayloadMessagePartCheck) {
            this.properties.put("skipPayloadMessagePartCheck", skipPayloadMessagePartCheck);
            return (T) this;
        }
        /**
         * Sets whether SOAP message validation should be disabled.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T skipPayloadMessagePartCheck(String skipPayloadMessagePartCheck) {
            this.properties.put("skipPayloadMessagePartCheck", skipPayloadMessagePartCheck);
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
         * This option enables CXF Logging Feature which writes inbound and
         * outbound SOAP messages to log.
         * The option is a <code>boolean</code> type.
         * @group logging
         */
        public T loggingFeatureEnabled(boolean loggingFeatureEnabled) {
            this.properties.put("loggingFeatureEnabled", loggingFeatureEnabled);
            return (T) this;
        }
        /**
         * This option enables CXF Logging Feature which writes inbound and
         * outbound SOAP messages to log.
         * The option will be converted to a <code>boolean</code> type.
         * @group logging
         */
        public T loggingFeatureEnabled(String loggingFeatureEnabled) {
            this.properties.put("loggingFeatureEnabled", loggingFeatureEnabled);
            return (T) this;
        }
        /**
         * To limit the total size of number of bytes the logger will output
         * when logging feature has been enabled and -1 for no limit.
         * The option is a <code>int</code> type.
         * @group logging
         */
        public T loggingSizeLimit(int loggingSizeLimit) {
            this.properties.put("loggingSizeLimit", loggingSizeLimit);
            return (T) this;
        }
        /**
         * To limit the total size of number of bytes the logger will output
         * when logging feature has been enabled and -1 for no limit.
         * The option will be converted to a <code>int</code> type.
         * @group logging
         */
        public T loggingSizeLimit(String loggingSizeLimit) {
            this.properties.put("loggingSizeLimit", loggingSizeLimit);
            return (T) this;
        }
        /**
         * This option controls whether the PhaseInterceptorChain skips logging
         * the Fault that it catches.
         * The option is a <code>boolean</code> type.
         * @group logging
         */
        public T skipFaultLogging(boolean skipFaultLogging) {
            this.properties.put("skipFaultLogging", skipFaultLogging);
            return (T) this;
        }
        /**
         * This option controls whether the PhaseInterceptorChain skips logging
         * the Fault that it catches.
         * The option will be converted to a <code>boolean</code> type.
         * @group logging
         */
        public T skipFaultLogging(String skipFaultLogging) {
            this.properties.put("skipFaultLogging", skipFaultLogging);
            return (T) this;
        }
        /**
         * This option is used to set the basic authentication information of
         * password for the CXF client.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * This option is used to set the basic authentication information of
         * username for the CXF client.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
        /**
         * The bindingId for the service model to use.
         * The option is a <code>java.lang.String</code> type.
         * @group service
         */
        public T bindingId(String bindingId) {
            this.properties.put("bindingId", bindingId);
            return (T) this;
        }
        /**
         * The endpoint name this service is implementing, it maps to the
         * wsdl:portname. In the format of ns:PORT_NAME where ns is a namespace
         * prefix valid at this scope.
         * The option is a <code>java.lang.String</code> type.
         * @group service
         */
        public T portName(String portName) {
            this.properties.put("portName", portName);
            return (T) this;
        }
        /**
         * This option can override the endpointUrl that published from the WSDL
         * which can be accessed with service address url plus wsd.
         * The option is a <code>java.lang.String</code> type.
         * @group service
         */
        public T publishedEndpointUrl(String publishedEndpointUrl) {
            this.properties.put("publishedEndpointUrl", publishedEndpointUrl);
            return (T) this;
        }
        /**
         * The class name of the SEI (Service Endpoint Interface) class which
         * could have JSR181 annotation or not.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group service
         */
        public T serviceClass(Class<Object> serviceClass) {
            this.properties.put("serviceClass", serviceClass);
            return (T) this;
        }
        /**
         * The class name of the SEI (Service Endpoint Interface) class which
         * could have JSR181 annotation or not.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group service
         */
        public T serviceClass(String serviceClass) {
            this.properties.put("serviceClass", serviceClass);
            return (T) this;
        }
        /**
         * The service name this service is implementing, it maps to the
         * wsdl:servicename.
         * The option is a <code>java.lang.String</code> type.
         * @group service
         */
        public T serviceName(String serviceName) {
            this.properties.put("serviceName", serviceName);
            return (T) this;
        }
        /**
         * The location of the WSDL. Can be on the classpath, file system, or be
         * hosted remotely.
         * The option is a <code>java.lang.String</code> type.
         * @group service
         */
        public T wsdlURL(String wsdlURL) {
            this.properties.put("wsdlURL", wsdlURL);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the CXF component.
     */
    public static class CxfConsumerBuilder
            extends
                CxfCommonBuilder<CxfConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public CxfConsumerBuilder(String path) {
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
        public CxfConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CxfConsumerBuilder) this;
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
        public CxfConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CxfConsumerBuilder) this;
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
        public CxfConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CxfConsumerBuilder) this;
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
        public CxfConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CxfConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public CxfConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CxfConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public CxfConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CxfConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the CXF component.
     */
    public static class CxfProducerBuilder
            extends
                CxfCommonBuilder<CxfProducerBuilder>
            implements
                EndpointProducerBuilder {
        public CxfProducerBuilder(String path) {
            super(path);
        }
        /**
         * Configure a cookie handler to maintain a HTTP session.
         * The option is a
         * <code>org.apache.camel.http.common.cookie.CookieHandler</code> type.
         * @group producer
         */
        public CxfProducerBuilder cookieHandler(Object cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (CxfProducerBuilder) this;
        }
        /**
         * Configure a cookie handler to maintain a HTTP session.
         * The option will be converted to a
         * <code>org.apache.camel.http.common.cookie.CookieHandler</code> type.
         * @group producer
         */
        public CxfProducerBuilder cookieHandler(String cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (CxfProducerBuilder) this;
        }
        /**
         * This option will set the default operationName that will be used by
         * the CxfProducer which invokes the remote service.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public CxfProducerBuilder defaultOperationName(
                String defaultOperationName) {
            this.properties.put("defaultOperationName", defaultOperationName);
            return (CxfProducerBuilder) this;
        }
        /**
         * This option will set the default operationNamespace that will be used
         * by the CxfProducer which invokes the remote service.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public CxfProducerBuilder defaultOperationNamespace(
                String defaultOperationNamespace) {
            this.properties.put("defaultOperationNamespace", defaultOperationNamespace);
            return (CxfProducerBuilder) this;
        }
        /**
         * The hostname verifier to be used. Use the # notation to reference a
         * HostnameVerifier from the registry.
         * The option is a <code>javax.net.ssl.HostnameVerifier</code> type.
         * @group producer
         */
        public CxfProducerBuilder hostnameVerifier(Object hostnameVerifier) {
            this.properties.put("hostnameVerifier", hostnameVerifier);
            return (CxfProducerBuilder) this;
        }
        /**
         * The hostname verifier to be used. Use the # notation to reference a
         * HostnameVerifier from the registry.
         * The option will be converted to a
         * <code>javax.net.ssl.HostnameVerifier</code> type.
         * @group producer
         */
        public CxfProducerBuilder hostnameVerifier(String hostnameVerifier) {
            this.properties.put("hostnameVerifier", hostnameVerifier);
            return (CxfProducerBuilder) this;
        }
        /**
         * The Camel SSL setting reference. Use the # notation to reference the
         * SSL Context.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group producer
         */
        public CxfProducerBuilder sslContextParameters(
                Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (CxfProducerBuilder) this;
        }
        /**
         * The Camel SSL setting reference. Use the # notation to reference the
         * SSL Context.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group producer
         */
        public CxfProducerBuilder sslContextParameters(
                String sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (CxfProducerBuilder) this;
        }
        /**
         * Which kind of operation that CXF endpoint producer will invoke.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public CxfProducerBuilder wrapped(boolean wrapped) {
            this.properties.put("wrapped", wrapped);
            return (CxfProducerBuilder) this;
        }
        /**
         * Which kind of operation that CXF endpoint producer will invoke.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public CxfProducerBuilder wrapped(String wrapped) {
            this.properties.put("wrapped", wrapped);
            return (CxfProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.cxf.DataFormat</code>
     * enum.
     */
    public static enum DataFormat {
        PAYLOAD, RAW, MESSAGE, CXF_MESSAGE, POJO;
    }
    /**
     * The cxf component is used for SOAP WebServices using Apache CXF. Creates
     * a builder to build a consumer endpoint for the CXF component.
     */
    public default CxfConsumerBuilder fromCxf(String path) {
        return new CxfConsumerBuilder(path);
    }
    /**
     * The cxf component is used for SOAP WebServices using Apache CXF. Creates
     * a builder to build a producer endpoint for the CXF component.
     */
    public default CxfProducerBuilder toCxf(String path) {
        return new CxfProducerBuilder(path);
    }
}