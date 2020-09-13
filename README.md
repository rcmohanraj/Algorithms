# Implementing Sorting and Searching Algorithms using Java

### Complexities Overview
https://www.bigocheatsheet.com/

## Comparison Sorting Algorithms

### Bubble Sort
We scan the array from left to right, if items are out of order we swap them. After each pass the largest items bubbles up and moves to last position.

#### Run Time Complexity
##### Best Case (Array is sorted)
Best case for each pass  	=> O(1) because we are comparing the next items to find out the maximum, so if the array is sorted, after the first pass itself we can skip sorting.  
Best case for comparison 	=> O(n) (logically n-1 comparisons)  
So bubble sort runs in O(n) or Linear time  

##### Worst Case (Array is not sorted)
Worst case for each pass  	=> O(n)  
Worst case for comparison 	=> O(n)  
So bubble sort runs in O(n^2) or Quadratic time  

Implemented BubbleSort in BubbleSort.java

--------------------------------------------------------------------------------

### Selection Sort
In each pass we will select the minimum value and move to the first in the array. 

#### Run Time Complexity
##### Best Case 
Best case for each pass  	=> O(n) because we are not comparing the next item, instead we are finding the next minimum value. So we need to do all passes to ensure array is sorted.  
Best case for comparison 	=> O(n)  
So selection sort runs in O(n^2) or Quadratic time  

##### Worst Case 
When the array is not sorted  
Worst case for each pass  	=> O(n)  
Worst case for comparison 	=> O(n)  
So selection sort runs in O(n^2) or Quadratic time  

Implemented SelectionSort in SelectionSort.java

--------------------------------------------------------------------------------

### Insertion Sort
Every item when we get an item, we insert it in the correct position. If we find a smaller item, we should shift the visited items that are greater than current value. Instead of swapping the items we are shifting the items to right. In every step, we pick an item from unsorted part and insert into the correct position of the sorted part.

#### Run Time Complexity
##### Best Case  
Best case for each iteration  	=> O(n) because we are iterating items in the each array.  
Best case for shifting items 	=> O(1) as the array is sorted, so current item is already in correct position, so it runs in constant time.  
Insertion sort runs in O(n) or Linear time  

##### Worst Case  
Worst case for each pass  		=> O(n)  
Worst case for shifting items 	=> O(n) if the array is in descending order we need to shift every item from starting position.  
Insertion sort runs in O(n^2) or Quadratic time  

Implemented InsertionSort in InsertionSort.java

--------------------------------------------------------------------------------

### Merge Sort (Divide and Conquer)
Break down list into smaller sublist and sort those sublist and once all the sublist are sorted, we can merge all the sublist.

#### Run Time Complexity
##### Best Case
Best case for Divide  	=> O(log n) because when the input is divide its always runs in logarithmic time.  
Best case for Merge 	=> O(n) as we have to read each item from sublist and compare.  
Merge sort runs in O(n log n)  

##### Worst Case
When the array is not sorted  
Worst case for Divide 	=> O(log n) because when the input is divide its always runs in logarithmic time.  
Worst case for Merge 	=> O(n) as we have to read each item from sublist and compare.  
Merge sort runs in O(n log n)  

#### Space Complexity
Every time we split an array we need to allocate two new subarrays, so this will take additional space in the memory. All these subarrays are combined together, will take same amount of space as the input array. So in best and worst case, merge sort will take O(n) space.  

As we see Merge sort is faster than BubbleSort, SelectionSort, InsertionSort but we need extra space to maintain the sublist or subarrays. (We can improve space complexity by using in-place merge sort algorithm).  

Implemented MergeSort in MergeSort.java

--------------------------------------------------------------------------------

### Quick Sort
One of the most used sorting algorithm in the languages. It doesn't require additional space. We can sort an array in-place. It works mainly by partitioning the input array using the pivot element. Typically pivot element will be selected as the last element and in some case pivot can be first or middle. After selecting the pivot, we need to move the items which are smaller than pivot to left and greater than pivot to right side. We continue until all the items are sorted. 

#### Run Time Complexity
##### Best Case
Cost of Partitioning the array				=> O(n) because we need to iterate the array and swap the item if necessary.  
How many times recursively Partitioning 	=> O(log n) as if we partition an array using pivot, we will get two nearly equal size array. So the input is divided.  
Quick sort runs in O(n log n)  

##### Worst Case
When the array is sorted ascending and Pivot as last item as well as array in descending order and pivot as first item.  
To work around we can use following pivot picking solutions  
1) Pick Random  
2) Pick Middle  
3) Average of first, middle and last  

Cost of Partitioning the array				=> O(n) because we need to iterate the array and swap the item if necessary.  
How many times recursively Partitioning 	=> O(n) If we pick the wrong pivot, then we end up dividing/partition the array n times.  
Quick sort runs in O(n^2)  

