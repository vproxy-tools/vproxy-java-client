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
import vproxy.client.model.Protocol;

/**
 * TcpLb
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-24T17:24:37.463+08:00")
public class TcpLb {
  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("backend")
  private String backend = null;

  @SerializedName("protocol")
  private Protocol protocol = null;

  @SerializedName("acceptorLoopGroup")
  private String acceptorLoopGroup = null;

  @SerializedName("workerLoopGroup")
  private String workerLoopGroup = null;

  @SerializedName("inBufferSize")
  private Integer inBufferSize = null;

  @SerializedName("outBufferSize")
  private Integer outBufferSize = null;

  @SerializedName("listOfCertKey")
  private List<String> listOfCertKey = null;

  @SerializedName("securityGroup")
  private String securityGroup = null;

  public TcpLb name(String name) {
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

  public TcpLb address(String address) {
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

  public TcpLb backend(String backend) {
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

  public TcpLb protocol(Protocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public Protocol getProtocol() {
    return protocol;
  }

  public void setProtocol(Protocol protocol) {
    this.protocol = protocol;
  }

  public TcpLb acceptorLoopGroup(String acceptorLoopGroup) {
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

  public TcpLb workerLoopGroup(String workerLoopGroup) {
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

  public TcpLb inBufferSize(Integer inBufferSize) {
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

  public TcpLb outBufferSize(Integer outBufferSize) {
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

  public TcpLb listOfCertKey(List<String> listOfCertKey) {
    this.listOfCertKey = listOfCertKey;
    return this;
  }

  public TcpLb addListOfCertKeyItem(String listOfCertKeyItem) {
    if (this.listOfCertKey == null) {
      this.listOfCertKey = new ArrayList<String>();
    }
    this.listOfCertKey.add(listOfCertKeyItem);
    return this;
  }

   /**
   * Get listOfCertKey
   * @return listOfCertKey
  **/
  @ApiModelProperty(value = "")
  public List<String> getListOfCertKey() {
    return listOfCertKey;
  }

  public void setListOfCertKey(List<String> listOfCertKey) {
    this.listOfCertKey = listOfCertKey;
  }

  public TcpLb securityGroup(String securityGroup) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TcpLb tcpLb = (TcpLb) o;
    return Objects.equals(this.name, tcpLb.name) &&
        Objects.equals(this.address, tcpLb.address) &&
        Objects.equals(this.backend, tcpLb.backend) &&
        Objects.equals(this.protocol, tcpLb.protocol) &&
        Objects.equals(this.acceptorLoopGroup, tcpLb.acceptorLoopGroup) &&
        Objects.equals(this.workerLoopGroup, tcpLb.workerLoopGroup) &&
        Objects.equals(this.inBufferSize, tcpLb.inBufferSize) &&
        Objects.equals(this.outBufferSize, tcpLb.outBufferSize) &&
        Objects.equals(this.listOfCertKey, tcpLb.listOfCertKey) &&
        Objects.equals(this.securityGroup, tcpLb.securityGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, backend, protocol, acceptorLoopGroup, workerLoopGroup, inBufferSize, outBufferSize, listOfCertKey, securityGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TcpLb {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    acceptorLoopGroup: ").append(toIndentedString(acceptorLoopGroup)).append("\n");
    sb.append("    workerLoopGroup: ").append(toIndentedString(workerLoopGroup)).append("\n");
    sb.append("    inBufferSize: ").append(toIndentedString(inBufferSize)).append("\n");
    sb.append("    outBufferSize: ").append(toIndentedString(outBufferSize)).append("\n");
    sb.append("    listOfCertKey: ").append(toIndentedString(listOfCertKey)).append("\n");
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

