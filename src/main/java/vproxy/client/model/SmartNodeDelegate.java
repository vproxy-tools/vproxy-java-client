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
 * SmartNodeDelegate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-11T01:36:17.205+08:00")
public class SmartNodeDelegate {
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

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UP("UP"),
    
    DOWN("DOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public SmartNodeDelegate name(String name) {
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

  public SmartNodeDelegate service(String service) {
    this.service = service;
    return this;
  }

   /**
   * name of the service to register application node into
   * @return service
  **/
  @ApiModelProperty(value = "name of the service to register application node into")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SmartNodeDelegate zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * name of the working zone
   * @return zone
  **/
  @ApiModelProperty(value = "name of the working zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public SmartNodeDelegate nic(String nic) {
    this.nic = nic;
    return this;
  }

   /**
   * name of the nic which the application binds on
   * @return nic
  **/
  @ApiModelProperty(value = "name of the nic which the application binds on")
  public String getNic() {
    return nic;
  }

  public void setNic(String nic) {
    this.nic = nic;
  }

  public SmartNodeDelegate ipType(IPType ipType) {
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

  public SmartNodeDelegate exposedPort(Integer exposedPort) {
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

  public SmartNodeDelegate weight(Integer weight) {
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

  public SmartNodeDelegate status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartNodeDelegate smartNodeDelegate = (SmartNodeDelegate) o;
    return Objects.equals(this.name, smartNodeDelegate.name) &&
        Objects.equals(this.service, smartNodeDelegate.service) &&
        Objects.equals(this.zone, smartNodeDelegate.zone) &&
        Objects.equals(this.nic, smartNodeDelegate.nic) &&
        Objects.equals(this.ipType, smartNodeDelegate.ipType) &&
        Objects.equals(this.exposedPort, smartNodeDelegate.exposedPort) &&
        Objects.equals(this.weight, smartNodeDelegate.weight) &&
        Objects.equals(this.status, smartNodeDelegate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, service, zone, nic, ipType, exposedPort, weight, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartNodeDelegate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
    sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
    sb.append("    exposedPort: ").append(toIndentedString(exposedPort)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

