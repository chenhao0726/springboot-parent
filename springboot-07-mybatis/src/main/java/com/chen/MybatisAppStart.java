package com.chen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan("com.chen.mapper") // mapper接口扫描
public class MybatisAppStart implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(MybatisAppStart.class, args);
    }

}
