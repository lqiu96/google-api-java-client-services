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

package com.google.api.services.places.v1.model;

/**
 * A photo media from Places API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1PhotoMedia extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of a photo media in the format:
   * `places/place_id/photos/photo_reference/media`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A short-lived uri that can be used to render the photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoUri;

  /**
   * The resource name of a photo media in the format:
   * `places/place_id/photos/photo_reference/media`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of a photo media in the format:
   * `places/place_id/photos/photo_reference/media`.
   * @param name name or {@code null} for none
   */
  public GoogleMapsPlacesV1PhotoMedia setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A short-lived uri that can be used to render the photo.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoUri() {
    return photoUri;
  }

  /**
   * A short-lived uri that can be used to render the photo.
   * @param photoUri photoUri or {@code null} for none
   */
  public GoogleMapsPlacesV1PhotoMedia setPhotoUri(java.lang.String photoUri) {
    this.photoUri = photoUri;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1PhotoMedia set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1PhotoMedia) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1PhotoMedia clone() {
    return (GoogleMapsPlacesV1PhotoMedia) super.clone();
  }

}
