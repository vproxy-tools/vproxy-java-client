# SecurityGroupApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSecurityGroup**](SecurityGroupApi.md#addSecurityGroup) | **POST** /security-group | add security-group
[**describeSecurityGroup**](SecurityGroupApi.md#describeSecurityGroup) | **GET** /security-group/{secg}/detail | get detailed info of one security-group
[**getSecurityGroup**](SecurityGroupApi.md#getSecurityGroup) | **GET** /security-group/{secg} | get security-group
[**listSecurityGroup**](SecurityGroupApi.md#listSecurityGroup) | **GET** /security-group | retrieve security-group list
[**removeSecurityGroup**](SecurityGroupApi.md#removeSecurityGroup) | **DELETE** /security-group/{secg} | remove security-group
[**updateSecurityGroup**](SecurityGroupApi.md#updateSecurityGroup) | **PUT** /security-group/{secg} | update security-group


<a name="addSecurityGroup"></a>
# **addSecurityGroup**
> addSecurityGroup(body)

add security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
SecurityGroupCreate body = new SecurityGroupCreate(); // SecurityGroupCreate | 
try {
    apiInstance.addSecurityGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#addSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecurityGroupCreate**](SecurityGroupCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeSecurityGroup"></a>
# **describeSecurityGroup**
> SecurityGroupDetail describeSecurityGroup(secg)

get detailed info of one security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
String secg = "secg_example"; // String | name of the security-group
try {
    SecurityGroupDetail result = apiInstance.describeSecurityGroup(secg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#describeSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |

### Return type

[**SecurityGroupDetail**](SecurityGroupDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSecurityGroup"></a>
# **getSecurityGroup**
> SecurityGroup getSecurityGroup(secg)

get security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
String secg = "secg_example"; // String | name of the security-group
try {
    SecurityGroup result = apiInstance.getSecurityGroup(secg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#getSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |

### Return type

[**SecurityGroup**](SecurityGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSecurityGroup"></a>
# **listSecurityGroup**
> List&lt;SecurityGroup&gt; listSecurityGroup()

retrieve security-group list

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
try {
    List<SecurityGroup> result = apiInstance.listSecurityGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#listSecurityGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SecurityGroup&gt;**](SecurityGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSecurityGroup"></a>
# **removeSecurityGroup**
> removeSecurityGroup(secg)

remove security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
String secg = "secg_example"; // String | name of the security-group
try {
    apiInstance.removeSecurityGroup(secg);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#removeSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateSecurityGroup"></a>
# **updateSecurityGroup**
> updateSecurityGroup(secg, body)

update security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
String secg = "secg_example"; // String | name of the security-group
SecurityGroupUpdate body = new SecurityGroupUpdate(); // SecurityGroupUpdate | 
try {
    apiInstance.updateSecurityGroup(secg, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#updateSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |
 **body** | [**SecurityGroupUpdate**](SecurityGroupUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

