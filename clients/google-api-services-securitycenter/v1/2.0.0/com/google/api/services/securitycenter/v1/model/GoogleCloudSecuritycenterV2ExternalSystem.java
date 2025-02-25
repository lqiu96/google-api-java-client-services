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

package com.google.api.services.securitycenter.v1.model;

/**
 * Representation of third party SIEM/SOAR fields within SCC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV2ExternalSystem extends com.google.api.client.json.GenericJson {

  /**
   * References primary/secondary etc assignees in the external system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> assignees;

  /**
   * The time when the case was last updated, as reported by the external system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String externalSystemUpdateTime;

  /**
   * The identifier that's used to track the finding's corresponding case in the external system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalUid;

  /**
   * Full resource name of the external system. The following list shows some examples: +
   * `organizations/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `organizations/1234/sources/5678/locations/us/findings/123456/externalSystems/jira` +
   * `folders/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `folders/1234/sources/5678/locations/us/findings/123456/externalSystems/jira` +
   * `projects/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `projects/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The most recent status of the finding's corresponding case, as reported by the external system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * References primary/secondary etc assignees in the external system.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAssignees() {
    return assignees;
  }

  /**
   * References primary/secondary etc assignees in the external system.
   * @param assignees assignees or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2ExternalSystem setAssignees(java.util.List<java.lang.String> assignees) {
    this.assignees = assignees;
    return this;
  }

  /**
   * The time when the case was last updated, as reported by the external system.
   * @return value or {@code null} for none
   */
  public String getExternalSystemUpdateTime() {
    return externalSystemUpdateTime;
  }

  /**
   * The time when the case was last updated, as reported by the external system.
   * @param externalSystemUpdateTime externalSystemUpdateTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2ExternalSystem setExternalSystemUpdateTime(String externalSystemUpdateTime) {
    this.externalSystemUpdateTime = externalSystemUpdateTime;
    return this;
  }

  /**
   * The identifier that's used to track the finding's corresponding case in the external system.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalUid() {
    return externalUid;
  }

  /**
   * The identifier that's used to track the finding's corresponding case in the external system.
   * @param externalUid externalUid or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2ExternalSystem setExternalUid(java.lang.String externalUid) {
    this.externalUid = externalUid;
    return this;
  }

  /**
   * Full resource name of the external system. The following list shows some examples: +
   * `organizations/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `organizations/1234/sources/5678/locations/us/findings/123456/externalSystems/jira` +
   * `folders/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `folders/1234/sources/5678/locations/us/findings/123456/externalSystems/jira` +
   * `projects/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `projects/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full resource name of the external system. The following list shows some examples: +
   * `organizations/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `organizations/1234/sources/5678/locations/us/findings/123456/externalSystems/jira` +
   * `folders/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `folders/1234/sources/5678/locations/us/findings/123456/externalSystems/jira` +
   * `projects/1234/sources/5678/findings/123456/externalSystems/jira` +
   * `projects/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * @param name name or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2ExternalSystem setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The most recent status of the finding's corresponding case, as reported by the external system.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The most recent status of the finding's corresponding case, as reported by the external system.
   * @param status status or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2ExternalSystem setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV2ExternalSystem set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV2ExternalSystem) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV2ExternalSystem clone() {
    return (GoogleCloudSecuritycenterV2ExternalSystem) super.clone();
  }

}
