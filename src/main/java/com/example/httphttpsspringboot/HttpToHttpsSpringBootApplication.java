package com.example.httphttpsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpToHttpsSpringBootApplication {

    @GetMapping("/test")
    public String test(){
        return  "*-----This is just a example----*";
    }

    //


    public static void main(String[] args) {
        SpringApplication.run(HttpToHttpsSpringBootApplication.class, args);
    }

}
