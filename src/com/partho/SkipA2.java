package com.partho;

public class SkipA2 {
    public static void main(String[] args) {
        System.out.println(skip("baccdad"));
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        }
        return ch + skip(up.substring(1));
    }
}
