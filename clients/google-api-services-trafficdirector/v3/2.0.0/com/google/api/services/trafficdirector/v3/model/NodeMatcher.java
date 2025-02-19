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

package com.google.api.services.trafficdirector.v3.model;

/**
 * Specifies the way to match a Node. The match follows AND semantics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeMatcher extends com.google.api.client.json.GenericJson {

  /**
   * Specifies match criteria on the node id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StringMatcher nodeId;

  /**
   * Specifies match criteria on the node metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StructMatcher> nodeMetadatas;

  /**
   * Specifies match criteria on the node id.
   * @return value or {@code null} for none
   */
  public StringMatcher getNodeId() {
    return nodeId;
  }

  /**
   * Specifies match criteria on the node id.
   * @param nodeId nodeId or {@code null} for none
   */
  public NodeMatcher setNodeId(StringMatcher nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * Specifies match criteria on the node metadata.
   * @return value or {@code null} for none
   */
  public java.util.List<StructMatcher> getNodeMetadatas() {
    return nodeMetadatas;
  }

  /**
   * Specifies match criteria on the node metadata.
   * @param nodeMetadatas nodeMetadatas or {@code null} for none
   */
  public NodeMatcher setNodeMetadatas(java.util.List<StructMatcher> nodeMetadatas) {
    this.nodeMetadatas = nodeMetadatas;
    return this;
  }

  @Override
  public NodeMatcher set(String fieldName, Object value) {
    return (NodeMatcher) super.set(fieldName, value);
  }

  @Override
  public NodeMatcher clone() {
    return (NodeMatcher) super.clone();
  }

}
