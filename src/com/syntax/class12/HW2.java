package com.syntax.class12;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime(Prime Number=Asal Sayi) or not?
		 * 
		 */ 
		 
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("please give a number");
		num=scan.nextInt();
		
		if(num%2!=0 && num!=0 && num!=2 && num!=1) {
			System.out.println("The number is a prime number");
		}else {
			System.out.println("Number is not a prime number");
		}
		
		
		
		

	}

}
