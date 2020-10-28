package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] num=new int[5];// array de 5 element var
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//to access element from your array?
		
		System.out.println(num[3]);
		System.out.println(num[2]+num[4]);
		
		//i would like to change 50 to 100
		
		num[4]=100;
		System.out.println(num[4]);
		
		System.out.println("========================");
		
		String array[]=new String[2];// array de 2 adet element var ve bunlar string
		
		array[0]="Hello";
		array[1]="Whatsup";		
	}

}
