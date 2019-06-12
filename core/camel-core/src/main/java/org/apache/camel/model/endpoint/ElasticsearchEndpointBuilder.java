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
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The elasticsearch component is used for interfacing with ElasticSearch server
 * using REST API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ElasticsearchEndpointBuilder {


    /**
     * Base class for the Elastichsearch Rest component builders.
     */
    public static class ElasticsearchCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        ElasticsearchCommonBuilder(String path) {
            super("elasticsearch-rest", path);
        }
        /**
         * Name of the cluster.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T clusterName(String clusterName) {
            this.properties.put("clusterName", clusterName);
            return (T) this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T connectionTimeout(int connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T connectionTimeout(String connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * Disconnect after it finish calling the producer.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T disconnect(boolean disconnect) {
            this.properties.put("disconnect", disconnect);
            return (T) this;
        }
        /**
         * Disconnect after it finish calling the producer.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T disconnect(String disconnect) {
            this.properties.put("disconnect", disconnect);
            return (T) this;
        }
        /**
         * Enable SSL.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T enableSSL(boolean enableSSL) {
            this.properties.put("enableSSL", enableSSL);
            return (T) this;
        }
        /**
         * Enable SSL.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T enableSSL(String enableSSL) {
            this.properties.put("enableSSL", enableSSL);
            return (T) this;
        }
        /**
         * Comma separated list with ip:port formatted remote transport
         * addresses to use.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T hostAddresses(String hostAddresses) {
            this.properties.put("hostAddresses", hostAddresses);
            return (T) this;
        }
        /**
         * The name of the index to act against.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T indexName(String indexName) {
            this.properties.put("indexName", indexName);
            return (T) this;
        }
        /**
         * The type of the index to act against.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T indexType(String indexType) {
            this.properties.put("indexType", indexType);
            return (T) this;
        }
        /**
         * The time in ms before retry.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T maxRetryTimeout(int maxRetryTimeout) {
            this.properties.put("maxRetryTimeout", maxRetryTimeout);
            return (T) this;
        }
        /**
         * The time in ms before retry.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T maxRetryTimeout(String maxRetryTimeout) {
            this.properties.put("maxRetryTimeout", maxRetryTimeout);
            return (T) this;
        }
        /**
         * What operation to perform.
         * The option is a
         * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> type.
         * @group producer
         */
        public T operation(ElasticsearchOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * What operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> type.
         * @group producer
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Time in ms during which elasticsearch will keep search context alive.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T scrollKeepAliveMs(int scrollKeepAliveMs) {
            this.properties.put("scrollKeepAliveMs", scrollKeepAliveMs);
            return (T) this;
        }
        /**
         * Time in ms during which elasticsearch will keep search context alive.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T scrollKeepAliveMs(String scrollKeepAliveMs) {
            this.properties.put("scrollKeepAliveMs", scrollKeepAliveMs);
            return (T) this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T socketTimeout(int socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (T) this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T socketTimeout(String socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (T) this;
        }
        /**
         * Enable scroll usage.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T useScroll(boolean useScroll) {
            this.properties.put("useScroll", useScroll);
            return (T) this;
        }
        /**
         * Enable scroll usage.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T useScroll(String useScroll) {
            this.properties.put("useScroll", useScroll);
            return (T) this;
        }
        /**
         * Index creation waits for the write consistency number of shards to be
         * available.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T waitForActiveShards(int waitForActiveShards) {
            this.properties.put("waitForActiveShards", waitForActiveShards);
            return (T) this;
        }
        /**
         * Index creation waits for the write consistency number of shards to be
         * available.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T waitForActiveShards(String waitForActiveShards) {
            this.properties.put("waitForActiveShards", waitForActiveShards);
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
     * Builder for endpoint producers for the Elastichsearch Rest component.
     */
    public static class ElasticsearchProducerBuilder
            extends
                ElasticsearchCommonBuilder<ElasticsearchProducerBuilder>
            implements
                EndpointProducerBuilder {
        public ElasticsearchProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> enum.
     */
    public static enum ElasticsearchOperation {
        Index, Update, Bulk, BulkIndex, GetById, MultiGet, MultiSearch, Delete, DeleteIndex, Search, Exists, Ping, Info;
    }
    /**
     * The elasticsearch component is used for interfacing with ElasticSearch
     * server using REST API. Creates a builder to build a producer endpoint for
     * the Elastichsearch Rest component.
     */
    public default ElasticsearchProducerBuilder toElasticsearch(String path) {
        return new ElasticsearchProducerBuilder(path);
    }
}