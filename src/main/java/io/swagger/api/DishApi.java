package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Dishes;
import io.swagger.model.Restaurant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Api(value = "Notification", description = "the Notification API")
public interface DishApi
{
    @ApiOperation(value = "Add a dish", nickname = "addDish", notes = "", authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                    @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                    @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
    }, tags={ "dish", })
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/dish",
            produces = { "application/xml", "application/json" },
            consumes = { "application/json", "application/xml" },
            method = RequestMethod.POST)
    ResponseEntity<Void> addDish(@ApiParam(value = "dish object that needs to be added to the store" ,required=true )  @Valid @RequestBody Dishes body);
}
