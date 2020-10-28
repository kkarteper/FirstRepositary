package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("====================Print numbers from 1 to 100 in 1 line with space===========================");
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("==================Print numbers from 100 to 1 in 1 line====================================");
	
		for(int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("==================Print even numbers from 20 to 1 (2 ways)===================================");
		
		//first way
		
		for(int j=20;j>=1;j--) {
			if(j%2==0) {
			 System.out.print(j+" ");
		 }
		}
		System.out.println();
		
		//second way
		
		for(int j=1;j<=20;j++) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("==================Print odd numbers between 20 and 50 (2 ways)===================================");
		
		//first way
		for(int i=50;i>=20;i--) {
			if(i%2==1) {
				System.out.print(i+" ");

			}
		}
		System.out.println();
		
		//second way
		
		for(int k=20;k<=50;k++) {
			if(k%2==1) {
				System.out.print(k+" ");
			}
		}
		
		
		
		
		
	}

}
