package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Project;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dependency
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T19:00:55.531Z")

public class Dependency   {
  @JsonProperty("idDependency")
  private String idDependency = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("project")
  private Project project = null;

  @JsonProperty("projecttDep")
  @Valid
  private List<Project> projecttDep = null;

  public Dependency idDependency(String idDependency) {
    this.idDependency = idDependency;
    return this;
  }

  /**
   * Get idDependency
   * @return idDependency
  **/
  @ApiModelProperty(example = "1234", required = true, value = "")
  @NotNull


  public String getIdDependency() {
    return idDependency;
  }

  public void setIdDependency(String idDependency) {
    this.idDependency = idDependency;
  }

  public Dependency name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CartridgeTV", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dependency description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "OSS", required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Dependency project(Project project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Dependency projecttDep(List<Project> projecttDep) {
    this.projecttDep = projecttDep;
    return this;
  }

  public Dependency addProjecttDepItem(Project projecttDepItem) {
    if (this.projecttDep == null) {
      this.projecttDep = new ArrayList<Project>();
    }
    this.projecttDep.add(projecttDepItem);
    return this;
  }

  /**
   * Get projecttDep
   * @return projecttDep
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Project> getProjecttDep() {
    return projecttDep;
  }

  public void setProjecttDep(List<Project> projecttDep) {
    this.projecttDep = projecttDep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.idDependency, dependency.idDependency) &&
        Objects.equals(this.name, dependency.name) &&
        Objects.equals(this.description, dependency.description) &&
        Objects.equals(this.project, dependency.project) &&
        Objects.equals(this.projecttDep, dependency.projecttDep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDependency, name, description, project, projecttDep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    idDependency: ").append(toIndentedString(idDependency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projecttDep: ").append(toIndentedString(projecttDep)).append("\n");
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

