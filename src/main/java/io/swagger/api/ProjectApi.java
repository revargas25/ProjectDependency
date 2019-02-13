/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Project;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T19:00:55.531Z")

@Api(value = "project", description = "the project API")
public interface ProjectApi {

    @ApiOperation(value = "adds a new Project", nickname = "addProject", notes = "Adds a Project to the system", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Project created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item already exists") })
    @RequestMapping(value = "/project/{idProject}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject,@ApiParam(value = "Project to add"  )  @Valid @RequestBody Project project);


    @ApiOperation(value = "delete a Project", nickname = "deleteProject", notes = "delete a Project to the system", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Project delete"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item does not exists") })
    @RequestMapping(value = "/project/{idProject}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject,@ApiParam(value = "Project to delete"  )  @Valid @RequestBody Project project);

    @ApiOperation(value = "searches all Projects", nickname = "searchProjects", notes = "By passing in the appropriate options, you can search for available inventory in the system ", response = Project.class, responseContainer = "List", tags={ "developers","managers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Project.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/project",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    @ResponseBody List<Project> searchProjects();

    @ApiOperation(value = "searches a Project", nickname = "searchProject", notes = "By passing in the appropriate options, you can search for available inventory in the system ", response = Project.class, responseContainer = "List", tags={ "developers","managers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Project.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/project/{idProject}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Project> searchProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject);


    @ApiOperation(value = "update a Project", nickname = "updateProject", notes = "update a Project to the system", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Project updated"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item does not exists") })
    @RequestMapping(value = "/project/{idProject}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject,@ApiParam(value = "Project to update"  )  @Valid @RequestBody Project project);

}
