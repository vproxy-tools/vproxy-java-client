
# TcpLbCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**address** | **String** | binding l4addr | 
**backend** | **String** | upstream reference for backend servers | 
**protocol** | [**Protocol**](Protocol.md) |  |  [optional]
**acceptorLoopGroup** | **String** | event loop group for accepting connections |  [optional]
**workerLoopGroup** | **String** | event loop group for handling netflow |  [optional]
**inBufferSize** | **Integer** | input buffer size |  [optional]
**outBufferSize** | **Integer** | output buffer size |  [optional]
**listOfCertKey** | **List&lt;String&gt;** |  |  [optional]
**securityGroup** | **String** | security group reference for access control |  [optional]



