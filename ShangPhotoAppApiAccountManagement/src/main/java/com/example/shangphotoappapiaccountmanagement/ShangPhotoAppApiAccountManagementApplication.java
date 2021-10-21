package com.example.shangphotoappapiaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShangPhotoAppApiAccountManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShangPhotoAppApiAccountManagementApplication.class, args);
    }

}
