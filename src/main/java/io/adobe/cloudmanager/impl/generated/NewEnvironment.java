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
 * Description of a new program to be created
 */
@Schema(description = "Description of a new program to be created")


public class NewEnvironment implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DEV("dev"),
    STAGE("stage"),
    PROD("prod"),
    RDE("rde");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("description")
  private String description = null;

  public NewEnvironment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the environment
   * @return name
  **/
  @Schema(example = "acme-dev1", required = true, description = "Name of the environment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewEnvironment type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NewEnvironment region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region to create the environment.
   * @return region
  **/
  @Schema(example = "va7", required = true, description = "Region to create the environment.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public NewEnvironment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the environment
   * @return description
  **/
  @Schema(example = "This is our primary development environment", description = "Description of the environment")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewEnvironment newEnvironment = (NewEnvironment) o;
    return Objects.equals(this.name, newEnvironment.name) &&
        Objects.equals(this.type, newEnvironment.type) &&
        Objects.equals(this.region, newEnvironment.region) &&
        Objects.equals(this.description, newEnvironment.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, region, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewEnvironment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
