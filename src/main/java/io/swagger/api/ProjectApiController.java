package io.swagger.api;

import io.swagger.model.Project;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.dao.ProjectDao;
import io.swagger.dao.ProjectDaoImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T19:00:55.531Z")

@Controller
public class ProjectApiController implements ProjectApi {

    private static final Logger log = LoggerFactory.getLogger(ProjectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProjectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject,@ApiParam(value = "Project to add"  )  @Valid @RequestBody Project project) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject,@ApiParam(value = "Project to delete"  )  @Valid @RequestBody Project project) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Project> searchProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            /*try {
                //return new ResponseEntity<Project>(objectMapper.readValue("[ {  \"idProject\" : \"1709121\",  \"name\" : \"Migracion\",  \"type\" : \"OC\",  \"status\" : \"DesarrolloOK\",  \"artifacts\" : [ {    \"application\" : {      \"name\" : \"Migracion\",      \"idApplication\" : \"OSM\",      \"type\" : \"OSS\"    },    \"name\" : \"CartridgeTV\",    \"description\" : \"OSS\",    \"idArtifact\" : \"Cartridge\"  }, {    \"application\" : {      \"name\" : \"Migracion\",      \"idApplication\" : \"OSM\",      \"type\" : \"OSS\"    },    \"name\" : \"CartridgeTV\",    \"description\" : \"OSS\",    \"idArtifact\" : \"Cartridge\"  } ]}, {  \"idProject\" : \"1709121\",  \"name\" : \"Migracion\",  \"type\" : \"OC\",  \"status\" : \"DesarrolloOK\",  \"artifacts\" : [ {    \"application\" : {      \"name\" : \"Migracion\",      \"idApplication\" : \"OSM\",      \"type\" : \"OSS\"    },    \"name\" : \"CartridgeTV\",    \"description\" : \"OSS\",    \"idArtifact\" : \"Cartridge\"  }, {    \"application\" : {      \"name\" : \"Migracion\",      \"idApplication\" : \"OSM\",      \"type\" : \"OSS\"    },    \"name\" : \"CartridgeTV\",    \"description\" : \"OSS\",    \"idArtifact\" : \"Cartridge\"  } ]} ]"), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Project>(HttpStatus.INTERNAL_SERVER_ERROR);
            }*/
        }

        return new ResponseEntity<Project>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateProject(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idProject") String idProject,@ApiParam(value = "Project to update"  )  @Valid @RequestBody Project project) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

	@Override
	public List<Project> searchProjects() {
		ProjectDao pdao = new ProjectDaoImp();
		return pdao.getAllProjects();
	}

}
