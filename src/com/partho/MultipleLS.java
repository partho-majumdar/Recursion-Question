package com.partho;

import java.util.ArrayList;

public class MultipleLS {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 5, 6, 9};
        findAllAns(arr, 6, 0);
        System.out.println((list));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllAns(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        findAllAns(arr, target, i + 1);
    }
}
