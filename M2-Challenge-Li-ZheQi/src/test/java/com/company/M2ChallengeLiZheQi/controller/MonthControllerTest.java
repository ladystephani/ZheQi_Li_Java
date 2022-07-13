package com.company.M2ChallengeLiZheQi.controller;

import com.company.M2ChallengeLiZheQi.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // Convert JSON
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void SetUp() {}
    //GET one
    //throws Exception works with mockMvc.perform
    @Test
    public void shouldReturnMonthByNumber() throws Exception {
        //arrange
        Month expectedMonth = new Month(1, "January");

        //act
        String expectedJson = mapper.writeValueAsString(expectedMonth);

        //perform on mock data
        mockMvc.perform(get("/month/1"))
                .andDo(print())
                //actually checking
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }


    @Test
    public void shouldReturn422StatusCodeWhenInputNumberOutOfRange() throws Exception {

//        //perform
        mockMvc.perform(get("/month/0"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    //GET a random month
    @Test
    public void shouldReturnARandomMonth() throws Exception {
        //arrange
        Month inputMonth = new Month();
        inputMonth.setNumber(1);
        inputMonth.setName("January");

        //perform
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value(inputMonth.getNumber()))
                .andExpect(jsonPath("$.name").value(inputMonth.getName()));
    }
}