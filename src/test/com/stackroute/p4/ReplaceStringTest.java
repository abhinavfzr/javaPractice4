package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {
  ReplaceString app;
    @Before
    public void setUp() throws Exception {
        app= new ReplaceString();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }


  @Test
  public void test2() throws Exception {
    //Arrange
    String expectedValue = "faity fry";

    //Act
    String actualValue = app.replaceString("daily dry");
    //Assert
    assertEquals(expectedValue, actualValue);
    assertNotNull(actualValue);
  }
}