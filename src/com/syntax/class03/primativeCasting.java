package com.syntax.class03;

public class primativeCasting {

	public static void main(String[] args) {
		
		//Casting in Java ---- converting 1 type to another
		
		//2 types of casting we have;
		
		 /// 1. widening - implict (smt happening automaticly)
		//// byte--- short--->int-->long-->float--->double
		
		//// 2. narrowing - explict (manuel) daraltmak
		///double--->float--->long-->int--->short-->byte
		/*

		Casting
		
		widen/implict casting
		int i=10
	
		double d=10;
		
		narrowing/explicting casting
		byte b=(byte)10998999;
		
		int e =(int)10.99;
		
		
		
		
		
		
		*/
		
		
		double d=15/7;
		System.out.println(d); //2.0 (double 2.0)
		
		System.out.println("==================1==============================");
		
		
		double q=15.0/7.0;
		System.out.println(q); //2.142857142857143
		System.out.println("=======================2==========================");
		
		
		double e=9;//widening
		System.out.println(e); //9.0 widening  smaller type to bigger type
		
		
		int i=(int)9.99;//narrowing
		System.out.println(i);//9  narrowing bigger type to smalller type
		
		
		//byte b=130; byte icin 130 buyuk Java bunu yazdirmaz size eger soyle yaparsaniz;
		
		byte b=(byte)130;//130 is so big for byte onune (byte) eklenirse onu kucultursun en kucugu -126.
		System.out.println(b); //-126 narrowing en kucuk degeri yaziyor narrowing
		
		System.out.println();
		
	}

}
