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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The salesforce component is used for integrating Camel with the massive
 * Salesforce API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SalesforceEndpointBuilder {


    /**
     * Base class for the Salesforce component builders.
     */
    public static class SalesforceCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        SalesforceCommonBuilder(String path) {
            super("salesforce", path);
        }
        /**
         * APEX method name. The option is a <code>java.lang.String</code> type.
         */
        public T apexMethod(String apexMethod) {
            this.properties.put("apexMethod", apexMethod);
            return (T) this;
        }
        /**
         * Query params for APEX method. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public T apexQueryParams(Map<String, Object> apexQueryParams) {
            this.properties.put("apexQueryParams", apexQueryParams);
            return (T) this;
        }
        /**
         * Query params for APEX method. The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public T apexQueryParams(String apexQueryParams) {
            this.properties.put("apexQueryParams", apexQueryParams);
            return (T) this;
        }
        /**
         * APEX method URL. The option is a <code>java.lang.String</code> type.
         */
        public T apexUrl(String apexUrl) {
            this.properties.put("apexUrl", apexUrl);
            return (T) this;
        }
        /**
         * Salesforce API version, defaults to
         * SalesforceEndpointConfig.DEFAULT_VERSION. The option is a
         * <code>java.lang.String</code> type.
         */
        public T apiVersion(String apiVersion) {
            this.properties.put("apiVersion", apiVersion);
            return (T) this;
        }
        /**
         * Backoff interval increment for Streaming connection restart attempts
         * for failures beyond CometD auto-reconnect. The option is a
         * <code>long</code> type.
         */
        public T backoffIncrement(long backoffIncrement) {
            this.properties.put("backoffIncrement", backoffIncrement);
            return (T) this;
        }
        /**
         * Backoff interval increment for Streaming connection restart attempts
         * for failures beyond CometD auto-reconnect. The option will be
         * converted to a <code>long</code> type.
         */
        public T backoffIncrement(String backoffIncrement) {
            this.properties.put("backoffIncrement", backoffIncrement);
            return (T) this;
        }
        /**
         * Bulk API Batch ID. The option is a <code>java.lang.String</code>
         * type.
         */
        public T batchId(String batchId) {
            this.properties.put("batchId", batchId);
            return (T) this;
        }
        /**
         * Bulk API content type, one of XML, CSV, ZIP_XML, ZIP_CSV. The option
         * is a
         * <code>org.apache.camel.component.salesforce.api.dto.bulk.ContentType</code> type.
         */
        public T contentType(ContentType contentType) {
            this.properties.put("contentType", contentType);
            return (T) this;
        }
        /**
         * Bulk API content type, one of XML, CSV, ZIP_XML, ZIP_CSV. The option
         * will be converted to a
         * <code>org.apache.camel.component.salesforce.api.dto.bulk.ContentType</code> type.
         */
        public T contentType(String contentType) {
            this.properties.put("contentType", contentType);
            return (T) this;
        }
        /**
         * Default replayId setting if no value is found in initialReplayIdMap.
         * The option is a <code>java.lang.Long</code> type.
         */
        public T defaultReplayId(Long defaultReplayId) {
            this.properties.put("defaultReplayId", defaultReplayId);
            return (T) this;
        }
        /**
         * Default replayId setting if no value is found in initialReplayIdMap.
         * The option will be converted to a <code>java.lang.Long</code> type.
         */
        public T defaultReplayId(String defaultReplayId) {
            this.properties.put("defaultReplayId", defaultReplayId);
            return (T) this;
        }
        /**
         * Payload format to use for Salesforce API calls, either JSON or XML,
         * defaults to JSON. The option is a
         * <code>org.apache.camel.component.salesforce.internal.PayloadFormat</code> type.
         */
        public T format(PayloadFormat format) {
            this.properties.put("format", format);
            return (T) this;
        }
        /**
         * Payload format to use for Salesforce API calls, either JSON or XML,
         * defaults to JSON. The option will be converted to a
         * <code>org.apache.camel.component.salesforce.internal.PayloadFormat</code> type.
         */
        public T format(String format) {
            this.properties.put("format", format);
            return (T) this;
        }
        /**
         * Custom Jetty Http Client to use to connect to Salesforce. The option
         * is a
         * <code>org.apache.camel.component.salesforce.SalesforceHttpClient</code> type.
         */
        public T httpClient(Object httpClient) {
            this.properties.put("httpClient", httpClient);
            return (T) this;
        }
        /**
         * Custom Jetty Http Client to use to connect to Salesforce. The option
         * will be converted to a
         * <code>org.apache.camel.component.salesforce.SalesforceHttpClient</code> type.
         */
        public T httpClient(String httpClient) {
            this.properties.put("httpClient", httpClient);
            return (T) this;
        }
        /**
         * Include details in Salesforce1 Analytics report, defaults to false.
         * The option is a <code>java.lang.Boolean</code> type.
         */
        public T includeDetails(Boolean includeDetails) {
            this.properties.put("includeDetails", includeDetails);
            return (T) this;
        }
        /**
         * Include details in Salesforce1 Analytics report, defaults to false.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         */
        public T includeDetails(String includeDetails) {
            this.properties.put("includeDetails", includeDetails);
            return (T) this;
        }
        /**
         * Replay IDs to start from per channel name. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Long&gt;</code>
         * type.
         */
        public T initialReplayIdMap(Map<String, Long> initialReplayIdMap) {
            this.properties.put("initialReplayIdMap", initialReplayIdMap);
            return (T) this;
        }
        /**
         * Replay IDs to start from per channel name. The option will be
         * converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Long&gt;</code> type.
         */
        public T initialReplayIdMap(String initialReplayIdMap) {
            this.properties.put("initialReplayIdMap", initialReplayIdMap);
            return (T) this;
        }
        /**
         * Salesforce1 Analytics report execution instance ID. The option is a
         * <code>java.lang.String</code> type.
         */
        public T instanceId(String instanceId) {
            this.properties.put("instanceId", instanceId);
            return (T) this;
        }
        /**
         * Bulk API Job ID. The option is a <code>java.lang.String</code> type.
         */
        public T jobId(String jobId) {
            this.properties.put("jobId", jobId);
            return (T) this;
        }
        /**
         * Limit on number of returned records. Applicable to some of the API,
         * check the Salesforce documentation. The option is a
         * <code>java.lang.Integer</code> type.
         */
        public T limit(Integer limit) {
            this.properties.put("limit", limit);
            return (T) this;
        }
        /**
         * Limit on number of returned records. Applicable to some of the API,
         * check the Salesforce documentation. The option will be converted to a
         * <code>java.lang.Integer</code> type.
         */
        public T limit(String limit) {
            this.properties.put("limit", limit);
            return (T) this;
        }
        /**
         * Maximum backoff interval for Streaming connection restart attempts
         * for failures beyond CometD auto-reconnect. The option is a
         * <code>long</code> type.
         */
        public T maxBackoff(long maxBackoff) {
            this.properties.put("maxBackoff", maxBackoff);
            return (T) this;
        }
        /**
         * Maximum backoff interval for Streaming connection restart attempts
         * for failures beyond CometD auto-reconnect. The option will be
         * converted to a <code>long</code> type.
         */
        public T maxBackoff(String maxBackoff) {
            this.properties.put("maxBackoff", maxBackoff);
            return (T) this;
        }
        /**
         * Sets the behaviour of 404 not found status received from Salesforce
         * API. Should the body be set to NULL NotFoundBehaviour#NULL or should
         * a exception be signaled on the exchange NotFoundBehaviour#EXCEPTION -
         * the default. The option is a
         * <code>org.apache.camel.component.salesforce.NotFoundBehaviour</code>
         * type.
         */
        public T notFoundBehaviour(NotFoundBehaviour notFoundBehaviour) {
            this.properties.put("notFoundBehaviour", notFoundBehaviour);
            return (T) this;
        }
        /**
         * Sets the behaviour of 404 not found status received from Salesforce
         * API. Should the body be set to NULL NotFoundBehaviour#NULL or should
         * a exception be signaled on the exchange NotFoundBehaviour#EXCEPTION -
         * the default. The option will be converted to a
         * <code>org.apache.camel.component.salesforce.NotFoundBehaviour</code>
         * type.
         */
        public T notFoundBehaviour(String notFoundBehaviour) {
            this.properties.put("notFoundBehaviour", notFoundBehaviour);
            return (T) this;
        }
        /**
         * Notify for fields, options are ALL, REFERENCED, SELECT, WHERE. The
         * option is a
         * <code>org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum</code> type.
         */
        public T notifyForFields(NotifyForFieldsEnum notifyForFields) {
            this.properties.put("notifyForFields", notifyForFields);
            return (T) this;
        }
        /**
         * Notify for fields, options are ALL, REFERENCED, SELECT, WHERE. The
         * option will be converted to a
         * <code>org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum</code> type.
         */
        public T notifyForFields(String notifyForFields) {
            this.properties.put("notifyForFields", notifyForFields);
            return (T) this;
        }
        /**
         * Notify for create operation, defaults to false (API version = 29.0).
         * The option is a <code>java.lang.Boolean</code> type.
         */
        public T notifyForOperationCreate(Boolean notifyForOperationCreate) {
            this.properties.put("notifyForOperationCreate", notifyForOperationCreate);
            return (T) this;
        }
        /**
         * Notify for create operation, defaults to false (API version = 29.0).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         */
        public T notifyForOperationCreate(String notifyForOperationCreate) {
            this.properties.put("notifyForOperationCreate", notifyForOperationCreate);
            return (T) this;
        }
        /**
         * Notify for delete operation, defaults to false (API version = 29.0).
         * The option is a <code>java.lang.Boolean</code> type.
         */
        public T notifyForOperationDelete(Boolean notifyForOperationDelete) {
            this.properties.put("notifyForOperationDelete", notifyForOperationDelete);
            return (T) this;
        }
        /**
         * Notify for delete operation, defaults to false (API version = 29.0).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         */
        public T notifyForOperationDelete(String notifyForOperationDelete) {
            this.properties.put("notifyForOperationDelete", notifyForOperationDelete);
            return (T) this;
        }
        /**
         * Notify for operations, options are ALL, CREATE, EXTENDED, UPDATE (API
         * version 29.0). The option is a
         * <code>org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum</code> type.
         */
        public T notifyForOperations(NotifyForOperationsEnum notifyForOperations) {
            this.properties.put("notifyForOperations", notifyForOperations);
            return (T) this;
        }
        /**
         * Notify for operations, options are ALL, CREATE, EXTENDED, UPDATE (API
         * version 29.0). The option will be converted to a
         * <code>org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum</code> type.
         */
        public T notifyForOperations(String notifyForOperations) {
            this.properties.put("notifyForOperations", notifyForOperations);
            return (T) this;
        }
        /**
         * Notify for un-delete operation, defaults to false (API version =
         * 29.0). The option is a <code>java.lang.Boolean</code> type.
         */
        public T notifyForOperationUndelete(Boolean notifyForOperationUndelete) {
            this.properties.put("notifyForOperationUndelete", notifyForOperationUndelete);
            return (T) this;
        }
        /**
         * Notify for un-delete operation, defaults to false (API version =
         * 29.0). The option will be converted to a
         * <code>java.lang.Boolean</code> type.
         */
        public T notifyForOperationUndelete(String notifyForOperationUndelete) {
            this.properties.put("notifyForOperationUndelete", notifyForOperationUndelete);
            return (T) this;
        }
        /**
         * Notify for update operation, defaults to false (API version = 29.0).
         * The option is a <code>java.lang.Boolean</code> type.
         */
        public T notifyForOperationUpdate(Boolean notifyForOperationUpdate) {
            this.properties.put("notifyForOperationUpdate", notifyForOperationUpdate);
            return (T) this;
        }
        /**
         * Notify for update operation, defaults to false (API version = 29.0).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         */
        public T notifyForOperationUpdate(String notifyForOperationUpdate) {
            this.properties.put("notifyForOperationUpdate", notifyForOperationUpdate);
            return (T) this;
        }
        /**
         * Custom Jackson ObjectMapper to use when serializing/deserializing
         * Salesforce objects. The option is a
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         */
        public T objectMapper(Object objectMapper) {
            this.properties.put("objectMapper", objectMapper);
            return (T) this;
        }
        /**
         * Custom Jackson ObjectMapper to use when serializing/deserializing
         * Salesforce objects. The option will be converted to a
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         */
        public T objectMapper(String objectMapper) {
            this.properties.put("objectMapper", objectMapper);
            return (T) this;
        }
        /**
         * Use raw payload String for request and response (either JSON or XML
         * depending on format), instead of DTOs, false by default. The option
         * is a <code>boolean</code> type.
         */
        public T rawPayload(boolean rawPayload) {
            this.properties.put("rawPayload", rawPayload);
            return (T) this;
        }
        /**
         * Use raw payload String for request and response (either JSON or XML
         * depending on format), instead of DTOs, false by default. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T rawPayload(String rawPayload) {
            this.properties.put("rawPayload", rawPayload);
            return (T) this;
        }
        /**
         * Salesforce1 Analytics report Id. The option is a
         * <code>java.lang.String</code> type.
         */
        public T reportId(String reportId) {
            this.properties.put("reportId", reportId);
            return (T) this;
        }
        /**
         * Salesforce1 Analytics report metadata for filtering. The option is a
         * <code>org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata</code> type.
         */
        public T reportMetadata(Object reportMetadata) {
            this.properties.put("reportMetadata", reportMetadata);
            return (T) this;
        }
        /**
         * Salesforce1 Analytics report metadata for filtering. The option will
         * be converted to a
         * <code>org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata</code> type.
         */
        public T reportMetadata(String reportMetadata) {
            this.properties.put("reportMetadata", reportMetadata);
            return (T) this;
        }
        /**
         * Bulk API Result ID. The option is a <code>java.lang.String</code>
         * type.
         */
        public T resultId(String resultId) {
            this.properties.put("resultId", resultId);
            return (T) this;
        }
        /**
         * Should the NULL values of given DTO be serialized with empty (NULL)
         * values. This affects only JSON data format. The option is a
         * <code>boolean</code> type.
         */
        public T serializeNulls(boolean serializeNulls) {
            this.properties.put("serializeNulls", serializeNulls);
            return (T) this;
        }
        /**
         * Should the NULL values of given DTO be serialized with empty (NULL)
         * values. This affects only JSON data format. The option will be
         * converted to a <code>boolean</code> type.
         */
        public T serializeNulls(String serializeNulls) {
            this.properties.put("serializeNulls", serializeNulls);
            return (T) this;
        }
        /**
         * SObject blob field name. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectBlobFieldName(String sObjectBlobFieldName) {
            this.properties.put("sObjectBlobFieldName", sObjectBlobFieldName);
            return (T) this;
        }
        /**
         * Fully qualified SObject class name, usually generated using
         * camel-salesforce-maven-plugin. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectClass(String sObjectClass) {
            this.properties.put("sObjectClass", sObjectClass);
            return (T) this;
        }
        /**
         * SObject fields to retrieve. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectFields(String sObjectFields) {
            this.properties.put("sObjectFields", sObjectFields);
            return (T) this;
        }
        /**
         * SObject ID if required by API. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectId(String sObjectId) {
            this.properties.put("sObjectId", sObjectId);
            return (T) this;
        }
        /**
         * SObject external ID field name. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectIdName(String sObjectIdName) {
            this.properties.put("sObjectIdName", sObjectIdName);
            return (T) this;
        }
        /**
         * SObject external ID field value. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectIdValue(String sObjectIdValue) {
            this.properties.put("sObjectIdValue", sObjectIdValue);
            return (T) this;
        }
        /**
         * SObject name if required or supported by API. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectName(String sObjectName) {
            this.properties.put("sObjectName", sObjectName);
            return (T) this;
        }
        /**
         * Salesforce SOQL query string. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectQuery(String sObjectQuery) {
            this.properties.put("sObjectQuery", sObjectQuery);
            return (T) this;
        }
        /**
         * Salesforce SOSL search string. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sObjectSearch(String sObjectSearch) {
            this.properties.put("sObjectSearch", sObjectSearch);
            return (T) this;
        }
        /**
         * Whether to update an existing Push Topic when using the Streaming
         * API, defaults to false. The option is a <code>boolean</code> type.
         */
        public T updateTopic(boolean updateTopic) {
            this.properties.put("updateTopic", updateTopic);
            return (T) this;
        }
        /**
         * Whether to update an existing Push Topic when using the Streaming
         * API, defaults to false. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T updateTopic(String updateTopic) {
            this.properties.put("updateTopic", updateTopic);
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
     * Builder for endpoint consumers for the Salesforce component.
     */
    public static class SalesforceConsumerBuilder
            extends
                SalesforceCommonBuilder<SalesforceConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public SalesforceConsumerBuilder(String path) {
            super(path);
        }
        /**
         * The name of the topic/channel to use. The option is a
         * <code>java.lang.String</code> type.
         */
        public SalesforceConsumerBuilder topicName(String topicName) {
            this.properties.put("topicName", topicName);
            return (SalesforceConsumerBuilder) this;
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
        public SalesforceConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SalesforceConsumerBuilder) this;
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
        public SalesforceConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SalesforceConsumerBuilder) this;
        }
        /**
         * The replayId value to use when subscribing. The option is a
         * <code>java.lang.Long</code> type.
         */
        public SalesforceConsumerBuilder replayId(Long replayId) {
            this.properties.put("replayId", replayId);
            return (SalesforceConsumerBuilder) this;
        }
        /**
         * The replayId value to use when subscribing. The option will be
         * converted to a <code>java.lang.Long</code> type.
         */
        public SalesforceConsumerBuilder replayId(String replayId) {
            this.properties.put("replayId", replayId);
            return (SalesforceConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public SalesforceConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SalesforceConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public SalesforceConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SalesforceConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SalesforceConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SalesforceConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SalesforceConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SalesforceConsumerBuilder) this;
        }
    }

    /**
     * Builder for endpoint producers for the Salesforce component.
     */
    public static class SalesforceProducerBuilder
            extends
                SalesforceCommonBuilder<SalesforceProducerBuilder>
            implements
                EndpointProducerBuilder {
        public SalesforceProducerBuilder(String path) {
            super(path);
        }
        /**
         * The operation to use. The option is a
         * <code>org.apache.camel.component.salesforce.internal.OperationName</code> type.
         */
        public SalesforceProducerBuilder operationName(
                OperationName operationName) {
            this.properties.put("operationName", operationName);
            return (SalesforceProducerBuilder) this;
        }
        /**
         * The operation to use. The option will be converted to a
         * <code>org.apache.camel.component.salesforce.internal.OperationName</code> type.
         */
        public SalesforceProducerBuilder operationName(String operationName) {
            this.properties.put("operationName", operationName);
            return (SalesforceProducerBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.salesforce.internal.OperationName</code>
     * enum.
     */
    public static enum OperationName {
        GET_VERSIONS, GET_RESOURCES, GET_GLOBAL_OBJECTS, GET_BASIC_INFO, GET_DESCRIPTION, GET_SOBJECT, CREATE_SOBJECT, UPDATE_SOBJECT, DELETE_SOBJECT, GET_SOBJECT_WITH_ID, UPSERT_SOBJECT, DELETE_SOBJECT_WITH_ID, GET_BLOB_FIELD, QUERY, QUERY_MORE, QUERY_ALL, SEARCH, APEX_CALL, RECENT, CREATE_JOB, GET_JOB, CLOSE_JOB, ABORT_JOB, CREATE_BATCH, GET_BATCH, GET_ALL_BATCHES, GET_REQUEST, GET_RESULTS, CREATE_BATCH_QUERY, GET_QUERY_RESULT_IDS, GET_QUERY_RESULT, GET_RECENT_REPORTS, GET_REPORT_DESCRIPTION, EXECUTE_SYNCREPORT, EXECUTE_ASYNCREPORT, GET_REPORT_INSTANCES, GET_REPORT_RESULTS, LIMITS, APPROVAL, APPROVALS, COMPOSITE_TREE, COMPOSITE_BATCH, COMPOSITE;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.salesforce.api.dto.bulk.ContentType</code> enum.
     */
    public static enum ContentType {
        XML, CSV, JSON, ZIP_XML, ZIP_CSV, ZIP_JSON;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.salesforce.internal.PayloadFormat</code>
     * enum.
     */
    public static enum PayloadFormat {
        JSON, XML;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.salesforce.NotFoundBehaviour</code>
     * enum.
     */
    public static enum NotFoundBehaviour {
        EXCEPTION, NULL;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum</code> enum.
     */
    public static enum NotifyForFieldsEnum {
        ALL, REFERENCED, SELECT, WHERE;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum</code> enum.
     */
    public static enum NotifyForOperationsEnum {
        ALL, CREATE, EXTENDED, UPDATE;
    }
    /**
     * The salesforce component is used for integrating Camel with the massive
     * Salesforce API. Creates a builder to build a consumer endpoint for the
     * Salesforce component.
     */
    public default SalesforceConsumerBuilder fromSalesforce(String path) {
        return new SalesforceConsumerBuilder(path);
    }
    /**
     * The salesforce component is used for integrating Camel with the massive
     * Salesforce API. Creates a builder to build a producer endpoint for the
     * Salesforce component.
     */
    public default SalesforceProducerBuilder toSalesforce(String path) {
        return new SalesforceProducerBuilder(path);
    }
}