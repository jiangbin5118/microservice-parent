package com.microservice.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangbin on 2018/1/9
 */
@RestController
@RequestMapping("user")
public class UserController {

  private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private Registration registration;

  @GetMapping("current")
  public String getCurrentUser() {
    LOG.debug("ServiceId:{}, Host:{}, Port:{}", registration.getServiceId(), registration.getHost(),
        registration.getPort());
    return "Hello World";
  }

}
