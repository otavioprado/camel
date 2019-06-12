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
 * The docker component is used for managing Docker containers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DockerEndpointBuilder {


    /**
     * Base class for the Docker component builders.
     */
    public static class DockerCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        DockerCommonBuilder(String path) {
            super("docker", path);
        }
        /**
         * Which operation to use.
         * The option is a
         * <code>org.apache.camel.component.docker.DockerOperation</code> type.
         * @group common
         */
        public T operation(DockerOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Which operation to use.
         * The option will be converted to a
         * <code>org.apache.camel.component.docker.DockerOperation</code> type.
         * @group common
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Email address associated with the user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T email(String email) {
            this.properties.put("email", email);
            return (T) this;
        }
        /**
         * Docker host.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Docker port.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public T port(Integer port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Docker port.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Request timeout for response (in seconds).
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public T requestTimeout(Integer requestTimeout) {
            this.properties.put("requestTimeout", requestTimeout);
            return (T) this;
        }
        /**
         * Request timeout for response (in seconds).
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public T requestTimeout(String requestTimeout) {
            this.properties.put("requestTimeout", requestTimeout);
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
         * The fully qualified class name of the DockerCmdExecFactory
         * implementation to use.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        public T cmdExecFactory(String cmdExecFactory) {
            this.properties.put("cmdExecFactory", cmdExecFactory);
            return (T) this;
        }
        /**
         * Whether to follow redirect filter.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T followRedirectFilter(boolean followRedirectFilter) {
            this.properties.put("followRedirectFilter", followRedirectFilter);
            return (T) this;
        }
        /**
         * Whether to follow redirect filter.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T followRedirectFilter(String followRedirectFilter) {
            this.properties.put("followRedirectFilter", followRedirectFilter);
            return (T) this;
        }
        /**
         * Whether to use logging filter.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T loggingFilter(boolean loggingFilter) {
            this.properties.put("loggingFilter", loggingFilter);
            return (T) this;
        }
        /**
         * Whether to use logging filter.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T loggingFilter(String loggingFilter) {
            this.properties.put("loggingFilter", loggingFilter);
            return (T) this;
        }
        /**
         * Maximum route connections.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        public T maxPerRouteConnections(Integer maxPerRouteConnections) {
            this.properties.put("maxPerRouteConnections", maxPerRouteConnections);
            return (T) this;
        }
        /**
         * Maximum route connections.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        public T maxPerRouteConnections(String maxPerRouteConnections) {
            this.properties.put("maxPerRouteConnections", maxPerRouteConnections);
            return (T) this;
        }
        /**
         * Maximum total connections.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        public T maxTotalConnections(Integer maxTotalConnections) {
            this.properties.put("maxTotalConnections", maxTotalConnections);
            return (T) this;
        }
        /**
         * Maximum total connections.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        public T maxTotalConnections(String maxTotalConnections) {
            this.properties.put("maxTotalConnections", maxTotalConnections);
            return (T) this;
        }
        /**
         * Server address for docker registry.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        public T serverAddress(String serverAddress) {
            this.properties.put("serverAddress", serverAddress);
            return (T) this;
        }
        /**
         * Socket connection mode.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T socket(boolean socket) {
            this.properties.put("socket", socket);
            return (T) this;
        }
        /**
         * Socket connection mode.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T socket(String socket) {
            this.properties.put("socket", socket);
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
         * Location containing the SSL certificate chain.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T certPath(String certPath) {
            this.properties.put("certPath", certPath);
            return (T) this;
        }
        /**
         * Password to authenticate with.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Use HTTPS communication.
         * The option is a <code>boolean</code> type.
         * @group security
         */
        public T secure(boolean secure) {
            this.properties.put("secure", secure);
            return (T) this;
        }
        /**
         * Use HTTPS communication.
         * The option will be converted to a <code>boolean</code> type.
         * @group security
         */
        public T secure(String secure) {
            this.properties.put("secure", secure);
            return (T) this;
        }
        /**
         * Check TLS.
         * The option is a <code>boolean</code> type.
         * @group security
         */
        public T tlsVerify(boolean tlsVerify) {
            this.properties.put("tlsVerify", tlsVerify);
            return (T) this;
        }
        /**
         * Check TLS.
         * The option will be converted to a <code>boolean</code> type.
         * @group security
         */
        public T tlsVerify(String tlsVerify) {
            this.properties.put("tlsVerify", tlsVerify);
            return (T) this;
        }
        /**
         * User name to authenticate with.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the Docker component.
     */
    public static class DockerConsumerBuilder
            extends
                DockerCommonBuilder<DockerConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public DockerConsumerBuilder(String path) {
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
        public DockerConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DockerConsumerBuilder) this;
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
        public DockerConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DockerConsumerBuilder) this;
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
        public DockerConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DockerConsumerBuilder) this;
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
        public DockerConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DockerConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public DockerConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DockerConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public DockerConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DockerConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Docker component.
     */
    public static class DockerProducerBuilder
            extends
                DockerCommonBuilder<DockerProducerBuilder>
            implements
                EndpointProducerBuilder {
        public DockerProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.docker.DockerOperation</code> enum.
     */
    public static enum DockerOperation {
        events, stats, auth, info, ping, version, imagebuild, imagecreate, imageinspect, imagelist, imagepull, imagepush, imageremove, imagesearch, imagetag, containerattach, containercommit, containercopyfile, containercreate, containerdiff, inspectcontainer, containerkill, containerlist, containerlog, containerpause, containerrestart, containerremove, containerstart, containerstop, containertop, containerunpause, networkcreate, networkremove, networkconnect, containerwait, execcreate, execstart;
    }
    /**
     * The docker component is used for managing Docker containers. Creates a
     * builder to build a consumer endpoint for the Docker component.
     */
    public default DockerConsumerBuilder fromDocker(String path) {
        return new DockerConsumerBuilder(path);
    }
    /**
     * The docker component is used for managing Docker containers. Creates a
     * builder to build a producer endpoint for the Docker component.
     */
    public default DockerProducerBuilder toDocker(String path) {
        return new DockerProducerBuilder(path);
    }
}