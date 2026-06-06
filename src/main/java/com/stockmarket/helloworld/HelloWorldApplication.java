package com.stockmarket.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}

// Deploy this app in three place
// 1. Heroku
// 2. Next, learn Docker → package your app so it can run anywhere.
// 3. Finally, move to AWS/Azure/GCP → practice deploying Dockerized apps to cloud VMs or managed services.
