package com.syntax.class08;

import java.util.Scanner;

public class recap {

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
		money = scan.nextInt();

		while (waterPrice != money) {
			if (money < waterPrice) {
				System.out.println("Water is expensive,Please enter more money");
				// money = scan.nextInt(); (***in if you do not need to capture 2 times.capture
				// after while. capture in line 31

			} else {
				System.out.println("The amount is huge,Please enter less money");
				// money = scan.nextInt();

			}
			money = scan.nextInt();

		}

		System.out.println("enjoy your water");

	}

}
