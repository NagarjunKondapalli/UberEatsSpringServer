package io.swagger.api;

import io.swagger.Service.CategoryService;
import io.swagger.model.Categories;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")

@Controller
public class CategoryApiController implements CategoryApi {

    @Autowired
    private CategoryService categoryService;

    private static final Logger log = LoggerFactory.getLogger(CategoryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CategoryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addCategory(@ApiParam(value = "category object that needs to be added to the store" ,required=true )  @Valid @RequestBody Categories body) {
        String accept = request.getHeader("Accept");
        categoryService.addCategory(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCategory(@ApiParam(value = "Category id to delete",required=true) @PathVariable("id") Integer id)
    //,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey
    {
        String accept = request.getHeader("Accept");
        categoryService.deleteCategory(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCategory(@ApiParam(value = "category object that needs to be updated to the store" ,required=true )  @Valid @RequestBody Categories body) {
        String accept = request.getHeader("Accept");
        categoryService.updateCategory(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
