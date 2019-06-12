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
 * The aws-lambda is used for managing and invoking functions from Amazon
 * Lambda.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LambdaEndpointBuilder {


    /**
     * Base class for the AWS Lambda component builders.
     */
    public static class LambdaCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        LambdaCommonBuilder(String path) {
            super("aws-lambda", path);
        }
        /**
         * Name of the Lambda function.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T function(String function) {
            this.properties.put("function", function);
            return (T) this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * The option is a
         * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code>
         * type.
         * @group producer
         */
        public T operation(LambdaOperations operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code>
         * type.
         * @group producer
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * The option is a <code>com.amazonaws.services.lambda.AWSLambda</code>
         * type.
         * @group advanced
         */
        public T awsLambdaClient(Object awsLambdaClient) {
            this.properties.put("awsLambdaClient", awsLambdaClient);
            return (T) this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * The option will be converted to a
         * <code>com.amazonaws.services.lambda.AWSLambda</code> type.
         * @group advanced
         */
        public T awsLambdaClient(String awsLambdaClient) {
            this.properties.put("awsLambdaClient", awsLambdaClient);
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
         * To define a proxy host when instantiating the Lambda client.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * The option is a <code>java.lang.Integer</code> type.
         * @group proxy
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group proxy
         */
        public T proxyPort(String proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * Amazon AWS Access Key.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (T) this;
        }
        /**
         * Amazon AWS Secret Key.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint producers for the AWS Lambda component.
     */
    public static class LambdaProducerBuilder
            extends
                LambdaCommonBuilder<LambdaProducerBuilder>
            implements
                EndpointProducerBuilder {
        public LambdaProducerBuilder(String path) {
            super(path);
        }
        /**
         * Amazon AWS Region.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public LambdaProducerBuilder region(String region) {
            this.properties.put("region", region);
            return (LambdaProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code> enum.
     */
    public static enum LambdaOperations {
        listFunctions, getFunction, createFunction, deleteFunction, invokeFunction, updateFunction, createEventSourceMapping, deleteEventSourceMapping, listEventSourceMapping, listTags, tagResource, untagResource, publishVersion, listVersions;
    }
    /**
     * The aws-lambda is used for managing and invoking functions from Amazon
     * Lambda. Creates a builder to build a producer endpoint for the AWS Lambda
     * component.
     */
    public default LambdaProducerBuilder toLambda(String path) {
        return new LambdaProducerBuilder(path);
    }
}