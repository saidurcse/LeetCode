import java.io.*;
import java.util.*;

public class Solution {

	/*
     * Given an array, find the contiguous subarray with the largest sum.
     * Input: -4, 2,-5,1,2,3,6,-5,1
     * Output: the largest sum subarray starts at index 3 and ends at 6 and the largest sum is 12
     *
     *
     * Below solution has:
     * Runtime Complexity - Linear, O(n).
     * Memory Complexity - Constant, O(1).
     *
     * This can be solved by Kadane's algorithm:
     * Basic idea of Kadane's algorithm is scanning the entire array and at each position finding the maximum sum of
     * subarray ending there.
     * This is achieved by keeping a current maximum for the current array index and a global maximum.
     * */
	
    public static int maxSubArray(int[] nums) {
    	
    	int size = nums.length;
        int maxSoFar = Integer.MIN_VALUE; 
        int maxAtEnd = 0;
 
        for (int i = 0; i < size; i++)
        {
        	maxAtEnd = maxAtEnd + nums[i];
            if (maxSoFar < maxAtEnd)
            	maxSoFar = maxAtEnd;
            if (maxAtEnd < 0)
            	maxAtEnd = 0;
        }
        return maxSoFar;

    }

    public static void main(String[] args) {
        int[] arr = {-4, 2,-5,1,2,3,6,-5,1};
        System.out.println(maxSubArray(arr));
    }
}

/* Output: 12 */
