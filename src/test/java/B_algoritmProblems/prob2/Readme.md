Subarray having number of elements as K which sum is less than X
* Problem: With an array arr[] and two integers K and X,
  find the maximum sum among all concatenated subarrays of size K which sum is less than X.

------------------------
*Input: arr[] = {20, 2, 3, 10, 5}, K = 3, X = 20
* Output: 18

* explanation
  ``` A subarray of number 3(K) is
  [
    [20, 2, 3],
    [2, 3, 10],
    [3, 10, 5],
  ]
  The largest subarray sum less than 20(X) is {3, 10, 5}.
  So the required output is 18.
  ```
------------------------
*Input: arr[] = {-5, 8, 7, 2, 10, 1, 20, -4, 6, 9}, K = 5, X = 30
* Output: 29
* explanation
  ```
  A subarray of size 5 with a maximum sum less than 30 is {2, 10, 1, 20, -4}. So the required output is 29.
  ```