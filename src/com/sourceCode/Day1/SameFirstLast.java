package com.sourceCode.Day1;

public class SameFirstLast {
    public static void main(String[] args) {


    }


    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
}
