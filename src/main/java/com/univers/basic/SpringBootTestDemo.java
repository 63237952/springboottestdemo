package com.univers.basic;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
//扫描指定包下的@Mapper注解，创建mapper的代理实现类
@MapperScan("com.univers.basic.mapper")
public class SpringBootTestDemo {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestDemo.class);
    }
}
