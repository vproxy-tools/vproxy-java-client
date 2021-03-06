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
import vproxy.client.model.Rule;
import vproxy.client.model.SecurityGroupRuleDetail;

/**
 * SecurityGroupDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-24T17:24:37.463+08:00")
public class SecurityGroupDetail {
  @SerializedName("name")
  private String name = null;

  @SerializedName("defaultRule")
  private Rule defaultRule = null;

  @SerializedName("ruleList")
  private List<SecurityGroupRuleDetail> ruleList = null;

  public SecurityGroupDetail name(String name) {
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

  public SecurityGroupDetail defaultRule(Rule defaultRule) {
    this.defaultRule = defaultRule;
    return this;
  }

   /**
   * Get defaultRule
   * @return defaultRule
  **/
  @ApiModelProperty(value = "")
  public Rule getDefaultRule() {
    return defaultRule;
  }

  public void setDefaultRule(Rule defaultRule) {
    this.defaultRule = defaultRule;
  }

  public SecurityGroupDetail ruleList(List<SecurityGroupRuleDetail> ruleList) {
    this.ruleList = ruleList;
    return this;
  }

  public SecurityGroupDetail addRuleListItem(SecurityGroupRuleDetail ruleListItem) {
    if (this.ruleList == null) {
      this.ruleList = new ArrayList<SecurityGroupRuleDetail>();
    }
    this.ruleList.add(ruleListItem);
    return this;
  }

   /**
   * Get ruleList
   * @return ruleList
  **/
  @ApiModelProperty(value = "")
  public List<SecurityGroupRuleDetail> getRuleList() {
    return ruleList;
  }

  public void setRuleList(List<SecurityGroupRuleDetail> ruleList) {
    this.ruleList = ruleList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupDetail securityGroupDetail = (SecurityGroupDetail) o;
    return Objects.equals(this.name, securityGroupDetail.name) &&
        Objects.equals(this.defaultRule, securityGroupDetail.defaultRule) &&
        Objects.equals(this.ruleList, securityGroupDetail.ruleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultRule, ruleList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupDetail {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultRule: ").append(toIndentedString(defaultRule)).append("\n");
    sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
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

