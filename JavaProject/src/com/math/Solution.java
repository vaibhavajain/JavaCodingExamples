package com.math;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public int solution(int[] A) {
		int numOfTrees = 0;
		List<Integer> aCopy = new ArrayList<Integer>();
		for (int i : A) {
			aCopy.add(i);
		} 
		boolean isAestheticAlrdy = false;
		for (int j = 0; j < A.length - 2; j++) {
			if ((aCopy.get(j) - aCopy.get(j + 1) > 0) && (aCopy.get(j + 1) - aCopy.get(j + 2) < 0)) {
				isAestheticAlrdy = true;
			} else if ((aCopy.get(j) - aCopy.get(j + 1) < 0) && (aCopy.get(j + 1) - aCopy.get(j + 2) > 0)) {
				isAestheticAlrdy = true;
			} else {
				isAestheticAlrdy = false;
				break;
			}
		}
		if (isAestheticAlrdy) {
			return 0;
		}
		List<Integer> aCopy2 = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			aCopy2.clear();
			aCopy2.addAll(aCopy);
			aCopy2.remove(i);
			int f = 0;
			boolean isAestheticNow = false;
			while (f < A.length - 3) {
				if (!isAestheticNow && f != 0) {
					break;
				}
				if ((aCopy2.get(f) - aCopy2.get(f + 1) > 0) && (aCopy2.get(f + 1) - aCopy2.get(f + 2) < 0)) {
					isAestheticNow = true;
				} else if ((aCopy2.get(f) - aCopy2.get(f + 1) < 0) && (aCopy2.get(f + 1) - aCopy2.get(f + 2) > 0)) {
					isAestheticNow = true;
				} else {
					isAestheticNow = false;
				}
				f++;
			}
			if (isAestheticNow) {
				numOfTrees++;
			}
		}
		if (numOfTrees == 0) {
			numOfTrees = -1;
		}
		return numOfTrees;
	}
}
