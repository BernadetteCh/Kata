package org.example.Kata1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KataOneTest {
    KataOne kataOne = new KataOne();

    public static Stream<Arguments> isNumberNegative() {
        return Stream.of(Arguments.of(-1,-1),Arguments.of(2,-2),Arguments.of(0,0));
    }

    @ParameterizedTest
    @MethodSource("isNumberNegative")
    public void makeNumberNegative(int inputNum, int expectedNum) {
        assertEquals(expectedNum,kataOne.makeNegative(inputNum));
    }

}