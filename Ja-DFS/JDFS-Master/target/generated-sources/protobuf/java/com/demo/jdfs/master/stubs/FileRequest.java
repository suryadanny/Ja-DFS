// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: master.proto

package com.demo.jdfs.master.stubs;

/**
 * Protobuf type {@code com.demo.jdfs.master.FileRequest}
 */
public final class FileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.jdfs.master.FileRequest)
    FileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileRequest.newBuilder() to construct.
  private FileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileRequest() {
    fileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.demo.jdfs.master.stubs.Master.internal_static_com_demo_jdfs_master_FileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.demo.jdfs.master.stubs.Master.internal_static_com_demo_jdfs_master_FileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.demo.jdfs.master.stubs.FileRequest.class, com.demo.jdfs.master.stubs.FileRequest.Builder.class);
  }

  public static final int FILENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string fileName = 1;</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string fileName = 1;</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileName_);
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
    if (!(obj instanceof com.demo.jdfs.master.stubs.FileRequest)) {
      return super.equals(obj);
    }
    com.demo.jdfs.master.stubs.FileRequest other = (com.demo.jdfs.master.stubs.FileRequest) obj;

    if (!getFileName()
        .equals(other.getFileName())) return false;
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
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.jdfs.master.stubs.FileRequest parseFrom(
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
  public static Builder newBuilder(com.demo.jdfs.master.stubs.FileRequest prototype) {
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
   * Protobuf type {@code com.demo.jdfs.master.FileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.jdfs.master.FileRequest)
      com.demo.jdfs.master.stubs.FileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.demo.jdfs.master.stubs.Master.internal_static_com_demo_jdfs_master_FileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.demo.jdfs.master.stubs.Master.internal_static_com_demo_jdfs_master_FileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.demo.jdfs.master.stubs.FileRequest.class, com.demo.jdfs.master.stubs.FileRequest.Builder.class);
    }

    // Construct using com.demo.jdfs.master.stubs.FileRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fileName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.demo.jdfs.master.stubs.Master.internal_static_com_demo_jdfs_master_FileRequest_descriptor;
    }

    @java.lang.Override
    public com.demo.jdfs.master.stubs.FileRequest getDefaultInstanceForType() {
      return com.demo.jdfs.master.stubs.FileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.demo.jdfs.master.stubs.FileRequest build() {
      com.demo.jdfs.master.stubs.FileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.demo.jdfs.master.stubs.FileRequest buildPartial() {
      com.demo.jdfs.master.stubs.FileRequest result = new com.demo.jdfs.master.stubs.FileRequest(this);
      result.fileName_ = fileName_;
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
      if (other instanceof com.demo.jdfs.master.stubs.FileRequest) {
        return mergeFrom((com.demo.jdfs.master.stubs.FileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.demo.jdfs.master.stubs.FileRequest other) {
      if (other == com.demo.jdfs.master.stubs.FileRequest.getDefaultInstance()) return this;
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
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
              fileName_ = input.readStringRequireUtf8();

              break;
            } // case 10
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

    private java.lang.Object fileName_ = "";
    /**
     * <code>string fileName = 1;</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fileName = 1;</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fileName = 1;</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 1;</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.demo.jdfs.master.FileRequest)
  }

  // @@protoc_insertion_point(class_scope:com.demo.jdfs.master.FileRequest)
  private static final com.demo.jdfs.master.stubs.FileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.demo.jdfs.master.stubs.FileRequest();
  }

  public static com.demo.jdfs.master.stubs.FileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileRequest>
      PARSER = new com.google.protobuf.AbstractParser<FileRequest>() {
    @java.lang.Override
    public FileRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.demo.jdfs.master.stubs.FileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
