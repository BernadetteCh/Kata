package org.example.Kata4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class KataFourTest {

    KataFour kataFour = new KataFour();


    @ParameterizedTest
    @CsvSource({
            "berni,inreb,true",
            "alen, nela, true",
            "berni, nierf,false",
            "peter, refelasdf, false"
    })
    void scramble(String str1, String str2, boolean expected) {
           boolean result =  kataFour.scramble(str1,str2);
           assertEquals(result,expected);
    }
}