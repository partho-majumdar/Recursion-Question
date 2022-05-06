package com.partho;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAll(arr, 4, 0, list);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAll(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return findAll(arr, target, i + 1, list);
    }
}
