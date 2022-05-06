package com.partho;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(arr2, 0));
    }

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
    }
}
