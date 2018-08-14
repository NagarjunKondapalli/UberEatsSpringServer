package io.swagger.api;

import io.swagger.annotations.*;

import io.swagger.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Api(value = "order", description = "the order API")
public interface OrderApi {

    @ApiOperation(value = "Add a Order", nickname = "addOrder", notes = "", authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                    @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                    @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
    }, tags={ "order", })
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/order",
            produces = { "application/xml", "application/json" },
            consumes = { "application/json", "application/xml" },
            method = RequestMethod.POST)
    ResponseEntity<Void> addOrder(@ApiParam(value = "dish object that needs to be added to the store" ,required=true )  @Valid @RequestBody Order body);
}
