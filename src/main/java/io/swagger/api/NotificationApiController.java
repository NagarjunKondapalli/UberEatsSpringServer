package io.swagger.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.Service.NotificationService;
import io.swagger.Service.OrderService;
import io.swagger.annotations.ApiParam;
import io.swagger.model.Notifications;
import io.swagger.model.Restaurant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")

@Controller
public class NotificationApiController implements NotificationApi
{
    private static final Logger log = LoggerFactory.getLogger(StoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private NotificationService notificationService;

    public NotificationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    public ResponseEntity<List<Notifications>> getAllNotification() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {

                return new ResponseEntity<List<Notifications>>(objectMapper.readValue("<Restaurant>  <id>123</id>  <Name>aeiou</Name>  <CategoryId>123</CategoryId>  <streetNameNumber>aeiou</streetNameNumber>  <postalCode>aeiou</postalCode>  <City>aeiou</City>  <Province>aeiou</Province></Restaurant>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Notifications>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) try {

            List<Notifications> notifications=notificationService.getAllNotification();
            return new ResponseEntity<List<Notifications>>((List<Notifications>) objectMapper.readValue(objectMapper.writeValueAsString(notifications),new TypeReference<List<Notifications>>() {}),HttpStatus.OK);
            //return new ResponseEntity<List<Restaurant>>(objectMapper.readValue("[ {  \"CategoryId\" : 6,  \"streetNameNumber\" : \"streetNameNumber\",  \"postalCode\" : \"postalCode\",  \"id\" : 0,  \"City\" : \"City\",  \"Province\" : \"Province\",  \"Name\" : \"Name\"}, {  \"CategoryId\" : 6,  \"streetNameNumber\" : \"streetNameNumber\",  \"postalCode\" : \"postalCode\",  \"id\" : 0,  \"City\" : \"City\",  \"Province\" : \"Province\",  \"Name\" : \"Name\"} ]", List.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Notifications>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<List<Notifications>>(HttpStatus.OK);
    }
    }

