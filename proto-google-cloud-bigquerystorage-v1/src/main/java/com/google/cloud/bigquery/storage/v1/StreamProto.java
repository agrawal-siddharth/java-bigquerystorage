/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/stream.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.storage.v1;

public final class StreamProto {
  private StreamProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1_ReadSession_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1_ReadSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableModifiers_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableModifiers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableReadOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableReadOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1_ReadStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1_ReadStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_storage_v1_WriteStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1_WriteStream_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/bigquery/storage/v1/strea"
          + "m.proto\022 google.cloud.bigquery.storage.v"
          + "1\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032,google/cloud/bigq"
          + "uery/storage/v1/arrow.proto\032+google/clou"
          + "d/bigquery/storage/v1/avro.proto\032,google"
          + "/cloud/bigquery/storage/v1/table.proto\032\037"
          + "google/protobuf/timestamp.proto\"\303\014\n\013Read"
          + "Session\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013expire_tim"
          + "e\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\022F\n\013data_format\030\003 \001(\0162,.google.cloud.big"
          + "query.storage.v1.DataFormatB\003\340A\005\022H\n\013avro"
          + "_schema\030\004 \001(\0132,.google.cloud.bigquery.st"
          + "orage.v1.AvroSchemaB\003\340A\003H\000\022J\n\014arrow_sche"
          + "ma\030\005 \001(\0132-.google.cloud.bigquery.storage"
          + ".v1.ArrowSchemaB\003\340A\003H\000\0224\n\005table\030\006 \001(\tB%\340"
          + "A\005\372A\037\n\035bigquery.googleapis.com/Table\022Z\n\017"
          + "table_modifiers\030\007 \001(\0132<.google.cloud.big"
          + "query.storage.v1.ReadSession.TableModifi"
          + "ersB\003\340A\001\022Y\n\014read_options\030\010 \001(\0132>.google."
          + "cloud.bigquery.storage.v1.ReadSession.Ta"
          + "bleReadOptionsB\003\340A\001\022B\n\007streams\030\n \003(\0132,.g"
          + "oogle.cloud.bigquery.storage.v1.ReadStre"
          + "amB\003\340A\003\022*\n\035estimated_total_bytes_scanned"
          + "\030\014 \001(\003B\003\340A\003\022/\n\"estimated_total_physical_"
          + "file_size\030\017 \001(\003B\003\340A\003\022 \n\023estimated_row_co"
          + "unt\030\016 \001(\003B\003\340A\003\022\025\n\010trace_id\030\r \001(\tB\003\340A\001\032C\n"
          + "\016TableModifiers\0221\n\rsnapshot_time\030\001 \001(\0132\032"
          + ".google.protobuf.Timestamp\032\211\005\n\020TableRead"
          + "Options\022\027\n\017selected_fields\030\001 \003(\t\022\027\n\017row_"
          + "restriction\030\002 \001(\t\022g\n\033arrow_serialization"
          + "_options\030\003 \001(\0132;.google.cloud.bigquery.s"
          + "torage.v1.ArrowSerializationOptionsB\003\340A\001"
          + "H\000\022e\n\032avro_serialization_options\030\004 \001(\0132:"
          + ".google.cloud.bigquery.storage.v1.AvroSe"
          + "rializationOptionsB\003\340A\001H\000\022#\n\021sample_perc"
          + "entage\030\005 \001(\001B\003\340A\001H\001\210\001\001\022\205\001\n\032response_comp"
          + "ression_codec\030\006 \001(\0162W.google.cloud.bigqu"
          + "ery.storage.v1.ReadSession.TableReadOpti"
          + "ons.ResponseCompressionCodecB\003\340A\001H\002\210\001\001\"j"
          + "\n\030ResponseCompressionCodec\022*\n&RESPONSE_C"
          + "OMPRESSION_CODEC_UNSPECIFIED\020\000\022\"\n\036RESPON"
          + "SE_COMPRESSION_CODEC_LZ4\020\002B%\n#output_for"
          + "mat_serialization_optionsB\024\n\022_sample_per"
          + "centageB\035\n\033_response_compression_codec:k"
          + "\352Ah\n*bigquerystorage.googleapis.com/Read"
          + "Session\022:projects/{project}/locations/{l"
          + "ocation}/sessions/{session}B\010\n\006schema\"\234\001"
          + "\n\nReadStream\022\021\n\004name\030\001 \001(\tB\003\340A\003:{\352Ax\n)bi"
          + "gquerystorage.googleapis.com/ReadStream\022"
          + "Kprojects/{project}/locations/{location}"
          + "/sessions/{session}/streams/{stream}\"\373\004\n"
          + "\013WriteStream\022\021\n\004name\030\001 \001(\tB\003\340A\003\022E\n\004type\030"
          + "\002 \001(\01622.google.cloud.bigquery.storage.v1"
          + ".WriteStream.TypeB\003\340A\005\0224\n\013create_time\030\003 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013"
          + "commit_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\022H\n\014table_schema\030\005 \001(\0132-.googl"
          + "e.cloud.bigquery.storage.v1.TableSchemaB"
          + "\003\340A\003\022P\n\nwrite_mode\030\007 \001(\01627.google.cloud."
          + "bigquery.storage.v1.WriteStream.WriteMod"
          + "eB\003\340A\005\022\025\n\010location\030\010 \001(\tB\003\340A\005\"F\n\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\r\n\tCOMMITTED\020\001\022\013\n\007PE"
          + "NDING\020\002\022\014\n\010BUFFERED\020\003\"3\n\tWriteMode\022\032\n\026WR"
          + "ITE_MODE_UNSPECIFIED\020\000\022\n\n\006INSERT\020\001:v\352As\n"
          + "*bigquerystorage.googleapis.com/WriteStr"
          + "eam\022Eprojects/{project}/datasets/{datase"
          + "t}/tables/{table}/streams/{stream}*>\n\nDa"
          + "taFormat\022\033\n\027DATA_FORMAT_UNSPECIFIED\020\000\022\010\n"
          + "\004AVRO\020\001\022\t\n\005ARROW\020\002*I\n\017WriteStreamView\022!\n"
          + "\035WRITE_STREAM_VIEW_UNSPECIFIED\020\000\022\t\n\005BASI"
          + "C\020\001\022\010\n\004FULL\020\002B\273\001\n$com.google.cloud.bigqu"
          + "ery.storage.v1B\013StreamProtoP\001Z>cloud.goo"
          + "gle.com/go/bigquery/storage/apiv1/storag"
          + "epb;storagepb\252\002 Google.Cloud.BigQuery.St"
          + "orage.V1\312\002 Google\\Cloud\\BigQuery\\Storage"
          + "\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.bigquery.storage.v1.ArrowProto.getDescriptor(),
              com.google.cloud.bigquery.storage.v1.AvroProto.getDescriptor(),
              com.google.cloud.bigquery.storage.v1.TableProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_storage_v1_ReadSession_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_storage_v1_ReadSession_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1_ReadSession_descriptor,
            new java.lang.String[] {
              "Name",
              "ExpireTime",
              "DataFormat",
              "AvroSchema",
              "ArrowSchema",
              "Table",
              "TableModifiers",
              "ReadOptions",
              "Streams",
              "EstimatedTotalBytesScanned",
              "EstimatedTotalPhysicalFileSize",
              "EstimatedRowCount",
              "TraceId",
              "Schema",
            });
    internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableModifiers_descriptor =
        internal_static_google_cloud_bigquery_storage_v1_ReadSession_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableModifiers_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableModifiers_descriptor,
            new java.lang.String[] {
              "SnapshotTime",
            });
    internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableReadOptions_descriptor =
        internal_static_google_cloud_bigquery_storage_v1_ReadSession_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableReadOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1_ReadSession_TableReadOptions_descriptor,
            new java.lang.String[] {
              "SelectedFields",
              "RowRestriction",
              "ArrowSerializationOptions",
              "AvroSerializationOptions",
              "SamplePercentage",
              "ResponseCompressionCodec",
              "OutputFormatSerializationOptions",
            });
    internal_static_google_cloud_bigquery_storage_v1_ReadStream_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_storage_v1_ReadStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1_ReadStream_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_storage_v1_WriteStream_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_storage_v1_WriteStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_storage_v1_WriteStream_descriptor,
            new java.lang.String[] {
              "Name", "Type", "CreateTime", "CommitTime", "TableSchema", "WriteMode", "Location",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.bigquery.storage.v1.ArrowProto.getDescriptor();
    com.google.cloud.bigquery.storage.v1.AvroProto.getDescriptor();
    com.google.cloud.bigquery.storage.v1.TableProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
