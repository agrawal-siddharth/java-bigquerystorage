/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery.storage.v1alpha;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.bigquery.storage.v1alpha.stub.MetastorePartitionServiceStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link MetastorePartitionServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigquerystorage.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of batchCreateMetastorePartitions:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * MetastorePartitionServiceSettings.Builder metastorePartitionServiceSettingsBuilder =
 *     MetastorePartitionServiceSettings.newBuilder();
 * metastorePartitionServiceSettingsBuilder
 *     .batchCreateMetastorePartitionsSettings()
 *     .setRetrySettings(
 *         metastorePartitionServiceSettingsBuilder
 *             .batchCreateMetastorePartitionsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * MetastorePartitionServiceSettings metastorePartitionServiceSettings =
 *     metastorePartitionServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class MetastorePartitionServiceSettings
    extends ClientSettings<MetastorePartitionServiceSettings> {

  /** Returns the object with the settings used for calls to batchCreateMetastorePartitions. */
  public UnaryCallSettings<
          BatchCreateMetastorePartitionsRequest, BatchCreateMetastorePartitionsResponse>
      batchCreateMetastorePartitionsSettings() {
    return ((MetastorePartitionServiceStubSettings) getStubSettings())
        .batchCreateMetastorePartitionsSettings();
  }

  /** Returns the object with the settings used for calls to batchDeleteMetastorePartitions. */
  public UnaryCallSettings<BatchDeleteMetastorePartitionsRequest, Empty>
      batchDeleteMetastorePartitionsSettings() {
    return ((MetastorePartitionServiceStubSettings) getStubSettings())
        .batchDeleteMetastorePartitionsSettings();
  }

  /** Returns the object with the settings used for calls to batchUpdateMetastorePartitions. */
  public UnaryCallSettings<
          BatchUpdateMetastorePartitionsRequest, BatchUpdateMetastorePartitionsResponse>
      batchUpdateMetastorePartitionsSettings() {
    return ((MetastorePartitionServiceStubSettings) getStubSettings())
        .batchUpdateMetastorePartitionsSettings();
  }

  /** Returns the object with the settings used for calls to listMetastorePartitions. */
  public UnaryCallSettings<ListMetastorePartitionsRequest, ListMetastorePartitionsResponse>
      listMetastorePartitionsSettings() {
    return ((MetastorePartitionServiceStubSettings) getStubSettings())
        .listMetastorePartitionsSettings();
  }

  /** Returns the object with the settings used for calls to streamMetastorePartitions. */
  public StreamingCallSettings<StreamMetastorePartitionsRequest, StreamMetastorePartitionsResponse>
      streamMetastorePartitionsSettings() {
    return ((MetastorePartitionServiceStubSettings) getStubSettings())
        .streamMetastorePartitionsSettings();
  }

  public static final MetastorePartitionServiceSettings create(
      MetastorePartitionServiceStubSettings stub) throws IOException {
    return new MetastorePartitionServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return MetastorePartitionServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return MetastorePartitionServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return MetastorePartitionServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return MetastorePartitionServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return MetastorePartitionServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return MetastorePartitionServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return MetastorePartitionServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected MetastorePartitionServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for MetastorePartitionServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<MetastorePartitionServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(MetastorePartitionServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(MetastorePartitionServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(MetastorePartitionServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(MetastorePartitionServiceStubSettings.newBuilder());
    }

    public MetastorePartitionServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((MetastorePartitionServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to batchCreateMetastorePartitions. */
    public UnaryCallSettings.Builder<
            BatchCreateMetastorePartitionsRequest, BatchCreateMetastorePartitionsResponse>
        batchCreateMetastorePartitionsSettings() {
      return getStubSettingsBuilder().batchCreateMetastorePartitionsSettings();
    }

    /** Returns the builder for the settings used for calls to batchDeleteMetastorePartitions. */
    public UnaryCallSettings.Builder<BatchDeleteMetastorePartitionsRequest, Empty>
        batchDeleteMetastorePartitionsSettings() {
      return getStubSettingsBuilder().batchDeleteMetastorePartitionsSettings();
    }

    /** Returns the builder for the settings used for calls to batchUpdateMetastorePartitions. */
    public UnaryCallSettings.Builder<
            BatchUpdateMetastorePartitionsRequest, BatchUpdateMetastorePartitionsResponse>
        batchUpdateMetastorePartitionsSettings() {
      return getStubSettingsBuilder().batchUpdateMetastorePartitionsSettings();
    }

    /** Returns the builder for the settings used for calls to listMetastorePartitions. */
    public UnaryCallSettings.Builder<
            ListMetastorePartitionsRequest, ListMetastorePartitionsResponse>
        listMetastorePartitionsSettings() {
      return getStubSettingsBuilder().listMetastorePartitionsSettings();
    }

    /** Returns the builder for the settings used for calls to streamMetastorePartitions. */
    public StreamingCallSettings.Builder<
            StreamMetastorePartitionsRequest, StreamMetastorePartitionsResponse>
        streamMetastorePartitionsSettings() {
      return getStubSettingsBuilder().streamMetastorePartitionsSettings();
    }

    @Override
    public MetastorePartitionServiceSettings build() throws IOException {
      return new MetastorePartitionServiceSettings(this);
    }
  }
}