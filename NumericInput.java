package com.company;

public class NumericInput extends TextInput {

    @Override
    public void add(char c) {
        if (Character.isDigit(c)){
            stringBuilder.append(c);
        }

    }
}
