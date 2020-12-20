package com.ankat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "resourceController")
public class ResourceController {

    @GetMapping(value = "/")
    public String defaultPage(){
        return "Hello World";
    }

    @GetMapping(value = "/admin")
    public String defaultAdminPage(){
        return "Hello World Admin";
    }

    @GetMapping(value = "/user")
    public String defaultUserPage(){
        return "Hello World User";
    }
}
