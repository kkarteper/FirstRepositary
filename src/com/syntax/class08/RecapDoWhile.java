package com.syntax.class08;

import java.util.Scanner;

public class RecapDoWhile {

	public static void main(String[] args) {
		/*
		 * waterPrice=$5 money can be less "please enter the money more" otherwise
		 * "enter money less" if user gives u s$5 --- "enjoy your water"
		 * 
		 */
		int waterPrice = 5;
		int money;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay your water");

		do {
			money = scan.nextInt();

			if (money < waterPrice) {
				System.out.println("Water is expensive,Please enter more money");

			} else if (money > waterPrice) {
				System.out.println("The amount is huge,Please enter less money");

			}

		} while (money != waterPrice);

		System.out.println("enjoy your water");

	}

}
