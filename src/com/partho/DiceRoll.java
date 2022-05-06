package com.partho;

import java.util.ArrayList;


public class DiceRoll {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));
        System.out.println(diceCount("", 4));
        diceFace("", 5, 7);
        System.out.println(diceFaceRet("", 5, 7));
        System.out.println(diceFaceCount("", 5, 7));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target && i <= 6; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 1; i <= target && i <= 6; i++) {
            list2.addAll(diceRet(p + i, target - i));
        }
        return list2;
    }

    static int diceCount(String p, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= target && i <= 6; i++) {
            count = count + diceCount(p + i, target - i);
        }
        return count;
    }

    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target && i <= face; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    static ArrayList<String> diceFaceRet(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 1; i <= target && i <= face; i++) {
            list2.addAll(diceFaceRet(p + i, target - i, face));
        }
        return list2;
    }

    static int diceFaceCount(String p, int target, int face) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= target && i <= face; i++) {
            count = count + diceFaceCount(p + i, target - i, face);
        }
        return count;
    }
}
