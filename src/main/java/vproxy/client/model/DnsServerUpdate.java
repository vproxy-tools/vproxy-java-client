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
 * DnsServerUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-24T17:24:37.463+08:00")
public class DnsServerUpdate {
  @SerializedName("ttl")
  private Integer ttl = null;

  @SerializedName("securityGroup")
  private String securityGroup = null;

  public DnsServerUpdate ttl(Integer ttl) {
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

  public DnsServerUpdate securityGroup(String securityGroup) {
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
    DnsServerUpdate dnsServerUpdate = (DnsServerUpdate) o;
    return Objects.equals(this.ttl, dnsServerUpdate.ttl) &&
        Objects.equals(this.securityGroup, dnsServerUpdate.securityGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttl, securityGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServerUpdate {\n");
    
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

