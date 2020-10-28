package com.syntax.class06;

import java.util.Scanner;

public class switchOdev6 {

	public static void main(String[] args) {
// "Please enter 2 numbers and make a calculater.
		
		double num1,num2;
		double result=0;
		char operation;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 2 number");

		num1=scan.nextDouble();
		num2=scan.nextDouble();
		System.out.println("pick one of them *,/,-,+");
		operation=scan.next().charAt(0);
		
		switch(operation) {
		case '+':
			result=(num1+num2);
		break;
		case '-':
			result=(num1-num2);
		break;
		case '*':
			result=(num1*num2);
		break;
		case '/':
			result=(num1/num2);
		break;
		default:
			System.out.println("Error");
		}
			
		if (result!=0) {
			System.out.println("The result is "+ result);
		}
	}
}