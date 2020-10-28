package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		double money = 5;
		double iceCream = 5.59;

		if (money >= iceCream) {

			System.out.println("I am buying an ice cream.");

		} else {
			System.out.println("sorry no ice cream");
		}

		System.out.println("i am code that executes without any condition");// you can see line 14(if else condition)
																			// and 18 (only println)

	
		
		System.out.println("1.soru========================================================================");

/*1-Create a Java program and name it Double Comparison. Declare 2 double values and if value of first variable is higher then the second, 
print “Double value __ is larger than __ .” Otherwise print...
*/

		int val1=25;
		int val2=13;
		
		if (val1>=val2) {
			System.out.println(val1+" is larger than "+ val2);
			
		}else {
			System.out.println(val1+" is smaller than "+val2);//25 is larger than 13
		}
		
		System.out.println("2.soru=====================================================");
	/*2-Create a Java program and name it Temperature Check. Create variable to store temperature. 
		Your program should check if temperature is below 32 then it should print “Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“.
*/
		System.out.println("===================42th==================");
		
		
		int TemperatureCheck=20;
		
		if (TemperatureCheck<32) {
			System.out.println("Water will freeze with temperature "+ TemperatureCheck);
			
		}else {
			System.out.println("Water will NOT freeze with temperature "+ TemperatureCheck);
		
		}
	
		
		/* if statement 
		 * syntax for if statement
		 * 
		 * if(boolean expression) {
		 * code.......
		 * }else{
		 * code,,,,,}
		 */
		
		System.out.println("===================65th==============");
		boolean sleepy=true;
		
		//if not sleepy ---> I will study otherwise i will take a nap.
		
		if(sleepy==true) {
			System.out.println("I will take a nap");
		}else{
			System.out.println("I will study some Java");
		}
		System.out.println("=============75th========================"); 

	boolean hungry=true;
	if(hungry) {
		System.out.println("i will go eat");
	}else {
		System.out.println();
	}
	
	
	
	
	
	}}





