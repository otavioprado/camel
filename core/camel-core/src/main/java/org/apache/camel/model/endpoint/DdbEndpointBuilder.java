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
 * The aws-ddb component is used for storing and retrieving data from Amazon's
 * DynamoDB service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DdbEndpointBuilder {


    /**
     * Base class for the AWS DynamoDB component builders.
     */
    public static class DdbCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        DdbCommonBuilder(String path) {
            super("aws-ddb", path);
        }
        /**
         * The name of the table currently worked with. The option is a
         * <code>java.lang.String</code> type.
         */
        public T tableName(String tableName) {
            this.properties.put("tableName", tableName);
            return (T) this;
        }
        /**
         * To use the AmazonDynamoDB as the client. The option is a
         * <code>com.amazonaws.services.dynamodbv2.AmazonDynamoDB</code> type.
         */
        public T amazonDDBClient(Object amazonDDBClient) {
            this.properties.put("amazonDDBClient", amazonDDBClient);
            return (T) this;
        }
        /**
         * To use the AmazonDynamoDB as the client. The option will be converted
         * to a <code>com.amazonaws.services.dynamodbv2.AmazonDynamoDB</code>
         * type.
         */
        public T amazonDDBClient(String amazonDDBClient) {
            this.properties.put("amazonDDBClient", amazonDDBClient);
            return (T) this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read. The option is a <code>boolean</code> type.
         */
        public T consistentRead(boolean consistentRead) {
            this.properties.put("consistentRead", consistentRead);
            return (T) this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read. The option will be converted to a <code>boolean</code>
         * type.
         */
        public T consistentRead(String consistentRead) {
            this.properties.put("consistentRead", consistentRead);
            return (T) this;
        }
        /**
         * Attribute name when creating table. The option is a
         * <code>java.lang.String</code> type.
         */
        public T keyAttributeName(String keyAttributeName) {
            this.properties.put("keyAttributeName", keyAttributeName);
            return (T) this;
        }
        /**
         * Attribute type when creating table. The option is a
         * <code>java.lang.String</code> type.
         */
        public T keyAttributeType(String keyAttributeType) {
            this.properties.put("keyAttributeType", keyAttributeType);
            return (T) this;
        }
        /**
         * What operation to perform. The option is a
         * <code>org.apache.camel.component.aws.ddb.DdbOperations</code> type.
         */
        public T operation(DdbOperations operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * What operation to perform. The option will be converted to a
         * <code>org.apache.camel.component.aws.ddb.DdbOperations</code> type.
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * To define a proxy host when instantiating the DDB client. The option
         * is a <code>java.lang.String</code> type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * To define a proxy port when instantiating the DDB client. The option
         * is a <code>java.lang.Integer</code> type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * To define a proxy port when instantiating the DDB client. The option
         * will be converted to a <code>java.lang.Integer</code> type.
         */
        public T proxyPort(String proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table. The option is a <code>java.lang.Long</code> type.
         */
        public T readCapacity(Long readCapacity) {
            this.properties.put("readCapacity", readCapacity);
            return (T) this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table. The option will be converted to a <code>java.lang.Long</code>
         * type.
         */
        public T readCapacity(String readCapacity) {
            this.properties.put("readCapacity", readCapacity);
            return (T) this;
        }
        /**
         * The region in which DDB client needs to work. The option is a
         * <code>java.lang.String</code> type.
         */
        public T region(String region) {
            this.properties.put("region", region);
            return (T) this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table. The option is a <code>java.lang.Long</code> type.
         */
        public T writeCapacity(Long writeCapacity) {
            this.properties.put("writeCapacity", writeCapacity);
            return (T) this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table. The option will be converted to a <code>java.lang.Long</code>
         * type.
         */
        public T writeCapacity(String writeCapacity) {
            this.properties.put("writeCapacity", writeCapacity);
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
        /**
         * Amazon AWS Access Key. The option is a <code>java.lang.String</code>
         * type.
         */
        public T accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (T) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a <code>java.lang.String</code>
         * type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint producers for the AWS DynamoDB component.
     */
    public static class DdbProducerBuilder
            extends
                DdbCommonBuilder<DdbProducerBuilder>
            implements
                EndpointProducerBuilder {
        public DdbProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.ddb.DdbOperations</code> enum.
     */
    public static enum DdbOperations {
        BatchGetItems, DeleteItem, DeleteTable, DescribeTable, GetItem, PutItem, Query, Scan, UpdateItem, UpdateTable;
    }
    /**
     * The aws-ddb component is used for storing and retrieving data from
     * Amazon's DynamoDB service. Creates a builder to build a producer endpoint
     * for the AWS DynamoDB component.
     */
    public default DdbProducerBuilder toDdb(String path) {
        return new DdbProducerBuilder(path);
    }
}