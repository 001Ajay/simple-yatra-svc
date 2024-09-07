package com.adas.simple_yatra_svc.config;

import com.adas.simple_yatra_svc.mapper.ModelMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    ModelMapper getModelMapper(){
        return Mappers.getMapper(ModelMapper.class);
    }
}
