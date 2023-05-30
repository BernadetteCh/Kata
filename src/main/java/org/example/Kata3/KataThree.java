package org.example.Kata3;

public class KataThree {
    public int sumOfSequence(int start, int end, int step) {
        if(step == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }
        return sum;
    }
}
