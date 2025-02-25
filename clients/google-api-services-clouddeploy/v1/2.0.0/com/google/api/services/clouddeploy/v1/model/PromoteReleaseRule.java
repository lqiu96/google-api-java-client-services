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

package com.google.api.services.clouddeploy.v1.model;

/**
 * `PromoteRelease` rule will automatically promote a release from the current target to a specified
 * target.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PromoteReleaseRule extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Information around the state of the Automation rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutomationRuleCondition condition;

  /**
   * Optional. The starting phase of the rollout created by this operation. Default to the first
   * phase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationPhase;

  /**
   * Optional. The ID of the stage in the pipeline to which this `Release` is deploying. If
   * unspecified, default it to the next stage in the promotion flow. The value of this field could
   * be one of the following: * The last segment of a target name. It only needs the ID to determine
   * if the target is one of the stages in the promotion sequence defined in the pipeline. *
   * "@next", the next target in the promotion sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationTargetId;

  /**
   * Required. ID of the rule. This id must be unique in the `Automation` resource to which this
   * rule belongs. The format is a-z{0,62}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. How long the release need to be paused until being promoted to the next target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String wait;

  /**
   * Output only. Information around the state of the Automation rule.
   * @return value or {@code null} for none
   */
  public AutomationRuleCondition getCondition() {
    return condition;
  }

  /**
   * Output only. Information around the state of the Automation rule.
   * @param condition condition or {@code null} for none
   */
  public PromoteReleaseRule setCondition(AutomationRuleCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Optional. The starting phase of the rollout created by this operation. Default to the first
   * phase.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationPhase() {
    return destinationPhase;
  }

  /**
   * Optional. The starting phase of the rollout created by this operation. Default to the first
   * phase.
   * @param destinationPhase destinationPhase or {@code null} for none
   */
  public PromoteReleaseRule setDestinationPhase(java.lang.String destinationPhase) {
    this.destinationPhase = destinationPhase;
    return this;
  }

  /**
   * Optional. The ID of the stage in the pipeline to which this `Release` is deploying. If
   * unspecified, default it to the next stage in the promotion flow. The value of this field could
   * be one of the following: * The last segment of a target name. It only needs the ID to determine
   * if the target is one of the stages in the promotion sequence defined in the pipeline. *
   * "@next", the next target in the promotion sequence.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationTargetId() {
    return destinationTargetId;
  }

  /**
   * Optional. The ID of the stage in the pipeline to which this `Release` is deploying. If
   * unspecified, default it to the next stage in the promotion flow. The value of this field could
   * be one of the following: * The last segment of a target name. It only needs the ID to determine
   * if the target is one of the stages in the promotion sequence defined in the pipeline. *
   * "@next", the next target in the promotion sequence.
   * @param destinationTargetId destinationTargetId or {@code null} for none
   */
  public PromoteReleaseRule setDestinationTargetId(java.lang.String destinationTargetId) {
    this.destinationTargetId = destinationTargetId;
    return this;
  }

  /**
   * Required. ID of the rule. This id must be unique in the `Automation` resource to which this
   * rule belongs. The format is a-z{0,62}.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. ID of the rule. This id must be unique in the `Automation` resource to which this
   * rule belongs. The format is a-z{0,62}.
   * @param id id or {@code null} for none
   */
  public PromoteReleaseRule setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. How long the release need to be paused until being promoted to the next target.
   * @return value or {@code null} for none
   */
  public String getWait() {
    return wait;
  }

  /**
   * Optional. How long the release need to be paused until being promoted to the next target.
   * @param wait wait or {@code null} for none
   */
  public PromoteReleaseRule setWait(String wait) {
    this.wait = wait;
    return this;
  }

  @Override
  public PromoteReleaseRule set(String fieldName, Object value) {
    return (PromoteReleaseRule) super.set(fieldName, value);
  }

  @Override
  public PromoteReleaseRule clone() {
    return (PromoteReleaseRule) super.clone();
  }

}
