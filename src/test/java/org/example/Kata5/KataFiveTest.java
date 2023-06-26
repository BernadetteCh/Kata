package org.example.Kata5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KataFiveTest {
    KataFive kataFive = new KataFive();

    public static Stream<Arguments> isCollatz() {
        return Stream.of(Arguments.of(4, "4->2->1"), Arguments.of(3, "3->10->5->16->8->4->2->1"));
    }
    @ParameterizedTest
    @MethodSource("isCollatz")
    void collatz(int number, String expected) {
        assertEquals(expected,kataFive.collatz(number));
    }
}