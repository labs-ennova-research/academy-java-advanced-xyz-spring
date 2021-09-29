package com.ennova_research.academy.xyzspring.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author Alberto Ielpo
 */
@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public ResponseEntity<String> sayHello() {
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode user = mapper.createObjectNode();
		user.put("msg", "Hello world");		
        
        return new ResponseEntity<String>(user.toString(), httpHeaders, HttpStatus.OK);
    }
    
}