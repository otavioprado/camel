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
 * Reactive Camel using reactive streams
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ReactiveStreamsEndpointBuilder {


    /**
     * Base class for the Reactive Streams component builders.
     */
    public static class ReactiveStreamsCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        ReactiveStreamsCommonBuilder(String path) {
            super("reactive-streams", path);
        }
        /**
         * Name of the stream channel used by the endpoint to exchange messages.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T stream(String stream) {
            this.properties.put("stream", stream);
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
     * Builder for endpoint consumers for the Reactive Streams component.
     */
    public static class ReactiveStreamsConsumerBuilder
            extends
                ReactiveStreamsCommonBuilder<ReactiveStreamsConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public ReactiveStreamsConsumerBuilder(String path) {
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
        public ReactiveStreamsConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (ReactiveStreamsConsumerBuilder) this;
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
        public ReactiveStreamsConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Number of threads used to process exchanges in the Camel route.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Number of threads used to process exchanges in the Camel route.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Set the low watermark of requested exchanges to the active
         * subscription as percentage of the maxInflightExchanges. When the
         * number of pending items from the upstream source is lower than the
         * watermark, new items can be requested to the subscription. If set to
         * 0, the subscriber will request items in batches of
         * maxInflightExchanges, only after all items of the previous batch have
         * been processed. If set to 1, the subscriber can request a new item
         * each time an exchange is processed (chatty). Any intermediate value
         * can be used.
         * The option is a <code>double</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder exchangesRefillLowWatermark(
                double exchangesRefillLowWatermark) {
            this.properties.put("exchangesRefillLowWatermark", exchangesRefillLowWatermark);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Set the low watermark of requested exchanges to the active
         * subscription as percentage of the maxInflightExchanges. When the
         * number of pending items from the upstream source is lower than the
         * watermark, new items can be requested to the subscription. If set to
         * 0, the subscriber will request items in batches of
         * maxInflightExchanges, only after all items of the previous batch have
         * been processed. If set to 1, the subscriber can request a new item
         * each time an exchange is processed (chatty). Any intermediate value
         * can be used.
         * The option will be converted to a <code>double</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder exchangesRefillLowWatermark(
                String exchangesRefillLowWatermark) {
            this.properties.put("exchangesRefillLowWatermark", exchangesRefillLowWatermark);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Determines if onComplete events should be pushed to the Camel route.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder forwardOnComplete(
                boolean forwardOnComplete) {
            this.properties.put("forwardOnComplete", forwardOnComplete);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Determines if onComplete events should be pushed to the Camel route.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder forwardOnComplete(
                String forwardOnComplete) {
            this.properties.put("forwardOnComplete", forwardOnComplete);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder forwardOnError(
                boolean forwardOnError) {
            this.properties.put("forwardOnError", forwardOnError);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder forwardOnError(
                String forwardOnError) {
            this.properties.put("forwardOnError", forwardOnError);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Maximum number of exchanges concurrently being processed by Camel.
         * This parameter controls backpressure on the stream. Setting a
         * non-positive value will disable backpressure.
         * The option is a <code>java.lang.Integer</code> type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder maxInflightExchanges(
                Integer maxInflightExchanges) {
            this.properties.put("maxInflightExchanges", maxInflightExchanges);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Maximum number of exchanges concurrently being processed by Camel.
         * This parameter controls backpressure on the stream. Setting a
         * non-positive value will disable backpressure.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group consumer
         */
        public ReactiveStreamsConsumerBuilder maxInflightExchanges(
                String maxInflightExchanges) {
            this.properties.put("maxInflightExchanges", maxInflightExchanges);
            return (ReactiveStreamsConsumerBuilder) this;
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
        public ReactiveStreamsConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (ReactiveStreamsConsumerBuilder) this;
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
        public ReactiveStreamsConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public ReactiveStreamsConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (ReactiveStreamsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public ReactiveStreamsConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (ReactiveStreamsConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Reactive Streams component.
     */
    public static class ReactiveStreamsProducerBuilder
            extends
                ReactiveStreamsCommonBuilder<ReactiveStreamsProducerBuilder>
            implements
                EndpointProducerBuilder {
        public ReactiveStreamsProducerBuilder(String path) {
            super(path);
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * The option is a
         * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> type.
         * @group producer
         */
        public ReactiveStreamsProducerBuilder backpressureStrategy(
                ReactiveStreamsBackpressureStrategy backpressureStrategy) {
            this.properties.put("backpressureStrategy", backpressureStrategy);
            return (ReactiveStreamsProducerBuilder) this;
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * The option will be converted to a
         * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> type.
         * @group producer
         */
        public ReactiveStreamsProducerBuilder backpressureStrategy(
                String backpressureStrategy) {
            this.properties.put("backpressureStrategy", backpressureStrategy);
            return (ReactiveStreamsProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> enum.
     */
    public static enum ReactiveStreamsBackpressureStrategy {
        BUFFER, OLDEST, LATEST;
    }
    /**
     * Reactive Camel using reactive streams Creates a builder to build a
     * consumer endpoint for the Reactive Streams component.
     */
    public default ReactiveStreamsConsumerBuilder fromReactiveStreams(
            String path) {
        return new ReactiveStreamsConsumerBuilder(path);
    }
    /**
     * Reactive Camel using reactive streams Creates a builder to build a
     * producer endpoint for the Reactive Streams component.
     */
    public default ReactiveStreamsProducerBuilder toReactiveStreams(String path) {
        return new ReactiveStreamsProducerBuilder(path);
    }
}