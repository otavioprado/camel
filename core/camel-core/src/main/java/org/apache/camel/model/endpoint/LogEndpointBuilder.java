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
 * The log component logs message exchanges to the underlying logging mechanism.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LogEndpointBuilder {


    /**
     * Base class for the Log component builders.
     */
    public static class LogCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        LogCommonBuilder(String path) {
            super("log", path);
        }
        /**
         * The logger name to use.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T loggerName(String loggerName) {
            this.properties.put("loggerName", loggerName);
            return (T) this;
        }
        /**
         * If true, will hide stats when no new messages have been received for
         * a time interval, if false, show stats regardless of message traffic.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        public T groupActiveOnly(Boolean groupActiveOnly) {
            this.properties.put("groupActiveOnly", groupActiveOnly);
            return (T) this;
        }
        /**
         * If true, will hide stats when no new messages have been received for
         * a time interval, if false, show stats regardless of message traffic.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        public T groupActiveOnly(String groupActiveOnly) {
            this.properties.put("groupActiveOnly", groupActiveOnly);
            return (T) this;
        }
        /**
         * Set the initial delay for stats (in millis).
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        public T groupDelay(Long groupDelay) {
            this.properties.put("groupDelay", groupDelay);
            return (T) this;
        }
        /**
         * Set the initial delay for stats (in millis).
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        public T groupDelay(String groupDelay) {
            this.properties.put("groupDelay", groupDelay);
            return (T) this;
        }
        /**
         * If specified will group message stats by this time interval (in
         * millis).
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        public T groupInterval(Long groupInterval) {
            this.properties.put("groupInterval", groupInterval);
            return (T) this;
        }
        /**
         * If specified will group message stats by this time interval (in
         * millis).
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        public T groupInterval(String groupInterval) {
            this.properties.put("groupInterval", groupInterval);
            return (T) this;
        }
        /**
         * An integer that specifies a group size for throughput logging.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        public T groupSize(Integer groupSize) {
            this.properties.put("groupSize", groupSize);
            return (T) this;
        }
        /**
         * An integer that specifies a group size for throughput logging.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        public T groupSize(String groupSize) {
            this.properties.put("groupSize", groupSize);
            return (T) this;
        }
        /**
         * Logging level to use. The default value is INFO.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T level(String level) {
            this.properties.put("level", level);
            return (T) this;
        }
        /**
         * If true, mask sensitive information like password or passphrase in
         * the log.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        public T logMask(Boolean logMask) {
            this.properties.put("logMask", logMask);
            return (T) this;
        }
        /**
         * If true, mask sensitive information like password or passphrase in
         * the log.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        public T logMask(String logMask) {
            this.properties.put("logMask", logMask);
            return (T) this;
        }
        /**
         * An optional Marker name to use.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T marker(String marker) {
            this.properties.put("marker", marker);
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
         * Limits the number of characters logged per line.
         * The option is a <code>int</code> type.
         * @group formatting
         */
        public T maxChars(int maxChars) {
            this.properties.put("maxChars", maxChars);
            return (T) this;
        }
        /**
         * Limits the number of characters logged per line.
         * The option will be converted to a <code>int</code> type.
         * @group formatting
         */
        public T maxChars(String maxChars) {
            this.properties.put("maxChars", maxChars);
            return (T) this;
        }
        /**
         * If enabled then each information is outputted on a newline.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T multiline(boolean multiline) {
            this.properties.put("multiline", multiline);
            return (T) this;
        }
        /**
         * If enabled then each information is outputted on a newline.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T multiline(String multiline) {
            this.properties.put("multiline", multiline);
            return (T) this;
        }
        /**
         * Quick option for turning all options on. (multiline, maxChars has to
         * be manually set if to be used).
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showAll(boolean showAll) {
            this.properties.put("showAll", showAll);
            return (T) this;
        }
        /**
         * Quick option for turning all options on. (multiline, maxChars has to
         * be manually set if to be used).
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showAll(String showAll) {
            this.properties.put("showAll", showAll);
            return (T) this;
        }
        /**
         * Show the message body.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showBody(boolean showBody) {
            this.properties.put("showBody", showBody);
            return (T) this;
        }
        /**
         * Show the message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showBody(String showBody) {
            this.properties.put("showBody", showBody);
            return (T) this;
        }
        /**
         * Show the body Java type.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showBodyType(boolean showBodyType) {
            this.properties.put("showBodyType", showBodyType);
            return (T) this;
        }
        /**
         * Show the body Java type.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showBodyType(String showBodyType) {
            this.properties.put("showBodyType", showBodyType);
            return (T) this;
        }
        /**
         * f the exchange has a caught exception, show the exception message (no
         * stack trace).A caught exception is stored as a property on the
         * exchange (using the key org.apache.camel.Exchange#EXCEPTION_CAUGHT
         * and for instance a doCatch can catch exceptions.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showCaughtException(boolean showCaughtException) {
            this.properties.put("showCaughtException", showCaughtException);
            return (T) this;
        }
        /**
         * f the exchange has a caught exception, show the exception message (no
         * stack trace).A caught exception is stored as a property on the
         * exchange (using the key org.apache.camel.Exchange#EXCEPTION_CAUGHT
         * and for instance a doCatch can catch exceptions.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showCaughtException(String showCaughtException) {
            this.properties.put("showCaughtException", showCaughtException);
            return (T) this;
        }
        /**
         * If the exchange has an exception, show the exception message (no
         * stacktrace).
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showException(boolean showException) {
            this.properties.put("showException", showException);
            return (T) this;
        }
        /**
         * If the exchange has an exception, show the exception message (no
         * stacktrace).
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showException(String showException) {
            this.properties.put("showException", showException);
            return (T) this;
        }
        /**
         * Show the unique exchange ID.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showExchangeId(boolean showExchangeId) {
            this.properties.put("showExchangeId", showExchangeId);
            return (T) this;
        }
        /**
         * Show the unique exchange ID.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showExchangeId(String showExchangeId) {
            this.properties.put("showExchangeId", showExchangeId);
            return (T) this;
        }
        /**
         * Shows the Message Exchange Pattern (or MEP for short).
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showExchangePattern(boolean showExchangePattern) {
            this.properties.put("showExchangePattern", showExchangePattern);
            return (T) this;
        }
        /**
         * Shows the Message Exchange Pattern (or MEP for short).
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showExchangePattern(String showExchangePattern) {
            this.properties.put("showExchangePattern", showExchangePattern);
            return (T) this;
        }
        /**
         * If enabled Camel will output files.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showFiles(boolean showFiles) {
            this.properties.put("showFiles", showFiles);
            return (T) this;
        }
        /**
         * If enabled Camel will output files.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showFiles(String showFiles) {
            this.properties.put("showFiles", showFiles);
            return (T) this;
        }
        /**
         * If enabled Camel will on Future objects wait for it to complete to
         * obtain the payload to be logged.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showFuture(boolean showFuture) {
            this.properties.put("showFuture", showFuture);
            return (T) this;
        }
        /**
         * If enabled Camel will on Future objects wait for it to complete to
         * obtain the payload to be logged.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showFuture(String showFuture) {
            this.properties.put("showFuture", showFuture);
            return (T) this;
        }
        /**
         * Show the message headers.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showHeaders(boolean showHeaders) {
            this.properties.put("showHeaders", showHeaders);
            return (T) this;
        }
        /**
         * Show the message headers.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showHeaders(String showHeaders) {
            this.properties.put("showHeaders", showHeaders);
            return (T) this;
        }
        /**
         * If the exchange has an out message, show the out message.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showOut(boolean showOut) {
            this.properties.put("showOut", showOut);
            return (T) this;
        }
        /**
         * If the exchange has an out message, show the out message.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showOut(String showOut) {
            this.properties.put("showOut", showOut);
            return (T) this;
        }
        /**
         * Show the exchange properties.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showProperties(boolean showProperties) {
            this.properties.put("showProperties", showProperties);
            return (T) this;
        }
        /**
         * Show the exchange properties.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showProperties(String showProperties) {
            this.properties.put("showProperties", showProperties);
            return (T) this;
        }
        /**
         * Show the stack trace, if an exchange has an exception. Only effective
         * if one of showAll, showException or showCaughtException are enabled.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showStackTrace(boolean showStackTrace) {
            this.properties.put("showStackTrace", showStackTrace);
            return (T) this;
        }
        /**
         * Show the stack trace, if an exchange has an exception. Only effective
         * if one of showAll, showException or showCaughtException are enabled.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showStackTrace(String showStackTrace) {
            this.properties.put("showStackTrace", showStackTrace);
            return (T) this;
        }
        /**
         * Whether Camel should show stream bodies or not (eg such as
         * java.io.InputStream). Beware if you enable this option then you may
         * not be able later to access the message body as the stream have
         * already been read by this logger. To remedy this you will have to use
         * Stream Caching.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T showStreams(boolean showStreams) {
            this.properties.put("showStreams", showStreams);
            return (T) this;
        }
        /**
         * Whether Camel should show stream bodies or not (eg such as
         * java.io.InputStream). Beware if you enable this option then you may
         * not be able later to access the message body as the stream have
         * already been read by this logger. To remedy this you will have to use
         * Stream Caching.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T showStreams(String showStreams) {
            this.properties.put("showStreams", showStreams);
            return (T) this;
        }
        /**
         * Whether to skip line separators when logging the message body.This
         * allows to log the message body in one line, setting this option to
         * false will preserve any line separators from the body, which then
         * will log the body as is.
         * The option is a <code>boolean</code> type.
         * @group formatting
         */
        public T skipBodyLineSeparator(boolean skipBodyLineSeparator) {
            this.properties.put("skipBodyLineSeparator", skipBodyLineSeparator);
            return (T) this;
        }
        /**
         * Whether to skip line separators when logging the message body.This
         * allows to log the message body in one line, setting this option to
         * false will preserve any line separators from the body, which then
         * will log the body as is.
         * The option will be converted to a <code>boolean</code> type.
         * @group formatting
         */
        public T skipBodyLineSeparator(String skipBodyLineSeparator) {
            this.properties.put("skipBodyLineSeparator", skipBodyLineSeparator);
            return (T) this;
        }
        /**
         * Sets the outputs style to use.
         * The option is a
         * <code>org.apache.camel.support.processor.DefaultExchangeFormatter$OutputStyle</code> type.
         * @group formatting
         */
        public T style(OutputStyle style) {
            this.properties.put("style", style);
            return (T) this;
        }
        /**
         * Sets the outputs style to use.
         * The option will be converted to a
         * <code>org.apache.camel.support.processor.DefaultExchangeFormatter$OutputStyle</code> type.
         * @group formatting
         */
        public T style(String style) {
            this.properties.put("style", style);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint producers for the Log component.
     */
    public static class LogProducerBuilder
            extends
                LogCommonBuilder<LogProducerBuilder>
            implements
                EndpointProducerBuilder {
        public LogProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.support.processor.DefaultExchangeFormatter$OutputStyle</code> enum.
     */
    public static enum OutputStyle {
        Default, Tab, Fixed;
    }
    /**
     * The log component logs message exchanges to the underlying logging
     * mechanism. Creates a builder to build a producer endpoint for the Log
     * component.
     */
    public default LogProducerBuilder toLog(String path) {
        return new LogProducerBuilder(path);
    }
}