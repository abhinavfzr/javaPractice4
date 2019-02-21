package com.stackroute.p4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleString
{
    //6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
    //methods
    String multipleString(String str, String regex) {

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        String result = "";
        while (matcher.find()) {
            result = result + matcher.start() + "-" + matcher.end() + " ";
        }
        result = result.trim();
        return result;
    }
}
