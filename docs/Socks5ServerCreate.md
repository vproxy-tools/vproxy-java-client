
# Socks5ServerCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**address** | **String** | binding l4addr | 
**backend** | **String** | upstream reference for backend servers | 
**acceptorLoopGroup** | **String** | event loop group for accepting connections |  [optional]
**workerLoopGroup** | **String** | event loop group for handling netflow |  [optional]
**inBufferSize** | **Integer** | input buffer size |  [optional]
**outBufferSize** | **Integer** | output buffer size |  [optional]
**securityGroup** | **String** | security group reference for access control |  [optional]
**allowNonBackend** | **Boolean** | allow or disallow to proxy to non-backend endpoints |  [optional]



