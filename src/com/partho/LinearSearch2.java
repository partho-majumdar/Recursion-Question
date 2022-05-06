package com.partho;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        System.out.println(findAns(arr, 18, 0));
    }

    static int findAns(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return findAns(arr, target, i + 1);
    }
}
