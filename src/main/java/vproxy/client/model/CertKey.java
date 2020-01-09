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
 * CertKey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-10T17:27:20.371+08:00")
public class CertKey {
  @SerializedName("name")
  private String name = null;

  @SerializedName("certs")
  private List<String> certs = null;

  @SerializedName("key")
  private String key = null;

  public CertKey name(String name) {
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

  public CertKey certs(List<String> certs) {
    this.certs = certs;
    return this;
  }

  public CertKey addCertsItem(String certsItem) {
    if (this.certs == null) {
      this.certs = new ArrayList<String>();
    }
    this.certs.add(certsItem);
    return this;
  }

   /**
   * Get certs
   * @return certs
  **/
  @ApiModelProperty(value = "")
  public List<String> getCerts() {
    return certs;
  }

  public void setCerts(List<String> certs) {
    this.certs = certs;
  }

  public CertKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * file path of the key
   * @return key
  **/
  @ApiModelProperty(value = "file path of the key")
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
    CertKey certKey = (CertKey) o;
    return Objects.equals(this.name, certKey.name) &&
        Objects.equals(this.certs, certKey.certs) &&
        Objects.equals(this.key, certKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, certs, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertKey {\n");
    
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
