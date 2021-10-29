package com.system.dms.localtest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerHttpRequestTest {

  private static String JSON = "{user={id=1, username=admin, password=admin}}";

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate testResttemplate;

  @Test
  void testFindById() {
    assertThat(testResttemplate
        .getForObject("http://localhost:" + port + "/user/find?id=1", Map.class)
        .toString()
        .equals(JSON))
      .isTrue();
  }



}
