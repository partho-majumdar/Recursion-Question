package com.partho;

public class SkipApp {
    public static void main(String[] args) {
        System.out.println(skipApp("bapplsc"));
        System.out.println(skipApp("bapplesc2"));
    }

    static String skipApp(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApp(up.substring(3));
        }
        return up.charAt(0) + skipApp(up.substring(1));
    }
}
