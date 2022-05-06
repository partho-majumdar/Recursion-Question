package com.partho;

public class Print5to1 {
    public static void main(String[] args) {
        find(5);
    }

    static void find(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        find(n - 1);
    }
}
