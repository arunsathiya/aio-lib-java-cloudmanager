/*
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/main/swagger-specs/api.yaml.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.adobe.cloudmanager.impl.generated;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.adobe.cloudmanager.impl.generated.PortForwardRepresentation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * EnableAdvancedNetworkingConfiguration
 */



public class EnableAdvancedNetworkingConfiguration implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("nonProxyHosts")
  private List<String> nonProxyHosts = null;

  @JsonProperty("portForwards")
  private List<PortForwardRepresentation> portForwards = null;

  public EnableAdvancedNetworkingConfiguration nonProxyHosts(List<String> nonProxyHosts) {
    this.nonProxyHosts = nonProxyHosts;
    return this;
  }

  public EnableAdvancedNetworkingConfiguration addNonProxyHostsItem(String nonProxyHostsItem) {
    if (this.nonProxyHosts == null) {
      this.nonProxyHosts = new ArrayList<>();
    }
    this.nonProxyHosts.add(nonProxyHostsItem);
    return this;
  }

   /**
   * A list of hosts that should be reached directly, bypassing the special VPN or egress routing. The patterns may start or end with a &#x27;&#x27;*&#x27;&#x27; for wildcards.
   * @return nonProxyHosts
  **/
  @Schema(example = "[\"*.example.com\",\"*.example.net\"]", description = "A list of hosts that should be reached directly, bypassing the special VPN or egress routing. The patterns may start or end with a ''*'' for wildcards.")
  public List<String> getNonProxyHosts() {
    return nonProxyHosts;
  }

  public void setNonProxyHosts(List<String> nonProxyHosts) {
    this.nonProxyHosts = nonProxyHosts;
  }

  public EnableAdvancedNetworkingConfiguration portForwards(List<PortForwardRepresentation> portForwards) {
    this.portForwards = portForwards;
    return this;
  }

  public EnableAdvancedNetworkingConfiguration addPortForwardsItem(PortForwardRepresentation portForwardsItem) {
    if (this.portForwards == null) {
      this.portForwards = new ArrayList<>();
    }
    this.portForwards.add(portForwardsItem);
    return this;
  }

   /**
   * List of port forwarding rules
   * @return portForwards
  **/
  @Schema(description = "List of port forwarding rules")
  public List<PortForwardRepresentation> getPortForwards() {
    return portForwards;
  }

  public void setPortForwards(List<PortForwardRepresentation> portForwards) {
    this.portForwards = portForwards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableAdvancedNetworkingConfiguration enableAdvancedNetworkingConfiguration = (EnableAdvancedNetworkingConfiguration) o;
    return Objects.equals(this.nonProxyHosts, enableAdvancedNetworkingConfiguration.nonProxyHosts) &&
        Objects.equals(this.portForwards, enableAdvancedNetworkingConfiguration.portForwards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonProxyHosts, portForwards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableAdvancedNetworkingConfiguration {\n");
    
    sb.append("    nonProxyHosts: ").append(toIndentedString(nonProxyHosts)).append("\n");
    sb.append("    portForwards: ").append(toIndentedString(portForwards)).append("\n");
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
