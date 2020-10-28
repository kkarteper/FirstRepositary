package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*1-Prompt the user to enter person heights in inches. Person should be classified as one of the following:
short (under 60 inch)
medium(between 60 -72 inch)
tall (over 72 inch)*/




		
		Scanner height=new Scanner(System.in);
		System.out.println("Enter your height");
		int inch=height.nextInt();
		
		if(inch<60) {
			System.out.println("You are short.");
		}else if(inch>=60 && inch<72) {
			System.out.println("You are medium.");
		}else if(inch>=72) {
			System.out.println("You are tall.");
		}
		
		
		
	}

}
