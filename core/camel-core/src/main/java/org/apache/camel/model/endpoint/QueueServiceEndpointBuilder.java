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
 * The azure-queue component is used for storing and retrieving messages from
 * Azure Storage Queue Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QueueServiceEndpointBuilder {


    /**
     * Base class for the Azure Storage Queue Service component builders.
     */
    public static class QueueServiceCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        QueueServiceCommonBuilder(String path) {
            super("azure-queue", path);
        }
        /**
         * Container Queue compact Uri.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T containerAndQueueUri(String containerAndQueueUri) {
            this.properties.put("containerAndQueueUri", containerAndQueueUri);
            return (T) this;
        }
        /**
         * The queue service client.
         * The option is a
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * @group common
         */
        public T azureQueueClient(Object azureQueueClient) {
            this.properties.put("azureQueueClient", azureQueueClient);
            return (T) this;
        }
        /**
         * The queue service client.
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.queue.CloudQueue</code> type.
         * @group common
         */
        public T azureQueueClient(String azureQueueClient) {
            this.properties.put("azureQueueClient", azureQueueClient);
            return (T) this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * The option is a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * @group common
         */
        public T credentials(Object credentials) {
            this.properties.put("credentials", credentials);
            return (T) this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * The option will be converted to a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         * @group common
         */
        public T credentials(String credentials) {
            this.properties.put("credentials", credentials);
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
     * Builder for endpoint consumers for the Azure Storage Queue Service
     * component.
     */
    public static class QueueServiceConsumerBuilder
            extends
                QueueServiceCommonBuilder<QueueServiceConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public QueueServiceConsumerBuilder(String path) {
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
        public QueueServiceConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (QueueServiceConsumerBuilder) this;
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
        public QueueServiceConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (QueueServiceConsumerBuilder) this;
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
        public QueueServiceConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (QueueServiceConsumerBuilder) this;
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
        public QueueServiceConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (QueueServiceConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public QueueServiceConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (QueueServiceConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public QueueServiceConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (QueueServiceConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Azure Storage Queue Service
     * component.
     */
    public static class QueueServiceProducerBuilder
            extends
                QueueServiceCommonBuilder<QueueServiceProducerBuilder>
            implements
                EndpointProducerBuilder {
        public QueueServiceProducerBuilder(String path) {
            super(path);
        }
        /**
         * Message Time To Live in seconds.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder messageTimeToLive(
                int messageTimeToLive) {
            this.properties.put("messageTimeToLive", messageTimeToLive);
            return (QueueServiceProducerBuilder) this;
        }
        /**
         * Message Time To Live in seconds.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder messageTimeToLive(
                String messageTimeToLive) {
            this.properties.put("messageTimeToLive", messageTimeToLive);
            return (QueueServiceProducerBuilder) this;
        }
        /**
         * Message Visibility Delay in seconds.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder messageVisibilityDelay(
                int messageVisibilityDelay) {
            this.properties.put("messageVisibilityDelay", messageVisibilityDelay);
            return (QueueServiceProducerBuilder) this;
        }
        /**
         * Message Visibility Delay in seconds.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder messageVisibilityDelay(
                String messageVisibilityDelay) {
            this.properties.put("messageVisibilityDelay", messageVisibilityDelay);
            return (QueueServiceProducerBuilder) this;
        }
        /**
         * Queue service operation hint to the producer.
         * The option is a
         * <code>org.apache.camel.component.azure.queue.QueueServiceOperations</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder operation(
                QueueServiceOperations operation) {
            this.properties.put("operation", operation);
            return (QueueServiceProducerBuilder) this;
        }
        /**
         * Queue service operation hint to the producer.
         * The option will be converted to a
         * <code>org.apache.camel.component.azure.queue.QueueServiceOperations</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (QueueServiceProducerBuilder) this;
        }
        /**
         * Set a prefix which can be used for listing the queues.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public QueueServiceProducerBuilder queuePrefix(String queuePrefix) {
            this.properties.put("queuePrefix", queuePrefix);
            return (QueueServiceProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.azure.queue.QueueServiceOperations</code> enum.
     */
    public static enum QueueServiceOperations {
        listQueues, createQueue, deleteQueue, addMessage, retrieveMessage, peekMessage, updateMessage, deleteMessage;
    }
    /**
     * The azure-queue component is used for storing and retrieving messages
     * from Azure Storage Queue Service. Creates a builder to build a consumer
     * endpoint for the Azure Storage Queue Service component.
     */
    public default QueueServiceConsumerBuilder fromQueueService(String path) {
        return new QueueServiceConsumerBuilder(path);
    }
    /**
     * The azure-queue component is used for storing and retrieving messages
     * from Azure Storage Queue Service. Creates a builder to build a producer
     * endpoint for the Azure Storage Queue Service component.
     */
    public default QueueServiceProducerBuilder toQueueService(String path) {
        return new QueueServiceProducerBuilder(path);
    }
}