package com.partho;

public class SkipApple {
    public static void main(String[] args) {
        System.out.println(skipApple("bapplecs"));
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }
        return up.charAt(0) + skipApple(up.substring(1));
    }
}
