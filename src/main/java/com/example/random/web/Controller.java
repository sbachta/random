package com.example.random.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello there.");
    }
}
