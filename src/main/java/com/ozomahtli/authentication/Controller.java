package com.ozomahtli.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    AuthService service;

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody Credentials credentials){
        System.out.println("username " + credentials.username());
        return service.getToken();
    }

    @GetMapping("/authenticate/{token}")
    public String isAuthenticated(@PathVariable("token") String token){
        System.out.println("user"+ service.getUser(token));

        return "valid";
    }
}

record Credentials(String username, String password) {}