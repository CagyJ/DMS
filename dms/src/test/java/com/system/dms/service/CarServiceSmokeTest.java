package com.system.dms.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CarServiceSmokeTest {

    @Resource
    private CarService carService;

    @Test
    void testNull(){
        assertThat(carService).isNotNull();
    }

}
