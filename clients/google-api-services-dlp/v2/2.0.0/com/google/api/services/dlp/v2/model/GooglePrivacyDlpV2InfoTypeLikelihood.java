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

package com.google.api.services.dlp.v2.model;

/**
 * Configuration for setting a minimum likelihood per infotype. Used to customize the minimum
 * likelihood level for specific infotypes in the request. For example, use this if you want to
 * lower the precision for PERSON_NAME without lowering the precision for the other infotypes in the
 * request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2InfoTypeLikelihood extends com.google.api.client.json.GenericJson {

  /**
   * Type of information the likelihood threshold applies to. Only one likelihood per info_type
   * should be provided. If InfoTypeLikelihood does not have an info_type, the configuration fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType infoType;

  /**
   * Only returns findings equal to or above this threshold. This field is required or else the
   * configuration fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minLikelihood;

  /**
   * Type of information the likelihood threshold applies to. Only one likelihood per info_type
   * should be provided. If InfoTypeLikelihood does not have an info_type, the configuration fails.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getInfoType() {
    return infoType;
  }

  /**
   * Type of information the likelihood threshold applies to. Only one likelihood per info_type
   * should be provided. If InfoTypeLikelihood does not have an info_type, the configuration fails.
   * @param infoType infoType or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeLikelihood setInfoType(GooglePrivacyDlpV2InfoType infoType) {
    this.infoType = infoType;
    return this;
  }

  /**
   * Only returns findings equal to or above this threshold. This field is required or else the
   * configuration fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinLikelihood() {
    return minLikelihood;
  }

  /**
   * Only returns findings equal to or above this threshold. This field is required or else the
   * configuration fails.
   * @param minLikelihood minLikelihood or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeLikelihood setMinLikelihood(java.lang.String minLikelihood) {
    this.minLikelihood = minLikelihood;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InfoTypeLikelihood set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InfoTypeLikelihood) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InfoTypeLikelihood clone() {
    return (GooglePrivacyDlpV2InfoTypeLikelihood) super.clone();
  }

}
