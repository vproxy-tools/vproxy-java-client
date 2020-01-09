
# Socks5ServerDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**address** | **String** | binding l4addr |  [optional]
**backend** | [**UpstreamDetail**](UpstreamDetail.md) |  |  [optional]
**acceptorLoopGroup** | [**EventLoopGroupDetail**](EventLoopGroupDetail.md) |  |  [optional]
**workerLoopGroup** | [**EventLoopGroupDetail**](EventLoopGroupDetail.md) |  |  [optional]
**inBufferSize** | **Integer** | input buffer size |  [optional]
**outBufferSize** | **Integer** | output buffer size |  [optional]
**securityGroup** | [**SecurityGroupDetail**](SecurityGroupDetail.md) |  |  [optional]
**allowNonBackend** | **Boolean** | allow or disallow to proxy to non-backend endpoints |  [optional]



