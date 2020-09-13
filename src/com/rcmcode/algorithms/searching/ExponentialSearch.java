package com.rcmcode.algorithms.searching;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] numbers = { 5, 7, 9, 10, 11, 12, 15, 17, 20, 51, 106 };
                        //0  1  2   3   4   5   6   7   8   9   10
        int item = 7;
        int index1 = searchRecursive(numbers, item, 1);
        System.out.println(String.format("Item %d found at %d index1", item, index1));
        int index2 = searchIterative(numbers, item);
        System.out.println(String.format("Item %d found at %d index2", item, index2));
    }

    private static int searchRecursive(int[] numbers, int item, int bound) {
        if(bound > numbers.length) {
            bound = numbers.length - 1;
        }
        if(numbers[bound] == item) {
            return bound;
        }
        System.out.println("Bound=>"+bound);
        if(item < numbers[bound] ) {
            return binarySearch(numbers, item, bound / 2, bound);
        } else {
            return searchRecursive(numbers, item, bound * 2);
        }
    }

    private static int searchIterative(int[] numbers, int item) {
        int bound = 1;
        System.out.println("Bound=>"+bound);
        while(bound < numbers.length && numbers[bound] < item) {
            bound *= 2;
        }

        int start = bound / 2;
        int end = Math.min(bound, numbers.length - 1);
        return binarySearch(numbers, item, start, end);
    }

    private static int binarySearch(int[] numbers, int item, int start, int end) {
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

        return binarySearch(numbers, item, start, end);
    }
}

