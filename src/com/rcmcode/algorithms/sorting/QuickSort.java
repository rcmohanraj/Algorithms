package com.rcmcode.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = { 8, 2, 4, 1, 7 , 3};
//        int[] numbers = { 1, 2, 3, 4, 5, 6 };
//        int[] numbers = { 2, 20, 1 };
//        int[] numbers = { 38, 27, 43, 3, 9, 82, 10 };
        sort(numbers);
        System.out.println("Result:"+Arrays.toString(numbers));
    }

    private static void sort(int[] numbers) {
        System.out.println("Input:"+Arrays.toString(numbers));
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int start, int end) {
        System.out.println("Sort Input:"+Arrays.toString(numbers));
        if(start >= end) {
            return;
        }
        int boundary = partition(numbers, start, end);
        sort(numbers, start, boundary - 1);
        sort(numbers, boundary + 1, end);
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int boundary = start - 1; //left boundary where we will have smaller items. initially there is no left
        for(int i = start; i <= end; i++) {
            if(numbers[i] <= pivot) {
                swap(numbers, i, ++boundary);
            }
        }
        return boundary;
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
