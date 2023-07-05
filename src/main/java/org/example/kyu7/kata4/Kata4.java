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
    public void fizzbuzz(int n) {

        /*for (int i = 1; i <= n; i++) {

            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }else if( i%5 == 0) {
                System.out.println("Buzz");
            } else if( i%3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }*/
        IntStream.rangeClosed(0, n).mapToObj(
                        i -> i % 3 == 0 ?
                                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    public int sum(List<Integer> ar) {
        ar.stream().mapToInt(number->number.intValue()).sum();
        return 0;
    }

    public int getMin(String s) {
        int countLeftParanthese = 0;//1
        int countRightPranthese = 0;//3
        for(int i = 0; i < s.length()-1; i++) {
            System.out.println(s.charAt(i) + "Hey");
            if(s.charAt(i) == '(') {
                countLeftParanthese+=1;
            }
            if(s.charAt(i) == ')') {
                countRightPranthese+=1;
            }
        }
        //check difference between left and right to make them equal
        int result = 0;
        System.out.println(countLeftParanthese +"Left");
        System.out.println(countRightPranthese + "Right");
        if(countRightPranthese > countLeftParanthese) {
             result = countRightPranthese - countLeftParanthese;
        }else {
            result = countLeftParanthese - countRightPranthese;

        }
        System.out.println(result);
        return result;
    }

    public char findLongestSingleSlot(List<List<Integer>> leaveTimes){
       int firstShiftStart =0;
        int secondShiftStart = 0;
        for (int i = 0; i < leaveTimes.size(); i++) {
            firstShiftStart = leaveTimes.get(0).get(1);

            for (int j = 0; j < leaveTimes.get(i).size(); j++) {
                secondShiftStart = leaveTimes.get(i).get(1);
                /*System.out.println(leaveTimes.get(j).get(0)+ "min");
                System.out.println(leaveTimes.get(j).get(1)+ "max");*/
                // secondShiftStart = leaveTimes.get(j).get(1);

                int employeeId = j;
                int difference = secondShiftStart - firstShiftStart;
                System.out.println(difference);

            }
        }
        return 'b';
    }
}
