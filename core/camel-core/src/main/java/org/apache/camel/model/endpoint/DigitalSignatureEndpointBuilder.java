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

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The crypto component is used for signing and verifying exchanges using the
 * Signature Service of the Java Cryptographic Extension (JCE).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DigitalSignatureEndpointBuilder {


    /**
     * Base class for the Crypto (JCE) component builders.
     */
    public static class DigitalSignatureCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        DigitalSignatureCommonBuilder(String path) {
            super("crypto", path);
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto:sign sets sign as the operation.
         * The option is a
         * <code>org.apache.camel.component.crypto.CryptoOperation</code> type.
         * @group producer
         */
        public T cryptoOperation(CryptoOperation cryptoOperation) {
            this.properties.put("cryptoOperation", cryptoOperation);
            return (T) this;
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto:sign sets sign as the operation.
         * The option will be converted to a
         * <code>org.apache.camel.component.crypto.CryptoOperation</code> type.
         * @group producer
         */
        public T cryptoOperation(String cryptoOperation) {
            this.properties.put("cryptoOperation", cryptoOperation);
            return (T) this;
        }
        /**
         * The logical name of this operation.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Sets the JCE name of the Algorithm that should be used for the
         * signer.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T algorithm(String algorithm) {
            this.properties.put("algorithm", algorithm);
            return (T) this;
        }
        /**
         * Sets the alias used to query the KeyStore for keys and {link
         * java.security.cert.Certificate Certificates} to be used in signing
         * and verifying exchanges. This value can be provided at runtime via
         * the message header
         * org.apache.camel.component.crypto.DigitalSignatureConstants#KEYSTORE_ALIAS.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T alias(String alias) {
            this.properties.put("alias", alias);
            return (T) this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T certificateName(String certificateName) {
            this.properties.put("certificateName", certificateName);
            return (T) this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * The option is a <code>java.security.KeyStore</code> type.
         * @group producer
         */
        public T keystore(KeyStore keystore) {
            this.properties.put("keystore", keystore);
            return (T) this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * The option will be converted to a <code>java.security.KeyStore</code>
         * type.
         * @group producer
         */
        public T keystore(String keystore) {
            this.properties.put("keystore", keystore);
            return (T) this;
        }
        /**
         * Sets the reference name for a Keystore that can be found in the
         * registry.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T keystoreName(String keystoreName) {
            this.properties.put("keystoreName", keystoreName);
            return (T) this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * The option is a <code>java.security.PrivateKey</code> type.
         * @group producer
         */
        public T privateKey(PrivateKey privateKey) {
            this.properties.put("privateKey", privateKey);
            return (T) this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * The option will be converted to a
         * <code>java.security.PrivateKey</code> type.
         * @group producer
         */
        public T privateKey(String privateKey) {
            this.properties.put("privateKey", privateKey);
            return (T) this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T privateKeyName(String privateKeyName) {
            this.properties.put("privateKeyName", privateKeyName);
            return (T) this;
        }
        /**
         * Set the id of the security provider that provides the configured
         * Signature algorithm.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T provider(String provider) {
            this.properties.put("provider", provider);
            return (T) this;
        }
        /**
         * references that should be resolved when the context changes.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T publicKeyName(String publicKeyName) {
            this.properties.put("publicKeyName", publicKeyName);
            return (T) this;
        }
        /**
         * Sets the reference name for a SecureRandom that can be found in the
         * registry.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T secureRandomName(String secureRandomName) {
            this.properties.put("secureRandomName", secureRandomName);
            return (T) this;
        }
        /**
         * Set the name of the message header that should be used to store the
         * base64 encoded signature. This defaults to 'CamelDigitalSignature'.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public T signatureHeaderName(String signatureHeaderName) {
            this.properties.put("signatureHeaderName", signatureHeaderName);
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
         * Set the size of the buffer used to read in the Exchange payload data.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        public T bufferSize(Integer bufferSize) {
            this.properties.put("bufferSize", bufferSize);
            return (T) this;
        }
        /**
         * Set the size of the buffer used to read in the Exchange payload data.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        public T bufferSize(String bufferSize) {
            this.properties.put("bufferSize", bufferSize);
            return (T) this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * The option is a <code>java.security.cert.Certificate</code> type.
         * @group advanced
         */
        public T certificate(Certificate certificate) {
            this.properties.put("certificate", certificate);
            return (T) this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * The option will be converted to a
         * <code>java.security.cert.Certificate</code> type.
         * @group advanced
         */
        public T certificate(String certificate) {
            this.properties.put("certificate", certificate);
            return (T) this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public T clearHeaders(boolean clearHeaders) {
            this.properties.put("clearHeaders", clearHeaders);
            return (T) this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public T clearHeaders(String clearHeaders) {
            this.properties.put("clearHeaders", clearHeaders);
            return (T) this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * The option is a
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * @group advanced
         */
        public T keyStoreParameters(Object keyStoreParameters) {
            this.properties.put("keyStoreParameters", keyStoreParameters);
            return (T) this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * @group advanced
         */
        public T keyStoreParameters(String keyStoreParameters) {
            this.properties.put("keyStoreParameters", keyStoreParameters);
            return (T) this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * The option is a <code>java.security.PublicKey</code> type.
         * @group advanced
         */
        public T publicKey(PublicKey publicKey) {
            this.properties.put("publicKey", publicKey);
            return (T) this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * The option will be converted to a
         * <code>java.security.PublicKey</code> type.
         * @group advanced
         */
        public T publicKey(String publicKey) {
            this.properties.put("publicKey", publicKey);
            return (T) this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * The option is a <code>java.security.SecureRandom</code> type.
         * @group advanced
         */
        public T secureRandom(SecureRandom secureRandom) {
            this.properties.put("secureRandom", secureRandom);
            return (T) this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * The option will be converted to a
         * <code>java.security.SecureRandom</code> type.
         * @group advanced
         */
        public T secureRandom(String secureRandom) {
            this.properties.put("secureRandom", secureRandom);
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
         * Sets the password used to access an aliased PrivateKey in the
         * KeyStore.
         * The option is a <code>char[]</code> type.
         * @group security
         */
        public T password(Character[] password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Sets the password used to access an aliased PrivateKey in the
         * KeyStore.
         * The option will be converted to a <code>char[]</code> type.
         * @group security
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
    }

    /**
     * Builder for endpoint producers for the Crypto (JCE) component.
     */
    public static class DigitalSignatureProducerBuilder
            extends
                DigitalSignatureCommonBuilder<DigitalSignatureProducerBuilder>
            implements
                EndpointProducerBuilder {
        public DigitalSignatureProducerBuilder(String path) {
            super(path);
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.crypto.CryptoOperation</code> enum.
     */
    public static enum CryptoOperation {
        sign, verify;
    }
    /**
     * The crypto component is used for signing and verifying exchanges using
     * the Signature Service of the Java Cryptographic Extension (JCE). Creates
     * a builder to build a producer endpoint for the Crypto (JCE) component.
     */
    public default DigitalSignatureProducerBuilder toDigitalSignature(
            String path) {
        return new DigitalSignatureProducerBuilder(path);
    }
}