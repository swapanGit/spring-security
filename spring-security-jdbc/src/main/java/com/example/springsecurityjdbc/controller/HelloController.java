package com.example.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String show() {
        return ("<h1>HelloController </h1>");
    }

    @GetMapping("/user")
    public String showUser() {
        return ("<h1>HelloController User</h1>");
    }

    @GetMapping("/admin")
    public String showAdmin() {
        return ("<h1>HelloController Admin</h1>");
    }
}
