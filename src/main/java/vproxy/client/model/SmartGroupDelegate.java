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
 * SmartGroupDelegate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-10T22:59:44.913+08:00")
public class SmartGroupDelegate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("handledGroup")
  private String handledGroup = null;

  public SmartGroupDelegate name(String name) {
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

  public SmartGroupDelegate service(String service) {
    this.service = service;
    return this;
  }

   /**
   * name of the watched service
   * @return service
  **/
  @ApiModelProperty(value = "name of the watched service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SmartGroupDelegate zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * name of the watched zone
   * @return zone
  **/
  @ApiModelProperty(value = "name of the watched zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public SmartGroupDelegate handledGroup(String handledGroup) {
    this.handledGroup = handledGroup;
    return this;
  }

   /**
   * name of the delegated group
   * @return handledGroup
  **/
  @ApiModelProperty(value = "name of the delegated group")
  public String getHandledGroup() {
    return handledGroup;
  }

  public void setHandledGroup(String handledGroup) {
    this.handledGroup = handledGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartGroupDelegate smartGroupDelegate = (SmartGroupDelegate) o;
    return Objects.equals(this.name, smartGroupDelegate.name) &&
        Objects.equals(this.service, smartGroupDelegate.service) &&
        Objects.equals(this.zone, smartGroupDelegate.zone) &&
        Objects.equals(this.handledGroup, smartGroupDelegate.handledGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, service, zone, handledGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartGroupDelegate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    handledGroup: ").append(toIndentedString(handledGroup)).append("\n");
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

