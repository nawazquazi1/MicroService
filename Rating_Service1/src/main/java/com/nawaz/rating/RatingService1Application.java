package com.nawaz.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author nawaz
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RatingService1Application {

    public static void main(String[] args) {
        SpringApplication.run(RatingService1Application.class, args);
    }

}
