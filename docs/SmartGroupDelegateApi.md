# SmartGroupDelegateApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSmartGroupDelegate**](SmartGroupDelegateApi.md#addSmartGroupDelegate) | **POST** /smart-group-delegate | add smart-group-delegate
[**describeSmartGroupDelegate**](SmartGroupDelegateApi.md#describeSmartGroupDelegate) | **GET** /smart-group-delegate/{sgd}/detail | get detailed info of one smart-group-delegate
[**getSmartGroupDelegate**](SmartGroupDelegateApi.md#getSmartGroupDelegate) | **GET** /smart-group-delegate/{sgd} | get smart-group-delegate
[**listSmartGroupDelegate**](SmartGroupDelegateApi.md#listSmartGroupDelegate) | **GET** /smart-group-delegate | retrieve smart-group-delegate list
[**removeSmartGroupDelegate**](SmartGroupDelegateApi.md#removeSmartGroupDelegate) | **DELETE** /smart-group-delegate/{sgd} | remove smart-group-delegate


<a name="addSmartGroupDelegate"></a>
# **addSmartGroupDelegate**
> addSmartGroupDelegate(body)

add smart-group-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartGroupDelegateApi;


SmartGroupDelegateApi apiInstance = new SmartGroupDelegateApi();
SmartGroupDelegateCreate body = new SmartGroupDelegateCreate(); // SmartGroupDelegateCreate | 
try {
    apiInstance.addSmartGroupDelegate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartGroupDelegateApi#addSmartGroupDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartGroupDelegateCreate**](SmartGroupDelegateCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeSmartGroupDelegate"></a>
# **describeSmartGroupDelegate**
> SmartGroupDelegateDetail describeSmartGroupDelegate(sgd)

get detailed info of one smart-group-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartGroupDelegateApi;


SmartGroupDelegateApi apiInstance = new SmartGroupDelegateApi();
String sgd = "sgd_example"; // String | name of the smart-group-delegate
try {
    SmartGroupDelegateDetail result = apiInstance.describeSmartGroupDelegate(sgd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartGroupDelegateApi#describeSmartGroupDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sgd** | **String**| name of the smart-group-delegate |

### Return type

[**SmartGroupDelegateDetail**](SmartGroupDelegateDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSmartGroupDelegate"></a>
# **getSmartGroupDelegate**
> SmartGroupDelegate getSmartGroupDelegate(sgd)

get smart-group-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartGroupDelegateApi;


SmartGroupDelegateApi apiInstance = new SmartGroupDelegateApi();
String sgd = "sgd_example"; // String | name of the smart-group-delegate
try {
    SmartGroupDelegate result = apiInstance.getSmartGroupDelegate(sgd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartGroupDelegateApi#getSmartGroupDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sgd** | **String**| name of the smart-group-delegate |

### Return type

[**SmartGroupDelegate**](SmartGroupDelegate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSmartGroupDelegate"></a>
# **listSmartGroupDelegate**
> List&lt;SmartGroupDelegate&gt; listSmartGroupDelegate()

retrieve smart-group-delegate list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartGroupDelegateApi;


SmartGroupDelegateApi apiInstance = new SmartGroupDelegateApi();
try {
    List<SmartGroupDelegate> result = apiInstance.listSmartGroupDelegate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartGroupDelegateApi#listSmartGroupDelegate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SmartGroupDelegate&gt;**](SmartGroupDelegate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSmartGroupDelegate"></a>
# **removeSmartGroupDelegate**
> removeSmartGroupDelegate(sgd)

remove smart-group-delegate

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SmartGroupDelegateApi;


SmartGroupDelegateApi apiInstance = new SmartGroupDelegateApi();
String sgd = "sgd_example"; // String | name of the smart-group-delegate
try {
    apiInstance.removeSmartGroupDelegate(sgd);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartGroupDelegateApi#removeSmartGroupDelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sgd** | **String**| name of the smart-group-delegate |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

