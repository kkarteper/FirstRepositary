package com.syntax.class03;

public class RelationOperators {

	public static void main(String[] args) {
		
		// == it means equal
		// != it means not equal
		
		int a=10;
		int b=15;
		
		System.out.println(a>b);//false
		
		System.out.println(a<b);//true
		
		System.out.println(a==b);//false
		
		System.out.println(a!=b);//true
		
		
		int x=100;
		int y=90;
		
		boolean result=x>y; // variation boolean olmali cunku = arkasindaki x>y dogrudur yani true dur o da boolean a aittir. 
		
		System.out.println(result);//true
		
		result=x==y;// y x e esit degildir boylece False
		System.out.println(result);//false
		
		
		System.out.println("----------33th-----------");
		System.out.println(x==y);//false compare yapip x equal to y. FALSE
		System.out.println(x=y);//90 assigning value of y to variable x; y assigning to x
		System.out.println(y=x);//90
		System.out.println(x);//90
		
		
		boolean result1=x==y;
		System.out.println(result1);//true
		
		System.out.println("--------43th--------------");
		
		byte num=10;
		byte num1=10;
		
		boolean boo=num>=num1;//true
		System.out.println(boo);
		
		byte num12=10;
		byte num13=11;
		
		boolean boom=num12>num13;
		System.out.println(boom);//false
		
		System.out.println("result of boo  = "+boo);// result of boo = true
		
		
		System.out.println("----------------------");
		
		
		
		
		
	}

}
