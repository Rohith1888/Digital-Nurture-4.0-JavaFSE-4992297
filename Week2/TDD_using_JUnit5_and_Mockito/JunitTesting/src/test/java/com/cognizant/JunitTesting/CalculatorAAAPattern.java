package com.cognizant.JunitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAAPattern {

    private Calculator calculator;

    @Before
    public void setUp() {
       
        calculator = new Calculator();
        System.out.println("Setting up...");
    }

    @After
    public void tearDown() {
        
        calculator = null;
        System.out.println("Cleaning up...");
    }

    @Test
    public void testAdd_AAA() {
        
        int result = calculator.add(10, 20);

       
        assertEquals(30, result);
    }

    @Test
    public void testSubtract_AAA() {
       
        int result = calculator.subtract(30, 10);

       
        assertEquals(20, result);
    }
}
