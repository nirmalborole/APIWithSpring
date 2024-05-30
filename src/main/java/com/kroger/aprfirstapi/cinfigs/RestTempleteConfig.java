package com.kroger.aprfirstapi.cinfigs;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempleteConfig {
    @Bean
    public RestTemplate getRestTemplete(){
        return new RestTemplate();
    }
}
