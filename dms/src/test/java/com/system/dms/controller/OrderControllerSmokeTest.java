package com.system.dms.controller;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class OrderControllerSmokeTest {
    @Resource
    private  OrderController orderController;

    @Test
    void testNull(){assertThat(orderController).isNotNull();}
}
