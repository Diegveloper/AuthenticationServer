package com.ozomahtli.authentication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/authenticate")
    public String authenticate(@RequestBody Credentials credentials){
        System.out.println("username " + credentials.username());
        return "Authentication successful";
    }
}

record Credentials(String username, String password) {}