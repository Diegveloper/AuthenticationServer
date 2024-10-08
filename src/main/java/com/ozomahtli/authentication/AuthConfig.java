package com.ozomahtli.authentication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthConfig {
    @Value("${app.secret_key}")
    private String secretKey;

    @Bean
    public JwtUtils jwtUtils(){


        return new JwtUtils(this.secretKey);
    }
}
