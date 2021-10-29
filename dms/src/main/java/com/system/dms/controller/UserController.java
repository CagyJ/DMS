package com.system.dms.controller;

import com.system.dms.entity.User;
import com.system.dms.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/all")
  @ResponseBody
  public Map list() {
    List<User> users = userService.listAll();
    HashMap map = new HashMap();
    map.put("users", users);
    return map;
  }

  @GetMapping("/find")
  @ResponseBody
  public Map find(Integer id) {
    User user = userService.findById(id);
    HashMap map = new HashMap();
    map.put("user", user);
    return map;
  }
}
