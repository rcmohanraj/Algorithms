# Implementing Sorting and Searching Algorithms using Java

### For Checking Complexities
https://www.bigocheatsheet.com/

## Sorting Algorithms

### Bubble Sort
We scan the array from left to right, if items are out of order we swap them. After each pass the largest items bubbles up and moves to last position.

#### Run Time Complexity
When the array is sorted
Best case for each pass  => O(1)
Best case for comparison => O(n)
So bubble sort runs in O(n) or Linear time

When the array is not sorted
Worst case for each pass  => O(n)
Worst case for comparison => O(n)
So bubble sort runs in O(n^2) or Quadratic time

Implemented BubbleSort in BubbleSort.java

### Selection Sort
