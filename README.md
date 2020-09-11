# Implementing Sorting and Searching Algorithms using Java

### For Checking Complexities
https://www.bigocheatsheet.com/

## Sorting Algorithms

### Bubble Sort
We scan the array from left to right, if items are out of order we swap them. After each pass the largest items bubbles up and moves to last position.

#### Run Time Complexity
When the array is sorted
Best case for each pass  => O(1) because we are comparing the next items to find out the maximum, so if the array is sorted, after the first pass itself we can skip sorting.
Best case for comparison => O(n)
So bubble sort runs in O(n) or Linear time

When the array is not sorted
Worst case for each pass  => O(n)
Worst case for comparison => O(n)
So bubble sort runs in O(n^2) or Quadratic time

Implemented BubbleSort in BubbleSort.java

--------------------------------------------------------------------------------

### Selection Sort
In each pass we will select the minimum value and move to the first in the array. 

#### Run Time Complexity
When the array is sorted
Best case for each pass  => O(n) because we are not comparing the next item, instead we are finding the next minimum value. So we need to do all passes to ensure array is sorted.
Best case for comparison => O(n)
So selection sort runs in O(n^2) or Quadratic time

When the array is not sorted
Worst case for each pass  => O(n)
Worst case for comparison => O(n)
So selection sort runs in O(n^2) or Quadratic time

Implemented SelectionSort in SelectionSort.java

--------------------------------------------------------------------------------

