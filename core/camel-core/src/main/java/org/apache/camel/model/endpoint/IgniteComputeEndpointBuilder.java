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
 * The Ignite Compute endpoint is one of camel-ignite endpoints which allows you
 * to run compute operations on the cluster by passing in an IgniteCallable, an
 * IgniteRunnable, an IgniteClosure, or collections of them, along with their
 * parameters if necessary.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteComputeEndpointBuilder {


    /**
     * Base class for the Ignite Compute component builders.
     */
    public static class IgniteComputeCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        IgniteComputeCommonBuilder(String path) {
            super("ignite-compute", path);
        }
        /**
         * The endpoint ID (not used).
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T endpointId(String endpointId) {
            this.properties.put("endpointId", endpointId);
            return (T) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            this.properties.put("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return (T) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            this.properties.put("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return (T) this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public T treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            this.properties.put("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return (T) this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public T treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            this.properties.put("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
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
     * Builder for endpoint producers for the Ignite Compute component.
     */
    public static class IgniteComputeProducerBuilder
            extends
                IgniteComputeCommonBuilder<IgniteComputeProducerBuilder>
            implements
                EndpointProducerBuilder {
        public IgniteComputeProducerBuilder(String path) {
            super(path);
        }
        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance.
         * The option is a
         * <code>org.apache.camel.component.ignite.ClusterGroupExpression</code>
         * type.
         * @group producer
         */
        public IgniteComputeProducerBuilder clusterGroupExpression(
                Object clusterGroupExpression) {
            this.properties.put("clusterGroupExpression", clusterGroupExpression);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance.
         * The option will be converted to a
         * <code>org.apache.camel.component.ignite.ClusterGroupExpression</code>
         * type.
         * @group producer
         */
        public IgniteComputeProducerBuilder clusterGroupExpression(
                String clusterGroupExpression) {
            this.properties.put("clusterGroupExpression", clusterGroupExpression);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * The name of the compute job, which will be set via
         * IgniteCompute#withName(String).
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public IgniteComputeProducerBuilder computeName(String computeName) {
            this.properties.put("computeName", computeName);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation.
         * The option is a
         * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> type.
         * @group producer
         */
        public IgniteComputeProducerBuilder executionType(
                IgniteComputeExecutionType executionType) {
            this.properties.put("executionType", executionType);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation.
         * The option will be converted to a
         * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> type.
         * @group producer
         */
        public IgniteComputeProducerBuilder executionType(String executionType) {
            this.properties.put("executionType", executionType);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * The task name, only applicable if using the
         * IgniteComputeExecutionType#EXECUTE execution type.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public IgniteComputeProducerBuilder taskName(String taskName) {
            this.properties.put("taskName", taskName);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long).
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        public IgniteComputeProducerBuilder timeoutMillis(Long timeoutMillis) {
            this.properties.put("timeoutMillis", timeoutMillis);
            return (IgniteComputeProducerBuilder) this;
        }
        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long).
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        public IgniteComputeProducerBuilder timeoutMillis(String timeoutMillis) {
            this.properties.put("timeoutMillis", timeoutMillis);
            return (IgniteComputeProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> enum.
     */
    public static enum IgniteComputeExecutionType {
        CALL, BROADCAST, APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN;
    }
    /**
     * The Ignite Compute endpoint is one of camel-ignite endpoints which allows
     * you to run compute operations on the cluster by passing in an
     * IgniteCallable, an IgniteRunnable, an IgniteClosure, or collections of
     * them, along with their parameters if necessary. Creates a builder to
     * build a producer endpoint for the Ignite Compute component.
     */
    public default IgniteComputeProducerBuilder toIgniteCompute(String path) {
        return new IgniteComputeProducerBuilder(path);
    }
}