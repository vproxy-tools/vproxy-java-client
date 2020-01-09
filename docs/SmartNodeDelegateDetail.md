
# SmartNodeDelegateDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**service** | **String** | name of the service to register application node into |  [optional]
**zone** | **String** | name of the working zone |  [optional]
**nic** | **String** | name of the nic which the application binds on |  [optional]
**ipType** | [**IPType**](IPType.md) |  |  [optional]
**exposedPort** | **Integer** | port of the application |  [optional]
**weight** | **Integer** | weight of the application node in the service |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;



