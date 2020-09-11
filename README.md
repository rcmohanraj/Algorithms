# Implementing Sorting and Searching Algorithms using Java

### For Checking Complexities
https://www.bigocheatsheet.com/

## Sorting Algorithms

### Bubble Sort
We scan the array from left to right, if items are out of order we swap them. After each pass the largest items bubbles up and moves to last position.

#### Run Time Complexity
When the array is sorted
Best case for each pass  => O(1) because we are comparing the next items to find out the maximum, so if the array is sorted, after the first pass itself we can skip sorting.
Best case for comparison => O(n) (logically n-1 comparisons)
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

### Insertion Sort
Every item when we get an item, we insert it in the correct position. If we find a smaller item, we should shift the visited items that greater than current value. Instead of swapping the items we are shifting the items to right. In every step, we pick an item from unsorted part and insert into the correct position of the sorted part.

#### Run Time Complexity
When the array is sorted
Best case for each iteration  => O(n) because we are iterating items in the each array.
Best case for shifting items => O(1) as the array is sorted, so current item is already in correct position, so it runs in constant time.
So insertion sort runs in O(n) or Linear time

When the array is not sorted
Worst case for each pass  => O(n)
Worst case for shifting items => O(n) if the array is in descending order we need to shift every item from starting position.
So insertion sort runs in O(n^2) or Quadratic time

Implemented InsertionSort in InsertionSort.java

--------------------------------------------------------------------------------