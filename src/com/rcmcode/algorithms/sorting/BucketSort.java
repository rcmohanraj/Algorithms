package com.rcmcode.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {

    public static void main(String[] args) {
        int[] numbers = { 10, 6, 5, 2, 8, 6, 1, 5, 6, 2, 8, 1, 6 };
//        int[] numbers = { 1, 2, 3, 4, 5, 6 };
//        int[] numbers = { 2, 20, 1 };
        LinkedList<Integer>[] buckets  = createBuckets(numbers, 4);
        sort(numbers, buckets);
    }

    private static LinkedList<Integer>[] createBuckets(int[] numbers, int numberofBuckets) {
        LinkedList<Integer>[] buckets = new LinkedList[numberofBuckets];   //Random Bucket Size
        for(int item : numbers) {
            int value = item / numberofBuckets;
            if(buckets[value] == null) {
                buckets[value] = new LinkedList<>();
            }
            buckets[value].addLast(item);
        }
        return buckets;
    }

    private static void sort(int[] numbers, LinkedList<Integer>[] buckets) {
        int j = 0;
        for(LinkedList<Integer> list : buckets) {
            if(list != null) {
                Collections.sort(list);
                for(int item : list) {
                    numbers[j++] = item;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
