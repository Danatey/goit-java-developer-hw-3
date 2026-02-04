package org.example;

public class SumCalculator {

    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("number less 0");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
