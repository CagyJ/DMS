package com.system.dms.localtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerHttpRequestTest {
    private static String JSON = "{car={id=1, carLicense=a123, driverName=Jack, driverPhonenumber=12345678, status=free, driverAddress=budapest, driverIdNumber=b123}}";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void testFindById(){
        assertThat(testRestTemplate
                .getForObject("http://localhost:"+port+"/car/find?id=1", Map.class)
                .toString()
                .equals(JSON))
            .isTrue();
    }


}
