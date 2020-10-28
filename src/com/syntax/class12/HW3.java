package com.syntax.class12;

public class HW3 {

	public static void main(String[] args) {
		/* Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * 
		 *1,3,5,8,13 
		 */
		
		int a=0;
		int b=1;
		int sum;
		for(int i=0;i<=10;i++) {
			System.out.print(a+"- ");
			sum=a+b;
			a=b;
			b=sum;
		}
		
		
	}

}
