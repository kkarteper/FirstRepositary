package com.syntax.class10;

public class forAndWhile3 {

	public static void main(String[] args) {
		
		boolean condition=true;
		
		for(int i=1;i<=5;i++) {
			System.out.println("I am For Loop");	
			while(condition) {
			System.out.println("I am While Loop");
				break;
			}
			
		}
	}

}
