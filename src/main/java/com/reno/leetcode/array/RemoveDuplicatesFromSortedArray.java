package com.reno.leetcode.array;
//Facebook, Google, Microsoft,Walmart
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[result] != nums[i]){
                nums[++result] = nums[i];
            }
        }
        System.out.println(result + 1);
        return result + 1;
    }
}
