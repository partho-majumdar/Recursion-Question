package com.partho;

public class Reverse1 {
    public static void main(String[] args) {
        reverse1(1423);
        System.out.println(sum);
    }

    static int sum = 0;
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = (sum * 10) + rem;
        reverse1( n/10);
    }
}
