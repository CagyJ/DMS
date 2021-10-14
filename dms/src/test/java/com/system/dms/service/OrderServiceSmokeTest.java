package com.system.dms.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class OrderServiceSmokeTest {

    @Resource
    private OrderService orderService;

    @Test
    void testNull(){
        assertThat(orderService).isNotNull();
    }
}
