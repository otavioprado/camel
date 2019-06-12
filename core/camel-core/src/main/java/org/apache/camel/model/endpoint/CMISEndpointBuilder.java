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
 * The cmis component uses the Apache Chemistry client API and allows you to
 * add/read nodes to/from a CMIS compliant content repositories.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CMISEndpointBuilder {


    /**
     * Base class for the CMIS component builders.
     */
    public static class CMISCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        CMISCommonBuilder(String path) {
            super("cmis", path);
        }
        /**
         * URL to the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T cmsUrl(String cmsUrl) {
            this.properties.put("cmsUrl", cmsUrl);
            return (T) this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T pageSize(int pageSize) {
            this.properties.put("pageSize", pageSize);
            return (T) this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T pageSize(String pageSize) {
            this.properties.put("pageSize", pageSize);
            return (T) this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T readContent(boolean readContent) {
            this.properties.put("readContent", readContent);
            return (T) this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T readContent(String readContent) {
            this.properties.put("readContent", readContent);
            return (T) this;
        }
        /**
         * Max number of nodes to read.
         * The option is a <code>int</code> type.
         * @group common
         */
        public T readCount(int readCount) {
            this.properties.put("readCount", readCount);
            return (T) this;
        }
        /**
         * Max number of nodes to read.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public T readCount(String readCount) {
            this.properties.put("readCount", readCount);
            return (T) this;
        }
        /**
         * The Id of the repository to use. If not specified the first available
         * repository is used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T repositoryId(String repositoryId) {
            this.properties.put("repositoryId", repositoryId);
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
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option is a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        public T sessionFacadeFactory(Object sessionFacadeFactory) {
            this.properties.put("sessionFacadeFactory", sessionFacadeFactory);
            return (T) this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option will be converted to a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        public T sessionFacadeFactory(String sessionFacadeFactory) {
            this.properties.put("sessionFacadeFactory", sessionFacadeFactory);
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
         * Password for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Username for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the CMIS component.
     */
    public static class CMISConsumerBuilder
            extends
                CMISCommonBuilder<CMISConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public CMISConsumerBuilder(String path) {
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
        public CMISConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CMISConsumerBuilder) this;
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
        public CMISConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CMISConsumerBuilder) this;
        }
        /**
         * The cmis query to execute against the repository. If not specified,
         * the consumer will retrieve every node from the content repository by
         * iterating the content tree recursively.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        public CMISConsumerBuilder query(String query) {
            this.properties.put("query", query);
            return (CMISConsumerBuilder) this;
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
        public CMISConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CMISConsumerBuilder) this;
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
        public CMISConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CMISConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public CMISConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CMISConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public CMISConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CMISConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the CMIS component.
     */
    public static class CMISProducerBuilder
            extends
                CMISCommonBuilder<CMISProducerBuilder>
            implements
                EndpointProducerBuilder {
        public CMISProducerBuilder(String path) {
            super(path);
        }
        /**
         * If true, will execute the cmis query from the message body and return
         * result, otherwise will create a node in the cmis repository.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public CMISProducerBuilder queryMode(boolean queryMode) {
            this.properties.put("queryMode", queryMode);
            return (CMISProducerBuilder) this;
        }
        /**
         * If true, will execute the cmis query from the message body and return
         * result, otherwise will create a node in the cmis repository.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public CMISProducerBuilder queryMode(String queryMode) {
            this.properties.put("queryMode", queryMode);
            return (CMISProducerBuilder) this;
        }
    }
    /**
     * The cmis component uses the Apache Chemistry client API and allows you to
     * add/read nodes to/from a CMIS compliant content repositories. Creates a
     * builder to build a consumer endpoint for the CMIS component.
     */
    public default CMISConsumerBuilder fromCMIS(String path) {
        return new CMISConsumerBuilder(path);
    }
    /**
     * The cmis component uses the Apache Chemistry client API and allows you to
     * add/read nodes to/from a CMIS compliant content repositories. Creates a
     * builder to build a producer endpoint for the CMIS component.
     */
    public default CMISProducerBuilder toCMIS(String path) {
        return new CMISProducerBuilder(path);
    }
}