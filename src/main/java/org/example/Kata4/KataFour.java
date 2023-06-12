package org.example.Kata4;

import java.util.Arrays;

public class KataFour {
    public  boolean scramble(String str1, String str2) {
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);

    }

}
