package com.syntax.class05;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		/*For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
Today you will be learning ____
		 * 
		 * 
		 */
		boolean weekend;
		  String subject;
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Is it weekend?");
		  weekend=scan.nextBoolean();
		  if(!weekend){
		    subject="Manual testing";
		  }else {
		    subject="Java";
		    
		  }
		  System.out.println("Today you will be learning "+subject);
		
		
		
	}

}
