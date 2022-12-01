// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: slave.proto

package com.demo.jdfs.slave.stubs;

/**
 * Protobuf type {@code com.demo.jdfs.slave.Slave}
 */
public final class Slave extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.jdfs.slave.Slave)
    SlaveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Slave.newBuilder() to construct.
  private Slave(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Slave() {
    slaveId_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Slave();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.demo.jdfs.slave.stubs.SlaveOuterClass.internal_static_com_demo_jdfs_slave_Slave_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.demo.jdfs.slave.stubs.SlaveOuterClass.internal_static_com_demo_jdfs_slave_Slave_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.demo.jdfs.slave.stubs.Slave.class, com.demo.jdfs.slave.stubs.Slave.Builder.class);
  }

  public static final int SLAVEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object slaveId_;
  /**
   * <code>string slaveId = 1;</code>
   * @return The slaveId.
   */
  @java.lang.Override
  public java.lang.String getSlaveId() {
    java.lang.Object ref = slaveId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      slaveId_ = s;
      return s;
    }
  }
  /**
   * <code>string slaveId = 1;</code>
   * @return The bytes for slaveId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSlaveIdBytes() {
    java.lang.Object ref = slaveId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      slaveId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 2;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slaveId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, slaveId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slaveId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, slaveId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.demo.jdfs.slave.stubs.Slave)) {
      return super.equals(obj);
    }
    com.demo.jdfs.slave.stubs.Slave other = (com.demo.jdfs.slave.stubs.Slave) obj;

    if (!getSlaveId()
        .equals(other.getSlaveId())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SLAVEID_FIELD_NUMBER;
    hash = (53 * hash) + getSlaveId().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.jdfs.slave.stubs.Slave parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.demo.jdfs.slave.stubs.Slave prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.demo.jdfs.slave.Slave}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.jdfs.slave.Slave)
      com.demo.jdfs.slave.stubs.SlaveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.demo.jdfs.slave.stubs.SlaveOuterClass.internal_static_com_demo_jdfs_slave_Slave_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.demo.jdfs.slave.stubs.SlaveOuterClass.internal_static_com_demo_jdfs_slave_Slave_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.demo.jdfs.slave.stubs.Slave.class, com.demo.jdfs.slave.stubs.Slave.Builder.class);
    }

    // Construct using com.demo.jdfs.slave.stubs.Slave.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      slaveId_ = "";

      url_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.demo.jdfs.slave.stubs.SlaveOuterClass.internal_static_com_demo_jdfs_slave_Slave_descriptor;
    }

    @java.lang.Override
    public com.demo.jdfs.slave.stubs.Slave getDefaultInstanceForType() {
      return com.demo.jdfs.slave.stubs.Slave.getDefaultInstance();
    }

    @java.lang.Override
    public com.demo.jdfs.slave.stubs.Slave build() {
      com.demo.jdfs.slave.stubs.Slave result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.demo.jdfs.slave.stubs.Slave buildPartial() {
      com.demo.jdfs.slave.stubs.Slave result = new com.demo.jdfs.slave.stubs.Slave(this);
      result.slaveId_ = slaveId_;
      result.url_ = url_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.demo.jdfs.slave.stubs.Slave) {
        return mergeFrom((com.demo.jdfs.slave.stubs.Slave)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.demo.jdfs.slave.stubs.Slave other) {
      if (other == com.demo.jdfs.slave.stubs.Slave.getDefaultInstance()) return this;
      if (!other.getSlaveId().isEmpty()) {
        slaveId_ = other.slaveId_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              slaveId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              url_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object slaveId_ = "";
    /**
     * <code>string slaveId = 1;</code>
     * @return The slaveId.
     */
    public java.lang.String getSlaveId() {
      java.lang.Object ref = slaveId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        slaveId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string slaveId = 1;</code>
     * @return The bytes for slaveId.
     */
    public com.google.protobuf.ByteString
        getSlaveIdBytes() {
      java.lang.Object ref = slaveId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        slaveId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string slaveId = 1;</code>
     * @param value The slaveId to set.
     * @return This builder for chaining.
     */
    public Builder setSlaveId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      slaveId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string slaveId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSlaveId() {
      
      slaveId_ = getDefaultInstance().getSlaveId();
      onChanged();
      return this;
    }
    /**
     * <code>string slaveId = 1;</code>
     * @param value The bytes for slaveId to set.
     * @return This builder for chaining.
     */
    public Builder setSlaveIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      slaveId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 2;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 2;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 2;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 2;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.demo.jdfs.slave.Slave)
  }

  // @@protoc_insertion_point(class_scope:com.demo.jdfs.slave.Slave)
  private static final com.demo.jdfs.slave.stubs.Slave DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.demo.jdfs.slave.stubs.Slave();
  }

  public static com.demo.jdfs.slave.stubs.Slave getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Slave>
      PARSER = new com.google.protobuf.AbstractParser<Slave>() {
    @java.lang.Override
    public Slave parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Slave> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Slave> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.demo.jdfs.slave.stubs.Slave getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
