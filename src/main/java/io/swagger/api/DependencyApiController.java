package io.swagger.api;

import io.swagger.model.Dependency;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
public class DependencyApiController implements DependencyApi {

    private static final Logger log = LoggerFactory.getLogger(DependencyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DependencyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addDependency(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idApplication") String idApplication,@ApiParam(value = "Dependency to add"  )  @Valid @RequestBody Dependency dependency) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDependency(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idApplication") String idApplication,@ApiParam(value = "Dependency to delete"  )  @Valid @RequestBody Dependency dependency) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Dependency>> searchDependencyApp(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idApplication") String idApplication) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Dependency>>(objectMapper.readValue("[ {  \"idDependency\" : \"1234\",  \"name\" : \"CartridgeTV\",  \"description\" : \"OSS\",  \"project\" : {    \"idProject\" : \"1709121\",    \"name\" : \"Migracion\",    \"type\" : \"OC\",    \"status\" : \"DesarrolloOK\",    \"artifacts\" : [ {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    }, {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    } ]  },  \"projecttDep\" : [ {    \"idProject\" : \"1709121\",    \"name\" : \"Migracion\",    \"type\" : \"OC\",    \"status\" : \"DesarrolloOK\",    \"artifacts\" : [ {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    }, {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    } ]  }, {    \"idProject\" : \"1709121\",    \"name\" : \"Migracion\",    \"type\" : \"OC\",    \"status\" : \"DesarrolloOK\",    \"artifacts\" : [ {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    }, {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    } ]  } ]}, {  \"idDependency\" : \"1234\",  \"name\" : \"CartridgeTV\",  \"description\" : \"OSS\",  \"project\" : {    \"idProject\" : \"1709121\",    \"name\" : \"Migracion\",    \"type\" : \"OC\",    \"status\" : \"DesarrolloOK\",    \"artifacts\" : [ {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    }, {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    } ]  },  \"projecttDep\" : [ {    \"idProject\" : \"1709121\",    \"name\" : \"Migracion\",    \"type\" : \"OC\",    \"status\" : \"DesarrolloOK\",    \"artifacts\" : [ {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    }, {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    } ]  }, {    \"idProject\" : \"1709121\",    \"name\" : \"Migracion\",    \"type\" : \"OC\",    \"status\" : \"DesarrolloOK\",    \"artifacts\" : [ {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    }, {      \"application\" : {        \"name\" : \"Migracion\",        \"idApplication\" : \"OSM\",        \"type\" : \"OSS\"      },      \"name\" : \"CartridgeTV\",      \"description\" : \"OSS\",      \"idArtifact\" : \"Cartridge\"    } ]  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Dependency>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Dependency>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDependency(@ApiParam(value = "pass an optional search string for looking up requirement",required=true) @PathVariable("idApplication") String idApplication,@ApiParam(value = "Dependency to update"  )  @Valid @RequestBody Dependency dependency) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
