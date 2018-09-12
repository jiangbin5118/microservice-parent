package com.microservice.user.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiangbin on 2018/1/9
 */
@RestController
@RequestMapping("service/user")
public class UserClient {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("consumerCurrentUser")
  @HystrixCommand(fallbackMethod = "addServiceFallback")
  public String consumerCurrentUser() {
    return restTemplate.getForEntity("http://MICROSERVICE-SERVICE-USER/user/current", String.class).getBody();
  }

  public String addServiceFallback() {
    return "error";
  }
}
