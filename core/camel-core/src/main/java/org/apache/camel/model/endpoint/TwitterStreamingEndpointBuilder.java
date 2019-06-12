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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The Twitter Streaming component consumes twitter statuses using Streaming
 * API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TwitterStreamingEndpointBuilder {


    /**
     * Base class for the Twitter Streaming component builders.
     */
    public static class TwitterStreamingCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        TwitterStreamingCommonBuilder(String path) {
            super("twitter-streaming", path);
        }
        /**
         * The streaming type to consume. The option is a
         * <code>org.apache.camel.component.twitter.data.StreamingType</code>
         * type.
         */
        public T streamingType(StreamingType streamingType) {
            this.properties.put("streamingType", streamingType);
            return (T) this;
        }
        /**
         * The streaming type to consume. The option will be converted to a
         * <code>org.apache.camel.component.twitter.data.StreamingType</code>
         * type.
         */
        public T streamingType(String streamingType) {
            this.properties.put("streamingType", streamingType);
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
         * The http proxy host which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * <code>java.lang.String</code> type.
         */
        public T httpProxyHost(String httpProxyHost) {
            this.properties.put("httpProxyHost", httpProxyHost);
            return (T) this;
        }
        /**
         * The http proxy password which can be used for the camel-twitter. Can
         * also be configured on the TwitterComponent level instead. The option
         * is a <code>java.lang.String</code> type.
         */
        public T httpProxyPassword(String httpProxyPassword) {
            this.properties.put("httpProxyPassword", httpProxyPassword);
            return (T) this;
        }
        /**
         * The http proxy port which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * <code>java.lang.Integer</code> type.
         */
        public T httpProxyPort(Integer httpProxyPort) {
            this.properties.put("httpProxyPort", httpProxyPort);
            return (T) this;
        }
        /**
         * The http proxy port which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option will
         * be converted to a <code>java.lang.Integer</code> type.
         */
        public T httpProxyPort(String httpProxyPort) {
            this.properties.put("httpProxyPort", httpProxyPort);
            return (T) this;
        }
        /**
         * The http proxy user which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * <code>java.lang.String</code> type.
         */
        public T httpProxyUser(String httpProxyUser) {
            this.properties.put("httpProxyUser", httpProxyUser);
            return (T) this;
        }
        /**
         * The access token. Can also be configured on the TwitterComponent
         * level instead. The option is a <code>java.lang.String</code> type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * The access secret. Can also be configured on the TwitterComponent
         * level instead. The option is a <code>java.lang.String</code> type.
         */
        public T accessTokenSecret(String accessTokenSecret) {
            this.properties.put("accessTokenSecret", accessTokenSecret);
            return (T) this;
        }
        /**
         * The consumer key. Can also be configured on the TwitterComponent
         * level instead. The option is a <code>java.lang.String</code> type.
         */
        public T consumerKey(String consumerKey) {
            this.properties.put("consumerKey", consumerKey);
            return (T) this;
        }
        /**
         * The consumer secret. Can also be configured on the TwitterComponent
         * level instead. The option is a <code>java.lang.String</code> type.
         */
        public T consumerSecret(String consumerSecret) {
            this.properties.put("consumerSecret", consumerSecret);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the Twitter Streaming component.
     */
    public static class TwitterStreamingConsumerBuilder
            extends
                TwitterStreamingCommonBuilder<TwitterStreamingConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public TwitterStreamingConsumerBuilder(String path) {
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
        public TwitterStreamingConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (TwitterStreamingConsumerBuilder) this;
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
        public TwitterStreamingConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Endpoint type to use. Only streaming supports event type. The option
         * is a
         * <code>org.apache.camel.component.twitter.data.EndpointType</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder type(EndpointType type) {
            this.properties.put("type", type);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Endpoint type to use. Only streaming supports event type. The option
         * will be converted to a
         * <code>org.apache.camel.component.twitter.data.EndpointType</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder type(String type) {
            this.properties.put("type", type);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search, to search by radius using
         * the configured metrics. The unit can either be mi for miles, or km
         * for kilometers. You need to configure all the following options:
         * longitude, latitude, radius, and distanceMetric. The option is a
         * <code>java.lang.String</code> type.
         */
        public TwitterStreamingConsumerBuilder distanceMetric(
                String distanceMetric) {
            this.properties.put("distanceMetric", distanceMetric);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public TwitterStreamingConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public TwitterStreamingConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public TwitterStreamingConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used for enabling full text from twitter (eg receive tweets that
         * contains more than 140 characters). The option is a
         * <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder extendedMode(boolean extendedMode) {
            this.properties.put("extendedMode", extendedMode);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used for enabling full text from twitter (eg receive tweets that
         * contains more than 140 characters). The option will be converted to a
         * <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder extendedMode(String extendedMode) {
            this.properties.put("extendedMode", extendedMode);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search to search by latitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option is a
         * <code>java.lang.Double</code> type.
         */
        public TwitterStreamingConsumerBuilder latitude(Double latitude) {
            this.properties.put("latitude", latitude);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search to search by latitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option will be converted to a
         * <code>java.lang.Double</code> type.
         */
        public TwitterStreamingConsumerBuilder latitude(String latitude) {
            this.properties.put("latitude", latitude);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Bounding boxes, created by pairs of lat/lons. Can be used for
         * streaming/filter. A pair is defined as lat,lon. And multiple paris
         * can be separated by semi colon. The option is a
         * <code>java.lang.String</code> type.
         */
        public TwitterStreamingConsumerBuilder locations(String locations) {
            this.properties.put("locations", locations);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search to search by longitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option is a
         * <code>java.lang.Double</code> type.
         */
        public TwitterStreamingConsumerBuilder longitude(Double longitude) {
            this.properties.put("longitude", longitude);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search to search by longitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option will be converted to a
         * <code>java.lang.Double</code> type.
         */
        public TwitterStreamingConsumerBuilder longitude(String longitude) {
            this.properties.put("longitude", longitude);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         */
        public TwitterStreamingConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a <code>org.apache.camel.spi.PollingConsumerPollStrategy</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search to search by radius. You need
         * to configure all the following options: longitude, latitude, radius,
         * and distanceMetric. The option is a <code>java.lang.Double</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder radius(Double radius) {
            this.properties.put("radius", radius);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Used by the non-stream geography search to search by radius. You need
         * to configure all the following options: longitude, latitude, radius,
         * and distanceMetric. The option will be converted to a
         * <code>java.lang.Double</code> type.
         */
        public TwitterStreamingConsumerBuilder radius(String radius) {
            this.properties.put("radius", radius);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To use a custom instance of TwitterStream. The option is a
         * <code>twitter4j.TwitterStream</code> type.
         */
        public TwitterStreamingConsumerBuilder twitterStream(
                Object twitterStream) {
            this.properties.put("twitterStream", twitterStream);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To use a custom instance of TwitterStream. The option will be
         * converted to a <code>twitter4j.TwitterStream</code> type.
         */
        public TwitterStreamingConsumerBuilder twitterStream(
                String twitterStream) {
            this.properties.put("twitterStream", twitterStream);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Limiting number of results per page. The option is a
         * <code>java.lang.Integer</code> type.
         */
        public TwitterStreamingConsumerBuilder count(Integer count) {
            this.properties.put("count", count);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Limiting number of results per page. The option will be converted to
         * a <code>java.lang.Integer</code> type.
         */
        public TwitterStreamingConsumerBuilder count(String count) {
            this.properties.put("count", count);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Filter out old tweets, that has previously been polled. This state is
         * stored in memory only, and based on last tweet id. The option is a
         * <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder filterOld(boolean filterOld) {
            this.properties.put("filterOld", filterOld);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Filter out old tweets, that has previously been polled. This state is
         * stored in memory only, and based on last tweet id. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder filterOld(String filterOld) {
            this.properties.put("filterOld", filterOld);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Can be used for a streaming filter. Multiple values can be separated
         * with comma. The option is a <code>java.lang.String</code> type.
         */
        public TwitterStreamingConsumerBuilder keywords(String keywords) {
            this.properties.put("keywords", keywords);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The lang string ISO_639-1 which will be used for searching. The
         * option is a <code>java.lang.String</code> type.
         */
        public TwitterStreamingConsumerBuilder lang(String lang) {
            this.properties.put("lang", lang);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The number of pages result which you want camel-twitter to consume.
         * The option is a <code>java.lang.Integer</code> type.
         */
        public TwitterStreamingConsumerBuilder numberOfPages(
                Integer numberOfPages) {
            this.properties.put("numberOfPages", numberOfPages);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The number of pages result which you want camel-twitter to consume.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder numberOfPages(
                String numberOfPages) {
            this.properties.put("numberOfPages", numberOfPages);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The last tweet id which will be used for pulling the tweets. It is
         * useful when the camel route is restarted after a long running. The
         * option is a <code>long</code> type.
         */
        public TwitterStreamingConsumerBuilder sinceId(long sinceId) {
            this.properties.put("sinceId", sinceId);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The last tweet id which will be used for pulling the tweets. It is
         * useful when the camel route is restarted after a long running. The
         * option will be converted to a <code>long</code> type.
         */
        public TwitterStreamingConsumerBuilder sinceId(String sinceId) {
            this.properties.put("sinceId", sinceId);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To filter by user ids for streaming/filter. Multiple values can be
         * separated by comma. The option is a <code>java.lang.String</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder userIds(String userIds) {
            this.properties.put("userIds", userIds);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a <code>int</code> type.
         */
        public TwitterStreamingConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a <code>int</code> type.
         */
        public TwitterStreamingConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a <code>int</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * <code>int</code> type.
         */
        public TwitterStreamingConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a <code>int</code> type.
         */
        public TwitterStreamingConsumerBuilder backoffMultiplier(
                int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a <code>int</code> type.
         */
        public TwitterStreamingConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. The option is a <code>long</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. The option will be converted to a
         * <code>long</code> type.
         */
        public TwitterStreamingConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public TwitterStreamingConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public TwitterStreamingConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a <code>org.apache.camel.LoggingLevel</code> type.
         */
        public TwitterStreamingConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a <code>org.apache.camel.LoggingLevel</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder runLoggingLevel(
                String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public TwitterStreamingConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public TwitterStreamingConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public TwitterStreamingConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public TwitterStreamingConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a
         * <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder startScheduler(
                boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder startScheduler(
                String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * <code>java.util.concurrent.TimeUnit</code> type.
         */
        public TwitterStreamingConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a <code>java.util.concurrent.TimeUnit</code> type.
         */
        public TwitterStreamingConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a
         * <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder useFixedDelay(
                boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder useFixedDelay(
                String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Sorts by id, so the oldest are first, and newest last. The option is
         * a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder sortById(boolean sortById) {
            this.properties.put("sortById", sortById);
            return (TwitterStreamingConsumerBuilder) this;
        }
        /**
         * Sorts by id, so the oldest are first, and newest last. The option
         * will be converted to a <code>boolean</code> type.
         */
        public TwitterStreamingConsumerBuilder sortById(String sortById) {
            this.properties.put("sortById", sortById);
            return (TwitterStreamingConsumerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.twitter.data.StreamingType</code> enum.
     */
    public static enum StreamingType {
        SAMPLE, FILTER, USER, UNKNOWN;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.twitter.data.EndpointType</code> enum.
     */
    public static enum EndpointType {
        POLLING, DIRECT, EVENT;
    }
    /**
     * The Twitter Streaming component consumes twitter statuses using Streaming
     * API. Creates a builder to build a consumer endpoint for the Twitter
     * Streaming component.
     */
    public default TwitterStreamingConsumerBuilder fromTwitterStreaming(
            String path) {
        return new TwitterStreamingConsumerBuilder(path);
    }
}