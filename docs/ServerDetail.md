
# ServerDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**address** | **String** | l4addr or hostname:port |  [optional]
**weight** | **Integer** | weight of the server in the server group |  [optional]
**currentIp** | **String** | l3addr |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**cost** | **Integer** | the milliseconds cost for one successful health check |  [optional]
**downReason** | **String** | reason for the last failed health check |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;



