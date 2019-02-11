package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Application;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Artifact
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T19:00:55.531Z")

public class Artifact   {
  @JsonProperty("idArtifact")
  private String idArtifact = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("application")
  private Application application = null;

  public Artifact idArtifact(String idArtifact) {
    this.idArtifact = idArtifact;
    return this;
  }

  /**
   * Get idArtifact
   * @return idArtifact
  **/
  @ApiModelProperty(example = "Cartridge", required = true, value = "")
  @NotNull


  public String getIdArtifact() {
    return idArtifact;
  }

  public void setIdArtifact(String idArtifact) {
    this.idArtifact = idArtifact;
  }

  public Artifact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CartridgeTV", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Artifact description(String description) {
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

  public Artifact application(Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact artifact = (Artifact) o;
    return Objects.equals(this.idArtifact, artifact.idArtifact) &&
        Objects.equals(this.name, artifact.name) &&
        Objects.equals(this.description, artifact.description) &&
        Objects.equals(this.application, artifact.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idArtifact, name, description, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artifact {\n");
    
    sb.append("    idArtifact: ").append(toIndentedString(idArtifact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

