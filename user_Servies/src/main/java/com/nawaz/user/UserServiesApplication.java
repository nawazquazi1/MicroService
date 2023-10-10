package com.nawaz.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author nawaz
 */
@SpringBootApplication
//@EnableFeignClients
public class UserServiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiesApplication.class, args);
    }

}
