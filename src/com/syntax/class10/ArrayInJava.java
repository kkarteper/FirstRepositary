package com.syntax.class10;

public class ArrayInJava {

	public static void main(String[] args) {

		String [] word=new String[4];//word de 4 element var; word[0] ile word[3] de birsey yok bu yuzden output null.
		word[1]="hello";
		word[2]="hi";
		
		System.out.println(word[3]);//null
		System.out.println(word[2]);//hi
		System.out.println(word[1]+" "+ word[0]);//hello null
		
			
		
			System.out.println("===================================================");
	}
}
