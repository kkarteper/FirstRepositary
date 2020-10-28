package com.syntax.class05;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * day is 1 or 5--- I am off.
		 * day is 2 or 3---GIT Class
		 * day is 4----review class
		 * day is 6 or 7 ----Java class
		 * the other numbers are invalid.
		 */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please a day number between from 1 to 7");
		int day;
		day=scan.nextInt();
		
		if(day==1 || day==5) {
			System.out.println("I am off");
		}else if(day==2 || day==3) {
			System.out.println("GIT Class");
		}else if(day==4) {
			System.out.println("review class");
		}else if(day==6 || day==7) {
			System.out.println("Java Class");
		}else {
			System.out.println("The others numbers are invalid");
		}
	}

}
