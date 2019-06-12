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

import java.util.List;
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
 * The google-sheets component provides access to Google Sheets.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleSheetsStreamEndpointBuilder {


    /**
     * Base class for the Google Sheets Stream component builders.
     */
    public static class GoogleSheetsStreamCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        GoogleSheetsStreamCommonBuilder(String path) {
            super("google-sheets-stream", path);
        }
        /**
         * Sets the apiName. The option is a <code>java.lang.String</code> type.
         */
        public T apiName(String apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage. The option is a
         * <code>java.lang.String</code> type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * Google sheets application name. Example would be
         * camel-google-sheets/1.0. The option is a
         * <code>java.lang.String</code> type.
         */
        public T applicationName(String applicationName) {
            this.properties.put("applicationName", applicationName);
            return (T) this;
        }
        /**
         * Client ID of the sheets application. The option is a
         * <code>java.lang.String</code> type.
         */
        public T clientId(String clientId) {
            this.properties.put("clientId", clientId);
            return (T) this;
        }
        /**
         * Client secret of the sheets application. The option is a
         * <code>java.lang.String</code> type.
         */
        public T clientSecret(String clientSecret) {
            this.properties.put("clientSecret", clientSecret);
            return (T) this;
        }
        /**
         * True if grid data should be returned. The option is a
         * <code>boolean</code> type.
         */
        public T includeGridData(boolean includeGridData) {
            this.properties.put("includeGridData", includeGridData);
            return (T) this;
        }
        /**
         * True if grid data should be returned. The option will be converted to
         * a <code>boolean</code> type.
         */
        public T includeGridData(String includeGridData) {
            this.properties.put("includeGridData", includeGridData);
            return (T) this;
        }
        /**
         * Specifies the major dimension that results should use.. The option is
         * a <code>java.lang.String</code> type.
         */
        public T majorDimension(String majorDimension) {
            this.properties.put("majorDimension", majorDimension);
            return (T) this;
        }
        /**
         * Specify the maximum number of returned results. This will limit the
         * number of rows in a returned value range data set or the number of
         * returned value ranges in a batch request. The option is a
         * <code>int</code> type.
         */
        public T maxResults(int maxResults) {
            this.properties.put("maxResults", maxResults);
            return (T) this;
        }
        /**
         * Specify the maximum number of returned results. This will limit the
         * number of rows in a returned value range data set or the number of
         * returned value ranges in a batch request. The option will be
         * converted to a <code>int</code> type.
         */
        public T maxResults(String maxResults) {
            this.properties.put("maxResults", maxResults);
            return (T) this;
        }
        /**
         * Specifies the range of rows and columns in a sheet to get data from.
         * The option is a <code>java.lang.String</code> type.
         */
        public T range(String range) {
            this.properties.put("range", range);
            return (T) this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived. The option is a
         * <code>java.lang.String</code> type.
         */
        public T refreshToken(String refreshToken) {
            this.properties.put("refreshToken", refreshToken);
            return (T) this;
        }
        /**
         * Specifies the level of permissions you want a sheets application to
         * have to a user account. See
         * https://developers.google.com/identity/protocols/googlescopes for
         * more info. The option is a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         */
        public T scopes(List<String> scopes) {
            this.properties.put("scopes", scopes);
            return (T) this;
        }
        /**
         * Specifies the level of permissions you want a sheets application to
         * have to a user account. See
         * https://developers.google.com/identity/protocols/googlescopes for
         * more info. The option will be converted to a
         * <code>java.util.List&lt;java.lang.String&gt;</code> type.
         */
        public T scopes(String scopes) {
            this.properties.put("scopes", scopes);
            return (T) this;
        }
        /**
         * Specifies the spreadsheet identifier that is used to identify the
         * target to obtain. The option is a <code>java.lang.String</code> type.
         */
        public T spreadsheetId(String spreadsheetId) {
            this.properties.put("spreadsheetId", spreadsheetId);
            return (T) this;
        }
        /**
         * Determines how values should be rendered in the output. The option is
         * a <code>java.lang.String</code> type.
         */
        public T valueRenderOption(String valueRenderOption) {
            this.properties.put("valueRenderOption", valueRenderOption);
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
     * Builder for endpoint consumers for the Google Sheets Stream component.
     */
    public static class GoogleSheetsStreamConsumerBuilder
            extends
                GoogleSheetsStreamCommonBuilder<GoogleSheetsStreamConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public GoogleSheetsStreamConsumerBuilder(String path) {
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
        public GoogleSheetsStreamConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (GoogleSheetsStreamConsumerBuilder) this;
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
        public GoogleSheetsStreamConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a <code>org.apache.camel.spi.PollingConsumerPollStrategy</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder pollStrategy(
                String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a <code>int</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a <code>int</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a <code>int</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * <code>int</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a <code>int</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder backoffMultiplier(
                int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a <code>int</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder initialDelay(
                String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a <code>org.apache.camel.LoggingLevel</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a <code>org.apache.camel.LoggingLevel</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder runLoggingLevel(
                String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public GoogleSheetsStreamConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a
         * <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder startScheduler(
                boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder startScheduler(
                String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * <code>java.util.concurrent.TimeUnit</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a <code>java.util.concurrent.TimeUnit</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a
         * <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder useFixedDelay(
                boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a <code>boolean</code> type.
         */
        public GoogleSheetsStreamConsumerBuilder useFixedDelay(
                String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (GoogleSheetsStreamConsumerBuilder) this;
        }
    }
    /**
     * The google-sheets component provides access to Google Sheets. Creates a
     * builder to build a consumer endpoint for the Google Sheets Stream
     * component.
     */
    public default GoogleSheetsStreamConsumerBuilder fromGoogleSheetsStream(
            String path) {
        return new GoogleSheetsStreamConsumerBuilder(path);
    }
}