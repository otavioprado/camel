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
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The properties component is used for using property placeholders in endpoint
 * uris.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PropertiesEndpointBuilder {


    /**
     * Base class for the Properties component builders.
     */
    public static class PropertiesCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        PropertiesCommonBuilder(String path) {
            super("properties", path);
        }
        /**
         * Property key to use as placeholder. The option is a
         * <code>java.lang.String</code> type.
         */
        public T key(String key) {
            this.properties.put("key", key);
            return (T) this;
        }
        /**
         * Whether to silently ignore if a location cannot be located, such as a
         * properties file not found. The option is a <code>boolean</code> type.
         */
        public T ignoreMissingLocation(boolean ignoreMissingLocation) {
            this.properties.put("ignoreMissingLocation", ignoreMissingLocation);
            return (T) this;
        }
        /**
         * Whether to silently ignore if a location cannot be located, such as a
         * properties file not found. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T ignoreMissingLocation(String ignoreMissingLocation) {
            this.properties.put("ignoreMissingLocation", ignoreMissingLocation);
            return (T) this;
        }
        /**
         * A list of locations to load properties. You can use comma to separate
         * multiple locations. This option will override any default locations
         * and only use the locations from this option. The option is a
         * <code>java.util.List&lt;org.apache.camel.component.properties.PropertiesLocation&gt;</code> type.
         */
        public T locations(List<Object> locations) {
            this.properties.put("locations", locations);
            return (T) this;
        }
        /**
         * A list of locations to load properties. You can use comma to separate
         * multiple locations. This option will override any default locations
         * and only use the locations from this option. The option will be
         * converted to a
         * <code>java.util.List&lt;org.apache.camel.component.properties.PropertiesLocation&gt;</code> type.
         */
        public T locations(String locations) {
            this.properties.put("locations", locations);
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
     * Builder for endpoint consumers for the Properties component.
     */
    public static class PropertiesConsumerBuilder
            extends
                PropertiesCommonBuilder<PropertiesConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public PropertiesConsumerBuilder(String path) {
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
        public PropertiesConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (PropertiesConsumerBuilder) this;
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
        public PropertiesConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (PropertiesConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public PropertiesConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (PropertiesConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public PropertiesConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (PropertiesConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public PropertiesConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (PropertiesConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public PropertiesConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (PropertiesConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Properties component.
     */
    public static class PropertiesProducerBuilder
            extends
                PropertiesCommonBuilder<PropertiesProducerBuilder>
            implements
                EndpointProducerBuilder {
        public PropertiesProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The properties component is used for using property placeholders in
     * endpoint uris. Creates a builder to build a consumer endpoint for the
     * Properties component.
     */
    public default PropertiesConsumerBuilder fromProperties(String path) {
        return new PropertiesConsumerBuilder(path);
    }
    /**
     * The properties component is used for using property placeholders in
     * endpoint uris. Creates a builder to build a producer endpoint for the
     * Properties component.
     */
    public default PropertiesProducerBuilder toProperties(String path) {
        return new PropertiesProducerBuilder(path);
    }
}