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
import io.adobe.cloudmanager.impl.generated.VariableListEmbedded;
import io.adobe.cloudmanager.impl.generated.VariableListLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
/**
 * VariableList
 */



public class VariableList implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("_totalNumberOfItems")
  private Integer _totalNumberOfItems = null;

  @JsonProperty("_embedded")
  private VariableListEmbedded _embedded = null;

  @JsonProperty("_links")
  private VariableListLinks _links = null;

  public VariableList _totalNumberOfItems(Integer _totalNumberOfItems) {
    this._totalNumberOfItems = _totalNumberOfItems;
    return this;
  }

   /**
   * The total number of embedded items
   * @return _totalNumberOfItems
  **/
  @Schema(example = "1", description = "The total number of embedded items")
  public Integer getTotalNumberOfItems() {
    return _totalNumberOfItems;
  }

  public void setTotalNumberOfItems(Integer _totalNumberOfItems) {
    this._totalNumberOfItems = _totalNumberOfItems;
  }

  public VariableList _embedded(VariableListEmbedded _embedded) {
    this._embedded = _embedded;
    return this;
  }

   /**
   * Get _embedded
   * @return _embedded
  **/
  @Schema(description = "")
  public VariableListEmbedded getEmbedded() {
    return _embedded;
  }

  public void setEmbedded(VariableListEmbedded _embedded) {
    this._embedded = _embedded;
  }

  public VariableList _links(VariableListLinks _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public VariableListLinks getLinks() {
    return _links;
  }

  public void setLinks(VariableListLinks _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableList variableList = (VariableList) o;
    return Objects.equals(this._totalNumberOfItems, variableList._totalNumberOfItems) &&
        Objects.equals(this._embedded, variableList._embedded) &&
        Objects.equals(this._links, variableList._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_totalNumberOfItems, _embedded, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableList {\n");
    
    sb.append("    _totalNumberOfItems: ").append(toIndentedString(_totalNumberOfItems)).append("\n");
    sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
