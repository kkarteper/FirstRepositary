package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {

		/// for(initialization; condition;decrement/increment){
		// code;
		// }

		for (int i = 1; i <= 5; i++) {
			System.out.println("good morning");
		}

		// 5 times will be written Good Morning in your console.

		System.out.println("==========I wanna print number 1 to 100================");

		// for(start point; end point; increment/decrement){
		// code:
		// }

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("==========I wanna print number 10 to 0================");

		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=======================example================================");

		for (int i = 0; i <= 30; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=======================example2===============================");

		for (int i = 50; i >= 0; i -= 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("======================example 3================================");

		for (int i = 100; i >=20;i /= 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("=========================example 4================");
		  
		for(int i=1;1<11;i++){
		      System.out.print(i);
		    }
		
		
		    
		  
	} 
	}


