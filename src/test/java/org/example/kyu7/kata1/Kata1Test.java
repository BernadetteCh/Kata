package org.example.kyu7.kata1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Kata1Test {

    Student student = new Student("John Smith","js123");
    Kata1 kata1 = new Kata1();
    @ParameterizedTest
    @CsvSource({
            "John Smith,js123,true",
            "Berni Reeves,js123,false"
    })
    public void checkStudent(String name, String inputNumber, boolean expected) {
        boolean testCase1 = kata1.assertStudent(student, name, inputNumber);
        assertEquals(expected,testCase1);
    }
}