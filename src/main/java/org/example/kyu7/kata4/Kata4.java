package org.example.kyu7.kata4;

import java.awt.*;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata4 {
    public int squareDigits(int n) {
        String result = "";
        int powResult = 0;
        String stringNumber = Integer.toString(n);

        for (int i = 0; i < stringNumber.length(); i++) {
            int b = Character.getNumericValue(stringNumber.charAt(i));
            // Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            powResult = b * b;
            result += Integer.toString(powResult);
        }
        return Integer.parseInt(result);

        //codewarsSolution
             /*  return Integer.parseInt(String.valueOf(n)
                 .chars()
                 .map(stringNumber->Integer.parseInt(String.valueOf((char) stringNumber)))
                 .map(i->(int)Math.pow(i,2))
                 .mapToObj(number->String.valueOf(number))
                 .collect(Collectors.joining("")));*/


    }
}
