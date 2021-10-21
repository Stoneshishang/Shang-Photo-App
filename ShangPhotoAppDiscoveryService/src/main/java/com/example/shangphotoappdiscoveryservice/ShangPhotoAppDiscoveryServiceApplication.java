package com.example.shangphotoappdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShangPhotoAppDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShangPhotoAppDiscoveryServiceApplication.class, args);
    }

}
