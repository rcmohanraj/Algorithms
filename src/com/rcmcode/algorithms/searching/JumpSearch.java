package com.rcmcode.algorithms.searching;

public class JumpSearch {

    public static void main(String[] args) {
        int[] numbers = { 5, 7, 9, 10, 11, 12, 15, 17, 20, 51, 106 };
                        //0  1  2   3   4   5   6   7   8   9   10
        int item = 5;
        int index = search(numbers, item);
        System.out.println(String.format("Item %d found at %d index", item, index));
    }

    private static int search(int[] numbers, int item) {
        int blocks = (int) Math.sqrt(numbers.length);
        int start = 0;
        int next = blocks;
        System.out.println("Blocks="+blocks);
        //Checking end of each block is less than target to get the block
        while(start < numbers.length && numbers[next-1] < item) {
            start = next;
            next += blocks;
            System.out.println("start="+start);
            System.out.println("next="+next);
            if(next > numbers.length) {
                next = numbers.length;
            }
        }

        for(int i = start; i < next; i++) {
            if(numbers[i] == item) {
                return i;
            }
        }
        return -1;

    }
}
