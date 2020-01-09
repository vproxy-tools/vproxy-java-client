# UpstreamApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUpstream**](UpstreamApi.md#addUpstream) | **POST** /upstream | add upstream
[**describeUpstream**](UpstreamApi.md#describeUpstream) | **GET** /upstream/{ups}/detail | get detailed info of one upstream
[**getUpstream**](UpstreamApi.md#getUpstream) | **GET** /upstream/{ups} | get upstream
[**listUpstream**](UpstreamApi.md#listUpstream) | **GET** /upstream | retrieve upstream list
[**removeUpstream**](UpstreamApi.md#removeUpstream) | **DELETE** /upstream/{ups} | remove upstream


<a name="addUpstream"></a>
# **addUpstream**
> addUpstream(body)

add upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.UpstreamApi;


UpstreamApi apiInstance = new UpstreamApi();
UpstreamCreate body = new UpstreamCreate(); // UpstreamCreate | 
try {
    apiInstance.addUpstream(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UpstreamApi#addUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpstreamCreate**](UpstreamCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeUpstream"></a>
# **describeUpstream**
> UpstreamDetail describeUpstream(ups)

get detailed info of one upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.UpstreamApi;


UpstreamApi apiInstance = new UpstreamApi();
String ups = "ups_example"; // String | name of the upstream
try {
    UpstreamDetail result = apiInstance.describeUpstream(ups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpstreamApi#describeUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |

### Return type

[**UpstreamDetail**](UpstreamDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUpstream"></a>
# **getUpstream**
> Upstream getUpstream(ups)

get upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.UpstreamApi;


UpstreamApi apiInstance = new UpstreamApi();
String ups = "ups_example"; // String | name of the upstream
try {
    Upstream result = apiInstance.getUpstream(ups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpstreamApi#getUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |

### Return type

[**Upstream**](Upstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUpstream"></a>
# **listUpstream**
> List&lt;Upstream&gt; listUpstream()

retrieve upstream list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.UpstreamApi;


UpstreamApi apiInstance = new UpstreamApi();
try {
    List<Upstream> result = apiInstance.listUpstream();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpstreamApi#listUpstream");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Upstream&gt;**](Upstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeUpstream"></a>
# **removeUpstream**
> removeUpstream(ups)

remove upstream

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.UpstreamApi;


UpstreamApi apiInstance = new UpstreamApi();
String ups = "ups_example"; // String | name of the upstream
try {
    apiInstance.removeUpstream(ups);
} catch (ApiException e) {
    System.err.println("Exception when calling UpstreamApi#removeUpstream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ups** | **String**| name of the upstream |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

