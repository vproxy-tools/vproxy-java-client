# SecurityGroupRuleApi

All URIs are relative to *http://127.0.0.1:18776/api/v1/module*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSecurityGroupRule**](SecurityGroupRuleApi.md#addSecurityGroupRule) | **POST** /security-group/{secg}/security-group-rule | add security-group-rule into security-group
[**describeSecurityGroupRule**](SecurityGroupRuleApi.md#describeSecurityGroupRule) | **GET** /security-group/{secg}/security-group-rule/{secgr}/detail | get detailed info of one security-group-rule in security-group
[**getSecurityGroupRule**](SecurityGroupRuleApi.md#getSecurityGroupRule) | **GET** /security-group/{secg}/security-group-rule/{secgr} | get security-group-rule in security-group
[**listSecurityGroupRule**](SecurityGroupRuleApi.md#listSecurityGroupRule) | **GET** /security-group/{secg}/security-group-rule | retrieve security-group-rule list from security-group
[**removeSecurityGroupRule**](SecurityGroupRuleApi.md#removeSecurityGroupRule) | **DELETE** /security-group/{secg}/security-group-rule/{secgr} | remove security-group-rule from security-group


<a name="addSecurityGroupRule"></a>
# **addSecurityGroupRule**
> addSecurityGroupRule(secg, body)

add security-group-rule into security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupRuleApi;


SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi();
String secg = "secg_example"; // String | name of the security-group
SecurityGroupRuleCreate body = new SecurityGroupRuleCreate(); // SecurityGroupRuleCreate | 
try {
    apiInstance.addSecurityGroupRule(secg, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupRuleApi#addSecurityGroupRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |
 **body** | [**SecurityGroupRuleCreate**](SecurityGroupRuleCreate.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeSecurityGroupRule"></a>
# **describeSecurityGroupRule**
> SecurityGroupRuleDetail describeSecurityGroupRule(secg, secgr)

get detailed info of one security-group-rule in security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupRuleApi;


SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi();
String secg = "secg_example"; // String | name of the security-group
String secgr = "secgr_example"; // String | name of the security-group-rule
try {
    SecurityGroupRuleDetail result = apiInstance.describeSecurityGroupRule(secg, secgr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupRuleApi#describeSecurityGroupRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |
 **secgr** | **String**| name of the security-group-rule |

### Return type

[**SecurityGroupRuleDetail**](SecurityGroupRuleDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSecurityGroupRule"></a>
# **getSecurityGroupRule**
> SecurityGroupRule getSecurityGroupRule(secg, secgr)

get security-group-rule in security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupRuleApi;


SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi();
String secg = "secg_example"; // String | name of the security-group
String secgr = "secgr_example"; // String | name of the security-group-rule
try {
    SecurityGroupRule result = apiInstance.getSecurityGroupRule(secg, secgr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupRuleApi#getSecurityGroupRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |
 **secgr** | **String**| name of the security-group-rule |

### Return type

[**SecurityGroupRule**](SecurityGroupRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSecurityGroupRule"></a>
# **listSecurityGroupRule**
> List&lt;SecurityGroupRule&gt; listSecurityGroupRule(secg)

retrieve security-group-rule list from security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupRuleApi;


SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi();
String secg = "secg_example"; // String | name of the security-group
try {
    List<SecurityGroupRule> result = apiInstance.listSecurityGroupRule(secg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupRuleApi#listSecurityGroupRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |

### Return type

[**List&lt;SecurityGroupRule&gt;**](SecurityGroupRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSecurityGroupRule"></a>
# **removeSecurityGroupRule**
> removeSecurityGroupRule(secg, secgr)

remove security-group-rule from security-group

### Example
```java
// Import classes:
//import vproxy.client.ApiException;
//import vproxy.client.model.SecurityGroupRuleApi;


SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi();
String secg = "secg_example"; // String | name of the security-group
String secgr = "secgr_example"; // String | name of the security-group-rule
try {
    apiInstance.removeSecurityGroupRule(secg, secgr);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupRuleApi#removeSecurityGroupRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secg** | **String**| name of the security-group |
 **secgr** | **String**| name of the security-group-rule |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

