package org.example.Kata5;

public class KataFive {
    public String collatz(int n) {
        StringBuilder sb = new StringBuilder().append(n);
        if (n > 0) {
            while (n != 1) {
                n = n % 2 == 0 ? n / 2 : 3 * n + 1;
                sb.append("->").append(n);
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
