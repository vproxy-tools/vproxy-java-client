# EventLoopApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEventLoop**](EventLoopApi.md#addEventLoop) | **POST** /event-loop-group/{elg}/event-loop | add event-loop into event-loop-group
[**describeEventLoop**](EventLoopApi.md#describeEventLoop) | **GET** /event-loop-group/{elg}/event-loop/{el}/detail | get detailed info of one event-loop in event-loop-group
[**getEventLoop**](EventLoopApi.md#getEventLoop) | **GET** /event-loop-group/{elg}/event-loop/{el} | get event-loop in event-loop-group
[**listEventLoop**](EventLoopApi.md#listEventLoop) | **GET** /event-loop-group/{elg}/event-loop | retrieve event-loop list from event-loop-group
[**removeEventLoop**](EventLoopApi.md#removeEventLoop) | **DELETE** /event-loop-group/{elg}/event-loop/{el} | remove event-loop from event-loop-group


<a name="addEventLoop"></a>
# **addEventLoop**
> addEventLoop(elg, body)

add event-loop into event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopApi;


EventLoopApi apiInstance = new EventLoopApi();
String elg = "elg_example"; // String | name of the event-loop-group
EventLoopCreate body = new EventLoopCreate(); // EventLoopCreate | 
try {
    apiInstance.addEventLoop(elg, body);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopApi#addEventLoop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |
 **body** | [**EventLoopCreate**](EventLoopCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeEventLoop"></a>
# **describeEventLoop**
> EventLoopDetail describeEventLoop(elg, el)

get detailed info of one event-loop in event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopApi;


EventLoopApi apiInstance = new EventLoopApi();
String elg = "elg_example"; // String | name of the event-loop-group
String el = "el_example"; // String | name of the event-loop
try {
    EventLoopDetail result = apiInstance.describeEventLoop(elg, el);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopApi#describeEventLoop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |
 **el** | **String**| name of the event-loop |

### Return type

[**EventLoopDetail**](EventLoopDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventLoop"></a>
# **getEventLoop**
> EventLoop getEventLoop(elg, el)

get event-loop in event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopApi;


EventLoopApi apiInstance = new EventLoopApi();
String elg = "elg_example"; // String | name of the event-loop-group
String el = "el_example"; // String | name of the event-loop
try {
    EventLoop result = apiInstance.getEventLoop(elg, el);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopApi#getEventLoop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |
 **el** | **String**| name of the event-loop |

### Return type

[**EventLoop**](EventLoop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEventLoop"></a>
# **listEventLoop**
> List&lt;EventLoop&gt; listEventLoop(elg)

retrieve event-loop list from event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopApi;


EventLoopApi apiInstance = new EventLoopApi();
String elg = "elg_example"; // String | name of the event-loop-group
try {
    List<EventLoop> result = apiInstance.listEventLoop(elg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopApi#listEventLoop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |

### Return type

[**List&lt;EventLoop&gt;**](EventLoop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeEventLoop"></a>
# **removeEventLoop**
> removeEventLoop(elg, el)

remove event-loop from event-loop-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.EventLoopApi;


EventLoopApi apiInstance = new EventLoopApi();
String elg = "elg_example"; // String | name of the event-loop-group
String el = "el_example"; // String | name of the event-loop
try {
    apiInstance.removeEventLoop(elg, el);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLoopApi#removeEventLoop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elg** | **String**| name of the event-loop-group |
 **el** | **String**| name of the event-loop |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

