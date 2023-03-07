package com.example.temas456;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/helloworld")
    public String helloWorld(){
        return "Hello World";
    }
}
