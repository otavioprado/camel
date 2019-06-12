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

import java.io.File;
import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * To insert or query from Apache Lucene databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LuceneEndpointBuilder {


    /**
     * Base class for the Lucene component builders.
     */
    public static class LuceneCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        LuceneCommonBuilder(String path) {
            super("lucene", path);
        }
        /**
         * The URL to the lucene server.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Operation to do such as insert or query.
         * The option is a
         * <code>org.apache.camel.component.lucene.LuceneOperation</code> type.
         * @group producer
         */
        public T operation(LuceneOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Operation to do such as insert or query.
         * The option will be converted to a
         * <code>org.apache.camel.component.lucene.LuceneOperation</code> type.
         * @group producer
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box.
         * The option is a <code>org.apache.lucene.analysis.Analyzer</code>
         * type.
         * @group producer
         */
        public T analyzer(Object analyzer) {
            this.properties.put("analyzer", analyzer);
            return (T) this;
        }
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box.
         * The option will be converted to a
         * <code>org.apache.lucene.analysis.Analyzer</code> type.
         * @group producer
         */
        public T analyzer(String analyzer) {
            this.properties.put("analyzer", analyzer);
            return (T) this;
        }
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer.
         * The option is a <code>java.io.File</code> type.
         * @group producer
         */
        public T indexDir(File indexDir) {
            this.properties.put("indexDir", indexDir);
            return (T) this;
        }
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer.
         * The option will be converted to a <code>java.io.File</code> type.
         * @group producer
         */
        public T indexDir(String indexDir) {
            this.properties.put("indexDir", indexDir);
            return (T) this;
        }
        /**
         * An integer value that limits the result set of the search operation.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T maxHits(int maxHits) {
            this.properties.put("maxHits", maxHits);
            return (T) this;
        }
        /**
         * An integer value that limits the result set of the search operation.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T maxHits(String maxHits) {
            this.properties.put("maxHits", maxHits);
            return (T) this;
        }
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         * The option is a <code>java.io.File</code> type.
         * @group producer
         */
        public T srcDir(File srcDir) {
            this.properties.put("srcDir", srcDir);
            return (T) this;
        }
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         * The option will be converted to a <code>java.io.File</code> type.
         * @group producer
         */
        public T srcDir(String srcDir) {
            this.properties.put("srcDir", srcDir);
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
     * Builder for endpoint producers for the Lucene component.
     */
    public static class LuceneProducerBuilder
            extends
                LuceneCommonBuilder<LuceneProducerBuilder>
            implements
                EndpointProducerBuilder {
        public LuceneProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.lucene.LuceneOperation</code> enum.
     */
    public static enum LuceneOperation {
        insert, query;
    }
    /**
     * To insert or query from Apache Lucene databases. Creates a builder to
     * build a producer endpoint for the Lucene component.
     */
    public default LuceneProducerBuilder toLucene(String path) {
        return new LuceneProducerBuilder(path);
    }
}