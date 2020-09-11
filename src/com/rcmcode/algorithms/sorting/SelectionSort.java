package com.rcmcode.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {10, 6, 5, 2, 8, 6, 1};
        //int[] numbers = {1, 2, 3, 4, 5, 6};
        sort(numbers);
    }

    private static void sort(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int min = findMinIndex(numbers, i);
            //System.out.println(String.format("Min value=%d in the Iteration=%d", min, i));
            if(min > i)
                swap(numbers, i, min);
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static int findMinIndex(int[] numbers, int i) {
        int min = i;
        for (int j = i+1; j < numbers.length; j++)
            if(numbers[j] < numbers[min])
                min = j;
        return min;
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
