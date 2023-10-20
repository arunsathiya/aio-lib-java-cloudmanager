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
import io.adobe.cloudmanager.impl.generated.HalLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
/**
 * EnvironmentLinks
 */



public class EnvironmentLinks implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpnsAdobeComadobecloudrelprogram = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline")
  private HalLink httpnsAdobeComadobecloudrelpipeline = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/author")
  private HalLink httpnsAdobeComadobecloudrelauthor = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/publish")
  private HalLink httpnsAdobeComadobecloudrelpublish = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/preview")
  private HalLink httpnsAdobeComadobecloudrelpreview = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/developerConsole")
  private HalLink httpnsAdobeComadobecloudreldeveloperConsole = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs")
  private HalLink httpnsAdobeComadobecloudrellogs = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/variables")
  private HalLink httpnsAdobeComadobecloudrelvariables = null;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/advancedNetworking")
  private HalLink httpnsAdobeComadobecloudreladvancedNetworking = null;

  @JsonProperty("self")
  private HalLink self = null;

  public EnvironmentLinks httpnsAdobeComadobecloudrelprogram(HalLink httpnsAdobeComadobecloudrelprogram) {
    this.httpnsAdobeComadobecloudrelprogram = httpnsAdobeComadobecloudrelprogram;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrelprogram
   * @return httpnsAdobeComadobecloudrelprogram
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrelprogram() {
    return httpnsAdobeComadobecloudrelprogram;
  }

  public void setHttpnsAdobeComadobecloudrelprogram(HalLink httpnsAdobeComadobecloudrelprogram) {
    this.httpnsAdobeComadobecloudrelprogram = httpnsAdobeComadobecloudrelprogram;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudrelpipeline(HalLink httpnsAdobeComadobecloudrelpipeline) {
    this.httpnsAdobeComadobecloudrelpipeline = httpnsAdobeComadobecloudrelpipeline;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrelpipeline
   * @return httpnsAdobeComadobecloudrelpipeline
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrelpipeline() {
    return httpnsAdobeComadobecloudrelpipeline;
  }

  public void setHttpnsAdobeComadobecloudrelpipeline(HalLink httpnsAdobeComadobecloudrelpipeline) {
    this.httpnsAdobeComadobecloudrelpipeline = httpnsAdobeComadobecloudrelpipeline;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudrelauthor(HalLink httpnsAdobeComadobecloudrelauthor) {
    this.httpnsAdobeComadobecloudrelauthor = httpnsAdobeComadobecloudrelauthor;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrelauthor
   * @return httpnsAdobeComadobecloudrelauthor
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrelauthor() {
    return httpnsAdobeComadobecloudrelauthor;
  }

  public void setHttpnsAdobeComadobecloudrelauthor(HalLink httpnsAdobeComadobecloudrelauthor) {
    this.httpnsAdobeComadobecloudrelauthor = httpnsAdobeComadobecloudrelauthor;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudrelpublish(HalLink httpnsAdobeComadobecloudrelpublish) {
    this.httpnsAdobeComadobecloudrelpublish = httpnsAdobeComadobecloudrelpublish;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrelpublish
   * @return httpnsAdobeComadobecloudrelpublish
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrelpublish() {
    return httpnsAdobeComadobecloudrelpublish;
  }

  public void setHttpnsAdobeComadobecloudrelpublish(HalLink httpnsAdobeComadobecloudrelpublish) {
    this.httpnsAdobeComadobecloudrelpublish = httpnsAdobeComadobecloudrelpublish;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudrelpreview(HalLink httpnsAdobeComadobecloudrelpreview) {
    this.httpnsAdobeComadobecloudrelpreview = httpnsAdobeComadobecloudrelpreview;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrelpreview
   * @return httpnsAdobeComadobecloudrelpreview
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrelpreview() {
    return httpnsAdobeComadobecloudrelpreview;
  }

  public void setHttpnsAdobeComadobecloudrelpreview(HalLink httpnsAdobeComadobecloudrelpreview) {
    this.httpnsAdobeComadobecloudrelpreview = httpnsAdobeComadobecloudrelpreview;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudreldeveloperConsole(HalLink httpnsAdobeComadobecloudreldeveloperConsole) {
    this.httpnsAdobeComadobecloudreldeveloperConsole = httpnsAdobeComadobecloudreldeveloperConsole;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudreldeveloperConsole
   * @return httpnsAdobeComadobecloudreldeveloperConsole
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudreldeveloperConsole() {
    return httpnsAdobeComadobecloudreldeveloperConsole;
  }

  public void setHttpnsAdobeComadobecloudreldeveloperConsole(HalLink httpnsAdobeComadobecloudreldeveloperConsole) {
    this.httpnsAdobeComadobecloudreldeveloperConsole = httpnsAdobeComadobecloudreldeveloperConsole;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudrellogs(HalLink httpnsAdobeComadobecloudrellogs) {
    this.httpnsAdobeComadobecloudrellogs = httpnsAdobeComadobecloudrellogs;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrellogs
   * @return httpnsAdobeComadobecloudrellogs
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrellogs() {
    return httpnsAdobeComadobecloudrellogs;
  }

  public void setHttpnsAdobeComadobecloudrellogs(HalLink httpnsAdobeComadobecloudrellogs) {
    this.httpnsAdobeComadobecloudrellogs = httpnsAdobeComadobecloudrellogs;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudrelvariables(HalLink httpnsAdobeComadobecloudrelvariables) {
    this.httpnsAdobeComadobecloudrelvariables = httpnsAdobeComadobecloudrelvariables;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudrelvariables
   * @return httpnsAdobeComadobecloudrelvariables
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudrelvariables() {
    return httpnsAdobeComadobecloudrelvariables;
  }

  public void setHttpnsAdobeComadobecloudrelvariables(HalLink httpnsAdobeComadobecloudrelvariables) {
    this.httpnsAdobeComadobecloudrelvariables = httpnsAdobeComadobecloudrelvariables;
  }

  public EnvironmentLinks httpnsAdobeComadobecloudreladvancedNetworking(HalLink httpnsAdobeComadobecloudreladvancedNetworking) {
    this.httpnsAdobeComadobecloudreladvancedNetworking = httpnsAdobeComadobecloudreladvancedNetworking;
    return this;
  }

   /**
   * Get httpnsAdobeComadobecloudreladvancedNetworking
   * @return httpnsAdobeComadobecloudreladvancedNetworking
  **/
  @Schema(description = "")
  public HalLink getHttpnsAdobeComadobecloudreladvancedNetworking() {
    return httpnsAdobeComadobecloudreladvancedNetworking;
  }

  public void setHttpnsAdobeComadobecloudreladvancedNetworking(HalLink httpnsAdobeComadobecloudreladvancedNetworking) {
    this.httpnsAdobeComadobecloudreladvancedNetworking = httpnsAdobeComadobecloudreladvancedNetworking;
  }

  public EnvironmentLinks self(HalLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentLinks environmentLinks = (EnvironmentLinks) o;
    return Objects.equals(this.httpnsAdobeComadobecloudrelprogram, environmentLinks.httpnsAdobeComadobecloudrelprogram) &&
        Objects.equals(this.httpnsAdobeComadobecloudrelpipeline, environmentLinks.httpnsAdobeComadobecloudrelpipeline) &&
        Objects.equals(this.httpnsAdobeComadobecloudrelauthor, environmentLinks.httpnsAdobeComadobecloudrelauthor) &&
        Objects.equals(this.httpnsAdobeComadobecloudrelpublish, environmentLinks.httpnsAdobeComadobecloudrelpublish) &&
        Objects.equals(this.httpnsAdobeComadobecloudrelpreview, environmentLinks.httpnsAdobeComadobecloudrelpreview) &&
        Objects.equals(this.httpnsAdobeComadobecloudreldeveloperConsole, environmentLinks.httpnsAdobeComadobecloudreldeveloperConsole) &&
        Objects.equals(this.httpnsAdobeComadobecloudrellogs, environmentLinks.httpnsAdobeComadobecloudrellogs) &&
        Objects.equals(this.httpnsAdobeComadobecloudrelvariables, environmentLinks.httpnsAdobeComadobecloudrelvariables) &&
        Objects.equals(this.httpnsAdobeComadobecloudreladvancedNetworking, environmentLinks.httpnsAdobeComadobecloudreladvancedNetworking) &&
        Objects.equals(this.self, environmentLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpnsAdobeComadobecloudrelprogram, httpnsAdobeComadobecloudrelpipeline, httpnsAdobeComadobecloudrelauthor, httpnsAdobeComadobecloudrelpublish, httpnsAdobeComadobecloudrelpreview, httpnsAdobeComadobecloudreldeveloperConsole, httpnsAdobeComadobecloudrellogs, httpnsAdobeComadobecloudrelvariables, httpnsAdobeComadobecloudreladvancedNetworking, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLinks {\n");
    
    sb.append("    httpnsAdobeComadobecloudrelprogram: ").append(toIndentedString(httpnsAdobeComadobecloudrelprogram)).append("\n");
    sb.append("    httpnsAdobeComadobecloudrelpipeline: ").append(toIndentedString(httpnsAdobeComadobecloudrelpipeline)).append("\n");
    sb.append("    httpnsAdobeComadobecloudrelauthor: ").append(toIndentedString(httpnsAdobeComadobecloudrelauthor)).append("\n");
    sb.append("    httpnsAdobeComadobecloudrelpublish: ").append(toIndentedString(httpnsAdobeComadobecloudrelpublish)).append("\n");
    sb.append("    httpnsAdobeComadobecloudrelpreview: ").append(toIndentedString(httpnsAdobeComadobecloudrelpreview)).append("\n");
    sb.append("    httpnsAdobeComadobecloudreldeveloperConsole: ").append(toIndentedString(httpnsAdobeComadobecloudreldeveloperConsole)).append("\n");
    sb.append("    httpnsAdobeComadobecloudrellogs: ").append(toIndentedString(httpnsAdobeComadobecloudrellogs)).append("\n");
    sb.append("    httpnsAdobeComadobecloudrelvariables: ").append(toIndentedString(httpnsAdobeComadobecloudrelvariables)).append("\n");
    sb.append("    httpnsAdobeComadobecloudreladvancedNetworking: ").append(toIndentedString(httpnsAdobeComadobecloudreladvancedNetworking)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
