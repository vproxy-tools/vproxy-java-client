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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vproxy.client.model.CheckProtocol;
import vproxy.client.model.EventLoopGroupDetail;
import vproxy.client.model.ServerDetail;
import vproxy.client.model.ServerGroupMethod;

/**
 * ServerGroupDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-24T17:24:37.463+08:00")
public class ServerGroupDetail {
  @SerializedName("name")
  private String name = null;

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

  @SerializedName("eventLoopGroup")
  private EventLoopGroupDetail eventLoopGroup = null;

  @SerializedName("serverList")
  private List<ServerDetail> serverList = null;

  public ServerGroupDetail name(String name) {
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

  public ServerGroupDetail timeout(Integer timeout) {
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

  public ServerGroupDetail period(Integer period) {
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

  public ServerGroupDetail up(Integer up) {
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

  public ServerGroupDetail down(Integer down) {
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

  public ServerGroupDetail protocol(CheckProtocol protocol) {
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

  public ServerGroupDetail method(ServerGroupMethod method) {
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

  public ServerGroupDetail annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ServerGroupDetail putAnnotationsItem(String key, String annotationsItem) {
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

  public ServerGroupDetail eventLoopGroup(EventLoopGroupDetail eventLoopGroup) {
    this.eventLoopGroup = eventLoopGroup;
    return this;
  }

   /**
   * Get eventLoopGroup
   * @return eventLoopGroup
  **/
  @ApiModelProperty(value = "")
  public EventLoopGroupDetail getEventLoopGroup() {
    return eventLoopGroup;
  }

  public void setEventLoopGroup(EventLoopGroupDetail eventLoopGroup) {
    this.eventLoopGroup = eventLoopGroup;
  }

  public ServerGroupDetail serverList(List<ServerDetail> serverList) {
    this.serverList = serverList;
    return this;
  }

  public ServerGroupDetail addServerListItem(ServerDetail serverListItem) {
    if (this.serverList == null) {
      this.serverList = new ArrayList<ServerDetail>();
    }
    this.serverList.add(serverListItem);
    return this;
  }

   /**
   * Get serverList
   * @return serverList
  **/
  @ApiModelProperty(value = "")
  public List<ServerDetail> getServerList() {
    return serverList;
  }

  public void setServerList(List<ServerDetail> serverList) {
    this.serverList = serverList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerGroupDetail serverGroupDetail = (ServerGroupDetail) o;
    return Objects.equals(this.name, serverGroupDetail.name) &&
        Objects.equals(this.timeout, serverGroupDetail.timeout) &&
        Objects.equals(this.period, serverGroupDetail.period) &&
        Objects.equals(this.up, serverGroupDetail.up) &&
        Objects.equals(this.down, serverGroupDetail.down) &&
        Objects.equals(this.protocol, serverGroupDetail.protocol) &&
        Objects.equals(this.method, serverGroupDetail.method) &&
        Objects.equals(this.annotations, serverGroupDetail.annotations) &&
        Objects.equals(this.eventLoopGroup, serverGroupDetail.eventLoopGroup) &&
        Objects.equals(this.serverList, serverGroupDetail.serverList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timeout, period, up, down, protocol, method, annotations, eventLoopGroup, serverList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupDetail {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    eventLoopGroup: ").append(toIndentedString(eventLoopGroup)).append("\n");
    sb.append("    serverList: ").append(toIndentedString(serverList)).append("\n");
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

