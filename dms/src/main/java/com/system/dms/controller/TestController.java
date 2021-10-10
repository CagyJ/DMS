package com.system.dms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  @GetMapping("/")
  public String index() {
    return "index.html";
  }

  @GetMapping("/MWH")
  public String testMWH(){
    return "testMWH.html";
  }

  @GetMapping("/mwh")
  @ResponseBody
  public String Testmwh(){
    return "Hello, i am the test!";
  }
}
