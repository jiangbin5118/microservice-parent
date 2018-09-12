package com.microservice.management;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author jiangbin on 2018/1/18
 */
@EnableAdminServer
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class ManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManagementApplication.class, args);
  }

}
