package com.reno.leetcode.array;

import java.util.*;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        //time: O(n), space: O(n)
        /*int[] result = new int[nums.length];
        int min = 0;
        int max = nums.length-1;
        for (int num:nums) {
            if (num % 2 == 0){
                result[min++]= num;
            }else{
                result[max--]=num;
            }
        }
        return result;*/
        //time: O(n), space: O(1)
        int min = 0;
        int max = nums.length-1;
        while (min < max){
            if (nums[min] % 2 == 0){
                min++;
            }else{
                if (nums[max] % 2 == 0){
                    int temp = nums[max];
                    nums[max] = nums[min];
                    nums[min] = temp;
                }
                max--;
            }
        }
        return nums;
    }
}
