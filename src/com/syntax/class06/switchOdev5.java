package com.syntax.class06;

import java.util.Scanner;

public class switchOdev5 {

	public static void main(String[] args) {
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: "Your favorite car is ___"
		 */

		String car;
		String w;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		car = scan.nextLine();

		switch (car) {
		case "BMW":
			w = "german car";
			break;
		case "Toyota":
			w = "japanese car";
			break;
		case "Maserati":
			w = "italian car";
			break;
		default:
			w = "unknown";

		}
		System.out.println("Your favorite car is " + w);

	}

}
