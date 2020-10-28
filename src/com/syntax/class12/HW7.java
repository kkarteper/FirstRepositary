package com.syntax.class12;

public class HW7 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program
		 * which will identify/print the even numbers only.
		 * 
		 */
		int[][] num = { { 00, 80, 31, 64 }, { 0, 1, 2, 3, 4 }, { 0, -15, -20, -32 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0 && num[i][j] != 0) {
					System.out.print(num[i][j] + ",");
				}
			}
		}
		System.out.println();
		System.out.println("========================2nd way===================");

		for (int[] num1 : num) {
			for (int num2 : num1) {
				if (num2 % 2 == 0 && num2 != 0) {
					System.out.print(num2 + ",");
				}
			}
		}

	}

}
