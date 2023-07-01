package org.example.kyu7.kata3;

public class Kata3 {

    public String disemvowel(String str) {
       return str.length()==0 ? null : removeVowel(str);
    }

    private String removeVowel(String str) {
        String withoutVowels = str.replaceAll("([aeiouAEIOU])","");
        return withoutVowels;
    }
}
