# EventLoopGroupApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEventLoopGroup**](EventLoopGroupApi.md#addEventLoopGroup) | **POST** /event-loop-group | add event-loop-group
[**describeEventLoopGroup**](EventLoopGroupApi.md#describeEventLoopGroup) | **GET** /event-loop-group/{elg}/detail | get detailed info of one event-loop-group
[**getEventLoopGroup**](EventLoopGroupApi.md#getEventLoopGroup) | **GET** /event-loop-group/{elg} | get event-loop-group
[**listEventLoopGroup**](EventLoopGroupApi.md#listEventLoopGroup) | **GET** /event-loop-group | retrieve event-loop-group list
[**removeEventLoopGroup**](EventLoopGroupApi.md#removeEventLoopGroup) | **DELETE** /event-loop-group/{elg} | remove event-loop-group


<a name="addEventLoopGroup"></a>
# **addEventLoopGroup**
> addEventLoopGroup(body)

add event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopGroupApi;


EventLoopGroupApi apiInstance = new EventLoopGroupApi();
EventLoopGroupCreate body = new EventLoopGroupCreate(); // EventLoopGroupCreate | 
try {
    apiInstance.addEventLoopGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopGroupApi#addEventLoopGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventLoopGroupCreate**](EventLoopGroupCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeEventLoopGroup"></a>
# **describeEventLoopGroup**
> EventLoopGroupDetail describeEventLoopGroup(elg)

get detailed info of one event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopGroupApi;


EventLoopGroupApi apiInstance = new EventLoopGroupApi();
String elg = "elg_example"; // String | name of the event-loop-group
try {
    EventLoopGroupDetail result = apiInstance.describeEventLoopGroup(elg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopGroupApi#describeEventLoopGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |

### Return type

[**EventLoopGroupDetail**](EventLoopGroupDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventLoopGroup"></a>
# **getEventLoopGroup**
> EventLoopGroup getEventLoopGroup(elg)

get event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopGroupApi;


EventLoopGroupApi apiInstance = new EventLoopGroupApi();
String elg = "elg_example"; // String | name of the event-loop-group
try {
    EventLoopGroup result = apiInstance.getEventLoopGroup(elg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopGroupApi#getEventLoopGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |

### Return type

[**EventLoopGroup**](EventLoopGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEventLoopGroup"></a>
# **listEventLoopGroup**
> List&lt;EventLoopGroup&gt; listEventLoopGroup()

retrieve event-loop-group list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopGroupApi;


EventLoopGroupApi apiInstance = new EventLoopGroupApi();
try {
    List<EventLoopGroup> result = apiInstance.listEventLoopGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopGroupApi#listEventLoopGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventLoopGroup&gt;**](EventLoopGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeEventLoopGroup"></a>
# **removeEventLoopGroup**
> removeEventLoopGroup(elg)

remove event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopGroupApi;


EventLoopGroupApi apiInstance = new EventLoopGroupApi();
String elg = "elg_example"; // String | name of the event-loop-group
try {
    apiInstance.removeEventLoopGroup(elg);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopGroupApi#removeEventLoopGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

