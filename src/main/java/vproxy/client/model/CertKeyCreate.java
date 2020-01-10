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
import java.util.ArrayList;
import java.util.List;

/**
 * CertKeyCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-10T22:59:44.913+08:00")
public class CertKeyCreate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("certs")
  private List<String> certs = new ArrayList<String>();

  @SerializedName("key")
  private String key = null;

  public CertKeyCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CertKeyCreate certs(List<String> certs) {
    this.certs = certs;
    return this;
  }

  public CertKeyCreate addCertsItem(String certsItem) {
    this.certs.add(certsItem);
    return this;
  }

   /**
   * Get certs
   * @return certs
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getCerts() {
    return certs;
  }

  public void setCerts(List<String> certs) {
    this.certs = certs;
  }

  public CertKeyCreate key(String key) {
    this.key = key;
    return this;
  }

   /**
   * file path of the key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "file path of the key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertKeyCreate certKeyCreate = (CertKeyCreate) o;
    return Objects.equals(this.name, certKeyCreate.name) &&
        Objects.equals(this.certs, certKeyCreate.certs) &&
        Objects.equals(this.key, certKeyCreate.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, certs, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertKeyCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    certs: ").append(toIndentedString(certs)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

