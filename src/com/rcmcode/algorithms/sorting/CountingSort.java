package com.rcmcode.algorithms.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] numbers = { 10, 6, 5, 2, 8, 6, 1, 5, 6, 2, 8, 1, 6 };
//        int[] numbers = { 1, 2, 3, 4, 5, 6 };
//        int[] numbers = { 2, 20, 1 };
        int max = max(numbers);
        sort(numbers, max);
    }

    private static void sort(int[] numbers, int max) {
        int[] counts = new int[max + 1];
        for(int item : numbers)
            counts[item]++;
        System.out.println(Arrays.toString(counts));

        int j = 0;
        for(int i = 0; i < counts.length; i++) {
            int count = counts[i];
//            System.out.println(String.format("i=%d and Count=%d", i, count));
            while(count > 0) {
                numbers[j++] = i;
                count--;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static int max(int[] numbers) {
        int max = -1;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
}
