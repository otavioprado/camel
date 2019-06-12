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
 * The cm-sms component allows to integrate with CM SMS Gateway.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CMEndpointBuilder {


    /**
     * Base class for the CM SMS Gateway component builders.
     */
    public static class CMCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        CMCommonBuilder(String path) {
            super("cm-sms", path);
        }
        /**
         * SMS Provider HOST with scheme. The option is a
         * <code>java.lang.String</code> type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * This is the sender name. The maximum length is 11 characters. The
         * option is a <code>java.lang.String</code> type.
         */
        public T defaultFrom(String defaultFrom) {
            this.properties.put("defaultFrom", defaultFrom);
            return (T) this;
        }
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters. The option
         * is a <code>int</code> type.
         */
        public T defaultMaxNumberOfParts(int defaultMaxNumberOfParts) {
            this.properties.put("defaultMaxNumberOfParts", defaultMaxNumberOfParts);
            return (T) this;
        }
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters. The option
         * will be converted to a <code>int</code> type.
         */
        public T defaultMaxNumberOfParts(String defaultMaxNumberOfParts) {
            this.properties.put("defaultMaxNumberOfParts", defaultMaxNumberOfParts);
            return (T) this;
        }
        /**
         * The unique token to use. The option is a
         * <code>java.lang.String</code> type.
         */
        public T productToken(String productToken) {
            this.properties.put("productToken", productToken);
            return (T) this;
        }
        /**
         * Whether to test the connection to the SMS Gateway on startup. The
         * option is a <code>boolean</code> type.
         */
        public T testConnectionOnStartup(boolean testConnectionOnStartup) {
            this.properties.put("testConnectionOnStartup", testConnectionOnStartup);
            return (T) this;
        }
        /**
         * Whether to test the connection to the SMS Gateway on startup. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T testConnectionOnStartup(String testConnectionOnStartup) {
            this.properties.put("testConnectionOnStartup", testConnectionOnStartup);
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
     * Builder for endpoint producers for the CM SMS Gateway component.
     */
    public static class CMProducerBuilder
            extends
                CMCommonBuilder<CMProducerBuilder>
            implements
                EndpointProducerBuilder {
        public CMProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The cm-sms component allows to integrate with CM SMS Gateway. Creates a
     * builder to build a producer endpoint for the CM SMS Gateway component.
     */
    public default CMProducerBuilder toCM(String path) {
        return new CMProducerBuilder(path);
    }
}