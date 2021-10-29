package com.system.dms.service;

import static org.assertj.core.api.Assertions.assertThat;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceSmokeTest {

  @Resource
  private UserService userService;

  @Test
  void testNull() {
    assertThat(userService).isNotNull();
  }
}