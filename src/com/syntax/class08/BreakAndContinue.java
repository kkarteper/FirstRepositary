package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		//break
		
		for(int i=1;i<4;i++) {
			System.out.println("hello");
			break;// output= only one Hello
		}
		
		System.out.println("===========================");
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			
			if(i==5) {
				break;
			}
		}
		

	}

}
