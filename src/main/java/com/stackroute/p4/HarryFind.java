package com.stackroute.p4;

public class HarryFind {


    //5. Write a program with the implementation of Regular Expression to find the presence of the name
//Harry in a string
    boolean harryFind(String str) {
        boolean f = str.matches(".*\\bharry\\b");
        return f;
    }


}
