package org.example.kyu7.kata3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Kata3Test {
    Kata3 kata3 = new Kata3();

    public static Stream<Arguments> isVowel() {
        return Stream.of(Arguments.of("This website","Ths wbst"),
                Arguments.of("LOL","LL"),
                Arguments.of("",null));
    }

    @ParameterizedTest
    @MethodSource("isVowel")
    public void removeVowel(String input, String expected) {
        String testString = kata3.disemvowel(input);
        assertEquals(expected,testString);
    }

}