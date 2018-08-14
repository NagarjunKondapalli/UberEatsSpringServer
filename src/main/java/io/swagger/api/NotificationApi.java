package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Notifications;
import io.swagger.model.Order;
import io.swagger.model.Restaurant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Api(value = "Notification", description = "the Notification API")
public interface NotificationApi
{
    @ApiOperation(value = "Finds all Notifications", nickname = "findAllNotifications", notes = "Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.", response = Notifications.class, responseContainer = "List", authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                    @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                    @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
    }, tags={ "Notification", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Notifications.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid tag value") })
    @RequestMapping(value = "/notification",
            produces = { "application/xml", "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Notifications>> getAllNotification();
}
