package com.bjss.richardking.javaspringbootexample;

import static org.assertj.core.api.Assertions.assertThat;

import com.bjss.richardking.javaspringbootexample.controllers.ExampleController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private ExampleController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}