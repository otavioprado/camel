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
 * The flatpack component supports fixed width and delimited file parsing via
 * the FlatPack library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FlatpackEndpointBuilder {


    /**
     * Base class for the Flatpack component builders.
     */
    public static class FlatpackCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        FlatpackCommonBuilder(String path) {
            super("flatpack", path);
        }
        /**
         * Whether to use fixed or delimiter.
         * The option is a
         * <code>org.apache.camel.component.flatpack.FlatpackType</code> type.
         * @group common
         */
        public T type(FlatpackType type) {
            this.properties.put("type", type);
            return (T) this;
        }
        /**
         * Whether to use fixed or delimiter.
         * The option will be converted to a
         * <code>org.apache.camel.component.flatpack.FlatpackType</code> type.
         * @group common
         */
        public T type(String type) {
            this.properties.put("type", type);
            return (T) this;
        }
        /**
         * URL for loading the flatpack mapping file from classpath or file
         * system.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Allows for lines to be shorter than expected and ignores the extra
         * characters.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T allowShortLines(boolean allowShortLines) {
            this.properties.put("allowShortLines", allowShortLines);
            return (T) this;
        }
        /**
         * Allows for lines to be shorter than expected and ignores the extra
         * characters.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T allowShortLines(String allowShortLines) {
            this.properties.put("allowShortLines", allowShortLines);
            return (T) this;
        }
        /**
         * The default character delimiter for delimited files.
         * The option is a <code>char</code> type.
         * @group common
         */
        public T delimiter(char delimiter) {
            this.properties.put("delimiter", delimiter);
            return (T) this;
        }
        /**
         * The default character delimiter for delimited files.
         * The option will be converted to a <code>char</code> type.
         * @group common
         */
        public T delimiter(String delimiter) {
            this.properties.put("delimiter", delimiter);
            return (T) this;
        }
        /**
         * Allows for lines to be longer than expected and ignores the extra
         * characters.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T ignoreExtraColumns(boolean ignoreExtraColumns) {
            this.properties.put("ignoreExtraColumns", ignoreExtraColumns);
            return (T) this;
        }
        /**
         * Allows for lines to be longer than expected and ignores the extra
         * characters.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T ignoreExtraColumns(String ignoreExtraColumns) {
            this.properties.put("ignoreExtraColumns", ignoreExtraColumns);
            return (T) this;
        }
        /**
         * Whether the first line is ignored for delimited files (for the column
         * headers).
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T ignoreFirstRecord(boolean ignoreFirstRecord) {
            this.properties.put("ignoreFirstRecord", ignoreFirstRecord);
            return (T) this;
        }
        /**
         * Whether the first line is ignored for delimited files (for the column
         * headers).
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T ignoreFirstRecord(String ignoreFirstRecord) {
            this.properties.put("ignoreFirstRecord", ignoreFirstRecord);
            return (T) this;
        }
        /**
         * Sets the Component to send each row as a separate exchange once
         * parsed.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T splitRows(boolean splitRows) {
            this.properties.put("splitRows", splitRows);
            return (T) this;
        }
        /**
         * Sets the Component to send each row as a separate exchange once
         * parsed.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T splitRows(String splitRows) {
            this.properties.put("splitRows", splitRows);
            return (T) this;
        }
        /**
         * The text qualifier for delimited files.
         * The option is a <code>char</code> type.
         * @group common
         */
        public T textQualifier(char textQualifier) {
            this.properties.put("textQualifier", textQualifier);
            return (T) this;
        }
        /**
         * The text qualifier for delimited files.
         * The option will be converted to a <code>char</code> type.
         * @group common
         */
        public T textQualifier(String textQualifier) {
            this.properties.put("textQualifier", textQualifier);
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
     * Builder for endpoint consumers for the Flatpack component.
     */
    public static class FlatpackConsumerBuilder
            extends
                FlatpackCommonBuilder<FlatpackConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public FlatpackConsumerBuilder(String path) {
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
        public FlatpackConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (FlatpackConsumerBuilder) this;
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
        public FlatpackConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public FlatpackConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public FlatpackConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (FlatpackConsumerBuilder) this;
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
        public FlatpackConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (FlatpackConsumerBuilder) this;
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
        public FlatpackConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public FlatpackConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public FlatpackConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * @group consumer (advanced)
         */
        public FlatpackConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * The option will be converted to a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * @group consumer (advanced)
         */
        public FlatpackConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option is a <code>long</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option will be converted to a <code>long</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option is a <code>long</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option will be converted to a <code>long</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * The option is a <code>org.apache.camel.LoggingLevel</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder runLoggingLevel(String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component.
         * The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder startScheduler(String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * The option is a <code>java.util.concurrent.TimeUnit</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * The option will be converted to a
         * <code>java.util.concurrent.TimeUnit</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (FlatpackConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        public FlatpackConsumerBuilder useFixedDelay(String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (FlatpackConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Flatpack component.
     */
    public static class FlatpackProducerBuilder
            extends
                FlatpackCommonBuilder<FlatpackProducerBuilder>
            implements
                EndpointProducerBuilder {
        public FlatpackProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.flatpack.FlatpackType</code> enum.
     */
    public static enum FlatpackType {
        fixed, delim;
    }
    /**
     * The flatpack component supports fixed width and delimited file parsing
     * via the FlatPack library. Creates a builder to build a consumer endpoint
     * for the Flatpack component.
     */
    public default FlatpackConsumerBuilder fromFlatpack(String path) {
        return new FlatpackConsumerBuilder(path);
    }
    /**
     * The flatpack component supports fixed width and delimited file parsing
     * via the FlatPack library. Creates a builder to build a producer endpoint
     * for the Flatpack component.
     */
    public default FlatpackProducerBuilder toFlatpack(String path) {
        return new FlatpackProducerBuilder(path);
    }
}