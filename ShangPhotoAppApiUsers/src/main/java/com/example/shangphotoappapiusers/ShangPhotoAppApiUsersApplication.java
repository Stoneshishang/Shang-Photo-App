package com.example.shangphotoappapiusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShangPhotoAppApiUsersApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShangPhotoAppApiUsersApplication.class, args);
    }

}
