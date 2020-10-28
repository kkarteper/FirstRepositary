package com.syntax.class04;

public class SequenceIsImportant {

	public static void main(String[] args) {
		/* 1----Write a program to store a boolean value of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
		 *  Then if user has a degree program should check a gpa score.
		 *   If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship�?, otherwise → “You should have studied harder�? .
	*/
	

		boolean diploma=true;
		
		double gpaScore=3.8;
		
		if(diploma) {
			System.out.println("Congratulations");
		}
				
				if(gpaScore>=3.5) {
					System.out.println("You are eligible for scholarship");
				}else if(gpaScore<3.5){
					System.out.println("You should study harder");
		}else {
				
			System.out.println("You should get a degree.");
		}
	
	
		System.out.println("========example2===========");
		
		/*	2-----Create a Java program and store values of mortgage rate and mortgage price. 
		*First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house,
		* if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
*/
		
		double rate=5;
		int price=500000;
		
		if(rate<4.5) {
			System.out.println("You can consider buy a house");
			
		if (price>200000) {
			System.out.println("You should take a loan");
		}else {
			System.out.println("You can pay Cash");
		}}else {
			System.out.println("DO NOY BUY A HOUSE");
		
	
		
		}
		
		
		
		
	}

}
