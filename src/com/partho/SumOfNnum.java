package com.partho;

public class SumOfNnum {
    public static void main(String[] args) {
        System.out.println(findSum(10));
    }

    static int findSum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + findSum(n-1);
    }
}

/*
    5 = 5 + 4 + 3 + 2 + 1
*/