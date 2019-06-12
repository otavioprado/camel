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

import java.net.URI;
import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * To send and receive messages using the SIP protocol (used in telco and
 * mobile).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SipEndpointBuilder {


    /**
     * Base class for the SIP component builders.
     */
    public static class SipCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        SipCommonBuilder(String path) {
            super("sip", path);
        }
        /**
         * URI of the SIP server to connect to (the username and password can be
         * included such as: john:secretmyserver:9999). The option is a
         * <code>java.net.URI</code> type.
         */
        public T uri(URI uri) {
            this.properties.put("uri", uri);
            return (T) this;
        }
        /**
         * URI of the SIP server to connect to (the username and password can be
         * included such as: john:secretmyserver:9999). The option will be
         * converted to a <code>java.net.URI</code> type.
         */
        public T uri(String uri) {
            this.properties.put("uri", uri);
            return (T) this;
        }
        /**
         * Should connections be cached by the SipStack to reduce cost of
         * connection creation. This is useful if the connection is used for
         * long running conversations. The option is a <code>boolean</code>
         * type.
         */
        public T cacheConnections(boolean cacheConnections) {
            this.properties.put("cacheConnections", cacheConnections);
            return (T) this;
        }
        /**
         * Should connections be cached by the SipStack to reduce cost of
         * connection creation. This is useful if the connection is used for
         * long running conversations. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T cacheConnections(String cacheConnections) {
            this.properties.put("cacheConnections", cacheConnections);
            return (T) this;
        }
        /**
         * Setting for contentSubType can be set to any valid MimeSubType. The
         * option is a <code>java.lang.String</code> type.
         */
        public T contentSubType(String contentSubType) {
            this.properties.put("contentSubType", contentSubType);
            return (T) this;
        }
        /**
         * Setting for contentType can be set to any valid MimeType. The option
         * is a <code>java.lang.String</code> type.
         */
        public T contentType(String contentType) {
            this.properties.put("contentType", contentType);
            return (T) this;
        }
        /**
         * Setting for a String based event type. The option is a
         * <code>java.lang.String</code> type.
         */
        public T eventHeaderName(String eventHeaderName) {
            this.properties.put("eventHeaderName", eventHeaderName);
            return (T) this;
        }
        /**
         * Setting for a String based event Id. Mandatory setting unless a
         * registry based FromHeader is specified. The option is a
         * <code>java.lang.String</code> type.
         */
        public T eventId(String eventId) {
            this.properties.put("eventId", eventId);
            return (T) this;
        }
        /**
         * Hostname of the message originator. Mandatory setting unless a
         * registry based FromHeader is specified. The option is a
         * <code>java.lang.String</code> type.
         */
        public T fromHost(String fromHost) {
            this.properties.put("fromHost", fromHost);
            return (T) this;
        }
        /**
         * Port of the message originator. Mandatory setting unless a registry
         * based FromHeader is specified. The option is a <code>int</code> type.
         */
        public T fromPort(int fromPort) {
            this.properties.put("fromPort", fromPort);
            return (T) this;
        }
        /**
         * Port of the message originator. Mandatory setting unless a registry
         * based FromHeader is specified. The option will be converted to a
         * <code>int</code> type.
         */
        public T fromPort(String fromPort) {
            this.properties.put("fromPort", fromPort);
            return (T) this;
        }
        /**
         * Username of the message originator. Mandatory setting unless a
         * registry based custom FromHeader is specified. The option is a
         * <code>java.lang.String</code> type.
         */
        public T fromUser(String fromUser) {
            this.properties.put("fromUser", fromUser);
            return (T) this;
        }
        /**
         * The amount of time a message received at an endpoint is considered
         * valid. The option is a <code>int</code> type.
         */
        public T msgExpiration(int msgExpiration) {
            this.properties.put("msgExpiration", msgExpiration);
            return (T) this;
        }
        /**
         * The amount of time a message received at an endpoint is considered
         * valid. The option will be converted to a <code>int</code> type.
         */
        public T msgExpiration(String msgExpiration) {
            this.properties.put("msgExpiration", msgExpiration);
            return (T) this;
        }
        /**
         * Setting for specifying amount of time to wait for a Response and/or
         * Acknowledgement can be received from another SIP stack. The option is
         * a <code>long</code> type.
         */
        public T receiveTimeoutMillis(long receiveTimeoutMillis) {
            this.properties.put("receiveTimeoutMillis", receiveTimeoutMillis);
            return (T) this;
        }
        /**
         * Setting for specifying amount of time to wait for a Response and/or
         * Acknowledgement can be received from another SIP stack. The option
         * will be converted to a <code>long</code> type.
         */
        public T receiveTimeoutMillis(String receiveTimeoutMillis) {
            this.properties.put("receiveTimeoutMillis", receiveTimeoutMillis);
            return (T) this;
        }
        /**
         * Name of the SIP Stack instance associated with an SIP Endpoint. The
         * option is a <code>java.lang.String</code> type.
         */
        public T stackName(String stackName) {
            this.properties.put("stackName", stackName);
            return (T) this;
        }
        /**
         * Hostname of the message receiver. Mandatory setting unless a registry
         * based ToHeader is specified. The option is a
         * <code>java.lang.String</code> type.
         */
        public T toHost(String toHost) {
            this.properties.put("toHost", toHost);
            return (T) this;
        }
        /**
         * Portname of the message receiver. Mandatory setting unless a registry
         * based ToHeader is specified. The option is a <code>int</code> type.
         */
        public T toPort(int toPort) {
            this.properties.put("toPort", toPort);
            return (T) this;
        }
        /**
         * Portname of the message receiver. Mandatory setting unless a registry
         * based ToHeader is specified. The option will be converted to a
         * <code>int</code> type.
         */
        public T toPort(String toPort) {
            this.properties.put("toPort", toPort);
            return (T) this;
        }
        /**
         * Username of the message receiver. Mandatory setting unless a registry
         * based custom ToHeader is specified. The option is a
         * <code>java.lang.String</code> type.
         */
        public T toUser(String toUser) {
            this.properties.put("toUser", toUser);
            return (T) this;
        }
        /**
         * Setting for choice of transport protocol. Valid choices are tcp or
         * udp. The option is a <code>java.lang.String</code> type.
         */
        public T transport(String transport) {
            this.properties.put("transport", transport);
            return (T) this;
        }
        /**
         * To use a custom AddressFactory. The option is a
         * <code>javax.sip.address.AddressFactory</code> type.
         */
        public T addressFactory(Object addressFactory) {
            this.properties.put("addressFactory", addressFactory);
            return (T) this;
        }
        /**
         * To use a custom AddressFactory. The option will be converted to a
         * <code>javax.sip.address.AddressFactory</code> type.
         */
        public T addressFactory(String addressFactory) {
            this.properties.put("addressFactory", addressFactory);
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
         * A custom Header object containing call details. Must implement the
         * type javax.sip.header.CallIdHeader. The option is a
         * <code>javax.sip.header.CallIdHeader</code> type.
         */
        public T callIdHeader(Object callIdHeader) {
            this.properties.put("callIdHeader", callIdHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing call details. Must implement the
         * type javax.sip.header.CallIdHeader. The option will be converted to a
         * <code>javax.sip.header.CallIdHeader</code> type.
         */
        public T callIdHeader(String callIdHeader) {
            this.properties.put("callIdHeader", callIdHeader);
            return (T) this;
        }
        /**
         * An optional custom Header object containing verbose contact details
         * (email, phone number etc). Must implement the type
         * javax.sip.header.ContactHeader. The option is a
         * <code>javax.sip.header.ContactHeader</code> type.
         */
        public T contactHeader(Object contactHeader) {
            this.properties.put("contactHeader", contactHeader);
            return (T) this;
        }
        /**
         * An optional custom Header object containing verbose contact details
         * (email, phone number etc). Must implement the type
         * javax.sip.header.ContactHeader. The option will be converted to a
         * <code>javax.sip.header.ContactHeader</code> type.
         */
        public T contactHeader(String contactHeader) {
            this.properties.put("contactHeader", contactHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message content details. Must
         * implement the type javax.sip.header.ContentTypeHeader. The option is
         * a <code>javax.sip.header.ContentTypeHeader</code> type.
         */
        public T contentTypeHeader(Object contentTypeHeader) {
            this.properties.put("contentTypeHeader", contentTypeHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message content details. Must
         * implement the type javax.sip.header.ContentTypeHeader. The option
         * will be converted to a
         * <code>javax.sip.header.ContentTypeHeader</code> type.
         */
        public T contentTypeHeader(String contentTypeHeader) {
            this.properties.put("contentTypeHeader", contentTypeHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing event details. Must implement the
         * type javax.sip.header.EventHeader. The option is a
         * <code>javax.sip.header.EventHeader</code> type.
         */
        public T eventHeader(Object eventHeader) {
            this.properties.put("eventHeader", eventHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing event details. Must implement the
         * type javax.sip.header.EventHeader. The option will be converted to a
         * <code>javax.sip.header.EventHeader</code> type.
         */
        public T eventHeader(String eventHeader) {
            this.properties.put("eventHeader", eventHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message expiration details. Must
         * implement the type javax.sip.header.ExpiresHeader. The option is a
         * <code>javax.sip.header.ExpiresHeader</code> type.
         */
        public T expiresHeader(Object expiresHeader) {
            this.properties.put("expiresHeader", expiresHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message expiration details. Must
         * implement the type javax.sip.header.ExpiresHeader. The option will be
         * converted to a <code>javax.sip.header.ExpiresHeader</code> type.
         */
        public T expiresHeader(String expiresHeader) {
            this.properties.put("expiresHeader", expiresHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing user/application specific details.
         * Must implement the type javax.sip.header.ExtensionHeader. The option
         * is a <code>javax.sip.header.ExtensionHeader</code> type.
         */
        public T extensionHeader(Object extensionHeader) {
            this.properties.put("extensionHeader", extensionHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing user/application specific details.
         * Must implement the type javax.sip.header.ExtensionHeader. The option
         * will be converted to a <code>javax.sip.header.ExtensionHeader</code>
         * type.
         */
        public T extensionHeader(String extensionHeader) {
            this.properties.put("extensionHeader", extensionHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message originator settings. Must
         * implement the type javax.sip.header.FromHeader. The option is a
         * <code>javax.sip.header.FromHeader</code> type.
         */
        public T fromHeader(Object fromHeader) {
            this.properties.put("fromHeader", fromHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message originator settings. Must
         * implement the type javax.sip.header.FromHeader. The option will be
         * converted to a <code>javax.sip.header.FromHeader</code> type.
         */
        public T fromHeader(String fromHeader) {
            this.properties.put("fromHeader", fromHeader);
            return (T) this;
        }
        /**
         * To use a custom HeaderFactory. The option is a
         * <code>javax.sip.header.HeaderFactory</code> type.
         */
        public T headerFactory(Object headerFactory) {
            this.properties.put("headerFactory", headerFactory);
            return (T) this;
        }
        /**
         * To use a custom HeaderFactory. The option will be converted to a
         * <code>javax.sip.header.HeaderFactory</code> type.
         */
        public T headerFactory(String headerFactory) {
            this.properties.put("headerFactory", headerFactory);
            return (T) this;
        }
        /**
         * To use a custom ListeningPoint implementation. The option is a
         * <code>javax.sip.ListeningPoint</code> type.
         */
        public T listeningPoint(Object listeningPoint) {
            this.properties.put("listeningPoint", listeningPoint);
            return (T) this;
        }
        /**
         * To use a custom ListeningPoint implementation. The option will be
         * converted to a <code>javax.sip.ListeningPoint</code> type.
         */
        public T listeningPoint(String listeningPoint) {
            this.properties.put("listeningPoint", listeningPoint);
            return (T) this;
        }
        /**
         * A custom Header object containing details on maximum proxy forwards.
         * This header places a limit on the viaHeaders possible. Must implement
         * the type javax.sip.header.MaxForwardsHeader. The option is a
         * <code>javax.sip.header.MaxForwardsHeader</code> type.
         */
        public T maxForwardsHeader(Object maxForwardsHeader) {
            this.properties.put("maxForwardsHeader", maxForwardsHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing details on maximum proxy forwards.
         * This header places a limit on the viaHeaders possible. Must implement
         * the type javax.sip.header.MaxForwardsHeader. The option will be
         * converted to a <code>javax.sip.header.MaxForwardsHeader</code> type.
         */
        public T maxForwardsHeader(String maxForwardsHeader) {
            this.properties.put("maxForwardsHeader", maxForwardsHeader);
            return (T) this;
        }
        /**
         * Setting for maximum allowed Message size in bytes. The option is a
         * <code>int</code> type.
         */
        public T maxMessageSize(int maxMessageSize) {
            this.properties.put("maxMessageSize", maxMessageSize);
            return (T) this;
        }
        /**
         * Setting for maximum allowed Message size in bytes. The option will be
         * converted to a <code>int</code> type.
         */
        public T maxMessageSize(String maxMessageSize) {
            this.properties.put("maxMessageSize", maxMessageSize);
            return (T) this;
        }
        /**
         * To use a custom MessageFactory. The option is a
         * <code>javax.sip.message.MessageFactory</code> type.
         */
        public T messageFactory(Object messageFactory) {
            this.properties.put("messageFactory", messageFactory);
            return (T) this;
        }
        /**
         * To use a custom MessageFactory. The option will be converted to a
         * <code>javax.sip.message.MessageFactory</code> type.
         */
        public T messageFactory(String messageFactory) {
            this.properties.put("messageFactory", messageFactory);
            return (T) this;
        }
        /**
         * To use a custom SipFactory to create the SipStack to be used. The
         * option is a <code>javax.sip.SipFactory</code> type.
         */
        public T sipFactory(Object sipFactory) {
            this.properties.put("sipFactory", sipFactory);
            return (T) this;
        }
        /**
         * To use a custom SipFactory to create the SipStack to be used. The
         * option will be converted to a <code>javax.sip.SipFactory</code> type.
         */
        public T sipFactory(String sipFactory) {
            this.properties.put("sipFactory", sipFactory);
            return (T) this;
        }
        /**
         * To use a custom SipStack. The option is a
         * <code>javax.sip.SipStack</code> type.
         */
        public T sipStack(Object sipStack) {
            this.properties.put("sipStack", sipStack);
            return (T) this;
        }
        /**
         * To use a custom SipStack. The option will be converted to a
         * <code>javax.sip.SipStack</code> type.
         */
        public T sipStack(String sipStack) {
            this.properties.put("sipStack", sipStack);
            return (T) this;
        }
        /**
         * To use a custom SipURI. If none configured, then the SipUri fallback
         * to use the options toUser toHost:toPort. The option is a
         * <code>javax.sip.address.SipURI</code> type.
         */
        public T sipUri(Object sipUri) {
            this.properties.put("sipUri", sipUri);
            return (T) this;
        }
        /**
         * To use a custom SipURI. If none configured, then the SipUri fallback
         * to use the options toUser toHost:toPort. The option will be converted
         * to a <code>javax.sip.address.SipURI</code> type.
         */
        public T sipUri(String sipUri) {
            this.properties.put("sipUri", sipUri);
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
        /**
         * A custom Header object containing message receiver settings. Must
         * implement the type javax.sip.header.ToHeader. The option is a
         * <code>javax.sip.header.ToHeader</code> type.
         */
        public T toHeader(Object toHeader) {
            this.properties.put("toHeader", toHeader);
            return (T) this;
        }
        /**
         * A custom Header object containing message receiver settings. Must
         * implement the type javax.sip.header.ToHeader. The option will be
         * converted to a <code>javax.sip.header.ToHeader</code> type.
         */
        public T toHeader(String toHeader) {
            this.properties.put("toHeader", toHeader);
            return (T) this;
        }
        /**
         * List of custom Header objects of the type javax.sip.header.ViaHeader.
         * Each ViaHeader containing a proxy address for request forwarding.
         * (Note this header is automatically updated by each proxy when the
         * request arrives at its listener). The option is a
         * <code>java.util.List&lt;javax.sip.header.ViaHeader&gt;</code> type.
         */
        public T viaHeaders(List<Object> viaHeaders) {
            this.properties.put("viaHeaders", viaHeaders);
            return (T) this;
        }
        /**
         * List of custom Header objects of the type javax.sip.header.ViaHeader.
         * Each ViaHeader containing a proxy address for request forwarding.
         * (Note this header is automatically updated by each proxy when the
         * request arrives at its listener). The option will be converted to a
         * <code>java.util.List&lt;javax.sip.header.ViaHeader&gt;</code> type.
         */
        public T viaHeaders(String viaHeaders) {
            this.properties.put("viaHeaders", viaHeaders);
            return (T) this;
        }
        /**
         * Name of client debug log file to use for logging. The option is a
         * <code>java.lang.String</code> type.
         */
        public T implementationDebugLogFile(String implementationDebugLogFile) {
            this.properties.put("implementationDebugLogFile", implementationDebugLogFile);
            return (T) this;
        }
        /**
         * Name of server log file to use for logging. The option is a
         * <code>java.lang.String</code> type.
         */
        public T implementationServerLogFile(String implementationServerLogFile) {
            this.properties.put("implementationServerLogFile", implementationServerLogFile);
            return (T) this;
        }
        /**
         * Logging level for tracing. The option is a
         * <code>java.lang.String</code> type.
         */
        public T implementationTraceLevel(String implementationTraceLevel) {
            this.properties.put("implementationTraceLevel", implementationTraceLevel);
            return (T) this;
        }
        /**
         * Number of maximum proxy forwards. The option is a <code>int</code>
         * type.
         */
        public T maxForwards(int maxForwards) {
            this.properties.put("maxForwards", maxForwards);
            return (T) this;
        }
        /**
         * Number of maximum proxy forwards. The option will be converted to a
         * <code>int</code> type.
         */
        public T maxForwards(String maxForwards) {
            this.properties.put("maxForwards", maxForwards);
            return (T) this;
        }
        /**
         * This setting is used when requests are sent to the Presence Agent via
         * a proxy. The option is a <code>boolean</code> type.
         */
        public T useRouterForAllUris(boolean useRouterForAllUris) {
            this.properties.put("useRouterForAllUris", useRouterForAllUris);
            return (T) this;
        }
        /**
         * This setting is used when requests are sent to the Presence Agent via
         * a proxy. The option will be converted to a <code>boolean</code> type.
         */
        public T useRouterForAllUris(String useRouterForAllUris) {
            this.properties.put("useRouterForAllUris", useRouterForAllUris);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the SIP component.
     */
    public static class SipConsumerBuilder
            extends
                SipCommonBuilder<SipConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public SipConsumerBuilder(String path) {
            super(path);
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
        public SipConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SipConsumerBuilder) this;
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
        public SipConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SipConsumerBuilder) this;
        }
        /**
         * This setting is used to determine whether the kind of header
         * (FromHeader,ToHeader etc) that needs to be created for this endpoint.
         * The option is a <code>boolean</code> type.
         */
        public SipConsumerBuilder consumer(boolean consumer) {
            this.properties.put("consumer", consumer);
            return (SipConsumerBuilder) this;
        }
        /**
         * This setting is used to determine whether the kind of header
         * (FromHeader,ToHeader etc) that needs to be created for this endpoint.
         * The option will be converted to a <code>boolean</code> type.
         */
        public SipConsumerBuilder consumer(String consumer) {
            this.properties.put("consumer", consumer);
            return (SipConsumerBuilder) this;
        }
        /**
         * This setting is used to distinguish between a Presence Agent & a
         * consumer. This is due to the fact that the SIP Camel component ships
         * with a basic Presence Agent (for testing purposes only). Consumers
         * have to set this flag to true. The option is a <code>boolean</code>
         * type.
         */
        public SipConsumerBuilder presenceAgent(boolean presenceAgent) {
            this.properties.put("presenceAgent", presenceAgent);
            return (SipConsumerBuilder) this;
        }
        /**
         * This setting is used to distinguish between a Presence Agent & a
         * consumer. This is due to the fact that the SIP Camel component ships
         * with a basic Presence Agent (for testing purposes only). Consumers
         * have to set this flag to true. The option will be converted to a
         * <code>boolean</code> type.
         */
        public SipConsumerBuilder presenceAgent(String presenceAgent) {
            this.properties.put("presenceAgent", presenceAgent);
            return (SipConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public SipConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SipConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public SipConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SipConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SipConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SipConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SipConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SipConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the SIP component.
     */
    public static class SipProducerBuilder
            extends
                SipCommonBuilder<SipProducerBuilder>
            implements
                EndpointProducerBuilder {
        public SipProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * To send and receive messages using the SIP protocol (used in telco and
     * mobile). Creates a builder to build a consumer endpoint for the SIP
     * component.
     */
    public default SipConsumerBuilder fromSip(String path) {
        return new SipConsumerBuilder(path);
    }
    /**
     * To send and receive messages using the SIP protocol (used in telco and
     * mobile). Creates a builder to build a producer endpoint for the SIP
     * component.
     */
    public default SipProducerBuilder toSip(String path) {
        return new SipProducerBuilder(path);
    }
}