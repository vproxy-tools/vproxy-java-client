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
import vproxy.client.model.Rule;

/**
 * SecurityGroupCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-10T22:59:44.913+08:00")
public class SecurityGroupCreate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("defaultRule")
  private Rule defaultRule = null;

  public SecurityGroupCreate name(String name) {
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

  public SecurityGroupCreate defaultRule(Rule defaultRule) {
    this.defaultRule = defaultRule;
    return this;
  }

   /**
   * Get defaultRule
   * @return defaultRule
  **/
  @ApiModelProperty(required = true, value = "")
  public Rule getDefaultRule() {
    return defaultRule;
  }

  public void setDefaultRule(Rule defaultRule) {
    this.defaultRule = defaultRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupCreate securityGroupCreate = (SecurityGroupCreate) o;
    return Objects.equals(this.name, securityGroupCreate.name) &&
        Objects.equals(this.defaultRule, securityGroupCreate.defaultRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultRule: ").append(toIndentedString(defaultRule)).append("\n");
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

