package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {
		
		int result=0;

		for(int i=10;i>6;i--) {
			result*=i;
			System.out.println("the value of result "+result);
		}
		// outputumuz alt alta 4 defa the value of result 0 dir.
		
		
		System.out.println();
		System.out.println("===============syso nun yerini degistirelim==========");
		
		

		for(int i=10;i>6;i--) {
			result*=i;
		}

		System.out.println("the value of result "+result);

		// outputumuz tek line ve sadece the value of result 0 dir.
	}

}
