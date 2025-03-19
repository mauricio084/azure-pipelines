package com.cloudadvocate.azure.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by MRomeh on 08/08/2017.
 */
@RestController
@RequestMapping("/api/v1")
public class ApplicationController {


    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }

}
