package com.example.stringmanipulatorexercise;
public class StringManipulatorAliisa {
    String reversed = "";
    String converted = "";
    public String reverse(String input) {
       for (int i = 0; i < input.length(); i++) {
           reversed = input.charAt(i) + reversed;
       }
       return reversed;
    }

    public String capitalize(String input) {
        String converted = input.toUpperCase();
        return converted;
    }
}