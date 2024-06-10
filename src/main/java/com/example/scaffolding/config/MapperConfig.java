package com.example.scaffolding.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**La anotación @Configuration indica que esta clase es una fuente de definiciones de Beans
 * para el contexto de la aplicación. Los métodos anotados con @Bean producen un Bean que es administrado
 * por el contenedor de Spring.
 * **/
@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    /**
    Esta anotacion se utiliza para indicar cual es el nombre que tendra un Bean.
    De esta manera podemos tener mas de Bean del mismo tipo en el ApplicationContext
    **/
    @Bean("mergerMapper")
    public ModelMapper mergerMapper(){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        return mapper;
    }

    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); //Convierte el formato fecha de Player
        return objectMapper;
    }

    /**La clase MapperConfig en el paquete com.example.demo.configs tiene la función de configurar y proveer
     * Beans de mapeo para la aplicación Spring, incluyendo ModelMapper y ObjectMapper.
     * Estos Beans son utilizados para transformar objetos entre diferentes clases y manejar
     * la serialización y deserialización de objetos JSON
     *
     * En resumen, MapperConfig configura y expone Beans que facilitan la conversión de objetos y
     * la manipulación de datos JSON dentro de una aplicación Spring.**/
}
