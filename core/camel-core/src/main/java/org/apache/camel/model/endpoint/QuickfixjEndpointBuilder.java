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
 * The quickfix component allows to send Financial Interchange (FIX) messages to
 * the QuickFix engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QuickfixjEndpointBuilder {


    /**
     * Base class for the QuickFix component builders.
     */
    public static class QuickfixjCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        QuickfixjCommonBuilder(String path) {
            super("quickfix", path);
        }
        /**
         * The configFile is the name of the QuickFIX/J configuration to use for
         * the FIX engine (located as a resource found in your classpath).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T configurationName(String configurationName) {
            this.properties.put("configurationName", configurationName);
            return (T) this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T lazyCreateEngine(boolean lazyCreateEngine) {
            this.properties.put("lazyCreateEngine", lazyCreateEngine);
            return (T) this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T lazyCreateEngine(String lazyCreateEngine) {
            this.properties.put("lazyCreateEngine", lazyCreateEngine);
            return (T) this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option is a <code>quickfix.SessionID</code> type.
         * @group common
         */
        public T sessionID(Object sessionID) {
            this.properties.put("sessionID", sessionID);
            return (T) this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option will be converted to a <code>quickfix.SessionID</code>
         * type.
         * @group common
         */
        public T sessionID(String sessionID) {
            this.properties.put("sessionID", sessionID);
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
     * Builder for endpoint consumers for the QuickFix component.
     */
    public static class QuickfixjConsumerBuilder
            extends
                QuickfixjCommonBuilder<QuickfixjConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public QuickfixjConsumerBuilder(String path) {
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
        public QuickfixjConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (QuickfixjConsumerBuilder) this;
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
        public QuickfixjConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (QuickfixjConsumerBuilder) this;
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
        public QuickfixjConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (QuickfixjConsumerBuilder) this;
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
        public QuickfixjConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (QuickfixjConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public QuickfixjConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (QuickfixjConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public QuickfixjConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (QuickfixjConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the QuickFix component.
     */
    public static class QuickfixjProducerBuilder
            extends
                QuickfixjCommonBuilder<QuickfixjProducerBuilder>
            implements
                EndpointProducerBuilder {
        public QuickfixjProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The quickfix component allows to send Financial Interchange (FIX)
     * messages to the QuickFix engine. Creates a builder to build a consumer
     * endpoint for the QuickFix component.
     */
    public default QuickfixjConsumerBuilder fromQuickfixj(String path) {
        return new QuickfixjConsumerBuilder(path);
    }
    /**
     * The quickfix component allows to send Financial Interchange (FIX)
     * messages to the QuickFix engine. Creates a builder to build a producer
     * endpoint for the QuickFix component.
     */
    public default QuickfixjProducerBuilder toQuickfixj(String path) {
        return new QuickfixjProducerBuilder(path);
    }
}