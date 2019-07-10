package com.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: CloudProject
 * @Date: 2019/7/10 10:03
 * @Author: Mr.Deng
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication_6001 {
 public static void main(String[] args) {
  SpringApplication.run(EurekaApplication_6001.class, args);
 }
}
