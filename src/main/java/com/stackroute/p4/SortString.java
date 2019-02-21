package com.stackroute.p4;

public class SortString {

    //3 .Write a program that sets up a String variable containing a paragraph of text of your choice.
    //a. Extract the words from the text and sort them into alphabetical order.
    //b. Display the sorted list of words
    String[] sortString(String str) {
        String[] names = str.split("\\s");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (names[j - 1].compareTo(names[j]) > 0) {
                    String temp = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }

}
