package com.syntax.class07;

public class whileLoop {

	public static void main(String[] args) {
		//I want to print numbers from 1 to 50
		
		int num=1;
		
		while (num<=50) {
		
		System.out.println(num);
		num++;
		
		}
		System.out.println("============Print 10 To 60 =========================");
		
		// print 10 to 60
		
		int a=10;
		
		while(a<=60) {
			System.out.print(a+" ");//print kullandik yanyana yazdik boslu icin de " " kullandik.
			a++;
		}
		
		System.out.println("======== Print 100 to 60===========================");
		
		int b=100;
		
		while(b>=60) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println("========print even numbers between 10 and 30===================");
	
		int c=10;
		
		while(c<31) {
		    if(c%2==0) {
			System.out.print(c+"*");
		}c++;
			
		}
		//another way
		
		int d=10;
		
		while(d<31) {
			System.out.print(d+",");
			d+=2;
		}
		
		System.out.println();
		System.out.println("============================================");
		 
			    int i=0;
			    while(i<=8){
			      System.out.println(i);
			      i++;}
	}

}
