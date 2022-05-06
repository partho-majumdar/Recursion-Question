package com.partho;

import java.util.ArrayList;

public class PathRes {
    public static void main(String[] args) {
        System.out.println(pathCount(3, 3));
        pathPrint("", 3, 3);
        System.out.println(pathPrintRet("", 3, 3));
        pathPrintDia("", 3, 3);
        System.out.println(pathPrintDiaRet("", 3, 3));
    }

    static int pathCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = pathCount(r - 1, c);
        int right = pathCount(r, c - 1);
        return left + right;
    }

    static void pathPrint(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            pathPrint(p + 'D', r - 1, c);
        }

        if (c > 1) {
            pathPrint(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathPrintRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list2 = new ArrayList<>();

        if (r > 1) {
            list2.addAll(pathPrintRet(p + 'D', r - 1, c));
        }

        if (c > 1) {
            list2.addAll(pathPrintRet(p + 'R', r, c - 1));
        }
        return list2;
    }

    static void pathPrintDia(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1 && c > 1) {
            pathPrintDia(p + 'D', r - 1, c - 1);
        }

        if (r > 1) {
            pathPrintDia(p + 'V', r - 1, c);
        }

        if (c > 1) {
            pathPrintDia(p + 'H', r, c - 1);
        }
    }

    static ArrayList<String> pathPrintDiaRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list2 = new ArrayList<>();

        if (r > 1 && c > 1) {
            list2.addAll(pathPrintDiaRet(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            list2.addAll(pathPrintDiaRet(p + 'V', r - 1, c));
        }

        if (c > 1) {
            list2.addAll(pathPrintDiaRet(p + 'H', r, c - 1));
        }
        return list2;
    }
}
