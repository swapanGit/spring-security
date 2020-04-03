package com.example.springsecurityldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String show() {

         return ("<h1>HelloController </h1>");
    }


}
