package com.imode.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/")
public class HomeController {

    @GetMapping("/helloworld")
    public String HelloWorld()
    {
        return "Hello World";
    }


}
