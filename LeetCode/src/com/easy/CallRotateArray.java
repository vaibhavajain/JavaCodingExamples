package com.easy;

import java.util.Arrays;

public class CallRotateArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		// right rotate k times = left rotate n-l times
		int k = 6; int l=6;
		RotateArray rt = new RotateArray();
		k=k%nums.length;
		rt.rightRotate(nums, k, nums.length);
		System.out.println(Arrays.toString(nums));

	}

}
