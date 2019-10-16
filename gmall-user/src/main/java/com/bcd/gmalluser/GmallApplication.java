package com.bcd.gmalluser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 17
 */

@SpringBootApplication
@MapperScan(basePackages = "com.bcd.gmalluser.mapper")
public class GmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallApplication.class, args);
    }
}
