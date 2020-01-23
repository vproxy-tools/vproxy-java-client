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
 * Error500
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-23T11:14:02.626+08:00")
public class Error500 {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("errId")
  private String errId = null;

  @SerializedName("message")
  private String message = null;

  public Error500 code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Error500 errId(String errId) {
    this.errId = errId;
    return this;
  }

   /**
   * Get errId
   * @return errId
  **/
  @ApiModelProperty(value = "")
  public String getErrId() {
    return errId;
  }

  public void setErrId(String errId) {
    this.errId = errId;
  }

  public Error500 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error500 error500 = (Error500) o;
    return Objects.equals(this.code, error500.code) &&
        Objects.equals(this.errId, error500.errId) &&
        Objects.equals(this.message, error500.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errId, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error500 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errId: ").append(toIndentedString(errId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

