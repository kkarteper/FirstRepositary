package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	/*/*
         * Create a Java program that will ask if user has a credit card or not. If you
         * user does not have a credit card then offer them. If they do have one ask
         * what is balance on the card? If balance of the card is larger than 1000, tell
         * them to pay off immediately, otherwise you can tell them that they can spend
         * more.
         */

		
		Scanner scan;
		boolean answer;
		double balance;
		
	    scan=new Scanner(System.in);
	  	
		System.out.println("Do you have a credit card? true or false");
        answer=scan.nextBoolean();
        
        if(answer) {
        	System.out.println("what is your balance?");
        	balance=scan.nextDouble();
        	if(balance>1000) {
        		System.out.println("Pay off immediately");
        	}else {
        		System.out.println("U can spend more");
        	}
    
        }else {
        	System.out.println("Would you like to get one?");
        }
        
        
        System.out.println("======================================================================");
        /*
        
		
	    scan=new Scanner(System.in);
	  	
		System.out.println("Do you have a credit card?);
        answer=scan.nextBoolean();
        
        if(answer.equalsIgnoreCase("yes")) {
        	System.out.println("what is your balance?");
        	balance=scan.nextDouble();
        	if(balance>1000) {
        		System.out.println("Pay off immediately");
        	}else {
        		System.out.println("U can spend more");
        	}
    
        }else {
        	System.out.println("Would you like to get one?");
        }
        
        */
 }

}
