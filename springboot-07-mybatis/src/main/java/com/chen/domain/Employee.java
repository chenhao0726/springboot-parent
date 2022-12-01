package com.chen.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private Integer gender;
    private String phone;
    private BigDecimal salary;
    private String address;
    private Long dept_id;
}
