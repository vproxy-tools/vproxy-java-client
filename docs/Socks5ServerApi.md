# Socks5ServerApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSocks5Server**](Socks5ServerApi.md#addSocks5Server) | **POST** /socks5-server | add socks5-server
[**describeSocks5Server**](Socks5ServerApi.md#describeSocks5Server) | **GET** /socks5-server/{socks5}/detail | get detailed info of one socks5-server
[**getSocks5Server**](Socks5ServerApi.md#getSocks5Server) | **GET** /socks5-server/{socks5} | get socks5-server
[**listSocks5Server**](Socks5ServerApi.md#listSocks5Server) | **GET** /socks5-server | retrieve socks5-server list
[**removeSocks5Server**](Socks5ServerApi.md#removeSocks5Server) | **DELETE** /socks5-server/{socks5} | remove socks5-server
[**updateSocks5Server**](Socks5ServerApi.md#updateSocks5Server) | **PUT** /socks5-server/{socks5} | update socks5-server


<a name="addSocks5Server"></a>
# **addSocks5Server**
> addSocks5Server(body)

add socks5-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.Socks5ServerApi;


Socks5ServerApi apiInstance = new Socks5ServerApi();
Socks5ServerCreate body = new Socks5ServerCreate(); // Socks5ServerCreate | 
try {
    apiInstance.addSocks5Server(body);
} catch (ApiException e) {
    System.err.println("Exception when calling Socks5ServerApi#addSocks5Server");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Socks5ServerCreate**](Socks5ServerCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeSocks5Server"></a>
# **describeSocks5Server**
> Socks5ServerDetail describeSocks5Server(socks5)

get detailed info of one socks5-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.Socks5ServerApi;


Socks5ServerApi apiInstance = new Socks5ServerApi();
String socks5 = "socks5_example"; // String | name of the socks5-server
try {
    Socks5ServerDetail result = apiInstance.describeSocks5Server(socks5);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Socks5ServerApi#describeSocks5Server");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socks5** | **String**| name of the socks5-server |

### Return type

[**Socks5ServerDetail**](Socks5ServerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSocks5Server"></a>
# **getSocks5Server**
> Socks5Server getSocks5Server(socks5)

get socks5-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.Socks5ServerApi;


Socks5ServerApi apiInstance = new Socks5ServerApi();
String socks5 = "socks5_example"; // String | name of the socks5-server
try {
    Socks5Server result = apiInstance.getSocks5Server(socks5);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Socks5ServerApi#getSocks5Server");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socks5** | **String**| name of the socks5-server |

### Return type

[**Socks5Server**](Socks5Server.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSocks5Server"></a>
# **listSocks5Server**
> List&lt;Socks5Server&gt; listSocks5Server()

retrieve socks5-server list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.Socks5ServerApi;


Socks5ServerApi apiInstance = new Socks5ServerApi();
try {
    List<Socks5Server> result = apiInstance.listSocks5Server();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Socks5ServerApi#listSocks5Server");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Socks5Server&gt;**](Socks5Server.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSocks5Server"></a>
# **removeSocks5Server**
> removeSocks5Server(socks5)

remove socks5-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.Socks5ServerApi;


Socks5ServerApi apiInstance = new Socks5ServerApi();
String socks5 = "socks5_example"; // String | name of the socks5-server
try {
    apiInstance.removeSocks5Server(socks5);
} catch (ApiException e) {
    System.err.println("Exception when calling Socks5ServerApi#removeSocks5Server");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socks5** | **String**| name of the socks5-server |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateSocks5Server"></a>
# **updateSocks5Server**
> updateSocks5Server(socks5, body)

update socks5-server

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.Socks5ServerApi;


Socks5ServerApi apiInstance = new Socks5ServerApi();
String socks5 = "socks5_example"; // String | name of the socks5-server
Socks5ServerUpdate body = new Socks5ServerUpdate(); // Socks5ServerUpdate | 
try {
    apiInstance.updateSocks5Server(socks5, body);
} catch (ApiException e) {
    System.err.println("Exception when calling Socks5ServerApi#updateSocks5Server");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socks5** | **String**| name of the socks5-server |
 **body** | [**Socks5ServerUpdate**](Socks5ServerUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

