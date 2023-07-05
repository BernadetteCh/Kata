package org.example;
import org.example.Kata5.KataFive;
import org.example.kyu7.kata4.Kata4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kata4 kata4 = new Kata4();
        List<List<Integer>> leaveTimes = new ArrayList<>();

        leaveTimes.add(Arrays.asList(0, 3));
        leaveTimes.add(Arrays.asList(2, 5));
        leaveTimes.add(Arrays.asList(1, 15));
        kata4.findLongestSingleSlot(leaveTimes);
    }
}