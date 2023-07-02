package org.example.kyu7.kata4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Kata4Test {
    Kata4 kata4 = new Kata4();

    @ParameterizedTest
    @CsvSource({
            "9119,811181"})
    public void squareNumbers(int inputNumber, int expected) {
        int testInput = kata4.squareDigits(inputNumber);
        assertEquals(expected,testInput);
    }

}