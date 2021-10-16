package com.system.dms.controller;

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerHttpRequestTest {

    private static String JSON = """
            {
                "orders": [
                    {
                        "id": 1,
                        "name": "test",
                        "origin": "budapest",
                        "destination": "german",
                        "car_license": null,
                        "product_weight": 0.0,
                        "status": "completed"
                    }
                ]
            }
            """;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void testListAll(){
//        assertThat(testRestTemplate
//                .getForObject("http://localhost:"+port+"/user/all", Map.class)
//                .toString()
//                .equals(JSON));
    }

}
