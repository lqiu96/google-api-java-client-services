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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * DefaultClusterConfig describes the default cluster configurations to be applied to all clusters
 * born-in-fleet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DefaultClusterConfig extends com.google.api.client.json.GenericJson {

  /**
   * Enable/Disable Security Posture features for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPostureConfig securityPostureConfig;

  /**
   * Enable/Disable Security Posture features for the cluster.
   * @return value or {@code null} for none
   */
  public SecurityPostureConfig getSecurityPostureConfig() {
    return securityPostureConfig;
  }

  /**
   * Enable/Disable Security Posture features for the cluster.
   * @param securityPostureConfig securityPostureConfig or {@code null} for none
   */
  public DefaultClusterConfig setSecurityPostureConfig(SecurityPostureConfig securityPostureConfig) {
    this.securityPostureConfig = securityPostureConfig;
    return this;
  }

  @Override
  public DefaultClusterConfig set(String fieldName, Object value) {
    return (DefaultClusterConfig) super.set(fieldName, value);
  }

  @Override
  public DefaultClusterConfig clone() {
    return (DefaultClusterConfig) super.clone();
  }

}
