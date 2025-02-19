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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Telemetry data collected for a managed user and device. * Granular permission needed:
 * TELEMETRY_API_DEVICE
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1TelemetryUserDevice extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Audio reports collected periodically sorted in a decreasing order of report_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1AudioStatusReport> audioStatusReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1AudioStatusReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1AudioStatusReport.class);
  }

  /**
   * Output only. Device activity reports collected periodically sorted in a decreasing order of
   * report_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1DeviceActivityReport> deviceActivityReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1DeviceActivityReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1DeviceActivityReport.class);
  }

  /**
   * The unique Directory API ID of the device. This value is the same as the Admin Console's
   * Directory API ID in the ChromeOS Devices tab.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceId;

  /**
   * Output only. Network bandwidth reports collected periodically sorted in a decreasing order of
   * report_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1NetworkBandwidthReport> networkBandwidthReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1NetworkBandwidthReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1NetworkBandwidthReport.class);
  }

  /**
   * Output only. Peripherals reports collected periodically sorted in a decreasing order of
   * report_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1PeripheralsReport> peripheralsReport;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1PeripheralsReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1PeripheralsReport.class);
  }

  /**
   * Output only. Audio reports collected periodically sorted in a decreasing order of report_time.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1AudioStatusReport> getAudioStatusReport() {
    return audioStatusReport;
  }

  /**
   * Output only. Audio reports collected periodically sorted in a decreasing order of report_time.
   * @param audioStatusReport audioStatusReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryUserDevice setAudioStatusReport(java.util.List<GoogleChromeManagementV1AudioStatusReport> audioStatusReport) {
    this.audioStatusReport = audioStatusReport;
    return this;
  }

  /**
   * Output only. Device activity reports collected periodically sorted in a decreasing order of
   * report_time.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1DeviceActivityReport> getDeviceActivityReport() {
    return deviceActivityReport;
  }

  /**
   * Output only. Device activity reports collected periodically sorted in a decreasing order of
   * report_time.
   * @param deviceActivityReport deviceActivityReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryUserDevice setDeviceActivityReport(java.util.List<GoogleChromeManagementV1DeviceActivityReport> deviceActivityReport) {
    this.deviceActivityReport = deviceActivityReport;
    return this;
  }

  /**
   * The unique Directory API ID of the device. This value is the same as the Admin Console's
   * Directory API ID in the ChromeOS Devices tab.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }

  /**
   * The unique Directory API ID of the device. This value is the same as the Admin Console's
   * Directory API ID in the ChromeOS Devices tab.
   * @param deviceId deviceId or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryUserDevice setDeviceId(java.lang.String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Output only. Network bandwidth reports collected periodically sorted in a decreasing order of
   * report_time.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1NetworkBandwidthReport> getNetworkBandwidthReport() {
    return networkBandwidthReport;
  }

  /**
   * Output only. Network bandwidth reports collected periodically sorted in a decreasing order of
   * report_time.
   * @param networkBandwidthReport networkBandwidthReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryUserDevice setNetworkBandwidthReport(java.util.List<GoogleChromeManagementV1NetworkBandwidthReport> networkBandwidthReport) {
    this.networkBandwidthReport = networkBandwidthReport;
    return this;
  }

  /**
   * Output only. Peripherals reports collected periodically sorted in a decreasing order of
   * report_time.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1PeripheralsReport> getPeripheralsReport() {
    return peripheralsReport;
  }

  /**
   * Output only. Peripherals reports collected periodically sorted in a decreasing order of
   * report_time.
   * @param peripheralsReport peripheralsReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryUserDevice setPeripheralsReport(java.util.List<GoogleChromeManagementV1PeripheralsReport> peripheralsReport) {
    this.peripheralsReport = peripheralsReport;
    return this;
  }

  @Override
  public GoogleChromeManagementV1TelemetryUserDevice set(String fieldName, Object value) {
    return (GoogleChromeManagementV1TelemetryUserDevice) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1TelemetryUserDevice clone() {
    return (GoogleChromeManagementV1TelemetryUserDevice) super.clone();
  }

}
