
# ServerGroupDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**timeout** | **Integer** | health check timeout (ms) (timeout before getting expected response) |  [optional]
**period** | **Integer** | health check period (ms) (interval between two hc) |  [optional]
**up** | **Integer** | consider the server healthy after $up times of successful health checks |  [optional]
**down** | **Integer** | consider the server unhealthy after $down times of failed health checks |  [optional]
**protocol** | [**CheckProtocol**](CheckProtocol.md) |  |  [optional]
**method** | [**ServerGroupMethod**](ServerGroupMethod.md) |  |  [optional]
**annotations** | **Map&lt;String, String&gt;** |  |  [optional]
**eventLoopGroup** | [**EventLoopGroupDetail**](EventLoopGroupDetail.md) |  |  [optional]
**serverList** | [**List&lt;ServerDetail&gt;**](ServerDetail.md) |  |  [optional]



