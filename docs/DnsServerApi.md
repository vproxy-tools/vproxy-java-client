# DnsServerApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDnsServer**](DnsServerApi.md#addDnsServer) | **POST** /dns-server | add dns-server
[**describeDnsServer**](DnsServerApi.md#describeDnsServer) | **GET** /dns-server/{dns}/detail | get detailed info of one dns-server
[**getDnsServer**](DnsServerApi.md#getDnsServer) | **GET** /dns-server/{dns} | get dns-server
[**listDnsServer**](DnsServerApi.md#listDnsServer) | **GET** /dns-server | retrieve dns-server list
[**removeDnsServer**](DnsServerApi.md#removeDnsServer) | **DELETE** /dns-server/{dns} | remove dns-server
[**updateDnsServer**](DnsServerApi.md#updateDnsServer) | **PUT** /dns-server/{dns} | update dns-server


<a name="addDnsServer"></a>
# **addDnsServer**
> addDnsServer(body)

add dns-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.DnsServerApi;


DnsServerApi apiInstance = new DnsServerApi();
DnsServerCreate body = new DnsServerCreate(); // DnsServerCreate | 
try {
    apiInstance.addDnsServer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsServerApi#addDnsServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DnsServerCreate**](DnsServerCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeDnsServer"></a>
# **describeDnsServer**
> DnsServerDetail describeDnsServer(dns)

get detailed info of one dns-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.DnsServerApi;


DnsServerApi apiInstance = new DnsServerApi();
String dns = "dns_example"; // String | name of the dns-server
try {
    DnsServerDetail result = apiInstance.describeDnsServer(dns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsServerApi#describeDnsServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dns** | **String**| name of the dns-server |

### Return type

[**DnsServerDetail**](DnsServerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDnsServer"></a>
# **getDnsServer**
> DnsServer getDnsServer(dns)

get dns-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.DnsServerApi;


DnsServerApi apiInstance = new DnsServerApi();
String dns = "dns_example"; // String | name of the dns-server
try {
    DnsServer result = apiInstance.getDnsServer(dns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsServerApi#getDnsServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dns** | **String**| name of the dns-server |

### Return type

[**DnsServer**](DnsServer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDnsServer"></a>
# **listDnsServer**
> List&lt;DnsServer&gt; listDnsServer()

retrieve dns-server list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.DnsServerApi;


DnsServerApi apiInstance = new DnsServerApi();
try {
    List<DnsServer> result = apiInstance.listDnsServer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsServerApi#listDnsServer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DnsServer&gt;**](DnsServer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDnsServer"></a>
# **removeDnsServer**
> removeDnsServer(dns)

remove dns-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.DnsServerApi;


DnsServerApi apiInstance = new DnsServerApi();
String dns = "dns_example"; // String | name of the dns-server
try {
    apiInstance.removeDnsServer(dns);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsServerApi#removeDnsServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dns** | **String**| name of the dns-server |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDnsServer"></a>
# **updateDnsServer**
> updateDnsServer(dns, body)

update dns-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.DnsServerApi;


DnsServerApi apiInstance = new DnsServerApi();
String dns = "dns_example"; // String | name of the dns-server
DnsServerUpdate body = new DnsServerUpdate(); // DnsServerUpdate | 
try {
    apiInstance.updateDnsServer(dns, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsServerApi#updateDnsServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dns** | **String**| name of the dns-server |
 **body** | [**DnsServerUpdate**](DnsServerUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

