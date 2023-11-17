package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n == 1) {
            return 1;
        }else if(n == 0) {
            throw new IllegalArgumentException();
        }else {
            return n + sum(n - 1);
        }
    }
}
