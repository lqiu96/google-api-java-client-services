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

package com.google.api.services.monitoring.v1.model;

/**
 * Preview: A chart dimension for an SQL query. This is applied over the x-axis. This is a preview
 * feature and may be subject to change before final release.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dimension extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the column in the source SQL query that is used to chart the dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String column;

  /**
   * Optional. The type of the dimension column. This is relevant only if one of the bin_size fields
   * is set. If it is empty, the type TIMESTAMP or INT64 will be assumed based on which bin_size
   * field is set. If populated, this should be set to one of the following types: DATE, TIME,
   * DATETIME, TIMESTAMP, BIGNUMERIC, INT64, NUMERIC, FLOAT64.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String columnType;

  /**
   * Optional. float_bin_size is used when the column type used for a dimension is a floating point
   * numeric column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double floatBinSize;

  /**
   * A limit to the number of bins generated. When 0 is specified, the maximum count is not
   * enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxBinCount;

  /**
   * numeric_bin_size is used when the column type used for a dimension is numeric or string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numericBinSize;

  /**
   * The column name to sort on for binning. This column can be the same column as this dimension or
   * any other column used as a measure in the results. If sort_order is set to NONE, then this
   * value is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sortColumn;

  /**
   * The sort order applied to the sort column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sortOrder;

  /**
   * time_bin_size is used when the data type specified by column is a time type and the bin size is
   * determined by a time duration. If column_type is DATE, this must be a whole value multiple of 1
   * day. If column_type is TIME, this must be less than or equal to 24 hours.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeBinSize;

  /**
   * Required. The name of the column in the source SQL query that is used to chart the dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumn() {
    return column;
  }

  /**
   * Required. The name of the column in the source SQL query that is used to chart the dimension.
   * @param column column or {@code null} for none
   */
  public Dimension setColumn(java.lang.String column) {
    this.column = column;
    return this;
  }

  /**
   * Optional. The type of the dimension column. This is relevant only if one of the bin_size fields
   * is set. If it is empty, the type TIMESTAMP or INT64 will be assumed based on which bin_size
   * field is set. If populated, this should be set to one of the following types: DATE, TIME,
   * DATETIME, TIMESTAMP, BIGNUMERIC, INT64, NUMERIC, FLOAT64.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumnType() {
    return columnType;
  }

  /**
   * Optional. The type of the dimension column. This is relevant only if one of the bin_size fields
   * is set. If it is empty, the type TIMESTAMP or INT64 will be assumed based on which bin_size
   * field is set. If populated, this should be set to one of the following types: DATE, TIME,
   * DATETIME, TIMESTAMP, BIGNUMERIC, INT64, NUMERIC, FLOAT64.
   * @param columnType columnType or {@code null} for none
   */
  public Dimension setColumnType(java.lang.String columnType) {
    this.columnType = columnType;
    return this;
  }

  /**
   * Optional. float_bin_size is used when the column type used for a dimension is a floating point
   * numeric column.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFloatBinSize() {
    return floatBinSize;
  }

  /**
   * Optional. float_bin_size is used when the column type used for a dimension is a floating point
   * numeric column.
   * @param floatBinSize floatBinSize or {@code null} for none
   */
  public Dimension setFloatBinSize(java.lang.Double floatBinSize) {
    this.floatBinSize = floatBinSize;
    return this;
  }

  /**
   * A limit to the number of bins generated. When 0 is specified, the maximum count is not
   * enforced.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxBinCount() {
    return maxBinCount;
  }

  /**
   * A limit to the number of bins generated. When 0 is specified, the maximum count is not
   * enforced.
   * @param maxBinCount maxBinCount or {@code null} for none
   */
  public Dimension setMaxBinCount(java.lang.Integer maxBinCount) {
    this.maxBinCount = maxBinCount;
    return this;
  }

  /**
   * numeric_bin_size is used when the column type used for a dimension is numeric or string.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumericBinSize() {
    return numericBinSize;
  }

  /**
   * numeric_bin_size is used when the column type used for a dimension is numeric or string.
   * @param numericBinSize numericBinSize or {@code null} for none
   */
  public Dimension setNumericBinSize(java.lang.Integer numericBinSize) {
    this.numericBinSize = numericBinSize;
    return this;
  }

  /**
   * The column name to sort on for binning. This column can be the same column as this dimension or
   * any other column used as a measure in the results. If sort_order is set to NONE, then this
   * value is not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSortColumn() {
    return sortColumn;
  }

  /**
   * The column name to sort on for binning. This column can be the same column as this dimension or
   * any other column used as a measure in the results. If sort_order is set to NONE, then this
   * value is not used.
   * @param sortColumn sortColumn or {@code null} for none
   */
  public Dimension setSortColumn(java.lang.String sortColumn) {
    this.sortColumn = sortColumn;
    return this;
  }

  /**
   * The sort order applied to the sort column.
   * @return value or {@code null} for none
   */
  public java.lang.String getSortOrder() {
    return sortOrder;
  }

  /**
   * The sort order applied to the sort column.
   * @param sortOrder sortOrder or {@code null} for none
   */
  public Dimension setSortOrder(java.lang.String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * time_bin_size is used when the data type specified by column is a time type and the bin size is
   * determined by a time duration. If column_type is DATE, this must be a whole value multiple of 1
   * day. If column_type is TIME, this must be less than or equal to 24 hours.
   * @return value or {@code null} for none
   */
  public String getTimeBinSize() {
    return timeBinSize;
  }

  /**
   * time_bin_size is used when the data type specified by column is a time type and the bin size is
   * determined by a time duration. If column_type is DATE, this must be a whole value multiple of 1
   * day. If column_type is TIME, this must be less than or equal to 24 hours.
   * @param timeBinSize timeBinSize or {@code null} for none
   */
  public Dimension setTimeBinSize(String timeBinSize) {
    this.timeBinSize = timeBinSize;
    return this;
  }

  @Override
  public Dimension set(String fieldName, Object value) {
    return (Dimension) super.set(fieldName, value);
  }

  @Override
  public Dimension clone() {
    return (Dimension) super.clone();
  }

}
