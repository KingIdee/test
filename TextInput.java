package com.company;

public class TextInput {

    StringBuilder stringBuilder = new StringBuilder();

    public void add(char c){
        stringBuilder.append(c);
    }

    public String getValue(){
        return stringBuilder.toString();
    }

}
