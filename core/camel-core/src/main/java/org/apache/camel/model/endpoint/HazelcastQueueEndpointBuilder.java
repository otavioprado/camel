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
 * The hazelcast-queue component is used to access Hazelcast distributed queue.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastQueueEndpointBuilder {


    /**
     * Base class for the Hazelcast Queue component builders.
     */
    public static class HazelcastQueueCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        HazelcastQueueCommonBuilder(String path) {
            super("hazelcast-queue", path);
        }
        /**
         * The name of the cache.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * The option is a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * @group common
         */
        public T defaultOperation(HazelcastOperation defaultOperation) {
            this.properties.put("defaultOperation", defaultOperation);
            return (T) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * @group common
         */
        public T defaultOperation(String defaultOperation) {
            this.properties.put("defaultOperation", defaultOperation);
            return (T) this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * The option is a <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * @group common
         */
        public T hazelcastInstance(Object hazelcastInstance) {
            this.properties.put("hazelcastInstance", hazelcastInstance);
            return (T) this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * @group common
         */
        public T hazelcastInstance(String hazelcastInstance) {
            this.properties.put("hazelcastInstance", hazelcastInstance);
            return (T) this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T hazelcastInstanceName(String hazelcastInstanceName) {
            this.properties.put("hazelcastInstanceName", hazelcastInstanceName);
            return (T) this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T reliable(boolean reliable) {
            this.properties.put("reliable", reliable);
            return (T) this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T reliable(String reliable) {
            this.properties.put("reliable", reliable);
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
         * To use concurrent consumers polling from the SEDA queue.
         * The option is a <code>int</code> type.
         * @group seda
         */
        public T concurrentConsumers(int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (T) this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * The option will be converted to a <code>int</code> type.
         * @group seda
         */
        public T concurrentConsumers(String concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (T) this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * The option is a <code>int</code> type.
         * @group seda
         */
        public T onErrorDelay(int onErrorDelay) {
            this.properties.put("onErrorDelay", onErrorDelay);
            return (T) this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * The option will be converted to a <code>int</code> type.
         * @group seda
         */
        public T onErrorDelay(String onErrorDelay) {
            this.properties.put("onErrorDelay", onErrorDelay);
            return (T) this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * The option is a <code>int</code> type.
         * @group seda
         */
        public T pollTimeout(int pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (T) this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * The option will be converted to a <code>int</code> type.
         * @group seda
         */
        public T pollTimeout(String pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (T) this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * The option is a <code>boolean</code> type.
         * @group seda
         */
        public T transacted(boolean transacted) {
            this.properties.put("transacted", transacted);
            return (T) this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * The option will be converted to a <code>boolean</code> type.
         * @group seda
         */
        public T transacted(String transacted) {
            this.properties.put("transacted", transacted);
            return (T) this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * The option is a <code>boolean</code> type.
         * @group seda
         */
        public T transferExchange(boolean transferExchange) {
            this.properties.put("transferExchange", transferExchange);
            return (T) this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * The option will be converted to a <code>boolean</code> type.
         * @group seda
         */
        public T transferExchange(String transferExchange) {
            this.properties.put("transferExchange", transferExchange);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the Hazelcast Queue component.
     */
    public static class HazelcastQueueConsumerBuilder
            extends
                HazelcastQueueCommonBuilder<HazelcastQueueConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public HazelcastQueueConsumerBuilder(String path) {
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
        public HazelcastQueueConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HazelcastQueueConsumerBuilder) this;
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
        public HazelcastQueueConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Define the polling timeout of the Queue consumer in Poll mode.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        public HazelcastQueueConsumerBuilder pollingTimeout(long pollingTimeout) {
            this.properties.put("pollingTimeout", pollingTimeout);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Define the polling timeout of the Queue consumer in Poll mode.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        public HazelcastQueueConsumerBuilder pollingTimeout(
                String pollingTimeout) {
            this.properties.put("pollingTimeout", pollingTimeout);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Define the Pool size for Queue Consumer Executor.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        public HazelcastQueueConsumerBuilder poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Define the Pool size for Queue Consumer Executor.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        public HazelcastQueueConsumerBuilder poolSize(String poolSize) {
            this.properties.put("poolSize", poolSize);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Define the Queue Consumer mode: Listen or Poll.
         * The option is a
         * <code>org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode</code> type.
         * @group consumer
         */
        public HazelcastQueueConsumerBuilder queueConsumerMode(
                HazelcastQueueConsumerMode queueConsumerMode) {
            this.properties.put("queueConsumerMode", queueConsumerMode);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Define the Queue Consumer mode: Listen or Poll.
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode</code> type.
         * @group consumer
         */
        public HazelcastQueueConsumerBuilder queueConsumerMode(
                String queueConsumerMode) {
            this.properties.put("queueConsumerMode", queueConsumerMode);
            return (HazelcastQueueConsumerBuilder) this;
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
        public HazelcastQueueConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HazelcastQueueConsumerBuilder) this;
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
        public HazelcastQueueConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public HazelcastQueueConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HazelcastQueueConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public HazelcastQueueConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HazelcastQueueConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Hazelcast Queue component.
     */
    public static class HazelcastQueueProducerBuilder
            extends
                HazelcastQueueCommonBuilder<HazelcastQueueProducerBuilder>
            implements
                EndpointProducerBuilder {
        public HazelcastQueueProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
     * enum.
     */
    public static enum HazelcastOperation {
        put, delete, get, update, query, getAll, clear, putIfAbsent, allAll, removeAll, retainAll, evict, evictAll, valueCount, containsKey, containsValue, keySet, removevalue, increment, decrement, setvalue, destroy, compareAndSet, getAndAdd, add, offer, peek, poll, remainingCapacity, drainTo, removeIf, take, publish, readOnceHeal, readOnceTail, capacity;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode</code> enum.
     */
    public static enum HazelcastQueueConsumerMode {
        listen, poll;
    }
    /**
     * The hazelcast-queue component is used to access Hazelcast distributed
     * queue. Creates a builder to build a consumer endpoint for the Hazelcast
     * Queue component.
     */
    public default HazelcastQueueConsumerBuilder fromHazelcastQueue(String path) {
        return new HazelcastQueueConsumerBuilder(path);
    }
    /**
     * The hazelcast-queue component is used to access Hazelcast distributed
     * queue. Creates a builder to build a producer endpoint for the Hazelcast
     * Queue component.
     */
    public default HazelcastQueueProducerBuilder toHazelcastQueue(String path) {
        return new HazelcastQueueProducerBuilder(path);
    }
}