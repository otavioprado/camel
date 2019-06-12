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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Component for working with documents stored in MongoDB database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MongoDbEndpointBuilder {


    /**
     * Base class for the MongoDB component builders.
     */
    public static class MongoDbCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        MongoDbCommonBuilder(String path) {
            super("mongodb3", path);
        }
        /**
         * Name of com.mongodb.Mongo to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T connectionBean(String connectionBean) {
            this.properties.put("connectionBean", connectionBean);
            return (T) this;
        }
        /**
         * Sets the name of the MongoDB collection to bind to this endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T collection(String collection) {
            this.properties.put("collection", collection);
            return (T) this;
        }
        /**
         * Sets the collection index (JSON FORMAT : { field1 : order1, field2 :
         * order2}).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T collectionIndex(String collectionIndex) {
            this.properties.put("collectionIndex", collectionIndex);
            return (T) this;
        }
        /**
         * Create collection during initialisation if it doesn't exist. Default
         * is true.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public T createCollection(boolean createCollection) {
            this.properties.put("createCollection", createCollection);
            return (T) this;
        }
        /**
         * Create collection during initialisation if it doesn't exist. Default
         * is true.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public T createCollection(String createCollection) {
            this.properties.put("createCollection", createCollection);
            return (T) this;
        }
        /**
         * Sets the name of the MongoDB database to target.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public T database(String database) {
            this.properties.put("database", database);
            return (T) this;
        }
        /**
         * Sets the operation this endpoint will execute against MongoDB. For
         * possible values, see MongoDbOperation.
         * The option is a
         * <code>org.apache.camel.component.mongodb3.MongoDbOperation</code>
         * type.
         * @group common
         */
        public T operation(MongoDbOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Sets the operation this endpoint will execute against MongoDB. For
         * possible values, see MongoDbOperation.
         * The option will be converted to a
         * <code>org.apache.camel.component.mongodb3.MongoDbOperation</code>
         * type.
         * @group common
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Convert the output of the producer to the selected type :
         * DocumentList Document or MongoIterable. DocumentList or MongoIterable
         * applies to findAll and aggregate. Document applies to all other
         * operations.
         * The option is a
         * <code>org.apache.camel.component.mongodb3.MongoDbOutputType</code>
         * type.
         * @group common
         */
        public T outputType(MongoDbOutputType outputType) {
            this.properties.put("outputType", outputType);
            return (T) this;
        }
        /**
         * Convert the output of the producer to the selected type :
         * DocumentList Document or MongoIterable. DocumentList or MongoIterable
         * applies to findAll and aggregate. Document applies to all other
         * operations.
         * The option will be converted to a
         * <code>org.apache.camel.component.mongodb3.MongoDbOutputType</code>
         * type.
         * @group common
         */
        public T outputType(String outputType) {
            this.properties.put("outputType", outputType);
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
         * MongoDB tailable cursors will block until new data arrives. If no new
         * data is inserted, after some time the cursor will be automatically
         * freed and closed by the MongoDB server. The client is expected to
         * regenerate the cursor if needed. This value specifies the time to
         * wait before attempting to fetch a new cursor, and if the attempt
         * fails, how long before the next attempt is made. Default value is
         * 1000ms.
         * The option is a <code>long</code> type.
         * @group advanced
         */
        public T cursorRegenerationDelay(long cursorRegenerationDelay) {
            this.properties.put("cursorRegenerationDelay", cursorRegenerationDelay);
            return (T) this;
        }
        /**
         * MongoDB tailable cursors will block until new data arrives. If no new
         * data is inserted, after some time the cursor will be automatically
         * freed and closed by the MongoDB server. The client is expected to
         * regenerate the cursor if needed. This value specifies the time to
         * wait before attempting to fetch a new cursor, and if the attempt
         * fails, how long before the next attempt is made. Default value is
         * 1000ms.
         * The option will be converted to a <code>long</code> type.
         * @group advanced
         */
        public T cursorRegenerationDelay(String cursorRegenerationDelay) {
            this.properties.put("cursorRegenerationDelay", cursorRegenerationDelay);
            return (T) this;
        }
        /**
         * Sets whether this endpoint will attempt to dynamically resolve the
         * target database and collection from the incoming Exchange properties.
         * Can be used to override at runtime the database and collection
         * specified on the otherwise static endpoint URI. It is disabled by
         * default to boost performance. Enabling it will take a minimal
         * performance hit.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T dynamicity(boolean dynamicity) {
            this.properties.put("dynamicity", dynamicity);
            return (T) this;
        }
        /**
         * Sets whether this endpoint will attempt to dynamically resolve the
         * target database and collection from the incoming Exchange properties.
         * Can be used to override at runtime the database and collection
         * specified on the otherwise static endpoint URI. It is disabled by
         * default to boost performance. Enabling it will take a minimal
         * performance hit.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T dynamicity(String dynamicity) {
            this.properties.put("dynamicity", dynamicity);
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
         * In write operations, it determines whether instead of returning
         * WriteResult as the body of the OUT message, we transfer the IN
         * message to the OUT and attach the WriteResult as a header.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T writeResultAsHeader(boolean writeResultAsHeader) {
            this.properties.put("writeResultAsHeader", writeResultAsHeader);
            return (T) this;
        }
        /**
         * In write operations, it determines whether instead of returning
         * WriteResult as the body of the OUT message, we transfer the IN
         * message to the OUT and attach the WriteResult as a header.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T writeResultAsHeader(String writeResultAsHeader) {
            this.properties.put("writeResultAsHeader", writeResultAsHeader);
            return (T) this;
        }
        /**
         * One tail tracking collection can host many trackers for several
         * tailable consumers. To keep them separate, each tracker should have
         * its own unique persistentId.
         * The option is a <code>java.lang.String</code> type.
         * @group tail
         */
        public T persistentId(String persistentId) {
            this.properties.put("persistentId", persistentId);
            return (T) this;
        }
        /**
         * Enable persistent tail tracking, which is a mechanism to keep track
         * of the last consumed message across system restarts. The next time
         * the system is up, the endpoint will recover the cursor from the point
         * where it last stopped slurping records.
         * The option is a <code>boolean</code> type.
         * @group tail
         */
        public T persistentTailTracking(boolean persistentTailTracking) {
            this.properties.put("persistentTailTracking", persistentTailTracking);
            return (T) this;
        }
        /**
         * Enable persistent tail tracking, which is a mechanism to keep track
         * of the last consumed message across system restarts. The next time
         * the system is up, the endpoint will recover the cursor from the point
         * where it last stopped slurping records.
         * The option will be converted to a <code>boolean</code> type.
         * @group tail
         */
        public T persistentTailTracking(String persistentTailTracking) {
            this.properties.put("persistentTailTracking", persistentTailTracking);
            return (T) this;
        }
        /**
         * Collection where tail tracking information will be persisted. If not
         * specified, MongoDbTailTrackingConfig#DEFAULT_COLLECTION will be used
         * by default.
         * The option is a <code>java.lang.String</code> type.
         * @group tail
         */
        public T tailTrackCollection(String tailTrackCollection) {
            this.properties.put("tailTrackCollection", tailTrackCollection);
            return (T) this;
        }
        /**
         * Indicates what database the tail tracking mechanism will persist to.
         * If not specified, the current database will be picked by default.
         * Dynamicity will not be taken into account even if enabled, i.e. the
         * tail tracking database will not vary past endpoint initialisation.
         * The option is a <code>java.lang.String</code> type.
         * @group tail
         */
        public T tailTrackDb(String tailTrackDb) {
            this.properties.put("tailTrackDb", tailTrackDb);
            return (T) this;
        }
        /**
         * Field where the last tracked value will be placed. If not specified,
         * MongoDbTailTrackingConfig#DEFAULT_FIELD will be used by default.
         * The option is a <code>java.lang.String</code> type.
         * @group tail
         */
        public T tailTrackField(String tailTrackField) {
            this.properties.put("tailTrackField", tailTrackField);
            return (T) this;
        }
        /**
         * Correlation field in the incoming record which is of increasing
         * nature and will be used to position the tailing cursor every time it
         * is generated. The cursor will be (re)created with a query of type:
         * tailTrackIncreasingField lastValue (possibly recovered from
         * persistent tail tracking). Can be of type Integer, Date, String, etc.
         * NOTE: No support for dot notation at the current time, so the field
         * should be at the top level of the document.
         * The option is a <code>java.lang.String</code> type.
         * @group tail
         */
        public T tailTrackIncreasingField(String tailTrackIncreasingField) {
            this.properties.put("tailTrackIncreasingField", tailTrackIncreasingField);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint consumers for the MongoDB component.
     */
    public static class MongoDbConsumerBuilder
            extends
                MongoDbCommonBuilder<MongoDbConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public MongoDbConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public MongoDbConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MongoDbConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public MongoDbConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MongoDbConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        public MongoDbConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MongoDbConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        public MongoDbConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MongoDbConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public MongoDbConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MongoDbConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public MongoDbConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MongoDbConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the MongoDB component.
     */
    public static class MongoDbProducerBuilder
            extends
                MongoDbCommonBuilder<MongoDbProducerBuilder>
            implements
                EndpointProducerBuilder {
        public MongoDbProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.mongodb3.MongoDbOperation</code> enum.
     */
    public static enum MongoDbOperation {
        findById, findOneByQuery, findAll, findDistinct, insert, save, update, remove, bulkWrite, aggregate, getDbStats, getColStats, count, command;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.mongodb3.MongoDbOutputType</code> enum.
     */
    public static enum MongoDbOutputType {
        DocumentList, Document, MongoIterable;
    }
    /**
     * Component for working with documents stored in MongoDB database. Creates
     * a builder to build a consumer endpoint for the MongoDB component.
     */
    public default MongoDbConsumerBuilder fromMongoDb(String path) {
        return new MongoDbConsumerBuilder(path);
    }
    /**
     * Component for working with documents stored in MongoDB database. Creates
     * a builder to build a producer endpoint for the MongoDB component.
     */
    public default MongoDbProducerBuilder toMongoDb(String path) {
        return new MongoDbProducerBuilder(path);
    }
}