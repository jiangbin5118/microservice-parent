package com.microservice.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jiangbin on 2017/8/15.
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(GatewayApplication.class).web(true).run(args);
  }

}
