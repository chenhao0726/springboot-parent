package com.chen.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
//@ConfigurationProperties(prefix = "user")
public class User {

    private String username;
    private String password;
    private Integer age;

}
