/*
 * vproxy
 * The vproxy http controller api.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package vproxy.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DnsServer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-24T17:24:37.463+08:00")
public class DnsServer {
  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("rrsets")
  private String rrsets = null;

  @SerializedName("ttl")
  private Integer ttl = null;

  @SerializedName("eventLoopGroup")
  private String eventLoopGroup = null;

  @SerializedName("securityGroup")
  private String securityGroup = null;

  public DnsServer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DnsServer address(String address) {
    this.address = address;
    return this;
  }

   /**
   * binding l4addr
   * @return address
  **/
  @ApiModelProperty(value = "binding l4addr")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DnsServer rrsets(String rrsets) {
    this.rrsets = rrsets;
    return this;
  }

   /**
   * answer records
   * @return rrsets
  **/
  @ApiModelProperty(value = "answer records")
  public String getRrsets() {
    return rrsets;
  }

  public void setRrsets(String rrsets) {
    this.rrsets = rrsets;
  }

  public DnsServer ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * ttl of answer records
   * @return ttl
  **/
  @ApiModelProperty(value = "ttl of answer records")
  public Integer getTtl() {
    return ttl;
  }

  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  public DnsServer eventLoopGroup(String eventLoopGroup) {
    this.eventLoopGroup = eventLoopGroup;
    return this;
  }

   /**
   * reference to the running event loop group
   * @return eventLoopGroup
  **/
  @ApiModelProperty(value = "reference to the running event loop group")
  public String getEventLoopGroup() {
    return eventLoopGroup;
  }

  public void setEventLoopGroup(String eventLoopGroup) {
    this.eventLoopGroup = eventLoopGroup;
  }

  public DnsServer securityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * security group for the dns server to use
   * @return securityGroup
  **/
  @ApiModelProperty(value = "security group for the dns server to use")
  public String getSecurityGroup() {
    return securityGroup;
  }

  public void setSecurityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServer dnsServer = (DnsServer) o;
    return Objects.equals(this.name, dnsServer.name) &&
        Objects.equals(this.address, dnsServer.address) &&
        Objects.equals(this.rrsets, dnsServer.rrsets) &&
        Objects.equals(this.ttl, dnsServer.ttl) &&
        Objects.equals(this.eventLoopGroup, dnsServer.eventLoopGroup) &&
        Objects.equals(this.securityGroup, dnsServer.securityGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, rrsets, ttl, eventLoopGroup, securityGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    rrsets: ").append(toIndentedString(rrsets)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    eventLoopGroup: ").append(toIndentedString(eventLoopGroup)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

