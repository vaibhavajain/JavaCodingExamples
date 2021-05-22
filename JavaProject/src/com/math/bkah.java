package com.math;

public class bkah {
	public static void main(String[] args) {
		int N = 5;
		int count = (N % 2 == 0)? N:N-1;
		String solution = "+";
		for (int i = 1; i <= count; i++) {

			if (N % 2 == 0 && i == 1) {
				N--;
				continue;
			} else if (N % 2 == 0) {
				solution = solution + "+";
			} else
				solution = solution + "-";
			
			N--;
		}
		System.out.println(solution);
		
	}
}
