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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vproxy.client.model.CheckProtocol;
import vproxy.client.model.ServerGroupMethod;

/**
 * ServerGroupUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-23T11:14:02.626+08:00")
public class ServerGroupUpdate {
  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("period")
  private Integer period = null;

  @SerializedName("up")
  private Integer up = null;

  @SerializedName("down")
  private Integer down = null;

  @SerializedName("protocol")
  private CheckProtocol protocol = null;

  @SerializedName("method")
  private ServerGroupMethod method = null;

  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  public ServerGroupUpdate timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * health check timeout (ms) (timeout before getting expected response)
   * @return timeout
  **/
  @ApiModelProperty(value = "health check timeout (ms) (timeout before getting expected response)")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public ServerGroupUpdate period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * health check period (ms) (interval between two hc)
   * @return period
  **/
  @ApiModelProperty(value = "health check period (ms) (interval between two hc)")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ServerGroupUpdate up(Integer up) {
    this.up = up;
    return this;
  }

   /**
   * consider the server healthy after $up times of successful health checks
   * @return up
  **/
  @ApiModelProperty(value = "consider the server healthy after $up times of successful health checks")
  public Integer getUp() {
    return up;
  }

  public void setUp(Integer up) {
    this.up = up;
  }

  public ServerGroupUpdate down(Integer down) {
    this.down = down;
    return this;
  }

   /**
   * consider the server unhealthy after $down times of failed health checks
   * @return down
  **/
  @ApiModelProperty(value = "consider the server unhealthy after $down times of failed health checks")
  public Integer getDown() {
    return down;
  }

  public void setDown(Integer down) {
    this.down = down;
  }

  public ServerGroupUpdate protocol(CheckProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public CheckProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(CheckProtocol protocol) {
    this.protocol = protocol;
  }

  public ServerGroupUpdate method(ServerGroupMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public ServerGroupMethod getMethod() {
    return method;
  }

  public void setMethod(ServerGroupMethod method) {
    this.method = method;
  }

  public ServerGroupUpdate annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ServerGroupUpdate putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerGroupUpdate serverGroupUpdate = (ServerGroupUpdate) o;
    return Objects.equals(this.timeout, serverGroupUpdate.timeout) &&
        Objects.equals(this.period, serverGroupUpdate.period) &&
        Objects.equals(this.up, serverGroupUpdate.up) &&
        Objects.equals(this.down, serverGroupUpdate.down) &&
        Objects.equals(this.protocol, serverGroupUpdate.protocol) &&
        Objects.equals(this.method, serverGroupUpdate.method) &&
        Objects.equals(this.annotations, serverGroupUpdate.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout, period, up, down, protocol, method, annotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupUpdate {\n");
    
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

