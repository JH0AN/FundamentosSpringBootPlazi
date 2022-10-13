package com.fundamentosplatzi.springboot.fundamentos.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@ConfigurationProperties(prefix = "user")
@ConstructorBinding
public class UserPojo {
    private String email;
    private String password;
    private String age;
}
