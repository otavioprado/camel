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
 * The aws-kms is used for managing Amazon ECS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ECSEndpointBuilder {


    /**
     * Base class for the AWS ECS component builders.
     */
    public static class ECSCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        ECSCommonBuilder(String path) {
            super("aws-ecs", path);
        }
        /**
         * Logical name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T label(String label) {
            this.properties.put("label", label);
            return (T) this;
        }
        /**
         * The region in which ECS client needs to work.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T region(String region) {
            this.properties.put("region", region);
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
     * Builder for endpoint producers for the AWS ECS component.
     */
    public static class ECSProducerBuilder
            extends
                ECSCommonBuilder<ECSProducerBuilder>
            implements
                EndpointProducerBuilder {
        public ECSProducerBuilder(String path) {
            super(path);
        }
        /**
         * Amazon AWS Access Key.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public ECSProducerBuilder accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (ECSProducerBuilder) this;
        }
        /**
         * To use a existing configured AWS ECS as client.
         * The option is a <code>com.amazonaws.services.ecs.AmazonECS</code>
         * type.
         * @group producer
         */
        public ECSProducerBuilder ecsClient(Object ecsClient) {
            this.properties.put("ecsClient", ecsClient);
            return (ECSProducerBuilder) this;
        }
        /**
         * To use a existing configured AWS ECS as client.
         * The option will be converted to a
         * <code>com.amazonaws.services.ecs.AmazonECS</code> type.
         * @group producer
         */
        public ECSProducerBuilder ecsClient(String ecsClient) {
            this.properties.put("ecsClient", ecsClient);
            return (ECSProducerBuilder) this;
        }
        /**
         * The operation to perform.
         * The option is a
         * <code>org.apache.camel.component.aws.ecs.ECSOperations</code> type.
         * @group producer
         */
        public ECSProducerBuilder operation(ECSOperations operation) {
            this.properties.put("operation", operation);
            return (ECSProducerBuilder) this;
        }
        /**
         * The operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.ecs.ECSOperations</code> type.
         * @group producer
         */
        public ECSProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (ECSProducerBuilder) this;
        }
        /**
         * To define a proxy host when instantiating the ECS client.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public ECSProducerBuilder proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (ECSProducerBuilder) this;
        }
        /**
         * To define a proxy port when instantiating the ECS client.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        public ECSProducerBuilder proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (ECSProducerBuilder) this;
        }
        /**
         * To define a proxy port when instantiating the ECS client.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        public ECSProducerBuilder proxyPort(String proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (ECSProducerBuilder) this;
        }
        /**
         * Amazon AWS Secret Key.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public ECSProducerBuilder secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (ECSProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.ecs.ECSOperations</code> enum.
     */
    public static enum ECSOperations {
        listClusters, describeCluster, createCluster, deleteCluster;
    }
    /**
     * The aws-kms is used for managing Amazon ECS Creates a builder to build a
     * producer endpoint for the AWS ECS component.
     */
    public default ECSProducerBuilder toECS(String path) {
        return new ECSProducerBuilder(path);
    }
}