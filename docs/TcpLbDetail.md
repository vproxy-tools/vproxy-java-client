
# TcpLbDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**address** | **String** | l4addr |  [optional]
**backend** | [**UpstreamDetail**](UpstreamDetail.md) |  |  [optional]
**protocol** | [**Protocol**](Protocol.md) |  |  [optional]
**acceptorLoopGroup** | [**EventLoopGroupDetail**](EventLoopGroupDetail.md) |  |  [optional]
**workerLoopGroup** | [**EventLoopGroupDetail**](EventLoopGroupDetail.md) |  |  [optional]
**inBufferSize** | **Integer** | input buffer size |  [optional]
**outBufferSize** | **Integer** | output buffer size |  [optional]
**listOfCertKey** | [**List&lt;CertKeyDetail&gt;**](CertKeyDetail.md) |  |  [optional]
**securityGroup** | [**SecurityGroupDetail**](SecurityGroupDetail.md) |  |  [optional]



