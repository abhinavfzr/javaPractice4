package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryFindTest {
    HarryFind app;
    @Before
    public void setUp() throws Exception {
        app= new HarryFind();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test5() throws Exception {
        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = app.harryFind("this is harry");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}