# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: master.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0cmaster.proto\x12\x14\x63om.demo.jdfs.master\"=\n\x17\x43reateOrEditFileRequest\x12\x10\n\x08\x66ileName\x18\x01 \x01(\t\x12\x10\n\x08\x66ileSize\x18\x02 \x01(\x03\"\x1f\n\x0b\x46ileRequest\x12\x10\n\x08\x66ileName\x18\x01 \x01(\t\"R\n\x11\x46ileIndexResponse\x12\x10\n\x08\x66ilename\x18\x01 \x01(\t\x12+\n\x06\x62locks\x18\x02 \x03(\x0b\x32\x1b.com.demo.jdfs.master.Block\"E\n\x05\x42lock\x12\x0f\n\x07\x62lockId\x18\x01 \x01(\t\x12+\n\x06slaves\x18\x02 \x03(\x0b\x32\x1b.com.demo.jdfs.master.Slave\"%\n\x05Slave\x12\x0f\n\x07slaveId\x18\x01 \x01(\t\x12\x0b\n\x03url\x18\x02 \x01(\t2\xd7\x01\n\x0cIndexService\x12\\\n\x0egetFileDetails\x12!.com.demo.jdfs.master.FileRequest\x1a\'.com.demo.jdfs.master.FileIndexResponse\x12i\n\x0fputFilesDetails\x12-.com.demo.jdfs.master.CreateOrEditFileRequest\x1a\'.com.demo.jdfs.master.FileIndexResponseB\x1e\n\x1a\x63om.demo.jdfs.master.stubsP\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'master_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.demo.jdfs.master.stubsP\001'
  _CREATEOREDITFILEREQUEST._serialized_start=38
  _CREATEOREDITFILEREQUEST._serialized_end=99
  _FILEREQUEST._serialized_start=101
  _FILEREQUEST._serialized_end=132
  _FILEINDEXRESPONSE._serialized_start=134
  _FILEINDEXRESPONSE._serialized_end=216
  _BLOCK._serialized_start=218
  _BLOCK._serialized_end=287
  _SLAVE._serialized_start=289
  _SLAVE._serialized_end=326
  _INDEXSERVICE._serialized_start=329
  _INDEXSERVICE._serialized_end=544
# @@protoc_insertion_point(module_scope)