package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.beans.BeanImpl;
import com.fundamentosplatzi.springboot.fundamentos.beans.IBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
    @Bean
    public IBean beanOperation(){
        return new BeanImpl();
    }
}
