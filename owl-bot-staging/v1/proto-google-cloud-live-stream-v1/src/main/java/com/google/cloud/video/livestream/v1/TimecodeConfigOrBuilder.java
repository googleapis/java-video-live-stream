// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/outputs.proto

package com.google.cloud.video.livestream.v1;

public interface TimecodeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.TimecodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The source of the timecode that will later be used in outputs/manifests.
   * It determines the initial timecode/timestamp (first frame) of output
   * streams.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.TimecodeConfig.TimecodeSource source = 1;</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <pre>
   * The source of the timecode that will later be used in outputs/manifests.
   * It determines the initial timecode/timestamp (first frame) of output
   * streams.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.TimecodeConfig.TimecodeSource source = 1;</code>
   * @return The source.
   */
  com.google.cloud.video.livestream.v1.TimecodeConfig.TimecodeSource getSource();

  /**
   * <pre>
   * UTC offset. Must be whole seconds, between -18 hours and +18 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration utc_offset = 2;</code>
   * @return Whether the utcOffset field is set.
   */
  boolean hasUtcOffset();
  /**
   * <pre>
   * UTC offset. Must be whole seconds, between -18 hours and +18 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration utc_offset = 2;</code>
   * @return The utcOffset.
   */
  com.google.protobuf.Duration getUtcOffset();
  /**
   * <pre>
   * UTC offset. Must be whole seconds, between -18 hours and +18 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration utc_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getUtcOffsetOrBuilder();

  /**
   * <pre>
   * Time zone e.g. "America/Los_Angeles".
   * </pre>
   *
   * <code>.google.type.TimeZone time_zone = 3;</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Time zone e.g. "America/Los_Angeles".
   * </pre>
   *
   * <code>.google.type.TimeZone time_zone = 3;</code>
   * @return The timeZone.
   */
  com.google.type.TimeZone getTimeZone();
  /**
   * <pre>
   * Time zone e.g. "America/Los_Angeles".
   * </pre>
   *
   * <code>.google.type.TimeZone time_zone = 3;</code>
   */
  com.google.type.TimeZoneOrBuilder getTimeZoneOrBuilder();

  public com.google.cloud.video.livestream.v1.TimecodeConfig.TimeOffsetCase getTimeOffsetCase();
}
