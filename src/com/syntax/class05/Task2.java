package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.*/
		 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please how many years did you work?");
		int years=scan.nextInt();
		
		if(years>=5) {
		System.out.println("what is your salary?");
		int salary=scan.nextInt();
		if(salary>50000) {
			System.out.println("your bonus is 5000.");
		}else {
			System.out.println("Your bonus is 3000");

	}}else {
		System.out.println("you can't get a bonus.");
	}

}}
