
# Socks5Server

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**address** | **String** | binding l4addr |  [optional]
**backend** | **String** | upstream reference for backend servers |  [optional]
**acceptorLoopGroup** | **String** | event loop group for accepting connections |  [optional]
**workerLoopGroup** | **String** | event loop group for handling netflow |  [optional]
**inBufferSize** | **Integer** | input buffer size |  [optional]
**outBufferSize** | **Integer** | output buffer size |  [optional]
**securityGroup** | **String** | security group reference for access control |  [optional]
**allowNonBackend** | **Boolean** | allow or disallow to proxy to non-backend endpoints |  [optional]



