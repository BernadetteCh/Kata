package org.example.DCP;

import java.util.List;
import java.util.Optional;

public class Challenge1 {

    public boolean sumNumbers(List<Integer> numbers, int k) {
        return numbers.size() <= 0 ? false : calculateValue(numbers, k);
    }

    private boolean calculateValue(List<Integer> numbers, int k) {
        Optional<Integer> result = numbers.stream().reduce((num, acc) -> (num + acc) == k ? k : num);
        return result.get() == k ? true : false;
    }
}
