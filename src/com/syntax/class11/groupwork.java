package com.syntax.class11;

public class groupwork {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable?
		 * 
		 * 
		 * Write a java program to check whether a given number is prime or not?
		 * 
		 * 
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * 
		 * 
		 * Maximum and minimum number in the array?
		 * 
		 * 
		 * Write a java program to find the second largest number in the array?
		 * 
		 * 
		 * Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of
		 * all numbers.
		 * 
		 * 
		 * Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program
		 * which will identify/print the even numbers only.
		 * 
		 * 
		 * Create a 2D array to store numbers and calculate sum of all odd numbers.
		 */

		int[][] a = { {0, 1, -2, 3 }, { 4, -5 } };

		System.out.println(a.length); 

		System.out.println("==================");//2

		int sum = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					sum += a[i][j];
				}
			}
		}
		System.out.print("The total of odd numbers in this array is "+sum);
		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 * 
		 * 
		 */

	}

}
