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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * Specifies how to route matched traffic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GrpcRouteRouteAction extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The destination services to which traffic should be forwarded. If multiple
   * destinations are specified, traffic will be split between Backend Service(s) according to the
   * weight field of these destinations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GrpcRouteDestination> destinations;

  static {
    // hack to force ProGuard to consider GrpcRouteDestination used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GrpcRouteDestination.class);
  }

  /**
   * Optional. The specification for fault injection introduced into traffic to test the resiliency
   * of clients to destination service failure. As part of fault injection, when clients send
   * requests to a destination, delays can be introduced on a percentage of requests before sending
   * those requests to the destination service. Similarly requests from clients can be aborted by
   * for a percentage of requests. timeout and retry_policy will be ignored by clients that are
   * configured with a fault_injection_policy
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrpcRouteFaultInjectionPolicy faultInjectionPolicy;

  /**
   * Optional. Specifies the retry policy associated with this route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrpcRouteRetryPolicy retryPolicy;

  /**
   * Optional. Specifies cookie-based stateful session affinity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GrpcRouteStatefulSessionAffinityPolicy statefulSessionAffinity;

  /**
   * Optional. Specifies the timeout for selected route. Timeout is computed from the time the
   * request has been fully processed (i.e. end of stream) up until the response has been completely
   * processed. Timeout includes all retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * Optional. The destination services to which traffic should be forwarded. If multiple
   * destinations are specified, traffic will be split between Backend Service(s) according to the
   * weight field of these destinations.
   * @return value or {@code null} for none
   */
  public java.util.List<GrpcRouteDestination> getDestinations() {
    return destinations;
  }

  /**
   * Optional. The destination services to which traffic should be forwarded. If multiple
   * destinations are specified, traffic will be split between Backend Service(s) according to the
   * weight field of these destinations.
   * @param destinations destinations or {@code null} for none
   */
  public GrpcRouteRouteAction setDestinations(java.util.List<GrpcRouteDestination> destinations) {
    this.destinations = destinations;
    return this;
  }

  /**
   * Optional. The specification for fault injection introduced into traffic to test the resiliency
   * of clients to destination service failure. As part of fault injection, when clients send
   * requests to a destination, delays can be introduced on a percentage of requests before sending
   * those requests to the destination service. Similarly requests from clients can be aborted by
   * for a percentage of requests. timeout and retry_policy will be ignored by clients that are
   * configured with a fault_injection_policy
   * @return value or {@code null} for none
   */
  public GrpcRouteFaultInjectionPolicy getFaultInjectionPolicy() {
    return faultInjectionPolicy;
  }

  /**
   * Optional. The specification for fault injection introduced into traffic to test the resiliency
   * of clients to destination service failure. As part of fault injection, when clients send
   * requests to a destination, delays can be introduced on a percentage of requests before sending
   * those requests to the destination service. Similarly requests from clients can be aborted by
   * for a percentage of requests. timeout and retry_policy will be ignored by clients that are
   * configured with a fault_injection_policy
   * @param faultInjectionPolicy faultInjectionPolicy or {@code null} for none
   */
  public GrpcRouteRouteAction setFaultInjectionPolicy(GrpcRouteFaultInjectionPolicy faultInjectionPolicy) {
    this.faultInjectionPolicy = faultInjectionPolicy;
    return this;
  }

  /**
   * Optional. Specifies the retry policy associated with this route.
   * @return value or {@code null} for none
   */
  public GrpcRouteRetryPolicy getRetryPolicy() {
    return retryPolicy;
  }

  /**
   * Optional. Specifies the retry policy associated with this route.
   * @param retryPolicy retryPolicy or {@code null} for none
   */
  public GrpcRouteRouteAction setRetryPolicy(GrpcRouteRetryPolicy retryPolicy) {
    this.retryPolicy = retryPolicy;
    return this;
  }

  /**
   * Optional. Specifies cookie-based stateful session affinity.
   * @return value or {@code null} for none
   */
  public GrpcRouteStatefulSessionAffinityPolicy getStatefulSessionAffinity() {
    return statefulSessionAffinity;
  }

  /**
   * Optional. Specifies cookie-based stateful session affinity.
   * @param statefulSessionAffinity statefulSessionAffinity or {@code null} for none
   */
  public GrpcRouteRouteAction setStatefulSessionAffinity(GrpcRouteStatefulSessionAffinityPolicy statefulSessionAffinity) {
    this.statefulSessionAffinity = statefulSessionAffinity;
    return this;
  }

  /**
   * Optional. Specifies the timeout for selected route. Timeout is computed from the time the
   * request has been fully processed (i.e. end of stream) up until the response has been completely
   * processed. Timeout includes all retries.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Optional. Specifies the timeout for selected route. Timeout is computed from the time the
   * request has been fully processed (i.e. end of stream) up until the response has been completely
   * processed. Timeout includes all retries.
   * @param timeout timeout or {@code null} for none
   */
  public GrpcRouteRouteAction setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public GrpcRouteRouteAction set(String fieldName, Object value) {
    return (GrpcRouteRouteAction) super.set(fieldName, value);
  }

  @Override
  public GrpcRouteRouteAction clone() {
    return (GrpcRouteRouteAction) super.clone();
  }

}
