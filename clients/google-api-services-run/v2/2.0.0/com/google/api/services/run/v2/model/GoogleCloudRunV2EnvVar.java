/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.run.v2.model;

/**
 * EnvVar represents an environment variable present in a Container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2EnvVar extends com.google.api.client.json.GenericJson {

  /**
   * Required. Name of the environment variable. Must not exceed 32768 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables
   * in the container and any route environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
   * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether
   * the variable exists or not. Defaults to "", and the maximum length is 32768 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Source for the environment variable's value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2EnvVarSource valueSource;

  /**
   * Required. Name of the environment variable. Must not exceed 32768 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the environment variable. Must not exceed 32768 characters.
   * @param name name or {@code null} for none
   */
  public GoogleCloudRunV2EnvVar setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables
   * in the container and any route environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
   * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether
   * the variable exists or not. Defaults to "", and the maximum length is 32768 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables
   * in the container and any route environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
   * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether
   * the variable exists or not. Defaults to "", and the maximum length is 32768 bytes.
   * @param value value or {@code null} for none
   */
  public GoogleCloudRunV2EnvVar setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Source for the environment variable's value.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2EnvVarSource getValueSource() {
    return valueSource;
  }

  /**
   * Source for the environment variable's value.
   * @param valueSource valueSource or {@code null} for none
   */
  public GoogleCloudRunV2EnvVar setValueSource(GoogleCloudRunV2EnvVarSource valueSource) {
    this.valueSource = valueSource;
    return this;
  }

  @Override
  public GoogleCloudRunV2EnvVar set(String fieldName, Object value) {
    return (GoogleCloudRunV2EnvVar) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2EnvVar clone() {
    return (GoogleCloudRunV2EnvVar) super.clone();
  }

}
