package com.goldnet.duty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.goldnet.duty.mapper")
public class DutyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DutyApplication.class, args);
    }

}
