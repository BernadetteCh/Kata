package org.example.DCP;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Challenge1Test {

    Challenge1 challenge1 = new Challenge1();

    private static Stream<Arguments> isSum() {
        return Stream.of(Arguments.of(List.of(10, 15, 3, 7),17,true),
                Arguments.of(List.of(10, 15, 3, 7),13,true),
                Arguments.of(List.of(10, 15, 3, 7), 14, false),
                Arguments.of(List.of(), 17, false),
                Arguments.of(List.of(10, 15, 3, 7), 15,false),
                Arguments.of(List.of(10, 15, 3, 7), -12,false),
                Arguments.of(List.of(-10, 15, 3, 7), -7, true));
    }

    @ParameterizedTest
    @MethodSource("isSum")
    void sumNumbers(List<Integer> numbers, int sum, boolean expected) {
        boolean test = challenge1.sumNumbers(numbers, sum);
        assertEquals(expected, test);
    }
}