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
 * Socks5Server
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-10T17:27:20.371+08:00")
public class Socks5Server {
  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("backend")
  private String backend = null;

  @SerializedName("acceptorLoopGroup")
  private String acceptorLoopGroup = null;

  @SerializedName("workerLoopGroup")
  private String workerLoopGroup = null;

  @SerializedName("inBufferSize")
  private Integer inBufferSize = null;

  @SerializedName("outBufferSize")
  private Integer outBufferSize = null;

  @SerializedName("securityGroup")
  private String securityGroup = null;

  @SerializedName("allowNonBackend")
  private Boolean allowNonBackend = null;

  public Socks5Server name(String name) {
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

  public Socks5Server address(String address) {
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

  public Socks5Server backend(String backend) {
    this.backend = backend;
    return this;
  }

   /**
   * upstream reference for backend servers
   * @return backend
  **/
  @ApiModelProperty(value = "upstream reference for backend servers")
  public String getBackend() {
    return backend;
  }

  public void setBackend(String backend) {
    this.backend = backend;
  }

  public Socks5Server acceptorLoopGroup(String acceptorLoopGroup) {
    this.acceptorLoopGroup = acceptorLoopGroup;
    return this;
  }

   /**
   * event loop group for accepting connections
   * @return acceptorLoopGroup
  **/
  @ApiModelProperty(value = "event loop group for accepting connections")
  public String getAcceptorLoopGroup() {
    return acceptorLoopGroup;
  }

  public void setAcceptorLoopGroup(String acceptorLoopGroup) {
    this.acceptorLoopGroup = acceptorLoopGroup;
  }

  public Socks5Server workerLoopGroup(String workerLoopGroup) {
    this.workerLoopGroup = workerLoopGroup;
    return this;
  }

   /**
   * event loop group for handling netflow
   * @return workerLoopGroup
  **/
  @ApiModelProperty(value = "event loop group for handling netflow")
  public String getWorkerLoopGroup() {
    return workerLoopGroup;
  }

  public void setWorkerLoopGroup(String workerLoopGroup) {
    this.workerLoopGroup = workerLoopGroup;
  }

  public Socks5Server inBufferSize(Integer inBufferSize) {
    this.inBufferSize = inBufferSize;
    return this;
  }

   /**
   * input buffer size
   * @return inBufferSize
  **/
  @ApiModelProperty(value = "input buffer size")
  public Integer getInBufferSize() {
    return inBufferSize;
  }

  public void setInBufferSize(Integer inBufferSize) {
    this.inBufferSize = inBufferSize;
  }

  public Socks5Server outBufferSize(Integer outBufferSize) {
    this.outBufferSize = outBufferSize;
    return this;
  }

   /**
   * output buffer size
   * @return outBufferSize
  **/
  @ApiModelProperty(value = "output buffer size")
  public Integer getOutBufferSize() {
    return outBufferSize;
  }

  public void setOutBufferSize(Integer outBufferSize) {
    this.outBufferSize = outBufferSize;
  }

  public Socks5Server securityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * security group reference for access control
   * @return securityGroup
  **/
  @ApiModelProperty(value = "security group reference for access control")
  public String getSecurityGroup() {
    return securityGroup;
  }

  public void setSecurityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
  }

  public Socks5Server allowNonBackend(Boolean allowNonBackend) {
    this.allowNonBackend = allowNonBackend;
    return this;
  }

   /**
   * allow or disallow to proxy to non-backend endpoints
   * @return allowNonBackend
  **/
  @ApiModelProperty(value = "allow or disallow to proxy to non-backend endpoints")
  public Boolean isAllowNonBackend() {
    return allowNonBackend;
  }

  public void setAllowNonBackend(Boolean allowNonBackend) {
    this.allowNonBackend = allowNonBackend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Socks5Server socks5Server = (Socks5Server) o;
    return Objects.equals(this.name, socks5Server.name) &&
        Objects.equals(this.address, socks5Server.address) &&
        Objects.equals(this.backend, socks5Server.backend) &&
        Objects.equals(this.acceptorLoopGroup, socks5Server.acceptorLoopGroup) &&
        Objects.equals(this.workerLoopGroup, socks5Server.workerLoopGroup) &&
        Objects.equals(this.inBufferSize, socks5Server.inBufferSize) &&
        Objects.equals(this.outBufferSize, socks5Server.outBufferSize) &&
        Objects.equals(this.securityGroup, socks5Server.securityGroup) &&
        Objects.equals(this.allowNonBackend, socks5Server.allowNonBackend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, backend, acceptorLoopGroup, workerLoopGroup, inBufferSize, outBufferSize, securityGroup, allowNonBackend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Socks5Server {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    acceptorLoopGroup: ").append(toIndentedString(acceptorLoopGroup)).append("\n");
    sb.append("    workerLoopGroup: ").append(toIndentedString(workerLoopGroup)).append("\n");
    sb.append("    inBufferSize: ").append(toIndentedString(inBufferSize)).append("\n");
    sb.append("    outBufferSize: ").append(toIndentedString(outBufferSize)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    allowNonBackend: ").append(toIndentedString(allowNonBackend)).append("\n");
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
