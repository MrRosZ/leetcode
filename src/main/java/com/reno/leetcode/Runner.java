package com.reno.leetcode;

import com.reno.leetcode.array.CheckIfNAndItsDoubleExist;
import com.reno.leetcode.array.MergeSortedArray;
import com.reno.leetcode.array.RemoveDuplicatesFromSortedArray;
import com.reno.leetcode.array.RemoveElement;

public class Runner {
    public static void main(String[] args) {
        /*MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        mergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0);
        mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1);*/
        /*RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        removeElement.removeElement(new int[]{3,2,2,3}, 3);*/
        /*RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();
        removeDuplicates.removeDuplicates(new int[]{1,1,2});*/
        CheckIfNAndItsDoubleExist result = new CheckIfNAndItsDoubleExist();
        System.out.println(result.checkIfExist(new int[]{10,2,5,3}));


    }
}