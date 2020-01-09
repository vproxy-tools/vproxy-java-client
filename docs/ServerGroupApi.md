# ServerGroupApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addServerGroup**](ServerGroupApi.md#addServerGroup) | **POST** /server-group | add server-group
[**addServerGroupInUpstream**](ServerGroupApi.md#addServerGroupInUpstream) | **POST** /upstream/{ups}/server-group | add server-group into upstream
[**describeServerGroup**](ServerGroupApi.md#describeServerGroup) | **GET** /server-group/{sg}/detail | get detailed info of one server-group
[**describeServerGroupInUpstream**](ServerGroupApi.md#describeServerGroupInUpstream) | **GET** /upstream/{ups}/server-group/{sg}/detail | get detailed info of one server-group in upstream
[**getServerGroup**](ServerGroupApi.md#getServerGroup) | **GET** /server-group/{sg} | get server-group
[**getServerGroupInUpstream**](ServerGroupApi.md#getServerGroupInUpstream) | **GET** /upstream/{ups}/server-group/{sg} | get server-group in upstream
[**listServerGroup**](ServerGroupApi.md#listServerGroup) | **GET** /server-group | retrieve server-group list
[**listServerGroupInUpstream**](ServerGroupApi.md#listServerGroupInUpstream) | **GET** /upstream/{ups}/server-group | retrieve server-group list from upstream
[**removeServerGroup**](ServerGroupApi.md#removeServerGroup) | **DELETE** /server-group/{sg} | remove server-group
[**removeServerGroupInUpstream**](ServerGroupApi.md#removeServerGroupInUpstream) | **DELETE** /upstream/{ups}/server-group/{sg} | remove server-group from upstream
[**updateServerGroup**](ServerGroupApi.md#updateServerGroup) | **PUT** /server-group/{sg} | update server-group
[**updateServerGroupInUpstream**](ServerGroupApi.md#updateServerGroupInUpstream) | **PUT** /upstream/{ups}/server-group/{sg} | update server-group in upstream


<a name="addServerGroup"></a>
# **addServerGroup**
> addServerGroup(body)

add server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
ServerGroupCreate body = new ServerGroupCreate(); // ServerGroupCreate | 
try {
    apiInstance.addServerGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#addServerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServerGroupCreate**](ServerGroupCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addServerGroupInUpstream"></a>
# **addServerGroupInUpstream**
> addServerGroupInUpstream(ups, body)

add server-group into upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String ups = "ups_example"; // String | name of the upstream
ServerGroupInUpstreamCreate body = new ServerGroupInUpstreamCreate(); // ServerGroupInUpstreamCreate | 
try {
    apiInstance.addServerGroupInUpstream(ups, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#addServerGroupInUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |
 **body** | [**ServerGroupInUpstreamCreate**](ServerGroupInUpstreamCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeServerGroup"></a>
# **describeServerGroup**
> ServerGroupDetail describeServerGroup(sg)

get detailed info of one server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String sg = "sg_example"; // String | name of the server-group
try {
    ServerGroupDetail result = apiInstance.describeServerGroup(sg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#describeServerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |

### Return type

[**ServerGroupDetail**](ServerGroupDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="describeServerGroupInUpstream"></a>
# **describeServerGroupInUpstream**
> ServerGroupInUpstreamDetail describeServerGroupInUpstream(ups, sg)

get detailed info of one server-group in upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String ups = "ups_example"; // String | name of the upstream
String sg = "sg_example"; // String | name of the server-group
try {
    ServerGroupInUpstreamDetail result = apiInstance.describeServerGroupInUpstream(ups, sg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#describeServerGroupInUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |
 **sg** | **String**| name of the server-group |

### Return type

[**ServerGroupInUpstreamDetail**](ServerGroupInUpstreamDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getServerGroup"></a>
# **getServerGroup**
> ServerGroup getServerGroup(sg)

get server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String sg = "sg_example"; // String | name of the server-group
try {
    ServerGroup result = apiInstance.getServerGroup(sg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#getServerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |

### Return type

[**ServerGroup**](ServerGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServerGroupInUpstream"></a>
# **getServerGroupInUpstream**
> ServerGroupInUpstream getServerGroupInUpstream(ups, sg)

get server-group in upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String ups = "ups_example"; // String | name of the upstream
String sg = "sg_example"; // String | name of the server-group
try {
    ServerGroupInUpstream result = apiInstance.getServerGroupInUpstream(ups, sg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#getServerGroupInUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |
 **sg** | **String**| name of the server-group |

### Return type

[**ServerGroupInUpstream**](ServerGroupInUpstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServerGroup"></a>
# **listServerGroup**
> List&lt;ServerGroup&gt; listServerGroup()

retrieve server-group list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
try {
    List<ServerGroup> result = apiInstance.listServerGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#listServerGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ServerGroup&gt;**](ServerGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServerGroupInUpstream"></a>
# **listServerGroupInUpstream**
> List&lt;ServerGroupInUpstream&gt; listServerGroupInUpstream(ups)

retrieve server-group list from upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String ups = "ups_example"; // String | name of the upstream
try {
    List<ServerGroupInUpstream> result = apiInstance.listServerGroupInUpstream(ups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#listServerGroupInUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |

### Return type

[**List&lt;ServerGroupInUpstream&gt;**](ServerGroupInUpstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeServerGroup"></a>
# **removeServerGroup**
> removeServerGroup(sg)

remove server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String sg = "sg_example"; // String | name of the server-group
try {
    apiInstance.removeServerGroup(sg);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#removeServerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeServerGroupInUpstream"></a>
# **removeServerGroupInUpstream**
> removeServerGroupInUpstream(ups, sg)

remove server-group from upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String ups = "ups_example"; // String | name of the upstream
String sg = "sg_example"; // String | name of the server-group
try {
    apiInstance.removeServerGroupInUpstream(ups, sg);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#removeServerGroupInUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |
 **sg** | **String**| name of the server-group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateServerGroup"></a>
# **updateServerGroup**
> updateServerGroup(sg, body)

update server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String sg = "sg_example"; // String | name of the server-group
ServerGroupUpdate body = new ServerGroupUpdate(); // ServerGroupUpdate | 
try {
    apiInstance.updateServerGroup(sg, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#updateServerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |
 **body** | [**ServerGroupUpdate**](ServerGroupUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServerGroupInUpstream"></a>
# **updateServerGroupInUpstream**
> updateServerGroupInUpstream(ups, sg, body)

update server-group in upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerGroupApi;


ServerGroupApi apiInstance = new ServerGroupApi();
String ups = "ups_example"; // String | name of the upstream
String sg = "sg_example"; // String | name of the server-group
ServerGroupInUpstreamUpdate body = new ServerGroupInUpstreamUpdate(); // ServerGroupInUpstreamUpdate | 
try {
    apiInstance.updateServerGroupInUpstream(ups, sg, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerGroupApi#updateServerGroupInUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |
 **sg** | **String**| name of the server-group |
 **body** | [**ServerGroupInUpstreamUpdate**](ServerGroupInUpstreamUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

