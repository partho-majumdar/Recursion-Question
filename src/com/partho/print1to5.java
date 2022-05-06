package com.partho;

public class print1to5 {
    public static void main(String[] args) {
        find(5);
    }

    static void find(int n) {
        if (n == 0) {
            return;
        }
        find(n - 1);
        System.out.println(n);
    }
}
