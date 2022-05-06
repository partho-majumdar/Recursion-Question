package com.partho;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1));
    }

    static boolean isPalindrome(int n) {
        if (n==-1){
            return false;
        }
        return n == reverse(n);
    }

    static int reverse(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
