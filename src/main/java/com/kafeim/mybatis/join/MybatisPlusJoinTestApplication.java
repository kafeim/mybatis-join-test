package com.kafeim.mybatis.join;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@MapperScan(basePackages = {"com.kafeim.mybatis.join.fluent.mapper" , "com.kafeim.mybatis.join.mapper"})
@ComponentScan(basePackages = { "com.kafeim.mybatis.join" , "com.kafeim.mybatisplus.join"  })
public class MybatisPlusJoinTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusJoinTestApplication.class, args);
    }

}
