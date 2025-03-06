package com.krm.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration     //automatically executed its like pre-condition
public class ConfigClass {

    @Bean
    public ModelMapper getMapper() {
        return new ModelMapper();
    }
}
