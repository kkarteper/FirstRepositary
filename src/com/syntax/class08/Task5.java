package com.syntax.class08;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 */
		for (int a = 50; a >= 1; a--) {
			if (a % 3 == 0) {
				continue;
			}
			System.out.print(a + " ");
		}

		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking.
		 */

		String response;
		Scanner scan=new Scanner(System.in);
		do {
		
		System.out.println("Would you like to apply the credit card?");
		response=scan.nextLine();
		}while(!response.equalsIgnoreCase("yes"));
		
		System.out.println("you are selected");
	}

}
