// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: slave.proto

package com.demo.jdfs.slave.stubs;

public interface FileStorageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.jdfs.slave.FileStorageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string partitionName = 1;</code>
   * @return The partitionName.
   */
  java.lang.String getPartitionName();
  /**
   * <code>string partitionName = 1;</code>
   * @return The bytes for partitionName.
   */
  com.google.protobuf.ByteString
      getPartitionNameBytes();

  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>repeated .com.demo.jdfs.slave.Slave slaves = 3;</code>
   */
  java.util.List<com.demo.jdfs.slave.stubs.Slave> 
      getSlavesList();
  /**
   * <code>repeated .com.demo.jdfs.slave.Slave slaves = 3;</code>
   */
  com.demo.jdfs.slave.stubs.Slave getSlaves(int index);
  /**
   * <code>repeated .com.demo.jdfs.slave.Slave slaves = 3;</code>
   */
  int getSlavesCount();
  /**
   * <code>repeated .com.demo.jdfs.slave.Slave slaves = 3;</code>
   */
  java.util.List<? extends com.demo.jdfs.slave.stubs.SlaveOrBuilder> 
      getSlavesOrBuilderList();
  /**
   * <code>repeated .com.demo.jdfs.slave.Slave slaves = 3;</code>
   */
  com.demo.jdfs.slave.stubs.SlaveOrBuilder getSlavesOrBuilder(
      int index);
}
