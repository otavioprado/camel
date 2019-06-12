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
 * The camel etcd component allows you to work with Etcd, a distributed reliable
 * key-value store.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EtcdEndpointBuilder {


    /**
     * Base class for the etcd component builders.
     */
    public static class EtcdCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        EtcdCommonBuilder(String path) {
            super("etcd", path);
        }
        /**
         * The API namespace to use. The option is a
         * <code>org.apache.camel.component.etcd.EtcdNamespace</code> type.
         */
        public T namespace(EtcdNamespace namespace) {
            this.properties.put("namespace", namespace);
            return (T) this;
        }
        /**
         * The API namespace to use. The option will be converted to a
         * <code>org.apache.camel.component.etcd.EtcdNamespace</code> type.
         */
        public T namespace(String namespace) {
            this.properties.put("namespace", namespace);
            return (T) this;
        }
        /**
         * The path the endpoint refers to. The option is a
         * <code>java.lang.String</code> type.
         */
        public T path(String path) {
            this.properties.put("path", path);
            return (T) this;
        }
        /**
         * To apply an action recursively. The option is a <code>boolean</code>
         * type.
         */
        public T recursive(boolean recursive) {
            this.properties.put("recursive", recursive);
            return (T) this;
        }
        /**
         * To apply an action recursively. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T recursive(String recursive) {
            this.properties.put("recursive", recursive);
            return (T) this;
        }
        /**
         * The path to look for for service discovery. The option is a
         * <code>java.lang.String</code> type.
         */
        public T servicePath(String servicePath) {
            this.properties.put("servicePath", servicePath);
            return (T) this;
        }
        /**
         * To set the maximum time an action could take to complete. The option
         * is a <code>java.lang.Long</code> type.
         */
        public T timeout(Long timeout) {
            this.properties.put("timeout", timeout);
            return (T) this;
        }
        /**
         * To set the maximum time an action could take to complete. The option
         * will be converted to a <code>java.lang.Long</code> type.
         */
        public T timeout(String timeout) {
            this.properties.put("timeout", timeout);
            return (T) this;
        }
        /**
         * To set the URIs the client connects. The option is a
         * <code>java.lang.String</code> type.
         */
        public T uris(String uris) {
            this.properties.put("uris", uris);
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
         * The password to use for basic authentication. The option is a
         * <code>java.lang.String</code> type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option will be
         * converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         */
        public T sslContextParameters(String sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * The user name to use for basic authentication. The option is a
         * <code>java.lang.String</code> type.
         */
        public T userName(String userName) {
            this.properties.put("userName", userName);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the etcd component.
     */
    public static class EtcdConsumerBuilder
            extends
                EtcdCommonBuilder<EtcdConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public EtcdConsumerBuilder(String path) {
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
        public EtcdConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (EtcdConsumerBuilder) this;
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
        public EtcdConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To send an empty message in case of timeout watching for a key. The
         * option is a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder sendEmptyExchangeOnTimeout(
                boolean sendEmptyExchangeOnTimeout) {
            this.properties.put("sendEmptyExchangeOnTimeout", sendEmptyExchangeOnTimeout);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To send an empty message in case of timeout watching for a key. The
         * option will be converted to a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder sendEmptyExchangeOnTimeout(
                String sendEmptyExchangeOnTimeout) {
            this.properties.put("sendEmptyExchangeOnTimeout", sendEmptyExchangeOnTimeout);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * <code>boolean</code> type.
         */
        public EtcdConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public EtcdConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public EtcdConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public EtcdConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public EtcdConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The index to watch from. The option is a <code>java.lang.Long</code>
         * type.
         */
        public EtcdConsumerBuilder fromIndex(Long fromIndex) {
            this.properties.put("fromIndex", fromIndex);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The index to watch from. The option will be converted to a
         * <code>java.lang.Long</code> type.
         */
        public EtcdConsumerBuilder fromIndex(String fromIndex) {
            this.properties.put("fromIndex", fromIndex);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         */
        public EtcdConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a <code>org.apache.camel.spi.PollingConsumerPollStrategy</code>
         * type.
         */
        public EtcdConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a <code>int</code> type.
         */
        public EtcdConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a <code>int</code> type.
         */
        public EtcdConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a <code>int</code>
         * type.
         */
        public EtcdConsumerBuilder backoffIdleThreshold(int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * <code>int</code> type.
         */
        public EtcdConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a <code>int</code> type.
         */
        public EtcdConsumerBuilder backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a <code>int</code> type.
         */
        public EtcdConsumerBuilder backoffMultiplier(String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public EtcdConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public EtcdConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public EtcdConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public EtcdConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a <code>org.apache.camel.LoggingLevel</code> type.
         */
        public EtcdConsumerBuilder runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a <code>org.apache.camel.LoggingLevel</code>
         * type.
         */
        public EtcdConsumerBuilder runLoggingLevel(String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public EtcdConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public EtcdConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public EtcdConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public EtcdConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public EtcdConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public EtcdConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a
         * <code>boolean</code> type.
         */
        public EtcdConsumerBuilder startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder startScheduler(String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * <code>java.util.concurrent.TimeUnit</code> type.
         */
        public EtcdConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a <code>java.util.concurrent.TimeUnit</code> type.
         */
        public EtcdConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a
         * <code>boolean</code> type.
         */
        public EtcdConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (EtcdConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a <code>boolean</code> type.
         */
        public EtcdConsumerBuilder useFixedDelay(String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (EtcdConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the etcd component.
     */
    public static class EtcdProducerBuilder
            extends
                EtcdCommonBuilder<EtcdProducerBuilder>
            implements
                EndpointProducerBuilder {
        public EtcdProducerBuilder(String path) {
            super(path);
        }
        /**
         * To set the lifespan of a key in milliseconds. The option is a
         * <code>java.lang.Integer</code> type.
         */
        public EtcdProducerBuilder timeToLive(Integer timeToLive) {
            this.properties.put("timeToLive", timeToLive);
            return (EtcdProducerBuilder) this;
        }
        /**
         * To set the lifespan of a key in milliseconds. The option will be
         * converted to a <code>java.lang.Integer</code> type.
         */
        public EtcdProducerBuilder timeToLive(String timeToLive) {
            this.properties.put("timeToLive", timeToLive);
            return (EtcdProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.etcd.EtcdNamespace</code>
     * enum.
     */
    public static enum EtcdNamespace {
        stats, watch, keys;
    }
    /**
     * The camel etcd component allows you to work with Etcd, a distributed
     * reliable key-value store. Creates a builder to build a consumer endpoint
     * for the etcd component.
     */
    public default EtcdConsumerBuilder fromEtcd(String path) {
        return new EtcdConsumerBuilder(path);
    }
    /**
     * The camel etcd component allows you to work with Etcd, a distributed
     * reliable key-value store. Creates a builder to build a producer endpoint
     * for the etcd component.
     */
    public default EtcdProducerBuilder toEtcd(String path) {
        return new EtcdProducerBuilder(path);
    }
}