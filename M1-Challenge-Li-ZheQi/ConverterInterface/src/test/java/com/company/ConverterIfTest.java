package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    ConverterIf converter;

    @Before

    public void SetUp() {
        converter = new ConverterIf();
    }

    @Test
    public void shouldConvertInputNumberToMonthString() {

        //Act
        //Assert
        //create multiple test cases
        assertEquals("January", converter.convertMonth(1));
        assertEquals("May", converter.convertMonth(5));
        assertEquals("August", converter.convertMonth(8));
    }

    @Test
    public void shouldConvertInputNumberToDayString() {
        assertEquals("Sunday", converter.convertDay(1));
        assertEquals("Tuesday", converter.convertDay(3));
        assertEquals("Saturday", converter.convertDay(7));
    }


}