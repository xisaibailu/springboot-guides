package com.xsbl.authenticatingldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:
 * @创建人: Isaac
 * @创建日期: 2020/6/30 14:48
 */
@RestController
public class HomeController {

  @GetMapping("/")
  public String index(){
    return "Welcome to the home page!";
  }
}
