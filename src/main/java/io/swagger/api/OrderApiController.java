package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.Service.OrderService;
import io.swagger.annotations.ApiParam;
import io.swagger.model.UberOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")

@Controller
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(StoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private OrderService orderService;

    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    public ResponseEntity<Void> addOrder(@ApiParam(value = "restaurant object that needs to be added to the store" ,required=true )  @Valid @RequestBody UberOrder body) {
        String accept = request.getHeader("Accept");
        orderService.addOrder(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
