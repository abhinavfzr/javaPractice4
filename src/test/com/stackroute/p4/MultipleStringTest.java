package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleStringTest {
    MultipleString app;
    @Before
    public void setUp() throws Exception {
        app= new MultipleString();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }


    @Test
    public void test6() throws Exception {
        //Arrange
        String expectedValue = "0-4 14-18";

        //Act
        String actualValue = app.multipleString("this is harry this is abhinav", "this");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}