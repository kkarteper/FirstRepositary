package com.syntax.class06;

import java.util.Scanner;

public class switchOdev4 {

	public static void main(String[] args) {
		/*
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement.
		 * 
		 * case: 1 will display January
		 * 
		 * case: 12 will display December
		 * 
		 * Anything outside of 12 will display "Invalid"
		 * 
		 * Example Output: Input a number between 1-12 Invalid
		 * 
		 * Example Output: Input a number between 1-12 January
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int number;
		String w;

		System.out.println("Input a number between 1-12");
		number = scan.nextInt();

		switch (number) {
		case (1):
			w = "January";
			break;
		case (2):
			w = "February";
			break;
		case (3):
			w = "March";
			break;
		case (4):
			w = "April";
			break;
		case (5):
			w = "May";
			break;
		case (6):
			w = "June";
			break;
		case (7):
			w = "July";
			break;
		case (8):
			w = "August";
			break;
		case (9):
			w = "September";
			break;
		case (10):
			w = "October";
			break;
		case (11):
			w = "November";
			break;
		case (12):
			w = "December";
			break;
		default:
			w = "Invalid";

		}

		System.out.println(w);

	}

}
