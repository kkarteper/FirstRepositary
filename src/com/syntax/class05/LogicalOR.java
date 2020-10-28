package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		/*------&&------AND
		 * 
		 * if(True && True)-----TRUE
		 * if(True && False)-----FALSE
		 * if(False && True)------FALSE
		 * if(False && False)------FALSE
		 * 
		 * 
		 * 
		 * ---------||-----OR
		 * 
		 * if(True || True)-------TRUE
		 * if(True || False)-------TRUE
		 * if(False || True)--------TRUE
		 * if(False || False)--------FALSE
		 */
		
		
		String day="Sunday";
		Scanner scan=new Scanner(System.in);
		System.out.println("input a day");
		day=scan.nextLine();
		
		 
		if(day.equals("Saturday") || day.equals("Sunday"))
				System.out.println("Today we have a Java class");
		System.out.println("The end");
		
		
		
		

	}

}
