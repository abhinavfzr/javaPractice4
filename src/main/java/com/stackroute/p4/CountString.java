package com.stackroute.p4;

public class CountString
{
    //1. Write a java program to count the total number of occurrences of a given character in a string
    //without using any loop?
    int countString(String str) {
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;
    }

}
