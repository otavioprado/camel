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
 * The openstack-glance component allows messages to be sent to an OpenStack
 * image services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GlanceEndpointBuilder {


    /**
     * Base class for the OpenStack Glance component builders.
     */
    public static class GlanceCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        GlanceCommonBuilder(String path) {
            super("openstack-glance", path);
        }
        /**
         * OpenStack host url. The option is a <code>java.lang.String</code>
         * type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * OpenStack API version. The option is a <code>java.lang.String</code>
         * type.
         */
        public T apiVersion(String apiVersion) {
            this.properties.put("apiVersion", apiVersion);
            return (T) this;
        }
        /**
         * OpenStack configuration. The option is a
         * <code>org.openstack4j.core.transport.Config</code> type.
         */
        public T config(Object config) {
            this.properties.put("config", config);
            return (T) this;
        }
        /**
         * OpenStack configuration. The option will be converted to a
         * <code>org.openstack4j.core.transport.Config</code> type.
         */
        public T config(String config) {
            this.properties.put("config", config);
            return (T) this;
        }
        /**
         * Authentication domain. The option is a <code>java.lang.String</code>
         * type.
         */
        public T domain(String domain) {
            this.properties.put("domain", domain);
            return (T) this;
        }
        /**
         * The operation to do. The option is a <code>java.lang.String</code>
         * type.
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * OpenStack password. The option is a <code>java.lang.String</code>
         * type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * The project ID. The option is a <code>java.lang.String</code> type.
         */
        public T project(String project) {
            this.properties.put("project", project);
            return (T) this;
        }
        /**
         * OpenStack username. The option is a <code>java.lang.String</code>
         * type.
         */
        public T username(String username) {
            this.properties.put("username", username);
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
     * Builder for endpoint producers for the OpenStack Glance component.
     */
    public static class GlanceProducerBuilder
            extends
                GlanceCommonBuilder<GlanceProducerBuilder>
            implements
                EndpointProducerBuilder {
        public GlanceProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The openstack-glance component allows messages to be sent to an OpenStack
     * image services. Creates a builder to build a producer endpoint for the
     * OpenStack Glance component.
     */
    public default GlanceProducerBuilder toGlance(String path) {
        return new GlanceProducerBuilder(path);
    }
}