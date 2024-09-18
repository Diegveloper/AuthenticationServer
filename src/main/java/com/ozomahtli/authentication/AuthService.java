package com.ozomahtli.authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {


    @Autowired
    private JwtUtils jwt;

    public boolean valid(String user, String password){
        //DON'T DO THIS
        return user.equals("diego") && password.equals("1234");

    }
    public String getToken(){
        return jwt.generateToken("diegolin");
    }

    public String getUser(String token){
        return jwt.extractUsername( token);
    }
}

