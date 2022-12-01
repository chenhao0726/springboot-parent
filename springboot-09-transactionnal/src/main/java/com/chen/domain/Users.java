package com.chen.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Long id;
    private String name;
    private String password;
    private Integer gender;
    private Integer age;
    private Integer permissions_id;

}
