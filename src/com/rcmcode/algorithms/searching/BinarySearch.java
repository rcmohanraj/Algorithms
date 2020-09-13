package com.rcmcode.algorithms.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = { 5, 7, 9, 10, 11, 12, 15, 17, 20, 51, 106 };
                        //0  1  2   3   4   5   6   7   8   9   10
        int item = 5;
        int index1 = searchIterative(numbers, item);
        System.out.println(String.format("Item1 %d found at %d index", item, index1));
        int index2 = searchRecursive(numbers, item);
        System.out.println(String.format("Item2 %d found at %d index", item, index2));
    }

    private static int searchIterative(int[] numbers, int item) {
        return searchIterative(numbers, item, 0, numbers.length);
    }

    private static int searchRecursive(int[] numbers, int item) {
        return searchRecursive(numbers, item, 0, numbers.length);
    }

    private static int searchIterative(int[] numbers, int item, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            System.out.println("mid=>"+mid);
            if(item == numbers[mid]) return mid;

            if(item < numbers[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    private static int searchRecursive(int[] numbers, int item, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        System.out.println("mid=>"+mid);

        if(item == numbers[mid]) return mid;
        if(item < numbers[mid])
            end = mid - 1;
        else
            start = mid + 1;

        return searchRecursive(numbers, item, start, end);
    }
}
