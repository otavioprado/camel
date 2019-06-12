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
 * The slack component allows you to send messages to Slack.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SlackEndpointBuilder {


    /**
     * Base class for the Slack component builders.
     */
    public static class SlackCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        SlackCommonBuilder(String path) {
            super("slack", path);
        }
        /**
         * The channel name (syntax #name) or slackuser (syntax userName) to
         * send a message directly to an user. The option is a
         * <code>java.lang.String</code> type.
         */
        public T channel(String channel) {
            this.properties.put("channel", channel);
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
    }

    /**
     * Builder for endpoint consumers for the Slack component.
     */
    public static class SlackConsumerBuilder
            extends
                SlackCommonBuilder<SlackConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public SlackConsumerBuilder(String path) {
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
        public SlackConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SlackConsumerBuilder) this;
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
        public SlackConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The Max Result for the poll. The option is a
         * <code>java.lang.String</code> type.
         */
        public SlackConsumerBuilder maxResults(String maxResults) {
            this.properties.put("maxResults", maxResults);
            return (SlackConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * <code>boolean</code> type.
         */
        public SlackConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (SlackConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a <code>boolean</code> type.
         */
        public SlackConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The Server URL of the Slack instance. The option is a
         * <code>java.lang.String</code> type.
         */
        public SlackConsumerBuilder serverUrl(String serverUrl) {
            this.properties.put("serverUrl", serverUrl);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The token to use. The option is a <code>java.lang.String</code> type.
         */
        public SlackConsumerBuilder token(String token) {
            this.properties.put("token", token);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public SlackConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public SlackConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SlackConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SlackConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SlackConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         */
        public SlackConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (SlackConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a <code>org.apache.camel.spi.PollingConsumerPollStrategy</code>
         * type.
         */
        public SlackConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a <code>int</code> type.
         */
        public SlackConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a <code>int</code> type.
         */
        public SlackConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a <code>int</code>
         * type.
         */
        public SlackConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * <code>int</code> type.
         */
        public SlackConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a <code>int</code> type.
         */
        public SlackConsumerBuilder backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a <code>int</code> type.
         */
        public SlackConsumerBuilder backoffMultiplier(String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public SlackConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public SlackConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (SlackConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a <code>boolean</code> type.
         */
        public SlackConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (SlackConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a <code>boolean</code> type.
         */
        public SlackConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public SlackConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public SlackConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a <code>org.apache.camel.LoggingLevel</code> type.
         */
        public SlackConsumerBuilder runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (SlackConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a <code>org.apache.camel.LoggingLevel</code>
         * type.
         */
        public SlackConsumerBuilder runLoggingLevel(String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public SlackConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public SlackConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public SlackConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public SlackConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public SlackConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (SlackConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public SlackConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a
         * <code>boolean</code> type.
         */
        public SlackConsumerBuilder startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a <code>boolean</code> type.
         */
        public SlackConsumerBuilder startScheduler(String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * <code>java.util.concurrent.TimeUnit</code> type.
         */
        public SlackConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a <code>java.util.concurrent.TimeUnit</code> type.
         */
        public SlackConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a
         * <code>boolean</code> type.
         */
        public SlackConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (SlackConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a <code>boolean</code> type.
         */
        public SlackConsumerBuilder useFixedDelay(String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (SlackConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Slack component.
     */
    public static class SlackProducerBuilder
            extends
                SlackCommonBuilder<SlackProducerBuilder>
            implements
                EndpointProducerBuilder {
        public SlackProducerBuilder(String path) {
            super(path);
        }
        /**
         * Use a Slack emoji as an avatar. The option is a
         * <code>java.lang.String</code> type.
         */
        public SlackProducerBuilder iconEmoji(String iconEmoji) {
            this.properties.put("iconEmoji", iconEmoji);
            return (SlackProducerBuilder) this;
        }
        /**
         * The avatar that the component will use when sending message to a
         * channel or user. The option is a <code>java.lang.String</code> type.
         */
        public SlackProducerBuilder iconUrl(String iconUrl) {
            this.properties.put("iconUrl", iconUrl);
            return (SlackProducerBuilder) this;
        }
        /**
         * This is the username that the bot will have when sending messages to
         * a channel or user. The option is a <code>java.lang.String</code>
         * type.
         */
        public SlackProducerBuilder username(String username) {
            this.properties.put("username", username);
            return (SlackProducerBuilder) this;
        }
        /**
         * The incoming webhook URL. The option is a
         * <code>java.lang.String</code> type.
         */
        public SlackProducerBuilder webhookUrl(String webhookUrl) {
            this.properties.put("webhookUrl", webhookUrl);
            return (SlackProducerBuilder) this;
        }
    }
    /**
     * The slack component allows you to send messages to Slack. Creates a
     * builder to build a consumer endpoint for the Slack component.
     */
    public default SlackConsumerBuilder fromSlack(String path) {
        return new SlackConsumerBuilder(path);
    }
    /**
     * The slack component allows you to send messages to Slack. Creates a
     * builder to build a producer endpoint for the Slack component.
     */
    public default SlackProducerBuilder toSlack(String path) {
        return new SlackProducerBuilder(path);
    }
}