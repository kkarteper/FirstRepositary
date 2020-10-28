package com.syntax.class05;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..
		 * if and logical operators provided by a user (numbers must be distinct)
Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
Click to expand inline
		 * 
		 * 
		 */

		int x,y,z;
		int LN=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first numbers");
		x=scan.nextInt();
		System.out.println("please enter second numbers");
		y=scan.nextInt();
		System.out.println("please enter third numbers");
		z=scan.nextInt();
		if(x>y && y>z) {
			LN=x;}
		else if(x>y && z>x) {
			LN=z;
		}else if(x<y && z<y) {
			LN=y;
	}
	 System.out.println("The largest number is "+LN);
	}

}
