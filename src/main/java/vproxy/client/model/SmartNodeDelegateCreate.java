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
import vproxy.client.model.IPType;

/**
 * SmartNodeDelegateCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-10T22:59:44.913+08:00")
public class SmartNodeDelegateCreate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("nic")
  private String nic = null;

  @SerializedName("ipType")
  private IPType ipType = null;

  @SerializedName("exposedPort")
  private Integer exposedPort = null;

  @SerializedName("weight")
  private Integer weight = null;

  public SmartNodeDelegateCreate name(String name) {
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

  public SmartNodeDelegateCreate service(String service) {
    this.service = service;
    return this;
  }

   /**
   * name of the service to register application node into
   * @return service
  **/
  @ApiModelProperty(required = true, value = "name of the service to register application node into")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SmartNodeDelegateCreate zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * name of the working zone
   * @return zone
  **/
  @ApiModelProperty(required = true, value = "name of the working zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public SmartNodeDelegateCreate nic(String nic) {
    this.nic = nic;
    return this;
  }

   /**
   * name of the nic which the application binds on
   * @return nic
  **/
  @ApiModelProperty(required = true, value = "name of the nic which the application binds on")
  public String getNic() {
    return nic;
  }

  public void setNic(String nic) {
    this.nic = nic;
  }

  public SmartNodeDelegateCreate ipType(IPType ipType) {
    this.ipType = ipType;
    return this;
  }

   /**
   * Get ipType
   * @return ipType
  **/
  @ApiModelProperty(value = "")
  public IPType getIpType() {
    return ipType;
  }

  public void setIpType(IPType ipType) {
    this.ipType = ipType;
  }

  public SmartNodeDelegateCreate exposedPort(Integer exposedPort) {
    this.exposedPort = exposedPort;
    return this;
  }

   /**
   * port of the application
   * @return exposedPort
  **/
  @ApiModelProperty(value = "port of the application")
  public Integer getExposedPort() {
    return exposedPort;
  }

  public void setExposedPort(Integer exposedPort) {
    this.exposedPort = exposedPort;
  }

  public SmartNodeDelegateCreate weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * weight of the application node in the service
   * @return weight
  **/
  @ApiModelProperty(value = "weight of the application node in the service")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartNodeDelegateCreate smartNodeDelegateCreate = (SmartNodeDelegateCreate) o;
    return Objects.equals(this.name, smartNodeDelegateCreate.name) &&
        Objects.equals(this.service, smartNodeDelegateCreate.service) &&
        Objects.equals(this.zone, smartNodeDelegateCreate.zone) &&
        Objects.equals(this.nic, smartNodeDelegateCreate.nic) &&
        Objects.equals(this.ipType, smartNodeDelegateCreate.ipType) &&
        Objects.equals(this.exposedPort, smartNodeDelegateCreate.exposedPort) &&
        Objects.equals(this.weight, smartNodeDelegateCreate.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, service, zone, nic, ipType, exposedPort, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartNodeDelegateCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
    sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
    sb.append("    exposedPort: ").append(toIndentedString(exposedPort)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

