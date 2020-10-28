package com.syntax.class08;

public class Task4 {

	public static void main(String[] args) {
// sum even and odd numbers between 1 to 50
		
		int sumO=0;
		int sumE=0;
		
		
		for (int n=1; n<51; n++) {
			if(n%2==0) {
				sumE=sumE+n;					/// sumE+=n;
			}else {
				sumO=sumO+n;					/// sumO+=n; shorter way
			
			}
			
		}
		System.out.println("the odd numbers totatly between 1 to 50= "+ sumO);
		System.out.println("the even numbers totatly between 1 to 50= "+ sumE);
	}

}
