package org.jbcnconf.realtime.processor.api;

import org.jbcnconf.realtime.processor.kafka.MessageEventProducer;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.jbcnconf.realtime.processor.model.Event;
import org.jbcnconf.realtime.processor.process.StockCalculation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-30T14:31:01.066Z[GMT]")
@Controller
public class EventsApiController implements EventsApi {

    private static final Logger log = LoggerFactory.getLogger(EventsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Value( "${spring.coherence.stock}" )
    private String cacheName;

    @Autowired
    MessageEventProducer producer;

    @Autowired
    StockCalculation stockCalculation;

    @org.springframework.beans.factory.annotation.Autowired
    public EventsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> eventsPost(@ApiParam(value = "The event to create."  )  @Valid @RequestBody Event body) {

        try{
            String accept = request.getHeader("Accept");
            stockCalculation.processStock(body.getStoreId(), body.getSku(), body.getFrom(), body.getTo(),cacheName);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
