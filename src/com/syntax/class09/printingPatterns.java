package com.syntax.class09;

public class printingPatterns {

	public static void main(String[] args) {

		
		/* Make a  5 row,10 colon * 
		 * 
		 */

		for(int i=1;i<=5;i++) {
			for(int k=1;k<=10;k++) {
			System.out.print("*");
		}
			System.out.println();

		}	
		
	System.out.println("===============================================================");
	
	/*
	 * Write a program to print out the pattern: 

$$$$$$
$$$$$$
$$$$$$
$$$$$$

	 */
	
	//6 sutun ve 4 kolon
	
	for(int k=1;k<=4;k++) {
		for(int i=1;i<=6;i++) {
			System.out.print("$");
		}
		System.out.println();
	}
	
	// 2 nd way
	System.out.println("======================2 nd way=========================");
	
	for(int i=1;i<5;i++){
	      System.out.println("$$$$$$");
	    }
	
	
	
	
	}

}
