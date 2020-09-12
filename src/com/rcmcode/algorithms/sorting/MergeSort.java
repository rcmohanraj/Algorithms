package com.rcmcode.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = { 8, 2, 4, 1, 7 , 3};
//        int[] numbers = { 1, 2, 3, 4, 5, 6 };
//        int[] numbers = { 2, 20, 1 };
        sort(numbers);
    }

    private static void sort(int[] numbers) {
        split(numbers);
    }

    private static void split(int[] numbers) {
        int size = numbers.length;
        if(size < 2) {
            return;
        }
        //System.out.println("Splitting Array:"+Arrays.toString(numbers));
        int mid = size / 2; //  5/2 => 2
        int[] left = new int[mid];//total 2 => 0, 1
        int[] right = new int[size - mid];//total 3 => 2, 3, 4
        for(int i = 0; i < mid; i++) {
            left[i] = numbers[i];
        }
        for(int i = mid; i < size; i++) {
            right[i - mid] = numbers[i];
        }
        split(left);
        split(right);
        compareAndMerge(left, right, numbers);
        //System.out.println("Result:"+Arrays.toString(numbers));
    }

    private static void compareAndMerge(int[] left, int[] right, int[] result)  {
        System.out.println("Left Array   :"+Arrays.toString(left));
        System.out.println("Right Array  :"+Arrays.toString(right));
        System.out.println("Result Array Before :"+Arrays.toString(result));
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while(i < left.length)
            result[k++] = left[i++];

        while(j < right.length)
            result[k++] = right[j++];
        System.out.println("Result Array Final:"+Arrays.toString(result));
    }

    /*                          [8, 2, 4, 1, 7, 3]
            L1 = [8, 2, 4]                          R2 = [1, 7, 3]
            L1.1 = [8] R1.2 = [2, 4]                L2.1 = [1] R2.2 = [7, 3]
                       L1.1.1 = [2] R1.1.2 = [4]               L2.2.1 = [7] R2.2.2 = [3]
    */
}
