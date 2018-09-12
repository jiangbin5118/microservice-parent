package com.microservice.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jiangbin on 2017/8/15.
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
  }

}
