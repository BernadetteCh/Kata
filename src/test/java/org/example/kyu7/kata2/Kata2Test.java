package org.example.kyu7.kata2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Kata2Test {

    Kata2 kata2 = new Kata2();

    @ParameterizedTest
    @CsvSource({"aaa,3",
            "'',0",
            "pear tree,4",
            "o a kak ushakov lil vo kashu kakao,13"})
    public void countVowel(String str, int expected) {
        int testCase = kata2.countVowels(str);
        assertEquals(expected, testCase);
    }

}