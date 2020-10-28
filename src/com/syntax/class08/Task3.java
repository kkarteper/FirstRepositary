package com.syntax.class08;

public class Task3 {

	public static void main(String[] args) {
		
		
		int result = 1;
		for (int i = 10; i > 1; i -= 2) {//1.deger 10; 2. deger 8; 3. deger 6; 4.deger 4; 5 deger 2; 6.deger 0 ; ama i>1 gecersiz
			result *= i;			     //result 1.deger 10 ile 10; 8 ile result 80; 6 ile 480; 4 ile 1920; 2 ile 3840.
		}
		System.out.println(result);
		
		
		
		System.out.println("===========result1 loop icine alirsak===================================================================");
		
		int result1=1;
		for (int i = 10; i > 1; i -= 2) {//1.deger 10; 2. deger 8; 3. deger 6; 4.deger 4; 5 deger 2; 6.deger 0 ; ama i>1 gecersiz
			result1 *= i;			     //result 1.deger 10 ile 10; 8 ile result 80; 6 ile 480; 4 ile 1920; 2 ile 3840.
		
			System.out.println(result1); // syso(result1) loop icinde iken i nin her degeri icin ayri ayri output cikarir
		}
		
	}

}
