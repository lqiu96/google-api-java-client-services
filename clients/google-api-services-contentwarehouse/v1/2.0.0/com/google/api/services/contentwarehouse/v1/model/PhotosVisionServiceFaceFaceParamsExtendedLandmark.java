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
 * Below is the set of extended landmarks added by LMprec_508 and 510. All future additional
 * landmarks should be added to this message.
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
public final class PhotosVisionServiceFaceFaceParamsExtendedLandmark extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * NOTE that landmark positions may fall outside the bounds of the image when the face is near one
   * or more edges of the image. That is, it is NOT guaranteed that 0 <= x < width or 0 <= y <
   * height. Rounded version of x_f.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer x;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float xF;

  /**
   * Rounded version of y_f.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer y;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float yF;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float z;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * NOTE that landmark positions may fall outside the bounds of the image when the face is near one
   * or more edges of the image. That is, it is NOT guaranteed that 0 <= x < width or 0 <= y <
   * height. Rounded version of x_f.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getX() {
    return x;
  }

  /**
   * NOTE that landmark positions may fall outside the bounds of the image when the face is near one
   * or more edges of the image. That is, it is NOT guaranteed that 0 <= x < width or 0 <= y <
   * height. Rounded version of x_f.
   * @param x x or {@code null} for none
   */
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark setX(java.lang.Integer x) {
    this.x = x;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getXF() {
    return xF;
  }

  /**
   * @param xF xF or {@code null} for none
   */
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark setXF(java.lang.Float xF) {
    this.xF = xF;
    return this;
  }

  /**
   * Rounded version of y_f.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getY() {
    return y;
  }

  /**
   * Rounded version of y_f.
   * @param y y or {@code null} for none
   */
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark setY(java.lang.Integer y) {
    this.y = y;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getYF() {
    return yF;
  }

  /**
   * @param yF yF or {@code null} for none
   */
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark setYF(java.lang.Float yF) {
    this.yF = yF;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getZ() {
    return z;
  }

  /**
   * @param z z or {@code null} for none
   */
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark setZ(java.lang.Float z) {
    this.z = z;
    return this;
  }

  @Override
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark set(String fieldName, Object value) {
    return (PhotosVisionServiceFaceFaceParamsExtendedLandmark) super.set(fieldName, value);
  }

  @Override
  public PhotosVisionServiceFaceFaceParamsExtendedLandmark clone() {
    return (PhotosVisionServiceFaceFaceParamsExtendedLandmark) super.clone();
  }

}
