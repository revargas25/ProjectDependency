package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Artifact;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T19:00:55.531Z")

public class Project   {
  @JsonProperty("idProject")
  private String idProject = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("artifacts")
  @Valid
  private List<Artifact> artifacts = null;

  public Project idProject(String idProject) {
    this.idProject = idProject;
    return this;
  }

  /**
   * Get idProject
   * @return idProject
  **/
  @ApiModelProperty(example = "1709121", required = true, value = "")
  @NotNull


  public String getIdProject() {
    return idProject;
  }

  public void setIdProject(String idProject) {
    this.idProject = idProject;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Migracion", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "OC", required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Project status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "DesarrolloOK", required = true, value = "")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Project artifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public Project addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<Artifact>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Get artifacts
   * @return artifacts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.idProject, project.idProject) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.type, project.type) &&
        Objects.equals(this.status, project.status) &&
        Objects.equals(this.artifacts, project.artifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProject, name, type, status, artifacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    idProject: ").append(toIndentedString(idProject)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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

