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
import io.adobe.cloudmanager.impl.generated.ContentSetPath;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * NewContentSet
 */



public class NewContentSet implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("paths")
  private List<ContentSetPath> paths = new ArrayList<>();

  public NewContentSet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this content set.
   * @return name
  **/
  @Schema(required = true, description = "The name of this content set.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewContentSet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of this content set.
   * @return description
  **/
  @Schema(description = "The description of this content set.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewContentSet paths(List<ContentSetPath> paths) {
    this.paths = paths;
    return this;
  }

  public NewContentSet addPathsItem(ContentSetPath pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Included asset paths
   * @return paths
  **/
  @Schema(required = true, description = "Included asset paths")
  public List<ContentSetPath> getPaths() {
    return paths;
  }

  public void setPaths(List<ContentSetPath> paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewContentSet newContentSet = (NewContentSet) o;
    return Objects.equals(this.name, newContentSet.name) &&
        Objects.equals(this.description, newContentSet.description) &&
        Objects.equals(this.paths, newContentSet.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, paths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewContentSet {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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
