// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface InspectJobConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectJobConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The data to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageConfig storage_config = 1;</code>
   */
  boolean hasStorageConfig();
  /**
   * <pre>
   * The data to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageConfig storage_config = 1;</code>
   */
  com.google.privacy.dlp.v2.StorageConfig getStorageConfig();
  /**
   * <pre>
   * The data to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageConfig storage_config = 1;</code>
   */
  com.google.privacy.dlp.v2.StorageConfigOrBuilder getStorageConfigOrBuilder();

  /**
   * <pre>
   * How and what to scan for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  boolean hasInspectConfig();
  /**
   * <pre>
   * How and what to scan for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   * <pre>
   * How and what to scan for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   * <pre>
   * If provided, will be used as the default for all values in InspectConfig.
   * `inspect_config` will be merged into the values persisted as part of the
   * template.
   * </pre>
   *
   * <code>string inspect_template_name = 3;</code>
   */
  java.lang.String getInspectTemplateName();
  /**
   * <pre>
   * If provided, will be used as the default for all values in InspectConfig.
   * `inspect_config` will be merged into the values persisted as part of the
   * template.
   * </pre>
   *
   * <code>string inspect_template_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getInspectTemplateNameBytes();

  /**
   * <pre>
   * Actions to execute at the completion of the job. Are executed in the order
   * provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Action actions = 4;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.Action> 
      getActionsList();
  /**
   * <pre>
   * Actions to execute at the completion of the job. Are executed in the order
   * provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Action actions = 4;</code>
   */
  com.google.privacy.dlp.v2.Action getActions(int index);
  /**
   * <pre>
   * Actions to execute at the completion of the job. Are executed in the order
   * provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Action actions = 4;</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * Actions to execute at the completion of the job. Are executed in the order
   * provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Action actions = 4;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.ActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * Actions to execute at the completion of the job. Are executed in the order
   * provided.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Action actions = 4;</code>
   */
  com.google.privacy.dlp.v2.ActionOrBuilder getActionsOrBuilder(
      int index);
}