package com.sourceCode.Day1;

public class SameFirstLast {
    public static void main(String[] args) {
//Given an array of ints, return true if the array is length 1 or more, and the first element and the last
// element are equal.

    }


    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
}
