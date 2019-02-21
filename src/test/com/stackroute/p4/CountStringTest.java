package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString app;
    @Before
    public void setUp() throws Exception {
        app= new CountString();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        int expectedValue = 8;

        //Act
        int actualValue = app.countString("java is java again java");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}