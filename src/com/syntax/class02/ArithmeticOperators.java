package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int num1, num2;
		num1=10;
		num2=12;
		
		System.out.println(num1+num2);
		
		
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		
		double num3=10.99;
		double num4=2.99;
		
		double mult=num3*num4;
		
		System.out.println(mult);
		
		double div=num3/num4;
		
		System.out.println(div);//3.6755852842809364
		
		float f=10.99f;
		float f1=2.99f;
		
		System.out.println(f/f1);//3.6755853
		
		// float will give 5 to 6 decimal places of accuracy
		//but double gives 14 to 15 places of accuracy.
		
	System.out.println("the result is = "+mult);	//the result is = 32,8601

	System.out.println("the result is "+f/f1); //the result is 3.6755853

	//TASK
	
	//Write a Java program to add, subtract, multiply and 
	//divide 2 decimal values.
	//Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

	int num10,num20;
	
	num10=20;
	num20=100;
	
	String pro="division";
			
			System.out.println("The "+pro+" of 2 numbers "+num20+" and "+num10+" is equal to "+num20/num10);
	
	
	
	
	
	

	//Write a program to find the square of the number 3.9.
	//You program should say “The square of the ____ is ____ ”

int num11=3;
int num22=9;
			
System.out.println("The square of the "+num11+" is "+num22);
	

//Write a program to print the area and 
	//perimeter of a rectangle with width = 5 and  height = 8.
	//Your program should say. “The perimeter of a rectangle 
	//with width ___ and height ____ is equal to _____ and the area is __”
//	Collapse

int W=5;
int H=8;

System.out.println("The peimeter of a rectangle with width "+W+" and height "+H+" is equal to "+ (H+W) +" and the area is "+ H*W);
	}


}
