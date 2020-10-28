package com.syntax.class10;

public class forAndWhile {

	public static void main(String[] args) {
		
		boolean condition=true;
		while(condition) {
			System.out.println("I am While Loop");
			for(int i=1;i<=5;i++) {
				System.out.println("I am For Loop");
			}
			break;//break koymazsak while dan dolayi 1 kez number 9 5 kez number 11 sonsuza kadar surekli consolada devam eder
		}	
		
	}

}
