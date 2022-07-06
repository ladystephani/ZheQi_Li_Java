package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void SetUp() {calc = new Calculator();}

    @Test
    public void shouldAddIntegers() {
        assertEquals(2, calc.add(1,1));
        assertEquals(3, calc.add(1,2));
        assertEquals(10, calc.add(3,7));
    }

    @Test
    public void shouldSubtractIntegers() {
        assertEquals(2, calc.subtract(3,1));
        assertEquals(3, calc.subtract(5,2));
        assertEquals(10, calc.subtract(17,7));
    }
    @Test
    public void shouldMultiplyIntegers() {
        assertEquals(1, calc.multiply(1,1));
        assertEquals(2, calc.multiply(1,2));
        assertEquals(21, calc.multiply(3,7));
    }
    @Test
    public void shouldDivideIntegers() {
        assertEquals(5, calc.divide(10,2));
        assertEquals(3, calc.divide(6,2));
        assertEquals(10, calc.divide(70,7));
    }

    //doubles
    @Test
    public void shouldAddDoubles() {
        assertEquals(2.2, calc.add(1.1,1.1), 0.01);
        assertEquals(3.0, calc.add(1.0,2.0), 0.01);
        assertEquals(10.0, calc.add(2.5,7.5), 0.01);
    }
    @Test
    public void shouldSubtractDoubles() {
        assertEquals(2.2, calc.subtract(3.3,1.1), 0.01);
        assertEquals(3.0, calc.subtract(5.0,2.0), 0.01);
        assertEquals(5.0, calc.subtract(12.5,7.5), 0.01);
    }
    @Test
    public void shouldMultiplyDoubles() {
        assertEquals(2.2, calc.multiply(2.0,1.1), 0.01);
        assertEquals(10.0, calc.multiply(5.0,2.0), 0.01);
        assertEquals(2.5, calc.multiply(2.5,1.0), 0.01);
    }
    @Test
    public void shouldDivideDoubles() {
        assertEquals(6.0, calc.divide(6.6,1.1), 0.01);
        assertEquals(3.0, calc.divide(6.0,2.0), 0.01);
        assertEquals(10.0, calc.divide(25.0,2.5), 0.01);
    }

 }