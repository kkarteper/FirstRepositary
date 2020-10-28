package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */
		
		double num1,num2,num3,max;
		Scanner scan=new Scanner(System.in);
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		
		if(num1>num2 && num1>num3) {
			max=num1;}
		
		else if(num2>num3) { 
				max=num2;}
				else {
					max=num3;
				}
			System.out.println(max);
		}
		
		
		
		
		
	}


