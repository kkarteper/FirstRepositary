package com.syntax.class12;

public class HW6 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of
		 * all numbers.
		 */
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { -2, -1, 0 } };

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				sum += num[i][j];
			}
		}
		System.out.println("The Total in my array is " + sum);

	}

}
