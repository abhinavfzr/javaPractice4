package com.stackroute.p4;

public class TransposeString
{

    //4. Write a program to transpose the given string
    String[] transposeString(String str) {
        String[] names = str.split("\\s");
        for (int i = 0; i < names.length; i++) {
            String reverse = "";
            for (int j = names[i].length() - 1; j >= 0; j--) {
                reverse = reverse + names[i].charAt(j);
            }

            names[i] = reverse;
        }
        return names;
    }
}
