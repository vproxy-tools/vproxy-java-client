# TcpLbApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTcpLb**](TcpLbApi.md#addTcpLb) | **POST** /tcp-lb | add tcp-lb
[**describeTcpLb**](TcpLbApi.md#describeTcpLb) | **GET** /tcp-lb/{tl}/detail | get detailed info of one tcp-lb
[**getTcpLb**](TcpLbApi.md#getTcpLb) | **GET** /tcp-lb/{tl} | get tcp-lb
[**listTcpLb**](TcpLbApi.md#listTcpLb) | **GET** /tcp-lb | retrieve tcp-lb list
[**removeTcpLb**](TcpLbApi.md#removeTcpLb) | **DELETE** /tcp-lb/{tl} | remove tcp-lb
[**updateTcpLb**](TcpLbApi.md#updateTcpLb) | **PUT** /tcp-lb/{tl} | update tcp-lb


<a name="addTcpLb"></a>
# **addTcpLb**
> addTcpLb(body)

add tcp-lb

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.TcpLbApi;


TcpLbApi apiInstance = new TcpLbApi();
TcpLbCreate body = new TcpLbCreate(); // TcpLbCreate | 
try {
    apiInstance.addTcpLb(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TcpLbApi#addTcpLb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TcpLbCreate**](TcpLbCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeTcpLb"></a>
# **describeTcpLb**
> TcpLbDetail describeTcpLb(tl)

get detailed info of one tcp-lb

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.TcpLbApi;


TcpLbApi apiInstance = new TcpLbApi();
String tl = "tl_example"; // String | name of the tcp-lb
try {
    TcpLbDetail result = apiInstance.describeTcpLb(tl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TcpLbApi#describeTcpLb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tl** | **String**| name of the tcp-lb |

### Return type

[**TcpLbDetail**](TcpLbDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTcpLb"></a>
# **getTcpLb**
> TcpLb getTcpLb(tl)

get tcp-lb

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.TcpLbApi;


TcpLbApi apiInstance = new TcpLbApi();
String tl = "tl_example"; // String | name of the tcp-lb
try {
    TcpLb result = apiInstance.getTcpLb(tl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TcpLbApi#getTcpLb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tl** | **String**| name of the tcp-lb |

### Return type

[**TcpLb**](TcpLb.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcpLb"></a>
# **listTcpLb**
> List&lt;TcpLb&gt; listTcpLb()

retrieve tcp-lb list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.TcpLbApi;


TcpLbApi apiInstance = new TcpLbApi();
try {
    List<TcpLb> result = apiInstance.listTcpLb();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TcpLbApi#listTcpLb");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TcpLb&gt;**](TcpLb.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeTcpLb"></a>
# **removeTcpLb**
> removeTcpLb(tl)

remove tcp-lb

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.TcpLbApi;


TcpLbApi apiInstance = new TcpLbApi();
String tl = "tl_example"; // String | name of the tcp-lb
try {
    apiInstance.removeTcpLb(tl);
} catch (ApiException e) {
    System.err.println("Exception when calling TcpLbApi#removeTcpLb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tl** | **String**| name of the tcp-lb |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateTcpLb"></a>
# **updateTcpLb**
> updateTcpLb(tl, body)

update tcp-lb

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.TcpLbApi;


TcpLbApi apiInstance = new TcpLbApi();
String tl = "tl_example"; // String | name of the tcp-lb
TcpLbUpdate body = new TcpLbUpdate(); // TcpLbUpdate | 
try {
    apiInstance.updateTcpLb(tl, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TcpLbApi#updateTcpLb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tl** | **String**| name of the tcp-lb |
 **body** | [**TcpLbUpdate**](TcpLbUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

