package com.rcmcode.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {10, 6, 5, 2, 8, 6, 1};
        //int[] numbers = {1, 2, 3, 4, 5, 6};
        sort(numbers);
    }

    private static void sort(int[] numbers) {
        boolean isSortedNumber = true;
        for(int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                // if we reverse these two operands then we will get the sort in descending
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j - 1);
                    isSortedNumber = false;
                }
            }
            //if the flag after the first pass is true, then the array is already sorted
            if (isSortedNumber) return;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

}
