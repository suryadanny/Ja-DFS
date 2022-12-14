# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import slave_pb2 as slave__pb2


class DataStorageServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.getFile = channel.unary_stream(
                '/com.demo.jdfs.slave.DataStorageService/getFile',
                request_serializer=slave__pb2.ViewFileRequest.SerializeToString,
                response_deserializer=slave__pb2.ViewFileResponse.FromString,
                )
        self.putFile = channel.stream_unary(
                '/com.demo.jdfs.slave.DataStorageService/putFile',
                request_serializer=slave__pb2.FileStorageRequest.SerializeToString,
                response_deserializer=slave__pb2.FileStorageResponse.FromString,
                )


class DataStorageServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def getFile(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def putFile(self, request_iterator, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_DataStorageServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'getFile': grpc.unary_stream_rpc_method_handler(
                    servicer.getFile,
                    request_deserializer=slave__pb2.ViewFileRequest.FromString,
                    response_serializer=slave__pb2.ViewFileResponse.SerializeToString,
            ),
            'putFile': grpc.stream_unary_rpc_method_handler(
                    servicer.putFile,
                    request_deserializer=slave__pb2.FileStorageRequest.FromString,
                    response_serializer=slave__pb2.FileStorageResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'com.demo.jdfs.slave.DataStorageService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class DataStorageService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def getFile(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/com.demo.jdfs.slave.DataStorageService/getFile',
            slave__pb2.ViewFileRequest.SerializeToString,
            slave__pb2.ViewFileResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def putFile(request_iterator,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.stream_unary(request_iterator, target, '/com.demo.jdfs.slave.DataStorageService/putFile',
            slave__pb2.FileStorageRequest.SerializeToString,
            slave__pb2.FileStorageResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
