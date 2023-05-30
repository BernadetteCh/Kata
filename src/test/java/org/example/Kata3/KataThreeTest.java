package org.example.Kata3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KataThreeTest {

    KataThree kataThree = new KataThree();

    @ParameterizedTest
    @CsvSource({
            "1,5,3,5",
            "2,6,2,12",
            "1,5,1,15",
            "0,0,0,0",
    })
    void sumOfSequence(int start, int end, int step, int expected) {
        int result = kataThree.sumOfSequence(start, end, step);
        assertEquals(expected, result);
    }
}