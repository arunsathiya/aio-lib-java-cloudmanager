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
import io.adobe.cloudmanager.impl.generated.PipelineStepUpdate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * Describes an update to a phase of a pipeline
 */
@Schema(description = "Describes an update to a phase of a pipeline")


public class PipelinePhaseUpdate implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("name")
  private String name = null;

  /**
   * Type of the phase
   */
  public enum TypeEnum {
    BUILD("BUILD"),
    DEPLOY("DEPLOY");

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

  @JsonProperty("repositoryId")
  private String repositoryId = null;

  @JsonProperty("branch")
  private String branch = null;

  @JsonProperty("environmentId")
  private String environmentId = null;

  @JsonProperty("steps")
  private List<PipelineStepUpdate> steps = null;

  public PipelinePhaseUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the phase
   * @return name
  **/
  @Schema(example = "BUILD_1", description = "Name of the phase")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PipelinePhaseUpdate type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the phase
   * @return type
  **/
  @Schema(example = "BUILD", required = true, description = "Type of the phase")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PipelinePhaseUpdate repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * For BUILD phase type. Identifier of the source repository. The code from this repository will be build at the start of this phase. If not provided, the current value is retained.
   * @return repositoryId
  **/
  @Schema(description = "For BUILD phase type. Identifier of the source repository. The code from this repository will be build at the start of this phase. If not provided, the current value is retained.")
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public PipelinePhaseUpdate branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * For BUILD phase type. Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1). If not provided, the current value is retained.
   * @return branch
  **/
  @Schema(description = "For BUILD phase type. Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1). If not provided, the current value is retained.")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public PipelinePhaseUpdate environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * For DEPLOY phase type. Identifier of the target environment.
   * @return environmentId
  **/
  @Schema(description = "For DEPLOY phase type. Identifier of the target environment.")
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public PipelinePhaseUpdate steps(List<PipelineStepUpdate> steps) {
    this.steps = steps;
    return this;
  }

  public PipelinePhaseUpdate addStepsItem(PipelineStepUpdate stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Steps to update within the phase.
   * @return steps
  **/
  @Schema(description = "Steps to update within the phase.")
  public List<PipelineStepUpdate> getSteps() {
    return steps;
  }

  public void setSteps(List<PipelineStepUpdate> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelinePhaseUpdate pipelinePhaseUpdate = (PipelinePhaseUpdate) o;
    return Objects.equals(this.name, pipelinePhaseUpdate.name) &&
        Objects.equals(this.type, pipelinePhaseUpdate.type) &&
        Objects.equals(this.repositoryId, pipelinePhaseUpdate.repositoryId) &&
        Objects.equals(this.branch, pipelinePhaseUpdate.branch) &&
        Objects.equals(this.environmentId, pipelinePhaseUpdate.environmentId) &&
        Objects.equals(this.steps, pipelinePhaseUpdate.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, repositoryId, branch, environmentId, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelinePhaseUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
