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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Model definition for ResearchVisionFace2cartoonLipThicknessClassifierResults.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResearchVisionFace2cartoonLipThicknessClassifierResults extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lipThickness;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * @param confidence confidence or {@code null} for none
   */
  public ResearchVisionFace2cartoonLipThicknessClassifierResults setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLipThickness() {
    return lipThickness;
  }

  /**
   * @param lipThickness lipThickness or {@code null} for none
   */
  public ResearchVisionFace2cartoonLipThicknessClassifierResults setLipThickness(java.lang.String lipThickness) {
    this.lipThickness = lipThickness;
    return this;
  }

  @Override
  public ResearchVisionFace2cartoonLipThicknessClassifierResults set(String fieldName, Object value) {
    return (ResearchVisionFace2cartoonLipThicknessClassifierResults) super.set(fieldName, value);
  }

  @Override
  public ResearchVisionFace2cartoonLipThicknessClassifierResults clone() {
    return (ResearchVisionFace2cartoonLipThicknessClassifierResults) super.clone();
  }

}
