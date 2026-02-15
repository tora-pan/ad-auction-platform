package com.torapan.adauction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AdauctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdauctionApplication.class, args);
    }

}
