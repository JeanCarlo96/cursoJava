package com.example.demo;

import com.example.demo.model.Liga;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguracion {

    @Bean
    public Liga liga(){
        return new Liga();
    }

}
