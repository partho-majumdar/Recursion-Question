package com.partho;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}

/*
    1342 = 1 + 3 + 4 + 2 = 10
*/