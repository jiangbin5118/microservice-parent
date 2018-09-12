package com.microservice.user;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author jiangbin on 2017/8/15.
 */
@SpringCloudApplication
public class ServiceUserApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(ServiceUserApplication.class).web(true).run(args);
  }

}
