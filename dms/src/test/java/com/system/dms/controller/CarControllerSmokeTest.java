package com.system.dms.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CarControllerSmokeTest {
    @Resource
    private CarController carController;

    @Test
    void testNull(){assertThat(carController).isNotNull();}
}