#### Space Complexity
Unlike Merge Sort, Quick sort using in-place sorting (swap items by using input array) without any additional space. But it will require additional space for recursive calls as JVM will keep track the recursive calls in stack.  
Best Case 	=> O(log n) as we have log n number of partitions  
Worst Case 	=> O(n) as we have n number of partitions  

Implemented QuickSort in QuickSort.java

--------------------------------------------------------------------------------

## Non-Comparison Sorting Algorithms

### Counting Sort
Count the occurrences of the items in the array and store in a different array by incrementing value in the index of the item. Then use this count array to sort the items.  
 
#### Run Time Complexity
Populating Counts		=> O(n) We need to iterate the input array to get the count value.  
Iterating Counts Array	=> O(k) We need to iterate over the counts array and update the value at the index.  
O(n+k)	=> which means O(n).  

#### Space Complexity
Directly depends on the size of the input as we need to create another array for storing counts. Size of the array is depends on the maximum value in the input array. If k is maximum number in the input array, then O(k) is the space complexity.  

Its fast than other sorting algorithms but it needs extra space for the counts array. (Time-Memory Trade-off)

We need to use Counting Sort when  
1) Allocating extra space is not an issue  
2) Value should be positive integers. (array index can't have negative values)  
3) Most of the values in the range are present. (otherwise we will have empty array cells)  

Implemented CountingSort in CountingSort.java

--------------------------------------------------------------------------------

### Bucket Sort
We have to distribute the array into no of buckets and sort this using any sort algorithm then combine the result. Instead of sorting larger array, we can sort smaller buckets and we can sort in parallel as well.

Bucket => item / number of buckets

#### Run Time Complexity
##### Best Case
Distribution		=> O(n) We need to iterate the input array to distribute items to different buckets.  
Iterating Buckets	=> O(k) We need to iterate over the buckets to sort each list and put them to the input array.  
Sorts 				=> In best case, we have single item in each bucket so O(1).  
Total cost is O(n+k+1) which means O(n+k).  

##### Worst Case
Distribution		=> O(n) We need to iterate the input array to distribute items to different buckets.  
Iterating Buckets	=> O(k) We need to iterate over the buckets to sort each list and put them to the input array.  
Sorts 				=> In worst case, we can get O(n^2) (in the case of using InsertionSort).  
Total cost is O(n+k+n^2) which means O(n^2).  

If we allocate more buckets our algorithm runs faster where we have O(n) as complexity. But this comes with additional space. If we reduce the buckets we will have O(n^2) as complexity but we can save memory.  

#### Space Complexity
Assume the number of buckets are k and then each bucket will have linked list to store items in the array which is n. So the space complexity is O(n+k), which we can map as O(n+k).

Implemented BucketSort in BucketSort.java

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

## Searching Algorithms

### Linear Search
Simplest of all the search algorithm. Iterate over array and inspect each item. If we find it we can return the index.  

#### Run Time Complexity
##### Best Case
The target item can be at first index. So O(1) comparison.  

##### Worst Case
The target item can be at last index or not at all present in the array. So we need n comparisons which is O(n).  

As the input grows the complexity of this search algorithm increases.  

Implemented LinearSearch in LinearSearch.java

--------------------------------------------------------------------------------

### Binary Search
Its faster than LinearSearch but it only works on the sorted list. We need to find the middle using left+right/2 formula and then check the middle is lesser or greater than target item, we can continue divide like this and search until our target item found.

#### Run Time Complexity
In every step we are dividing the array into half, so this algorithm runs O(log n) complexity.

#### Space Complexity
1) Recursive	=> If we use recursive functions to implement search, Java Runtime will store these recursive calls in the Stack, the amount of space required in Stack is equal to number of recursive functions, which is O(log n)
2) Iterative	=> O(1) as we have one loop statement stored in Stack.

But both these approaches are good, even though the Iterative approach takes O(1) space, recursive function also takes less space in Stack. For example if have 1 million items in the array, we need totally 19 comparisons to find the target item. log<sub>2</sub>1,000,000 = 19.

Implemented BinarySearch using iterative and recursive approaches in BinarySearch.java

--------------------------------------------------------------------------------

### Ternary Search
Instead of dividing the array into 2 parts, we divide into 3 parts. 
Size of Partitions = (right - left) / 3.  
mid 1 = left + partition size  
mid 2 = right - partition size  

#### Run Time Complexity
In every step we are dividing the array into three parts, so this algorithm runs O(log<sub>3</sub> n) complexity.

log<sub>2</sub> 8 = 3  
log<sub>3</sub> 8 = 1.89  

It doesn't mean that the Ternary Search is faster than Binary Search. Because in the Binary Search we have one mid value to compare with left and right. But in Ternary Search we have two mid values to compare with left and right, which makes more comparison statements. Thus in worst case, Binary Search is faster due to less comparisons.

Implemented TernarySearch using recursive approach in TernarySearch.java

--------------------------------------------------------------------------------



