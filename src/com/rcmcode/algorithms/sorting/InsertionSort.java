package com.rcmcode.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = { 10, 6, 5, 2, 8, 6, 1 };
//        int[] numbers = { 1, 2, 3, 4, 5, 6 };
//        int[] numbers = { 2, 20, 1 };
        sort(numbers);
    }

    private static void sort(int[] numbers) {
        for(int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i;
            for (; j > 0; j--) {
                if(numbers[j - 1] > current) {
                    numbers[j] = numbers[j - 1];
                } else {
                    break;
                }
            }
            numbers[j] = current;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
