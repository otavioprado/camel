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
 * The jolt component allows you to process a JSON messages using an JOLT
 * specification (such as JSON-JSON transformation).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JoltEndpointBuilder {


    /**
     * Base class for the JOLT component builders.
     */
    public static class JoltCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        JoltCommonBuilder(String path) {
            super("jolt", path);
        }
        /**
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod. The option is a <code>java.lang.String</code>
         * type.
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Sets whether to use resource content cache or not. The option is a
         * <code>boolean</code> type.
         */
        public T contentCache(boolean contentCache) {
            this.properties.put("contentCache", contentCache);
            return (T) this;
        }
        /**
         * Sets whether to use resource content cache or not. The option will be
         * converted to a <code>boolean</code> type.
         */
        public T contentCache(String contentCache) {
            this.properties.put("contentCache", contentCache);
            return (T) this;
        }
        /**
         * Specifies if the input is hydrated JSON or a JSON String. The option
         * is a <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         */
        public T inputType(JoltInputOutputType inputType) {
            this.properties.put("inputType", inputType);
            return (T) this;
        }
        /**
         * Specifies if the input is hydrated JSON or a JSON String. The option
         * will be converted to a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         */
        public T inputType(String inputType) {
            this.properties.put("inputType", inputType);
            return (T) this;
        }
        /**
         * Specifies if the output should be hydrated JSON or a JSON String. The
         * option is a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         */
        public T outputType(JoltInputOutputType outputType) {
            this.properties.put("outputType", outputType);
            return (T) this;
        }
        /**
         * Specifies if the output should be hydrated JSON or a JSON String. The
         * option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltInputOutputType</code>
         * type.
         */
        public T outputType(String outputType) {
            this.properties.put("outputType", outputType);
            return (T) this;
        }
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used. The option is a
         * <code>org.apache.camel.component.jolt.JoltTransformType</code> type.
         */
        public T transformDsl(JoltTransformType transformDsl) {
            this.properties.put("transformDsl", transformDsl);
            return (T) this;
        }
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used. The option will be converted to a
         * <code>org.apache.camel.component.jolt.JoltTransformType</code> type.
         */
        public T transformDsl(String transformDsl) {
            this.properties.put("transformDsl", transformDsl);
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
     * Builder for endpoint producers for the JOLT component.
     */
    public static class JoltProducerBuilder
            extends
                JoltCommonBuilder<JoltProducerBuilder>
            implements
                EndpointProducerBuilder {
        public JoltProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jolt.JoltInputOutputType</code> enum.
     */
    public static enum JoltInputOutputType {
        Hydrated, JsonString;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jolt.JoltTransformType</code> enum.
     */
    public static enum JoltTransformType {
        Chainr, Shiftr, Defaultr, Removr, Sortr;
    }
    /**
     * The jolt component allows you to process a JSON messages using an JOLT
     * specification (such as JSON-JSON transformation). Creates a builder to
     * build a producer endpoint for the JOLT component.
     */
    public default JoltProducerBuilder toJolt(String path) {
        return new JoltProducerBuilder(path);
    }
}