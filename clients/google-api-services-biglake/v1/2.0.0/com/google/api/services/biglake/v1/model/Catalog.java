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

package com.google.api.services.biglake.v1.model;

/**
 * Catalog is the container of databases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigLake API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Catalog extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time of the catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The deletion time of the catalog. Only set after the catalog is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Output only. The time when this catalog is considered expired. Only set after the catalog is
   * deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. The resource name. Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The last modification time of the catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation time of the catalog.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time of the catalog.
   * @param createTime createTime or {@code null} for none
   */
  public Catalog setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The deletion time of the catalog. Only set after the catalog is deleted.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The deletion time of the catalog. Only set after the catalog is deleted.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Catalog setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Output only. The time when this catalog is considered expired. Only set after the catalog is
   * deleted.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The time when this catalog is considered expired. Only set after the catalog is
   * deleted.
   * @param expireTime expireTime or {@code null} for none
   */
  public Catalog setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. The resource name. Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name. Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}
   * @param name name or {@code null} for none
   */
  public Catalog setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The last modification time of the catalog.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last modification time of the catalog.
   * @param updateTime updateTime or {@code null} for none
   */
  public Catalog setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Catalog set(String fieldName, Object value) {
    return (Catalog) super.set(fieldName, value);
  }

  @Override
  public Catalog clone() {
    return (Catalog) super.clone();
  }

}
