package com.example.random.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = Controller.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(SpringExtension.class)
class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturn200OnSuccess() throws Exception {
        mockMvc.perform(get("/hello"))
               .andExpect(status().isOk());
    }

    @Test
    void shouldReturnBodyWithResponse() throws Exception {
        mockMvc.perform(get("/hello"))
               .andExpect(content().string("Hello there."));
    }
}