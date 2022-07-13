package com.company.M2ChallengeLiZheQi.controller;

import com.company.M2ChallengeLiZheQi.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)

public class MathSolutionControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private MathSolutionController mathSolutionController;
    // Convert JSON
    private ObjectMapper mapper = new ObjectMapper();
//    private WebApplicationContext webApplicationContext;
    @Before
    public void setup() {

    }

    @Test
    public void shouldReturnAddedResultInResponseBody() throws Exception {
        //arrange
        MathSolution inputAnswer = new MathSolution(1,2,"add");
        MathSolution expectedAnswer = new MathSolution(1,2,"add", 3);
//        MathSolution inputAnswer = new MathSolution();
//        inputAnswer.setOperand1(1);
//        inputAnswer.setOperand2(2);
//        inputAnswer.setOperation("add");
//        inputAnswer.setAnswer(3);

//        MathSolution outputAnswer = new MathSolution();
//        outputAnswer.setOperand1(inputAnswer.getOperand1());
//        outputAnswer.setOperand2(inputAnswer.getOperand2());
//        outputAnswer.setOperation(inputAnswer.getOperation());
//        outputAnswer.setAnswer(inputAnswer.getOperand1() + inputAnswer.getOperand2());

        //act
        String inputJson = mapper.writeValueAsString(inputAnswer);
        String expectedJson = mapper.writeValueAsString(expectedAnswer);

        //perform
        mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(expectedJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfAdditionMissingOperandsOrNotInt() throws Exception {
        MathSolution inputAnswer = new MathSolution();
        inputAnswer.setOperand2(2);
        inputAnswer.setOperation("add");

        String inputJson = mapper.writeValueAsString(inputAnswer);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnSubtractionResultInResponseBody() throws Exception {
        //arrange
        MathSolution inputAnswer = new MathSolution(10,2,"subtract");
        MathSolution expectedAnswer = new MathSolution(10,2,"subtract", 8);
        //act
        String inputJson = mapper.writeValueAsString(inputAnswer);
        String expectedJson = mapper.writeValueAsString(expectedAnswer);

        //perform
        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(expectedJson));
    }

    @Test
    public void shouldReturn422StatusCodeIfSubtractionMissingOperandsOrNotInt() throws Exception {
        MathSolution inputAnswer = new MathSolution();
        inputAnswer.setOperand2(2);
        inputAnswer.setOperation("subtract");

        String inputJson = mapper.writeValueAsString(inputAnswer);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnMultiplicationResultInResponseBody() throws Exception {
        //arrange
        MathSolution inputAnswer = new MathSolution(10,2,"multiply");
        MathSolution expectedAnswer = new MathSolution(10,2,"multiply", 8);
        //act
        String inputJson = mapper.writeValueAsString(inputAnswer);
        String expectedJson = mapper.writeValueAsString(expectedAnswer);

        //perform
        mockMvc.perform(post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(expectedJson));
    }
    @Test
    public void shouldReturn422StatusCodeIfMultiplicationMissingOperandsOrNotInt() throws Exception {
        MathSolution inputAnswer = new MathSolution();
        inputAnswer.setOperand2(2);
        inputAnswer.setOperation("multiply");

        String inputJson = mapper.writeValueAsString(inputAnswer);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnDivisionResultInResponseBody() throws Exception {
        //arrange
        MathSolution inputAnswer = new MathSolution(10,2,"divide");
        MathSolution expectedAnswer = new MathSolution(10,2,"divide", 8);
        //act
        String inputJson = mapper.writeValueAsString(inputAnswer);
        String expectedJson = mapper.writeValueAsString(expectedAnswer);

        //perform
        mockMvc.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(expectedJson));
    }
    @Test
    public void shouldReturn422StatusCodeIfDivideMissingOperandsOrNotInt() throws Exception {
        MathSolution inputAnswer = new MathSolution();
        inputAnswer.setOperand2(2);
        inputAnswer.setOperation("divide");

        String inputJson = mapper.writeValueAsString(inputAnswer);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}