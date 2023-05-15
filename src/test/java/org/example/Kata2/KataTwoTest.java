package org.example.Kata2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KataTwoTest {
    KataTwo kataTwo = new KataTwo();
    @ParameterizedTest
    @CsvSource({
            "Dermatoglyphics,true ",
            "moose, false",
            "aba, false"
    })
    void isIsogram(String word, boolean expected) {
        assertEquals(expected, kataTwo.isIsogram(word));
    }

}