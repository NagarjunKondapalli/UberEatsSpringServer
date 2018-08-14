package io.swagger.api;

import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.Service.RestuarantService;
import io.swagger.model.Restaurant;
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
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")

@Controller
public class StoreApiController implements StoreApi {

    private static final Logger log = LoggerFactory.getLogger(StoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private RestuarantService restuarantService;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addrestaurant(@ApiParam(value = "restaurant object that needs to be added to the store" ,required=true )  @Valid @RequestBody Restaurant body) {
        String accept = request.getHeader("Accept");
        restuarantService.addRestaurant(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteStore(@ApiParam(value = "Restaurant id to delete",required=true) @PathVariable("id") Integer id,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        restuarantService.deleteRestaurant(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Restaurant>> findAllRestarants() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {

                return new ResponseEntity<List<Restaurant>>(objectMapper.readValue("<Restaurant>  <id>123</id>  <Name>aeiou</Name>  <CategoryId>123</CategoryId>  <streetNameNumber>aeiou</streetNameNumber>  <postalCode>aeiou</postalCode>  <City>aeiou</City>  <Province>aeiou</Province></Restaurant>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) try {

           List<Restaurant> restaurants=restuarantService.getAllStores();
            return new ResponseEntity<List<Restaurant>>((List<Restaurant>) objectMapper.readValue(objectMapper.writeValueAsString(restaurants),new TypeReference<List<Restaurant>>() {}),HttpStatus.OK);
            //return new ResponseEntity<List<Restaurant>>(objectMapper.readValue("[ {  \"CategoryId\" : 6,  \"streetNameNumber\" : \"streetNameNumber\",  \"postalCode\" : \"postalCode\",  \"id\" : 0,  \"City\" : \"City\",  \"Province\" : \"Province\",  \"Name\" : \"Name\"}, {  \"CategoryId\" : 6,  \"streetNameNumber\" : \"streetNameNumber\",  \"postalCode\" : \"postalCode\",  \"id\" : 0,  \"City\" : \"City\",  \"Province\" : \"Province\",  \"Name\" : \"Name\"} ]", List.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<List<Restaurant>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Restaurant>> findStoreByLocation(@NotNull @ApiParam(value = "Postalcode that need to be considered for filter", required = true) @Valid @RequestParam(value = "postalCode", required = true) String postalCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {

                return new ResponseEntity<List<Restaurant>>(objectMapper.readValue("<Restaurant>  <id>123</id>  <Name>aeiou</Name>  <CategoryId>123</CategoryId>  <streetNameNumber>aeiou</streetNameNumber>  <postalCode>aeiou</postalCode>  <City>aeiou</City>  <Province>aeiou</Province></Restaurant>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                List<Restaurant> restaurants=restuarantService.findRestaurantByLocation(postalCode);
                return new ResponseEntity<List<Restaurant>>((List<Restaurant>) objectMapper.readValue(objectMapper.writeValueAsString(restaurants),new TypeReference<List<Restaurant>>() {}),HttpStatus.OK);
                //return new ResponseEntity<List<Restaurant>>(objectMapper.readValue("[ {  \"CategoryId\" : 6,  \"streetNameNumber\" : \"streetNameNumber\",  \"postalCode\" : \"postalCode\",  \"id\" : 0,  \"City\" : \"City\",  \"Province\" : \"Province\",  \"Name\" : \"Name\"}, {  \"CategoryId\" : 6,  \"streetNameNumber\" : \"streetNameNumber\",  \"postalCode\" : \"postalCode\",  \"id\" : 0,  \"City\" : \"City\",  \"Province\" : \"Province\",  \"Name\" : \"Name\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Restaurant>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Restaurant>> getrestaurantByCategory(@ApiParam(value = "category of restaurents that needs to be fetched",required=true) @PathVariable("Name") String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Restaurant>>((List<Restaurant>) objectMapper.readValue("<Restaurant>  <id>123</id>  <Name>aeiou</Name>  <CategoryId>123</CategoryId>  <streetNameNumber>aeiou</streetNameNumber>  <postalCode>aeiou</postalCode>  <City>aeiou</City>  <Province>aeiou</Province></Restaurant>", Restaurant.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                List<Restaurant> restaurants=restuarantService.getrestaurantByCategory(name);
                return new ResponseEntity<List<Restaurant>>((List<Restaurant>) objectMapper.readValue(objectMapper.writeValueAsString(restaurants),new TypeReference<List<Restaurant>>() {}),HttpStatus.OK);

                //return new ResponseEntity<Restaurant>((List<Restaurant>)objectMapper.readValue(objectMapper.writeValueAsString(restaurants),new TypeReference<List<Restaurant>>() {}), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Restaurant>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateRestaurant(@ApiParam(value = "category object that needs to be updated to the store" ,required=true )  @Valid @RequestBody Restaurant body) {
        String accept = request.getHeader("Accept");
        restuarantService.updateRestaurant(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
