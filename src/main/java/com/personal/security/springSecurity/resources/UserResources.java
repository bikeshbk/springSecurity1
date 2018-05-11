package com.personal.security.springSecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserResources {

    @GetMapping("/users")
    public String getUsers(){
        return "Ram Parsad";
    }
}
