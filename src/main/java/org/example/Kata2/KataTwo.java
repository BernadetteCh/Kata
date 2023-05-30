package org.example.Kata2;

public class KataTwo {

    public boolean isIsogram(String word) {
        return word.chars()
                .map(Character::toLowerCase)
                .distinct()
                .count()== word.length();

      /* 2. Method
      return Stream.of(word.split(""))
                        .map(String::toLowerCase)
                                .distinct()
                                        .count()== word.length();*/
        //3. Method return word.length() == word.toLowerCase().chars().distinct().count();


    }
}
