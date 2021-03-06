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
import vproxy.client.model.CertKeyDetail;
import vproxy.client.model.EventLoopGroupDetail;
import vproxy.client.model.Protocol;
import vproxy.client.model.SecurityGroupDetail;
import vproxy.client.model.UpstreamDetail;

/**
 * TcpLbDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-24T17:24:37.463+08:00")
public class TcpLbDetail {
  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("backend")
  private UpstreamDetail backend = null;

  @SerializedName("protocol")
  private Protocol protocol = null;

  @SerializedName("acceptorLoopGroup")
  private EventLoopGroupDetail acceptorLoopGroup = null;

  @SerializedName("workerLoopGroup")
  private EventLoopGroupDetail workerLoopGroup = null;

  @SerializedName("inBufferSize")
  private Integer inBufferSize = null;

  @SerializedName("outBufferSize")
  private Integer outBufferSize = null;

  @SerializedName("listOfCertKey")
  private List<CertKeyDetail> listOfCertKey = null;

  @SerializedName("securityGroup")
  private SecurityGroupDetail securityGroup = null;

  public TcpLbDetail name(String name) {
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

  public TcpLbDetail address(String address) {
    this.address = address;
    return this;
  }

   /**
   * l4addr
   * @return address
  **/
  @ApiModelProperty(value = "l4addr")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public TcpLbDetail backend(UpstreamDetail backend) {
    this.backend = backend;
    return this;
  }

   /**
   * Get backend
   * @return backend
  **/
  @ApiModelProperty(value = "")
  public UpstreamDetail getBackend() {
    return backend;
  }

  public void setBackend(UpstreamDetail backend) {
    this.backend = backend;
  }

  public TcpLbDetail protocol(Protocol protocol) {
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

  public TcpLbDetail acceptorLoopGroup(EventLoopGroupDetail acceptorLoopGroup) {
    this.acceptorLoopGroup = acceptorLoopGroup;
    return this;
  }

   /**
   * Get acceptorLoopGroup
   * @return acceptorLoopGroup
  **/
  @ApiModelProperty(value = "")
  public EventLoopGroupDetail getAcceptorLoopGroup() {
    return acceptorLoopGroup;
  }

  public void setAcceptorLoopGroup(EventLoopGroupDetail acceptorLoopGroup) {
    this.acceptorLoopGroup = acceptorLoopGroup;
  }

  public TcpLbDetail workerLoopGroup(EventLoopGroupDetail workerLoopGroup) {
    this.workerLoopGroup = workerLoopGroup;
    return this;
  }

   /**
   * Get workerLoopGroup
   * @return workerLoopGroup
  **/
  @ApiModelProperty(value = "")
  public EventLoopGroupDetail getWorkerLoopGroup() {
    return workerLoopGroup;
  }

  public void setWorkerLoopGroup(EventLoopGroupDetail workerLoopGroup) {
    this.workerLoopGroup = workerLoopGroup;
  }

  public TcpLbDetail inBufferSize(Integer inBufferSize) {
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

  public TcpLbDetail outBufferSize(Integer outBufferSize) {
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

  public TcpLbDetail listOfCertKey(List<CertKeyDetail> listOfCertKey) {
    this.listOfCertKey = listOfCertKey;
    return this;
  }

  public TcpLbDetail addListOfCertKeyItem(CertKeyDetail listOfCertKeyItem) {
    if (this.listOfCertKey == null) {
      this.listOfCertKey = new ArrayList<CertKeyDetail>();
    }
    this.listOfCertKey.add(listOfCertKeyItem);
    return this;
  }

   /**
   * Get listOfCertKey
   * @return listOfCertKey
  **/
  @ApiModelProperty(value = "")
  public List<CertKeyDetail> getListOfCertKey() {
    return listOfCertKey;
  }

  public void setListOfCertKey(List<CertKeyDetail> listOfCertKey) {
    this.listOfCertKey = listOfCertKey;
  }

  public TcpLbDetail securityGroup(SecurityGroupDetail securityGroup) {
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @ApiModelProperty(value = "")
  public SecurityGroupDetail getSecurityGroup() {
    return securityGroup;
  }

  public void setSecurityGroup(SecurityGroupDetail securityGroup) {
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
    TcpLbDetail tcpLbDetail = (TcpLbDetail) o;
    return Objects.equals(this.name, tcpLbDetail.name) &&
        Objects.equals(this.address, tcpLbDetail.address) &&
        Objects.equals(this.backend, tcpLbDetail.backend) &&
        Objects.equals(this.protocol, tcpLbDetail.protocol) &&
        Objects.equals(this.acceptorLoopGroup, tcpLbDetail.acceptorLoopGroup) &&
        Objects.equals(this.workerLoopGroup, tcpLbDetail.workerLoopGroup) &&
        Objects.equals(this.inBufferSize, tcpLbDetail.inBufferSize) &&
        Objects.equals(this.outBufferSize, tcpLbDetail.outBufferSize) &&
        Objects.equals(this.listOfCertKey, tcpLbDetail.listOfCertKey) &&
        Objects.equals(this.securityGroup, tcpLbDetail.securityGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, backend, protocol, acceptorLoopGroup, workerLoopGroup, inBufferSize, outBufferSize, listOfCertKey, securityGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TcpLbDetail {\n");
    
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

