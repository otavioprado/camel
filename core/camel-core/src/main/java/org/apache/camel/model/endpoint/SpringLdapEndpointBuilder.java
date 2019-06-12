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
 * The spring-ldap component allows you to perform searches in LDAP servers
 * using filters as the message payload.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SpringLdapEndpointBuilder {


    /**
     * Base class for the Spring LDAP component builders.
     */
    public static class SpringLdapCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        SpringLdapCommonBuilder(String path) {
            super("spring-ldap", path);
        }
        /**
         * Name of the Spring LDAP Template bean.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T templateName(String templateName) {
            this.properties.put("templateName", templateName);
            return (T) this;
        }
        /**
         * The LDAP operation to be performed.
         * The option is a
         * <code>org.apache.camel.component.springldap.LdapOperation</code>
         * type.
         * @group producer
         */
        public T operation(LdapOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * The LDAP operation to be performed.
         * The option will be converted to a
         * <code>org.apache.camel.component.springldap.LdapOperation</code>
         * type.
         * @group producer
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * The scope of the search operation.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T scope(String scope) {
            this.properties.put("scope", scope);
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
     * Builder for endpoint producers for the Spring LDAP component.
     */
    public static class SpringLdapProducerBuilder
            extends
                SpringLdapCommonBuilder<SpringLdapProducerBuilder>
            implements
                EndpointProducerBuilder {
        public SpringLdapProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.springldap.LdapOperation</code> enum.
     */
    public static enum LdapOperation {
        SEARCH, BIND, UNBIND, AUTHENTICATE, MODIFY_ATTRIBUTES, FUNCTION_DRIVEN;
    }
    /**
     * The spring-ldap component allows you to perform searches in LDAP servers
     * using filters as the message payload. Creates a builder to build a
     * producer endpoint for the Spring LDAP component.
     */
    public default SpringLdapProducerBuilder toSpringLdap(String path) {
        return new SpringLdapProducerBuilder(path);
    }
}