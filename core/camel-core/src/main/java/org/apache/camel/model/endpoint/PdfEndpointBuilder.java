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
 * The pdf components provides the ability to create, modify or extract content
 * from PDF documents.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PdfEndpointBuilder {


    /**
     * Base class for the PDF component builders.
     */
    public static class PdfCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        PdfCommonBuilder(String path) {
            super("pdf", path);
        }
        /**
         * Operation type.
         * The option is a
         * <code>org.apache.camel.component.pdf.PdfOperation</code> type.
         * @group producer
         */
        public T operation(PdfOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Operation type.
         * The option will be converted to a
         * <code>org.apache.camel.component.pdf.PdfOperation</code> type.
         * @group producer
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Font.
         * The option is a <code>org.apache.pdfbox.pdmodel.font.PDFont</code>
         * type.
         * @group producer
         */
        public T font(Object font) {
            this.properties.put("font", font);
            return (T) this;
        }
        /**
         * Font.
         * The option will be converted to a
         * <code>org.apache.pdfbox.pdmodel.font.PDFont</code> type.
         * @group producer
         */
        public T font(String font) {
            this.properties.put("font", font);
            return (T) this;
        }
        /**
         * Font size in pixels.
         * The option is a <code>float</code> type.
         * @group producer
         */
        public T fontSize(float fontSize) {
            this.properties.put("fontSize", fontSize);
            return (T) this;
        }
        /**
         * Font size in pixels.
         * The option will be converted to a <code>float</code> type.
         * @group producer
         */
        public T fontSize(String fontSize) {
            this.properties.put("fontSize", fontSize);
            return (T) this;
        }
        /**
         * Margin bottom in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T marginBottom(int marginBottom) {
            this.properties.put("marginBottom", marginBottom);
            return (T) this;
        }
        /**
         * Margin bottom in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T marginBottom(String marginBottom) {
            this.properties.put("marginBottom", marginBottom);
            return (T) this;
        }
        /**
         * Margin left in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T marginLeft(int marginLeft) {
            this.properties.put("marginLeft", marginLeft);
            return (T) this;
        }
        /**
         * Margin left in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T marginLeft(String marginLeft) {
            this.properties.put("marginLeft", marginLeft);
            return (T) this;
        }
        /**
         * Margin right in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T marginRight(int marginRight) {
            this.properties.put("marginRight", marginRight);
            return (T) this;
        }
        /**
         * Margin right in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T marginRight(String marginRight) {
            this.properties.put("marginRight", marginRight);
            return (T) this;
        }
        /**
         * Margin top in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        public T marginTop(int marginTop) {
            this.properties.put("marginTop", marginTop);
            return (T) this;
        }
        /**
         * Margin top in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        public T marginTop(String marginTop) {
            this.properties.put("marginTop", marginTop);
            return (T) this;
        }
        /**
         * Page size.
         * The option is a
         * <code>org.apache.pdfbox.pdmodel.common.PDRectangle</code> type.
         * @group producer
         */
        public T pageSize(Object pageSize) {
            this.properties.put("pageSize", pageSize);
            return (T) this;
        }
        /**
         * Page size.
         * The option will be converted to a
         * <code>org.apache.pdfbox.pdmodel.common.PDRectangle</code> type.
         * @group producer
         */
        public T pageSize(String pageSize) {
            this.properties.put("pageSize", pageSize);
            return (T) this;
        }
        /**
         * Text processing to use. autoFormatting: Text is getting sliced by
         * words, then max amount of words that fits in the line will be written
         * into pdf document. With this strategy all words that doesn't fit in
         * the line will be moved to the new line. lineTermination: Builds set
         * of classes for line-termination writing strategy. Text getting sliced
         * by line termination symbol and then it will be written regardless it
         * fits in the line or not.
         * The option is a
         * <code>org.apache.camel.component.pdf.TextProcessingFactory</code>
         * type.
         * @group producer
         */
        public T textProcessingFactory(
                TextProcessingFactory textProcessingFactory) {
            this.properties.put("textProcessingFactory", textProcessingFactory);
            return (T) this;
        }
        /**
         * Text processing to use. autoFormatting: Text is getting sliced by
         * words, then max amount of words that fits in the line will be written
         * into pdf document. With this strategy all words that doesn't fit in
         * the line will be moved to the new line. lineTermination: Builds set
         * of classes for line-termination writing strategy. Text getting sliced
         * by line termination symbol and then it will be written regardless it
         * fits in the line or not.
         * The option will be converted to a
         * <code>org.apache.camel.component.pdf.TextProcessingFactory</code>
         * type.
         * @group producer
         */
        public T textProcessingFactory(String textProcessingFactory) {
            this.properties.put("textProcessingFactory", textProcessingFactory);
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
     * Builder for endpoint producers for the PDF component.
     */
    public static class PdfProducerBuilder
            extends
                PdfCommonBuilder<PdfProducerBuilder>
            implements
                EndpointProducerBuilder {
        public PdfProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.pdf.PdfOperation</code>
     * enum.
     */
    public static enum PdfOperation {
        create, append, extractText;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.pdf.TextProcessingFactory</code> enum.
     */
    public static enum TextProcessingFactory {
        autoFormatting, lineTermination;
    }
    /**
     * The pdf components provides the ability to create, modify or extract
     * content from PDF documents. Creates a builder to build a producer
     * endpoint for the PDF component.
     */
    public default PdfProducerBuilder toPdf(String path) {
        return new PdfProducerBuilder(path);
    }
}