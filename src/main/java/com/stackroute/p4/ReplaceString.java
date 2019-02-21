package com.stackroute.p4;

public class ReplaceString
{
    //2. Write a program to replace all d with f and all l with t in the given String
    String replaceString(String str) {
        String replaceString = str.replace('d', 'f');
        replaceString = replaceString.replace("l", "t");
        return replaceString;
    }
}
