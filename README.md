# swagger-java-client

vproxy
- API version: 1.0.0
  - Build date: 2020-01-09T11:11:04.239+08:00

The vproxy http controller api.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import vproxy.client.*;
import vproxy.client.auth.*;
import vproxy.client.model.*;
import vproxy.client.model.CertKeyApi;

import java.io.File;
import java.util.*;

public class CertKeyApiExample {

    public static void main(String[] args) {
        
        CertKeyApi apiInstance = new CertKeyApi();
        CertKeyCreate body = new CertKeyCreate(); // CertKeyCreate | 
        try {
            apiInstance.addCertKey(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CertKeyApi#addCertKey");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1/module*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CertKeyApi* | [**addCertKey**](docs/CertKeyApi.md#addCertKey) | **POST** /cert-key | add cert-key
*CertKeyApi* | [**describeCertKey**](docs/CertKeyApi.md#describeCertKey) | **GET** /cert-key/{ck}/detail | get detailed info of one cert-key
*CertKeyApi* | [**getCertKey**](docs/CertKeyApi.md#getCertKey) | **GET** /cert-key/{ck} | get cert-key
*CertKeyApi* | [**listCertKey**](docs/CertKeyApi.md#listCertKey) | **GET** /cert-key | retrieve cert-key list
*CertKeyApi* | [**removeCertKey**](docs/CertKeyApi.md#removeCertKey) | **DELETE** /cert-key/{ck} | remove cert-key
*DnsServerApi* | [**addDnsServer**](docs/DnsServerApi.md#addDnsServer) | **POST** /dns-server | add dns-server
*DnsServerApi* | [**describeDnsServer**](docs/DnsServerApi.md#describeDnsServer) | **GET** /dns-server/{dns}/detail | get detailed info of one dns-server
*DnsServerApi* | [**getDnsServer**](docs/DnsServerApi.md#getDnsServer) | **GET** /dns-server/{dns} | get dns-server
*DnsServerApi* | [**listDnsServer**](docs/DnsServerApi.md#listDnsServer) | **GET** /dns-server | retrieve dns-server list
*DnsServerApi* | [**removeDnsServer**](docs/DnsServerApi.md#removeDnsServer) | **DELETE** /dns-server/{dns} | remove dns-server
*DnsServerApi* | [**updateDnsServer**](docs/DnsServerApi.md#updateDnsServer) | **PUT** /dns-server/{dns} | update dns-server
*EventLoopApi* | [**addEventLoop**](docs/EventLoopApi.md#addEventLoop) | **POST** /event-loop-group/{elg}/event-loop | add event-loop into event-loop-group
*EventLoopApi* | [**describeEventLoop**](docs/EventLoopApi.md#describeEventLoop) | **GET** /event-loop-group/{elg}/event-loop/{el}/detail | get detailed info of one event-loop in event-loop-group
*EventLoopApi* | [**getEventLoop**](docs/EventLoopApi.md#getEventLoop) | **GET** /event-loop-group/{elg}/event-loop/{el} | get event-loop in event-loop-group
*EventLoopApi* | [**listEventLoop**](docs/EventLoopApi.md#listEventLoop) | **GET** /event-loop-group/{elg}/event-loop | retrieve event-loop list from event-loop-group
*EventLoopApi* | [**removeEventLoop**](docs/EventLoopApi.md#removeEventLoop) | **DELETE** /event-loop-group/{elg}/event-loop/{el} | remove event-loop from event-loop-group
*EventLoopGroupApi* | [**addEventLoopGroup**](docs/EventLoopGroupApi.md#addEventLoopGroup) | **POST** /event-loop-group | add event-loop-group
*EventLoopGroupApi* | [**describeEventLoopGroup**](docs/EventLoopGroupApi.md#describeEventLoopGroup) | **GET** /event-loop-group/{elg}/detail | get detailed info of one event-loop-group
*EventLoopGroupApi* | [**getEventLoopGroup**](docs/EventLoopGroupApi.md#getEventLoopGroup) | **GET** /event-loop-group/{elg} | get event-loop-group
*EventLoopGroupApi* | [**listEventLoopGroup**](docs/EventLoopGroupApi.md#listEventLoopGroup) | **GET** /event-loop-group | retrieve event-loop-group list
*EventLoopGroupApi* | [**removeEventLoopGroup**](docs/EventLoopGroupApi.md#removeEventLoopGroup) | **DELETE** /event-loop-group/{elg} | remove event-loop-group
*SecurityGroupApi* | [**addSecurityGroup**](docs/SecurityGroupApi.md#addSecurityGroup) | **POST** /security-group | add security-group
*SecurityGroupApi* | [**describeSecurityGroup**](docs/SecurityGroupApi.md#describeSecurityGroup) | **GET** /security-group/{secg}/detail | get detailed info of one security-group
*SecurityGroupApi* | [**getSecurityGroup**](docs/SecurityGroupApi.md#getSecurityGroup) | **GET** /security-group/{secg} | get security-group
*SecurityGroupApi* | [**listSecurityGroup**](docs/SecurityGroupApi.md#listSecurityGroup) | **GET** /security-group | retrieve security-group list
*SecurityGroupApi* | [**removeSecurityGroup**](docs/SecurityGroupApi.md#removeSecurityGroup) | **DELETE** /security-group/{secg} | remove security-group
*SecurityGroupApi* | [**updateSecurityGroup**](docs/SecurityGroupApi.md#updateSecurityGroup) | **PUT** /security-group/{secg} | update security-group
*SecurityGroupRuleApi* | [**addSecurityGroupRule**](docs/SecurityGroupRuleApi.md#addSecurityGroupRule) | **POST** /security-group/{secg}/security-group-rule | add security-group-rule into security-group
*SecurityGroupRuleApi* | [**describeSecurityGroupRule**](docs/SecurityGroupRuleApi.md#describeSecurityGroupRule) | **GET** /security-group/{secg}/security-group-rule/{secgr}/detail | get detailed info of one security-group-rule in security-group
*SecurityGroupRuleApi* | [**getSecurityGroupRule**](docs/SecurityGroupRuleApi.md#getSecurityGroupRule) | **GET** /security-group/{secg}/security-group-rule/{secgr} | get security-group-rule in security-group
*SecurityGroupRuleApi* | [**listSecurityGroupRule**](docs/SecurityGroupRuleApi.md#listSecurityGroupRule) | **GET** /security-group/{secg}/security-group-rule | retrieve security-group-rule list from security-group
*SecurityGroupRuleApi* | [**removeSecurityGroupRule**](docs/SecurityGroupRuleApi.md#removeSecurityGroupRule) | **DELETE** /security-group/{secg}/security-group-rule/{secgr} | remove security-group-rule from security-group
*ServerApi* | [**addServer**](docs/ServerApi.md#addServer) | **POST** /server-group/{sg}/server | add server into server-group
*ServerApi* | [**describeServer**](docs/ServerApi.md#describeServer) | **GET** /server-group/{sg}/server/{svr}/detail | get detailed info of one server in server-group
*ServerApi* | [**getServer**](docs/ServerApi.md#getServer) | **GET** /server-group/{sg}/server/{svr} | get server in server-group
*ServerApi* | [**listServer**](docs/ServerApi.md#listServer) | **GET** /server-group/{sg}/server | retrieve server list from server-group
*ServerApi* | [**removeServer**](docs/ServerApi.md#removeServer) | **DELETE** /server-group/{sg}/server/{svr} | remove server from server-group
*ServerApi* | [**updateServer**](docs/ServerApi.md#updateServer) | **PUT** /server-group/{sg}/server/{svr} | update server in server-group
*ServerGroupApi* | [**addServerGroup**](docs/ServerGroupApi.md#addServerGroup) | **POST** /server-group | add server-group
*ServerGroupApi* | [**addServerGroupInUpstream**](docs/ServerGroupApi.md#addServerGroupInUpstream) | **POST** /upstream/{ups}/server-group | add server-group into upstream
*ServerGroupApi* | [**describeServerGroup**](docs/ServerGroupApi.md#describeServerGroup) | **GET** /server-group/{sg}/detail | get detailed info of one server-group
*ServerGroupApi* | [**describeServerGroupInUpstream**](docs/ServerGroupApi.md#describeServerGroupInUpstream) | **GET** /upstream/{ups}/server-group/{sg}/detail | get detailed info of one server-group in upstream
*ServerGroupApi* | [**getServerGroup**](docs/ServerGroupApi.md#getServerGroup) | **GET** /server-group/{sg} | get server-group
*ServerGroupApi* | [**getServerGroupInUpstream**](docs/ServerGroupApi.md#getServerGroupInUpstream) | **GET** /upstream/{ups}/server-group/{sg} | get server-group in upstream
*ServerGroupApi* | [**listServerGroup**](docs/ServerGroupApi.md#listServerGroup) | **GET** /server-group | retrieve server-group list
*ServerGroupApi* | [**listServerGroupInUpstream**](docs/ServerGroupApi.md#listServerGroupInUpstream) | **GET** /upstream/{ups}/server-group | retrieve server-group list from upstream
*ServerGroupApi* | [**removeServerGroup**](docs/ServerGroupApi.md#removeServerGroup) | **DELETE** /server-group/{sg} | remove server-group
*ServerGroupApi* | [**removeServerGroupInUpstream**](docs/ServerGroupApi.md#removeServerGroupInUpstream) | **DELETE** /upstream/{ups}/server-group/{sg} | remove server-group from upstream
*ServerGroupApi* | [**updateServerGroup**](docs/ServerGroupApi.md#updateServerGroup) | **PUT** /server-group/{sg} | update server-group
*ServerGroupApi* | [**updateServerGroupInUpstream**](docs/ServerGroupApi.md#updateServerGroupInUpstream) | **PUT** /upstream/{ups}/server-group/{sg} | update server-group in upstream
*SmartGroupDelegateApi* | [**addSmartGroupDelegate**](docs/SmartGroupDelegateApi.md#addSmartGroupDelegate) | **POST** /smart-group-delegate | add smart-group-delegate
*SmartGroupDelegateApi* | [**describeSmartGroupDelegate**](docs/SmartGroupDelegateApi.md#describeSmartGroupDelegate) | **GET** /smart-group-delegate/{sgd}/detail | get detailed info of one smart-group-delegate
*SmartGroupDelegateApi* | [**getSmartGroupDelegate**](docs/SmartGroupDelegateApi.md#getSmartGroupDelegate) | **GET** /smart-group-delegate/{sgd} | get smart-group-delegate
*SmartGroupDelegateApi* | [**listSmartGroupDelegate**](docs/SmartGroupDelegateApi.md#listSmartGroupDelegate) | **GET** /smart-group-delegate | retrieve smart-group-delegate list
*SmartGroupDelegateApi* | [**removeSmartGroupDelegate**](docs/SmartGroupDelegateApi.md#removeSmartGroupDelegate) | **DELETE** /smart-group-delegate/{sgd} | remove smart-group-delegate
*SmartNodeDelegateApi* | [**addSmartNodeDelegate**](docs/SmartNodeDelegateApi.md#addSmartNodeDelegate) | **POST** /smart-node-delegate | add smart-node-delegate
*SmartNodeDelegateApi* | [**describeSmartNodeDelegate**](docs/SmartNodeDelegateApi.md#describeSmartNodeDelegate) | **GET** /smart-node-delegate/{snd}/detail | get detailed info of one smart-node-delegate
*SmartNodeDelegateApi* | [**getSmartNodeDelegate**](docs/SmartNodeDelegateApi.md#getSmartNodeDelegate) | **GET** /smart-node-delegate/{snd} | get smart-node-delegate
*SmartNodeDelegateApi* | [**listSmartNodeDelegate**](docs/SmartNodeDelegateApi.md#listSmartNodeDelegate) | **GET** /smart-node-delegate | retrieve smart-node-delegate list
*SmartNodeDelegateApi* | [**removeSmartNodeDelegate**](docs/SmartNodeDelegateApi.md#removeSmartNodeDelegate) | **DELETE** /smart-node-delegate/{snd} | remove smart-node-delegate
*Socks5ServerApi* | [**addSocks5Server**](docs/Socks5ServerApi.md#addSocks5Server) | **POST** /socks5-server | add socks5-server
*Socks5ServerApi* | [**describeSocks5Server**](docs/Socks5ServerApi.md#describeSocks5Server) | **GET** /socks5-server/{socks5}/detail | get detailed info of one socks5-server
*Socks5ServerApi* | [**getSocks5Server**](docs/Socks5ServerApi.md#getSocks5Server) | **GET** /socks5-server/{socks5} | get socks5-server
*Socks5ServerApi* | [**listSocks5Server**](docs/Socks5ServerApi.md#listSocks5Server) | **GET** /socks5-server | retrieve socks5-server list
*Socks5ServerApi* | [**removeSocks5Server**](docs/Socks5ServerApi.md#removeSocks5Server) | **DELETE** /socks5-server/{socks5} | remove socks5-server
*Socks5ServerApi* | [**updateSocks5Server**](docs/Socks5ServerApi.md#updateSocks5Server) | **PUT** /socks5-server/{socks5} | update socks5-server
*TcpLbApi* | [**addTcpLb**](docs/TcpLbApi.md#addTcpLb) | **POST** /tcp-lb | add tcp-lb
*TcpLbApi* | [**describeTcpLb**](docs/TcpLbApi.md#describeTcpLb) | **GET** /tcp-lb/{tl}/detail | get detailed info of one tcp-lb
*TcpLbApi* | [**getTcpLb**](docs/TcpLbApi.md#getTcpLb) | **GET** /tcp-lb/{tl} | get tcp-lb
*TcpLbApi* | [**listTcpLb**](docs/TcpLbApi.md#listTcpLb) | **GET** /tcp-lb | retrieve tcp-lb list
*TcpLbApi* | [**removeTcpLb**](docs/TcpLbApi.md#removeTcpLb) | **DELETE** /tcp-lb/{tl} | remove tcp-lb
*TcpLbApi* | [**updateTcpLb**](docs/TcpLbApi.md#updateTcpLb) | **PUT** /tcp-lb/{tl} | update tcp-lb
*UpstreamApi* | [**addUpstream**](docs/UpstreamApi.md#addUpstream) | **POST** /upstream | add upstream
*UpstreamApi* | [**describeUpstream**](docs/UpstreamApi.md#describeUpstream) | **GET** /upstream/{ups}/detail | get detailed info of one upstream
*UpstreamApi* | [**getUpstream**](docs/UpstreamApi.md#getUpstream) | **GET** /upstream/{ups} | get upstream
*UpstreamApi* | [**listUpstream**](docs/UpstreamApi.md#listUpstream) | **GET** /upstream | retrieve upstream list
*UpstreamApi* | [**removeUpstream**](docs/UpstreamApi.md#removeUpstream) | **DELETE** /upstream/{ups} | remove upstream


## Documentation for Models

 - [CertKey](docs/CertKey.md)
 - [CertKeyCreate](docs/CertKeyCreate.md)
 - [CertKeyDetail](docs/CertKeyDetail.md)
 - [CheckProtocol](docs/CheckProtocol.md)
 - [DnsServer](docs/DnsServer.md)
 - [DnsServerCreate](docs/DnsServerCreate.md)
 - [DnsServerDetail](docs/DnsServerDetail.md)
 - [DnsServerUpdate](docs/DnsServerUpdate.md)
 - [EventLoop](docs/EventLoop.md)
 - [EventLoopCreate](docs/EventLoopCreate.md)
 - [EventLoopDetail](docs/EventLoopDetail.md)
 - [EventLoopGroup](docs/EventLoopGroup.md)
 - [EventLoopGroupCreate](docs/EventLoopGroupCreate.md)
 - [EventLoopGroupDetail](docs/EventLoopGroupDetail.md)
 - [IPType](docs/IPType.md)
 - [Protocol](docs/Protocol.md)
 - [Rule](docs/Rule.md)
 - [SecurityGroup](docs/SecurityGroup.md)
 - [SecurityGroupCreate](docs/SecurityGroupCreate.md)
 - [SecurityGroupDetail](docs/SecurityGroupDetail.md)
 - [SecurityGroupProtocol](docs/SecurityGroupProtocol.md)
 - [SecurityGroupRule](docs/SecurityGroupRule.md)
 - [SecurityGroupRuleCreate](docs/SecurityGroupRuleCreate.md)
 - [SecurityGroupRuleDetail](docs/SecurityGroupRuleDetail.md)
 - [SecurityGroupUpdate](docs/SecurityGroupUpdate.md)
 - [Server](docs/Server.md)
 - [ServerCreate](docs/ServerCreate.md)
 - [ServerDetail](docs/ServerDetail.md)
 - [ServerGroup](docs/ServerGroup.md)
 - [ServerGroupCreate](docs/ServerGroupCreate.md)
 - [ServerGroupDetail](docs/ServerGroupDetail.md)
 - [ServerGroupInUpstream](docs/ServerGroupInUpstream.md)
 - [ServerGroupInUpstreamCreate](docs/ServerGroupInUpstreamCreate.md)
 - [ServerGroupInUpstreamDetail](docs/ServerGroupInUpstreamDetail.md)
 - [ServerGroupInUpstreamUpdate](docs/ServerGroupInUpstreamUpdate.md)
 - [ServerGroupMethod](docs/ServerGroupMethod.md)
 - [ServerGroupUpdate](docs/ServerGroupUpdate.md)
 - [ServerUpdate](docs/ServerUpdate.md)
 - [SmartGroupDelegate](docs/SmartGroupDelegate.md)
 - [SmartGroupDelegateCreate](docs/SmartGroupDelegateCreate.md)
 - [SmartGroupDelegateDetail](docs/SmartGroupDelegateDetail.md)
 - [SmartNodeDelegate](docs/SmartNodeDelegate.md)
 - [SmartNodeDelegateCreate](docs/SmartNodeDelegateCreate.md)
 - [SmartNodeDelegateDetail](docs/SmartNodeDelegateDetail.md)
 - [Socks5Server](docs/Socks5Server.md)
 - [Socks5ServerCreate](docs/Socks5ServerCreate.md)
 - [Socks5ServerDetail](docs/Socks5ServerDetail.md)
 - [Socks5ServerUpdate](docs/Socks5ServerUpdate.md)
 - [TcpLb](docs/TcpLb.md)
 - [TcpLbCreate](docs/TcpLbCreate.md)
 - [TcpLbDetail](docs/TcpLbDetail.md)
 - [TcpLbUpdate](docs/TcpLbUpdate.md)
 - [Upstream](docs/Upstream.md)
 - [UpstreamCreate](docs/UpstreamCreate.md)
 - [UpstreamDetail](docs/UpstreamDetail.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



