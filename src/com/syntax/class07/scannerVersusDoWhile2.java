package com.syntax.class07;

import java.util.Scanner;

public class scannerVersusDoWhile2 {

	public static void main(String[] args) {
		// 
		// play a lottery  where we need to enter a number from 1 to 100
		//lucky number is 7, enter a number, if user enter 7, you are the winner
		
		
		Scanner scan=new Scanner(System.in);
		int userNumber;
		int luckyNumber=7;
		
		
		
		   do {
			   System.out.println("enter the number");
			   userNumber=scan.nextInt();
		   }while(userNumber!=luckyNumber);
		   
		   System.out.println("you are the winner");
		

	}

}
