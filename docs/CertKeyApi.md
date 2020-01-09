# CertKeyApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCertKey**](CertKeyApi.md#addCertKey) | **POST** /cert-key | add cert-key
[**describeCertKey**](CertKeyApi.md#describeCertKey) | **GET** /cert-key/{ck}/detail | get detailed info of one cert-key
[**getCertKey**](CertKeyApi.md#getCertKey) | **GET** /cert-key/{ck} | get cert-key
[**listCertKey**](CertKeyApi.md#listCertKey) | **GET** /cert-key | retrieve cert-key list
[**removeCertKey**](CertKeyApi.md#removeCertKey) | **DELETE** /cert-key/{ck} | remove cert-key


<a name="addCertKey"></a>
# **addCertKey**
> addCertKey(body)

add cert-key

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.CertKeyApi;


CertKeyApi apiInstance = new CertKeyApi();
CertKeyCreate body = new CertKeyCreate(); // CertKeyCreate | 
try {
    apiInstance.addCertKey(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CertKeyApi#addCertKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CertKeyCreate**](CertKeyCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeCertKey"></a>
# **describeCertKey**
> CertKeyDetail describeCertKey(ck)

get detailed info of one cert-key

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.CertKeyApi;


CertKeyApi apiInstance = new CertKeyApi();
String ck = "ck_example"; // String | name of the cert-key
try {
    CertKeyDetail result = apiInstance.describeCertKey(ck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertKeyApi#describeCertKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ck** | **String**| name of the cert-key |

### Return type

[**CertKeyDetail**](CertKeyDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCertKey"></a>
# **getCertKey**
> CertKey getCertKey(ck)

get cert-key

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.CertKeyApi;


CertKeyApi apiInstance = new CertKeyApi();
String ck = "ck_example"; // String | name of the cert-key
try {
    CertKey result = apiInstance.getCertKey(ck);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertKeyApi#getCertKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ck** | **String**| name of the cert-key |

### Return type

[**CertKey**](CertKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCertKey"></a>
# **listCertKey**
> List&lt;CertKey&gt; listCertKey()

retrieve cert-key list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.CertKeyApi;


CertKeyApi apiInstance = new CertKeyApi();
try {
    List<CertKey> result = apiInstance.listCertKey();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertKeyApi#listCertKey");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CertKey&gt;**](CertKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCertKey"></a>
# **removeCertKey**
> removeCertKey(ck)

remove cert-key

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.CertKeyApi;


CertKeyApi apiInstance = new CertKeyApi();
String ck = "ck_example"; // String | name of the cert-key
try {
    apiInstance.removeCertKey(ck);
} catch (ApiException e) {
    System.err.println("Exception when calling CertKeyApi#removeCertKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ck** | **String**| name of the cert-key |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

