# SmartNodeDelegateApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSmartNodeDelegate**](SmartNodeDelegateApi.md#addSmartNodeDelegate) | **POST** /smart-node-delegate | add smart-node-delegate
[**describeSmartNodeDelegate**](SmartNodeDelegateApi.md#describeSmartNodeDelegate) | **GET** /smart-node-delegate/{snd}/detail | get detailed info of one smart-node-delegate
[**getSmartNodeDelegate**](SmartNodeDelegateApi.md#getSmartNodeDelegate) | **GET** /smart-node-delegate/{snd} | get smart-node-delegate
[**listSmartNodeDelegate**](SmartNodeDelegateApi.md#listSmartNodeDelegate) | **GET** /smart-node-delegate | retrieve smart-node-delegate list
[**removeSmartNodeDelegate**](SmartNodeDelegateApi.md#removeSmartNodeDelegate) | **DELETE** /smart-node-delegate/{snd} | remove smart-node-delegate


<a name="addSmartNodeDelegate"></a>
# **addSmartNodeDelegate**
> addSmartNodeDelegate(body)

add smart-node-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartNodeDelegateApi;


SmartNodeDelegateApi apiInstance = new SmartNodeDelegateApi();
SmartNodeDelegateCreate body = new SmartNodeDelegateCreate(); // SmartNodeDelegateCreate | 
try {
    apiInstance.addSmartNodeDelegate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartNodeDelegateApi#addSmartNodeDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartNodeDelegateCreate**](SmartNodeDelegateCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeSmartNodeDelegate"></a>
# **describeSmartNodeDelegate**
> SmartNodeDelegateDetail describeSmartNodeDelegate(snd)

get detailed info of one smart-node-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartNodeDelegateApi;


SmartNodeDelegateApi apiInstance = new SmartNodeDelegateApi();
String snd = "snd_example"; // String | name of the smart-node-delegate
try {
    SmartNodeDelegateDetail result = apiInstance.describeSmartNodeDelegate(snd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartNodeDelegateApi#describeSmartNodeDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snd** | **String**| name of the smart-node-delegate |

### Return type

[**SmartNodeDelegateDetail**](SmartNodeDelegateDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSmartNodeDelegate"></a>
# **getSmartNodeDelegate**
> SmartNodeDelegate getSmartNodeDelegate(snd)

get smart-node-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartNodeDelegateApi;


SmartNodeDelegateApi apiInstance = new SmartNodeDelegateApi();
String snd = "snd_example"; // String | name of the smart-node-delegate
try {
    SmartNodeDelegate result = apiInstance.getSmartNodeDelegate(snd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartNodeDelegateApi#getSmartNodeDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snd** | **String**| name of the smart-node-delegate |

### Return type

[**SmartNodeDelegate**](SmartNodeDelegate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSmartNodeDelegate"></a>
# **listSmartNodeDelegate**
> List&lt;SmartNodeDelegate&gt; listSmartNodeDelegate()

retrieve smart-node-delegate list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartNodeDelegateApi;


SmartNodeDelegateApi apiInstance = new SmartNodeDelegateApi();
try {
    List<SmartNodeDelegate> result = apiInstance.listSmartNodeDelegate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartNodeDelegateApi#listSmartNodeDelegate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SmartNodeDelegate&gt;**](SmartNodeDelegate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSmartNodeDelegate"></a>
# **removeSmartNodeDelegate**
> removeSmartNodeDelegate(snd)

remove smart-node-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartNodeDelegateApi;


SmartNodeDelegateApi apiInstance = new SmartNodeDelegateApi();
String snd = "snd_example"; // String | name of the smart-node-delegate
try {
    apiInstance.removeSmartNodeDelegate(snd);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartNodeDelegateApi#removeSmartNodeDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snd** | **String**| name of the smart-node-delegate |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

