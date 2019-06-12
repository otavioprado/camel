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
 * The sap-netweaver component integrates with the SAP NetWeaver Gateway using
 * HTTP transports.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NetWeaverEndpointBuilder {


    /**
     * Base class for the SAP NetWeaver component builders.
     */
    public static class NetWeaverCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        NetWeaverCommonBuilder(String path) {
            super("sap-netweaver", path);
        }
        /**
         * Url to the SAP net-weaver gateway server.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T url(String url) {
            this.properties.put("url", url);
            return (T) this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T flatternMap(boolean flatternMap) {
            this.properties.put("flatternMap", flatternMap);
            return (T) this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T flatternMap(String flatternMap) {
            this.properties.put("flatternMap", flatternMap);
            return (T) this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T json(boolean json) {
            this.properties.put("json", json);
            return (T) this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T json(String json) {
            this.properties.put("json", json);
            return (T) this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T jsonAsMap(boolean jsonAsMap) {
            this.properties.put("jsonAsMap", jsonAsMap);
            return (T) this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T jsonAsMap(String jsonAsMap) {
            this.properties.put("jsonAsMap", jsonAsMap);
            return (T) this;
        }
        /**
         * Password for account.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Username for account.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T username(String username) {
            this.properties.put("username", username);
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
     * Builder for endpoint producers for the SAP NetWeaver component.
     */
    public static class NetWeaverProducerBuilder
            extends
                NetWeaverCommonBuilder<NetWeaverProducerBuilder>
            implements
                EndpointProducerBuilder {
        public NetWeaverProducerBuilder(String path) {
            super(path);
        }
    }
    /**
     * The sap-netweaver component integrates with the SAP NetWeaver Gateway
     * using HTTP transports. Creates a builder to build a producer endpoint for
     * the SAP NetWeaver component.
     */
    public default NetWeaverProducerBuilder toNetWeaver(String path) {
        return new NetWeaverProducerBuilder(path);
    }
}