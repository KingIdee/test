package com.company;

import java.util.Arrays;

public class FirstQuestion {

    private static boolean firstQuestion(String str){

        // create reversed string
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(str);
        reversedString = reversedString.reverse();


        // split first string
        String[] arrayString1 = str.split("");

        // split second string
        String[] arrayString2 = reversedString.toString().split("");

        // compare two strings
        if (Arrays.equals(arrayString1,arrayString2)){
            return true;
        }
        return false;
    }
}
