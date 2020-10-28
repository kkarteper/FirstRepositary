package com.syntax.class05;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born ______”.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the which months you were born?");
		String month;
		String season;
		month=scan.nextLine();
		
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("Decemeber")){
			season="Winter";
			
		}else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("March")){
			season="Spring";
			
		}else if(month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("June")){
			season="Summer";
			
		}else if(month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("September")) {
			season="Fall";	
		}else {
			season="Invalid month";
		}
		
		System.out.println("You were born in "+season);

	}}