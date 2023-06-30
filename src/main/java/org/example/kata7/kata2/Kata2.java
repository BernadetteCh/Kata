package org.example.kata7.kata2;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Kata2 {

    public int countVowels(String string) {
        return string.length()== 0 ? 0 : countVowelsInString(string);
    }

    private int countVowelsInString(String string) {
      //  return (int) string.chars().filter(letter->"aeiou".indexOf(letter)>=0).count();
        String letters = string.trim();
        int countVowel = 0;
        //*First approach*
        for (int i = 0; i < letters.length(); i++) {
            if(letters.charAt(i) == 'a' || letters.charAt(i) == 'e'||letters.charAt(i) == 'i' || letters.charAt(i) == 'o' ||letters.charAt(i) == 'u') {
                countVowel+=1;
            }
        }
        return countVowel;
    }
}
