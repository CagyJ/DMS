package com.system.dms.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerHttpRequestTest {
    private static String JSON = """
            {
                "cars": [
                    {
                        "id": 1,
                        "carLicense": "a123",
                        "driverName": "Jack",
                        "driverPhonenumber": 12345678,
                        "status": "free",
                        "driverAddress": "budapest",
                        "driverIdNumber": "b123"
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
        assertThat(testRestTemplate
                .getForObject("http://localhost:"+port+"/car/all", Map.class)
                .toString()
                .equals(JSON));
    }


}
