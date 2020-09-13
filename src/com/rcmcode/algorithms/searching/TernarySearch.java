package com.rcmcode.algorithms.searching;

public class TernarySearch {

    public static void main(String[] args) {
        int[] numbers = { 5, 7, 9, 10, 11, 12, 15, 17, 20, 51, 106 };
                        //0  1  2   3   4   5   6   7   8   9   10
        int item = 106;
        int index = search(numbers, item);
        System.out.println(String.format("Item %d found at %d index", item, index));
    }

    private static int search(int[] numbers, int item) {
        return search(numbers, item, 0, numbers.length - 1);
    }

    private static int search(int[] numbers, int item, int start, int end) {
        if(start > end) {
            return -1;
        }
        int partition = (end - start) / 3;
        int mid1 = start + partition;
        int mid2 = end - partition;
        System.out.println("mid1=>"+mid1);
        System.out.println("mid2=>"+mid2);

        if(item == numbers[mid1]) return mid1;
        if(item == numbers[mid2]) return mid2;

        if(item < numbers[mid1])
            return search(numbers, item, start, mid1 - 1);
        else if(item > numbers[mid2])
            return search(numbers, item, mid2 + 1, end);

        return search(numbers, item, mid1 + 1, mid2 - 1);

    }
}
