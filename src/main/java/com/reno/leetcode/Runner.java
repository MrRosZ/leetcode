package com.reno.leetcode;

import com.reno.leetcode.array.*;

import java.util.Arrays;

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
        /*CheckIfNAndItsDoubleExist result = new CheckIfNAndItsDoubleExist();
        System.out.println(result.checkIfExist(new int[]{10,2,5,3}));*/
        /*ValidMountainArray mountainArray = new ValidMountainArray();
        System.out.println(mountainArray.validMountainArray(new int[]{0,3,2,1}));*/
        /*ReplaceElementsWithGreatestElementOnRightSide replaceElements = new ReplaceElementsWithGreatestElementOnRightSide();
        int[] result = replaceElements.replaceElements(new int[]{17,18,5,4,6,1});
        System.out.println(Arrays.toString(result));*/
        /*MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0,1,0,3,12});*/
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] result = sortArrayByParity.sortArrayByParity(new int[]{3,1,2,4});
        System.out.println(Arrays.toString(result));


    }
}