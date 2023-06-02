package com.reno.leetcode;

import com.reno.leetcode.array.MergeSortedArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        mergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0);
        mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1);

    }
}
