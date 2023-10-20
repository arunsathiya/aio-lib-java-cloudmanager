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
import io.adobe.cloudmanager.impl.generated.EnvironmentRegionintegrations;
import io.adobe.cloudmanager.impl.generated.RegionDeploymentLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;
/**
 * describes region deployments for an environment
 */
@Schema(description = "describes region deployments for an environment")


public class RegionDeployment implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("cluster")
  private String cluster = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("environmentId")
  private String environmentId = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("integrations")
  private EnvironmentRegionintegrations integrations = null;

  /**
   * Status of the region deployment
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    PROGRESSING("PROGRESSING"),
    FAILED("FAILED"),
    COMPLETE("COMPLETE"),
    DELETING("DELETING"),
    DELETED("DELETED"),
    DELETION_FAILED("DELETION_FAILED"),
    TO_DELETE("TO_DELETE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * Type of the region deployment
   */
  public enum TypeEnum {
    PRIMARY("PRIMARY"),
    SECONDARY("SECONDARY");

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

  @JsonProperty("_links")
  private RegionDeploymentLinks _links = null;

  public RegionDeployment cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * The cluster where this deployment happens
   * @return cluster
  **/
  @Schema(example = "ethos13stageva7", description = "The cluster where this deployment happens")
  public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  public RegionDeployment namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace in which this deployment happens
   * @return namespace
  **/
  @Schema(example = "ns-team-aem", description = "The namespace in which this deployment happens")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public RegionDeployment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created time
   * @return createdAt
  **/
  @Schema(description = "Created time")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RegionDeployment updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Date of last change
   * @return updatedAt
  **/
  @Schema(description = "Date of last change")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RegionDeployment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * identifier of a region deployment
   * @return id
  **/
  @Schema(description = "identifier of a region deployment")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegionDeployment environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * identifier of an environment
   * @return environmentId
  **/
  @Schema(description = "identifier of an environment")
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public RegionDeployment region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region name of the deployment
   * @return region
  **/
  @Schema(example = "va7", description = "Region name of the deployment")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public RegionDeployment integrations(EnvironmentRegionintegrations integrations) {
    this.integrations = integrations;
    return this;
  }

   /**
   * Get integrations
   * @return integrations
  **/
  @Schema(description = "")
  public EnvironmentRegionintegrations getIntegrations() {
    return integrations;
  }

  public void setIntegrations(EnvironmentRegionintegrations integrations) {
    this.integrations = integrations;
  }

  public RegionDeployment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the region deployment
   * @return status
  **/
  @Schema(description = "Status of the region deployment")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RegionDeployment type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the region deployment
   * @return type
  **/
  @Schema(example = "primary", description = "Type of the region deployment")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RegionDeployment _links(RegionDeploymentLinks _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public RegionDeploymentLinks getLinks() {
    return _links;
  }

  public void setLinks(RegionDeploymentLinks _links) {
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
    RegionDeployment regionDeployment = (RegionDeployment) o;
    return Objects.equals(this.cluster, regionDeployment.cluster) &&
        Objects.equals(this.namespace, regionDeployment.namespace) &&
        Objects.equals(this.createdAt, regionDeployment.createdAt) &&
        Objects.equals(this.updatedAt, regionDeployment.updatedAt) &&
        Objects.equals(this.id, regionDeployment.id) &&
        Objects.equals(this.environmentId, regionDeployment.environmentId) &&
        Objects.equals(this.region, regionDeployment.region) &&
        Objects.equals(this.integrations, regionDeployment.integrations) &&
        Objects.equals(this.status, regionDeployment.status) &&
        Objects.equals(this.type, regionDeployment.type) &&
        Objects.equals(this._links, regionDeployment._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, namespace, createdAt, updatedAt, id, environmentId, region, integrations, status, type, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionDeployment {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
