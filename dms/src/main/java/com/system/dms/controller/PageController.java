package com.system.dms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

  @GetMapping("/")
  public String index() {
    return "index.html";
  }

  @GetMapping("cars")
  public String cars() {
    return "cars.html";
  }

  @GetMapping("orders")
  public String orders() {
    return "orders.html";
  }

  @GetMapping("histories")
  public String histories() {
    return "histories.html";
  }
}
