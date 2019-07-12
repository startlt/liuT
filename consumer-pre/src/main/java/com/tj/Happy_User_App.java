package com.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        exclude = {DataSourceAutoConfiguration.class}
)
@EnableEurekaClient
@EnableFeignClients
public class Happy_User_App {
    public static void main(String[] args) {
        SpringApplication.run(Happy_User_App.class, args);
    }
}
