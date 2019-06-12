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
 * For uploading, downloading and managing files, folders, groups,
 * collaborations, etc on dropbox DOT com.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DropboxEndpointBuilder {


    /**
     * Base class for the Dropbox component builders.
     */
    public static class DropboxCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        DropboxCommonBuilder(String path) {
            super("dropbox", path);
        }
        /**
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder. The option is a
         * <code>org.apache.camel.component.dropbox.util.DropboxOperation</code>
         * type.
         */
        public T operation(DropboxOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder. The option will be converted to a
         * <code>org.apache.camel.component.dropbox.util.DropboxOperation</code>
         * type.
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * The option is a <code>java.lang.String</code> type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client. The option
         * is a <code>com.dropbox.core.v2.DbxClientV2</code> type.
         */
        public T client(Object client) {
            this.properties.put("client", client);
            return (T) this;
        }
        /**
         * To use an existing DbxClient instance as DropBox client. The option
         * will be converted to a <code>com.dropbox.core.v2.DbxClientV2</code>
         * type.
         */
        public T client(String client) {
            this.properties.put("client", client);
            return (T) this;
        }
        /**
         * Name of the app registered to make API requests. The option is a
         * <code>java.lang.String</code> type.
         */
        public T clientIdentifier(String clientIdentifier) {
            this.properties.put("clientIdentifier", clientIdentifier);
            return (T) this;
        }
        /**
         * Optional folder or file to upload on Dropbox from the local
         * filesystem. If this option has not been configured then the message
         * body is used as the content to upload. The option is a
         * <code>java.lang.String</code> type.
         */
        public T localPath(String localPath) {
            this.properties.put("localPath", localPath);
            return (T) this;
        }
        /**
         * Destination file or folder. The option is a
         * <code>java.lang.String</code> type.
         */
        public T newRemotePath(String newRemotePath) {
            this.properties.put("newRemotePath", newRemotePath);
            return (T) this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched. The option is a
         * <code>java.lang.String</code> type.
         */
        public T query(String query) {
            this.properties.put("query", query);
            return (T) this;
        }
        /**
         * Original file or folder to move. The option is a
         * <code>java.lang.String</code> type.
         */
        public T remotePath(String remotePath) {
            this.properties.put("remotePath", remotePath);
            return (T) this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten. The option is a
         * <code>org.apache.camel.component.dropbox.util.DropboxUploadMode</code> type.
         */
        public T uploadMode(DropboxUploadMode uploadMode) {
            this.properties.put("uploadMode", uploadMode);
            return (T) this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten. The option will be converted to a
         * <code>org.apache.camel.component.dropbox.util.DropboxUploadMode</code> type.
         */
        public T uploadMode(String uploadMode) {
            this.properties.put("uploadMode", uploadMode);
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
     * Builder for endpoint consumers for the Dropbox component.
     */
    public static class DropboxConsumerBuilder
            extends
                DropboxCommonBuilder<DropboxConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public DropboxConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a <code>boolean</code> type.
         */
        public DropboxConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DropboxConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a <code>boolean</code> type.
         */
        public DropboxConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DropboxConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public DropboxConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DropboxConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public DropboxConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DropboxConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public DropboxConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DropboxConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public DropboxConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DropboxConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Dropbox component.
     */
    public static class DropboxProducerBuilder
            extends
                DropboxCommonBuilder<DropboxProducerBuilder>
            implements
                EndpointProducerBuilder {
        public DropboxProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.dropbox.util.DropboxOperation</code>
     * enum.
     */
    public static enum DropboxOperation {
        put, del, search, get, move;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.dropbox.util.DropboxUploadMode</code>
     * enum.
     */
    public static enum DropboxUploadMode {
        add, force;
    }
    /**
     * For uploading, downloading and managing files, folders, groups,
     * collaborations, etc on dropbox DOT com. Creates a builder to build a
     * consumer endpoint for the Dropbox component.
     */
    public default DropboxConsumerBuilder fromDropbox(String path) {
        return new DropboxConsumerBuilder(path);
    }
    /**
     * For uploading, downloading and managing files, folders, groups,
     * collaborations, etc on dropbox DOT com. Creates a builder to build a
     * producer endpoint for the Dropbox component.
     */
    public default DropboxProducerBuilder toDropbox(String path) {
        return new DropboxProducerBuilder(path);
    }
}