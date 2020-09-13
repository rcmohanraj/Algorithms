package com.rcmcode.algorithms.searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 10, 1, 2, 5, 3, 4, 11, 56 };
        int item = 50;
        int index = search(numbers, item);
        System.out.println(String.format("Item %d found at %d index", item, index));
    }

    private static int search(int[] numbers, int item) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == item)
                return i;
        }
        return -1;
    }
}
