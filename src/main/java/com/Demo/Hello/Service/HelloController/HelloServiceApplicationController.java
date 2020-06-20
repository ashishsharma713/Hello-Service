package com.Demo.Hello.Service.HelloController;

import com.Demo.Hello.Service.ResponseEntity.StringResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloServiceApplicationController {


    @Autowired
    private StringResponse resp;
    @GetMapping(path = "hello", produces = "application/json")
    public ResponseEntity<?> getHello()
    {

        resp.setResponse("Hello");

       return new ResponseEntity<StringResponse>(resp,HttpStatus.OK);
    }
}
