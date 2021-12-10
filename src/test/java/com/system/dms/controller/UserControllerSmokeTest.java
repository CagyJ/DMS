package com.system.dms.controller;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserControllerSmokeTest {

  @Resource
  private UserController userController;

  @Test
  void testNull() {
    assertThat(userController).isNotNull();
  }

}