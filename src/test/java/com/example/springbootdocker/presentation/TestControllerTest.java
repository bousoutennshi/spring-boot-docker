package com.example.springbootdocker.presentation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(TestController.class)
class TestControllerTest {
    @Autowired
    private TestController testController;

    @Test
    void test_指定の文字が返ってくる事() {
        final String expected = "Hello Docker World";
        final String actual = testController.test();
        assertEquals(expected, actual);
    }
}
