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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Provenance of the source. Ways to find the original source, or verify that some source was used
 * for this build.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Hash(es) of the build source, which can be used to verify that the original source
   * integrity was maintained in the build. Note that `FileHashes` will only be populated if
   * `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used
   * as build source and the values contain the hash values for those files. If the build source
   * came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the
   * single path to that file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes> fileHashes;

  static {
    // hack to force ProGuard to consider ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes.class);
  }

  /**
   * Output only. A copy of the build's `source.connected_repository`, if exists, with any revisions
   * resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1ConnectedRepository resolvedConnectedRepository;

  /**
   * Output only. A copy of the build's `source.git_source`, if exists, with any revisions resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource resolvedGitSource;

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource resolvedRepoSource;

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource resolvedStorageSource;

  /**
   * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved.
   * This feature is in Preview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest resolvedStorageSourceManifest;

  /**
   * Output only. Hash(es) of the build source, which can be used to verify that the original source
   * integrity was maintained in the build. Note that `FileHashes` will only be populated if
   * `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used
   * as build source and the values contain the hash values for those files. If the build source
   * came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the
   * single path to that file.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes> getFileHashes() {
    return fileHashes;
  }

  /**
   * Output only. Hash(es) of the build source, which can be used to verify that the original source
   * integrity was maintained in the build. Note that `FileHashes` will only be populated if
   * `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used
   * as build source and the values contain the hash values for those files. If the build source
   * came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the
   * single path to that file.
   * @param fileHashes fileHashes or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance setFileHashes(java.util.Map<String, ContaineranalysisGoogleDevtoolsCloudbuildV1FileHashes> fileHashes) {
    this.fileHashes = fileHashes;
    return this;
  }

  /**
   * Output only. A copy of the build's `source.connected_repository`, if exists, with any revisions
   * resolved.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ConnectedRepository getResolvedConnectedRepository() {
    return resolvedConnectedRepository;
  }

  /**
   * Output only. A copy of the build's `source.connected_repository`, if exists, with any revisions
   * resolved.
   * @param resolvedConnectedRepository resolvedConnectedRepository or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance setResolvedConnectedRepository(ContaineranalysisGoogleDevtoolsCloudbuildV1ConnectedRepository resolvedConnectedRepository) {
    this.resolvedConnectedRepository = resolvedConnectedRepository;
    return this;
  }

  /**
   * Output only. A copy of the build's `source.git_source`, if exists, with any revisions resolved.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource getResolvedGitSource() {
    return resolvedGitSource;
  }

  /**
   * Output only. A copy of the build's `source.git_source`, if exists, with any revisions resolved.
   * @param resolvedGitSource resolvedGitSource or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance setResolvedGitSource(ContaineranalysisGoogleDevtoolsCloudbuildV1GitSource resolvedGitSource) {
    this.resolvedGitSource = resolvedGitSource;
    return this;
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource getResolvedRepoSource() {
    return resolvedRepoSource;
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * @param resolvedRepoSource resolvedRepoSource or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance setResolvedRepoSource(ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource resolvedRepoSource) {
    this.resolvedRepoSource = resolvedRepoSource;
    return this;
  }

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource getResolvedStorageSource() {
    return resolvedStorageSource;
  }

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * @param resolvedStorageSource resolvedStorageSource or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance setResolvedStorageSource(ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSource resolvedStorageSource) {
    this.resolvedStorageSource = resolvedStorageSource;
    return this;
  }

  /**
   * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved.
   * This feature is in Preview.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest getResolvedStorageSourceManifest() {
    return resolvedStorageSourceManifest;
  }

  /**
   * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved.
   * This feature is in Preview.
   * @param resolvedStorageSourceManifest resolvedStorageSourceManifest or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance setResolvedStorageSourceManifest(ContaineranalysisGoogleDevtoolsCloudbuildV1StorageSourceManifest resolvedStorageSourceManifest) {
    this.resolvedStorageSourceManifest = resolvedStorageSourceManifest;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1SourceProvenance) super.clone();
  }

}
