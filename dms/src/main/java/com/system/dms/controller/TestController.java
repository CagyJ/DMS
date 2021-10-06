package com.system.dms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  @GetMapping("/")
  @ResponseBody
  public String test() {
    return "<h1>Hello World!</h1>";
  }

  // TODO for MWH: create your first response!
  // do the similar thing as above, inside @GetMapping, you should write your name down, like /mwh
  // and return a block of html code or just string, whatever you like
  // finally, run the application and test your response, aka. response! (if your write /mwh into @GetMapping, you should enter localhost:8080/mwh to get your page!)

}
