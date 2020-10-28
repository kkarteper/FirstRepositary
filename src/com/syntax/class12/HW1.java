package com.syntax.class12;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable? 
		 */
		
		
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x is "+ x);//x=20
		System.out.println("Value of y is "+y);//y=10 sayilar switch oldu
	}

}
