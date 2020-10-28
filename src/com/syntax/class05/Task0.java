package com.syntax.class05;

import java.util.Scanner;

public class Task0 {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter his/her gender "Please enter your gender: M or F" and
		 * their age "Please enter your age"
		 * 
		 * You have 2 conditions: If age is above 25, then check if a user entered F
		 * then the output should be "Woman" otherwise it should say "Man" If age is
		 * below 25, then check if a user entered F then the output should be "Girl"
		 * otherwise it should say "Boy"
		 * 
		 * Example Output: Please enter your gender: M or F Please enter your age Man
		 * 
		 * Example Output: Please enter your gender: M or F Please enter your age Boy
		 * 
		 * Example Output: Please enter your gender: M or F Please enter your age Woman
		 * 
		 * Example Output: Please enter your gender: M or F Please enter your age Girl
		 * Auto-generated method stub
		 */

		char gender;
		int age;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender: M or F");

		gender = scan.next().charAt(0);

		System.out.println("what is your age?");

		age = scan.nextInt();

		if (gender == 'F' && age >= 25) {
			System.out.println("Woman");

		}
		if (gender == 'F' && age < 25) {

			System.out.println("Girl");

		}

		if (gender == 'M' && age >= 25) {
			System.out.println("Man");
		}
		if (gender == 'M' && age < 25) {
			System.out.println("Boy");
		}

	}

}
