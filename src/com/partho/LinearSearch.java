package com.partho;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        System.out.println(isExist(arr, 18, 0));
    }

    static boolean isExist(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || isExist(arr, target, i + 1);
    }
}
