
# ServerGroupCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**timeout** | **Integer** | health check timeout (ms) (timeout before getting expected response) | 
**period** | **Integer** | health check period (ms) (interval between two hc) | 
**up** | **Integer** | consider the server healthy after $up times of successful health checks | 
**down** | **Integer** | consider the server unhealthy after $down times of failed health checks | 
**protocol** | [**CheckProtocol**](CheckProtocol.md) |  |  [optional]
**method** | [**ServerGroupMethod**](ServerGroupMethod.md) |  |  [optional]
**annotations** | **Map&lt;String, String&gt;** |  |  [optional]
**eventLoopGroup** | **String** | the event loop group to run health check on |  [optional]



