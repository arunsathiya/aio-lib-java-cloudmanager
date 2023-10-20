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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
/**
 * MissingParameter
 */



public class MissingParameter implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  public MissingParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the missing parameter.
   * @return name
  **/
  @Schema(example = "paramName", description = "Name of the missing parameter.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MissingParameter type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the missing parameter.
   * @return type
  **/
  @Schema(example = "string", description = "Type of the missing parameter.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingParameter missingParameter = (MissingParameter) o;
    return Objects.equals(this.name, missingParameter.name) &&
        Objects.equals(this.type, missingParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
