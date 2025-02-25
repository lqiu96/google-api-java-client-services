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
 * The specifications for routing traffic and applying associated policies.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteRouteAction extends com.google.api.client.json.GenericJson {

  /**
   * The specification for allowing client side cross-origin requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteCorsPolicy corsPolicy;

  /**
   * The destination to which traffic should be forwarded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpRouteDestination> destinations;

  static {
    // hack to force ProGuard to consider HttpRouteDestination used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HttpRouteDestination.class);
  }

  /**
   * The specification for fault injection introduced into traffic to test the resiliency of clients
   * to backend service failure. As part of fault injection, when clients send requests to a backend
   * service, delays can be introduced on a percentage of requests before sending those requests to
   * the backend service. Similarly requests from clients can be aborted for a percentage of
   * requests. timeout and retry_policy will be ignored by clients that are configured with a
   * fault_injection_policy
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteFaultInjectionPolicy faultInjectionPolicy;

  /**
   * If set, the request is directed as configured by this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteRedirect redirect;

  /**
   * The specification for modifying the headers of a matching request prior to delivery of the
   * request to the destination. If HeaderModifiers are set on both the Destination and the
   * RouteAction, they will be merged. Conflicts between the two will not be resolved on the
   * configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteHeaderModifier requestHeaderModifier;

  /**
   * Specifies the policy on how requests intended for the routes destination are shadowed to a
   * separate mirrored destination. Proxy will not wait for the shadow destination to respond before
   * returning the response. Prior to sending traffic to the shadow service, the host/authority
   * header is suffixed with -shadow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteRequestMirrorPolicy requestMirrorPolicy;

  /**
   * The specification for modifying the headers of a response prior to sending the response back to
   * the client. If HeaderModifiers are set on both the Destination and the RouteAction, they will
   * be merged. Conflicts between the two will not be resolved on the configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteHeaderModifier responseHeaderModifier;

  /**
   * Specifies the retry policy associated with this route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteRetryPolicy retryPolicy;

  /**
   * Optional. Specifies cookie-based stateful session affinity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteStatefulSessionAffinityPolicy statefulSessionAffinity;

  /**
   * Specifies the timeout for selected route. Timeout is computed from the time the request has
   * been fully processed (i.e. end of stream) up until the response has been completely processed.
   * Timeout includes all retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * The specification for rewrite URL before forwarding requests to the destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteURLRewrite urlRewrite;

  /**
   * The specification for allowing client side cross-origin requests.
   * @return value or {@code null} for none
   */
  public HttpRouteCorsPolicy getCorsPolicy() {
    return corsPolicy;
  }

  /**
   * The specification for allowing client side cross-origin requests.
   * @param corsPolicy corsPolicy or {@code null} for none
   */
  public HttpRouteRouteAction setCorsPolicy(HttpRouteCorsPolicy corsPolicy) {
    this.corsPolicy = corsPolicy;
    return this;
  }

  /**
   * The destination to which traffic should be forwarded.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpRouteDestination> getDestinations() {
    return destinations;
  }

  /**
   * The destination to which traffic should be forwarded.
   * @param destinations destinations or {@code null} for none
   */
  public HttpRouteRouteAction setDestinations(java.util.List<HttpRouteDestination> destinations) {
    this.destinations = destinations;
    return this;
  }

  /**
   * The specification for fault injection introduced into traffic to test the resiliency of clients
   * to backend service failure. As part of fault injection, when clients send requests to a backend
   * service, delays can be introduced on a percentage of requests before sending those requests to
   * the backend service. Similarly requests from clients can be aborted for a percentage of
   * requests. timeout and retry_policy will be ignored by clients that are configured with a
   * fault_injection_policy
   * @return value or {@code null} for none
   */
  public HttpRouteFaultInjectionPolicy getFaultInjectionPolicy() {
    return faultInjectionPolicy;
  }

  /**
   * The specification for fault injection introduced into traffic to test the resiliency of clients
   * to backend service failure. As part of fault injection, when clients send requests to a backend
   * service, delays can be introduced on a percentage of requests before sending those requests to
   * the backend service. Similarly requests from clients can be aborted for a percentage of
   * requests. timeout and retry_policy will be ignored by clients that are configured with a
   * fault_injection_policy
   * @param faultInjectionPolicy faultInjectionPolicy or {@code null} for none
   */
  public HttpRouteRouteAction setFaultInjectionPolicy(HttpRouteFaultInjectionPolicy faultInjectionPolicy) {
    this.faultInjectionPolicy = faultInjectionPolicy;
    return this;
  }

  /**
   * If set, the request is directed as configured by this field.
   * @return value or {@code null} for none
   */
  public HttpRouteRedirect getRedirect() {
    return redirect;
  }

  /**
   * If set, the request is directed as configured by this field.
   * @param redirect redirect or {@code null} for none
   */
  public HttpRouteRouteAction setRedirect(HttpRouteRedirect redirect) {
    this.redirect = redirect;
    return this;
  }

  /**
   * The specification for modifying the headers of a matching request prior to delivery of the
   * request to the destination. If HeaderModifiers are set on both the Destination and the
   * RouteAction, they will be merged. Conflicts between the two will not be resolved on the
   * configuration.
   * @return value or {@code null} for none
   */
  public HttpRouteHeaderModifier getRequestHeaderModifier() {
    return requestHeaderModifier;
  }

  /**
   * The specification for modifying the headers of a matching request prior to delivery of the
   * request to the destination. If HeaderModifiers are set on both the Destination and the
   * RouteAction, they will be merged. Conflicts between the two will not be resolved on the
   * configuration.
   * @param requestHeaderModifier requestHeaderModifier or {@code null} for none
   */
  public HttpRouteRouteAction setRequestHeaderModifier(HttpRouteHeaderModifier requestHeaderModifier) {
    this.requestHeaderModifier = requestHeaderModifier;
    return this;
  }

  /**
   * Specifies the policy on how requests intended for the routes destination are shadowed to a
   * separate mirrored destination. Proxy will not wait for the shadow destination to respond before
   * returning the response. Prior to sending traffic to the shadow service, the host/authority
   * header is suffixed with -shadow.
   * @return value or {@code null} for none
   */
  public HttpRouteRequestMirrorPolicy getRequestMirrorPolicy() {
    return requestMirrorPolicy;
  }

  /**
   * Specifies the policy on how requests intended for the routes destination are shadowed to a
   * separate mirrored destination. Proxy will not wait for the shadow destination to respond before
   * returning the response. Prior to sending traffic to the shadow service, the host/authority
   * header is suffixed with -shadow.
   * @param requestMirrorPolicy requestMirrorPolicy or {@code null} for none
   */
  public HttpRouteRouteAction setRequestMirrorPolicy(HttpRouteRequestMirrorPolicy requestMirrorPolicy) {
    this.requestMirrorPolicy = requestMirrorPolicy;
    return this;
  }

  /**
   * The specification for modifying the headers of a response prior to sending the response back to
   * the client. If HeaderModifiers are set on both the Destination and the RouteAction, they will
   * be merged. Conflicts between the two will not be resolved on the configuration.
   * @return value or {@code null} for none
   */
  public HttpRouteHeaderModifier getResponseHeaderModifier() {
    return responseHeaderModifier;
  }

  /**
   * The specification for modifying the headers of a response prior to sending the response back to
   * the client. If HeaderModifiers are set on both the Destination and the RouteAction, they will
   * be merged. Conflicts between the two will not be resolved on the configuration.
   * @param responseHeaderModifier responseHeaderModifier or {@code null} for none
   */
  public HttpRouteRouteAction setResponseHeaderModifier(HttpRouteHeaderModifier responseHeaderModifier) {
    this.responseHeaderModifier = responseHeaderModifier;
    return this;
  }

  /**
   * Specifies the retry policy associated with this route.
   * @return value or {@code null} for none
   */
  public HttpRouteRetryPolicy getRetryPolicy() {
    return retryPolicy;
  }

  /**
   * Specifies the retry policy associated with this route.
   * @param retryPolicy retryPolicy or {@code null} for none
   */
  public HttpRouteRouteAction setRetryPolicy(HttpRouteRetryPolicy retryPolicy) {
    this.retryPolicy = retryPolicy;
    return this;
  }

  /**
   * Optional. Specifies cookie-based stateful session affinity.
   * @return value or {@code null} for none
   */
  public HttpRouteStatefulSessionAffinityPolicy getStatefulSessionAffinity() {
    return statefulSessionAffinity;
  }

  /**
   * Optional. Specifies cookie-based stateful session affinity.
   * @param statefulSessionAffinity statefulSessionAffinity or {@code null} for none
   */
  public HttpRouteRouteAction setStatefulSessionAffinity(HttpRouteStatefulSessionAffinityPolicy statefulSessionAffinity) {
    this.statefulSessionAffinity = statefulSessionAffinity;
    return this;
  }

  /**
   * Specifies the timeout for selected route. Timeout is computed from the time the request has
   * been fully processed (i.e. end of stream) up until the response has been completely processed.
   * Timeout includes all retries.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Specifies the timeout for selected route. Timeout is computed from the time the request has
   * been fully processed (i.e. end of stream) up until the response has been completely processed.
   * Timeout includes all retries.
   * @param timeout timeout or {@code null} for none
   */
  public HttpRouteRouteAction setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * The specification for rewrite URL before forwarding requests to the destination.
   * @return value or {@code null} for none
   */
  public HttpRouteURLRewrite getUrlRewrite() {
    return urlRewrite;
  }

  /**
   * The specification for rewrite URL before forwarding requests to the destination.
   * @param urlRewrite urlRewrite or {@code null} for none
   */
  public HttpRouteRouteAction setUrlRewrite(HttpRouteURLRewrite urlRewrite) {
    this.urlRewrite = urlRewrite;
    return this;
  }

  @Override
  public HttpRouteRouteAction set(String fieldName, Object value) {
    return (HttpRouteRouteAction) super.set(fieldName, value);
  }

  @Override
  public HttpRouteRouteAction clone() {
    return (HttpRouteRouteAction) super.clone();
  }

}
