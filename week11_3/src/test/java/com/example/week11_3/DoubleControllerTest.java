package com.example.week11_3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DoubleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testDoubleNumberEndpoint() throws Exception {
        this.mockMvc.perform(get("/double?number=6"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("12"));
    }
}

