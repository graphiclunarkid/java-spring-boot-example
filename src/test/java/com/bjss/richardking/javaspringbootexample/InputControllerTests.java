package com.bjss.richardking.javaspringbootexample;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.bjss.richardking.javaspringbootexample.controllers.InputController;
import com.bjss.richardking.javaspringbootexample.controllers.InputService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(InputController.class)
public class InputControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private InputService service;

    @Test
    public void inputShouldReturnMessageFromService() throws Exception {
        when(service.input()).thenReturn("Hello, input!");

        this.mockMvc.perform(get("/input")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, input!")));
    }
}
