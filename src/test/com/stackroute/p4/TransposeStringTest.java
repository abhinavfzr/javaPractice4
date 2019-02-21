package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString app;
    @Before
    public void setUp() throws Exception {
        app= new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }



    @Test
    public void test4() throws Exception {
        //Arrange
        String[] expectedValue = {"vanihba", "dnana", "lapog"};

        //Act
        String[] actualValue = app.transposeString("abhinav anand gopal");
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}