# ServerApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addServer**](ServerApi.md#addServer) | **POST** /server-group/{sg}/server | add server into server-group
[**describeServer**](ServerApi.md#describeServer) | **GET** /server-group/{sg}/server/{svr}/detail | get detailed info of one server in server-group
[**getServer**](ServerApi.md#getServer) | **GET** /server-group/{sg}/server/{svr} | get server in server-group
[**listServer**](ServerApi.md#listServer) | **GET** /server-group/{sg}/server | retrieve server list from server-group
[**removeServer**](ServerApi.md#removeServer) | **DELETE** /server-group/{sg}/server/{svr} | remove server from server-group
[**updateServer**](ServerApi.md#updateServer) | **PUT** /server-group/{sg}/server/{svr} | update server in server-group


<a name="addServer"></a>
# **addServer**
> addServer(sg, body)

add server into server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerApi;


ServerApi apiInstance = new ServerApi();
String sg = "sg_example"; // String | name of the server-group
ServerCreate body = new ServerCreate(); // ServerCreate | 
try {
    apiInstance.addServer(sg, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#addServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |
 **body** | [**ServerCreate**](ServerCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeServer"></a>
# **describeServer**
> ServerDetail describeServer(sg, svr)

get detailed info of one server in server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerApi;


ServerApi apiInstance = new ServerApi();
String sg = "sg_example"; // String | name of the server-group
String svr = "svr_example"; // String | name of the server
try {
    ServerDetail result = apiInstance.describeServer(sg, svr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#describeServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |
 **svr** | **String**| name of the server |

### Return type

[**ServerDetail**](ServerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getServer"></a>
# **getServer**
> Server getServer(sg, svr)

get server in server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerApi;


ServerApi apiInstance = new ServerApi();
String sg = "sg_example"; // String | name of the server-group
String svr = "svr_example"; // String | name of the server
try {
    Server result = apiInstance.getServer(sg, svr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |
 **svr** | **String**| name of the server |

### Return type

[**Server**](Server.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServer"></a>
# **listServer**
> List&lt;Server&gt; listServer(sg)

retrieve server list from server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerApi;


ServerApi apiInstance = new ServerApi();
String sg = "sg_example"; // String | name of the server-group
try {
    List<Server> result = apiInstance.listServer(sg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#listServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |

### Return type

[**List&lt;Server&gt;**](Server.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeServer"></a>
# **removeServer**
> removeServer(sg, svr)

remove server from server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerApi;


ServerApi apiInstance = new ServerApi();
String sg = "sg_example"; // String | name of the server-group
String svr = "svr_example"; // String | name of the server
try {
    apiInstance.removeServer(sg, svr);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#removeServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |
 **svr** | **String**| name of the server |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateServer"></a>
# **updateServer**
> updateServer(sg, svr, body)

update server in server-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.ServerApi;


ServerApi apiInstance = new ServerApi();
String sg = "sg_example"; // String | name of the server-group
String svr = "svr_example"; // String | name of the server
ServerUpdate body = new ServerUpdate(); // ServerUpdate | 
try {
    apiInstance.updateServer(sg, svr, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#updateServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sg** | **String**| name of the server-group |
 **svr** | **String**| name of the server |
 **body** | [**ServerUpdate**](ServerUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

