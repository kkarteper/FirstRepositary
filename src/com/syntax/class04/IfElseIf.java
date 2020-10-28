package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
		/* we need to compare 2 numbers:
		 * bigger smaller equal
		 * 
		 * 
		 */
		int num1=99;
		int num2=99;
		
		if(num1>num2) {// what is this condition is true
		System.out.println(num1+" is bigger than "+num2);
		}else if(num1<num2) {//or what if this is true
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
			
		}
		System.out.println("-----------------------------------");
		
		
		/*Based on the day of the week we will print class schedule
		 * 
		 * 
		 * 
		 * 
		 */
		int day=7;// 7 days in a week
		
		//if(day=1) { error because = is assinging///// == is equal
		//if(day==1) CORRECT == it means equal
		
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if(day==2) {
			System.out.println("Todayu is Tuesday we have Manuel Class");
		}else if(day==3) {
			System.out.println("Today is Wednesday and we have Manuel Class");
		}else if(day==4) {
			System.out.println("Today is Thursday we have Review Class");
		}else if(day==5) {
			System.out.println("Today is Friday we have no class");
		}else if(day==6) {
			System.out.println("Today is Saturday I miss Java Class");
		}else if(day==7) {
			System.out.println("Today is Sunday I did a lot of coding");
		}else {
			System.out.println("This is invalid day of a week");
		}
		
		System.out.println("---------------------------------------------------");
		
		
		/*
		 1* Create a Java program and declare int variable that will hold a month. 
		  Based on the value of the variable your program should print the name of the month.
			2*Write a program to check whether number is positive or negative.
			3*Write a Java Program to check whether number is Even or Odd. * 
		 */
		
		int month=9;
		
		if(month==1) {
			System.out.println("January");
		}else if(month==2) {
			System.out.println("February");
		}else if(month==3) {
			System.out.println("March");
		}else if(month==4) {
		System.out.println("April");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("June");
		}else if(month==7) {
		System.out.println("July");
		}else if(month==8) {
			System.out.println("August");
		}else if(month==9) {
		System.out.println("September");
		}else if(month==10) {
			System.out.println("October");
		}else if(month==11) {
			System.out.println("November");
		}else if(month==12) {
			System.out.println("December");
		}else {
			System.out.println("invalid month");
		}
		System.out.println("====================================================");
		/*2*Write a program to check whether number is positive or negative.
		 * 
		 */
		
		int num=0;
		
		if (num<0) {
			System.out.println("The number is negative.");
		}else {
			System.out.println("the number is positive.");
		}
		
	
		/*
		 * 
		 * 
		 * 3*Write a Java Program to check whether number is Even or Odd. (cift sayi yada tek sayi* 
		
		 
		 int number2 = 2;
   			if (number2 % 2 == 0) {
      			System.out.println("The number " + number2 + " is even");
   				} else {
      	System.out.println("The number " + number2 + " is odd");
   		}
   
   */
	
		/*
		 * 
		 * Nested If
		
		
		if (boolean) {
			code...
			    if () {
			}
		
		}else{
		
		}
		
			*/
		
		
			
			
			
			
			
		
		
		
		
	

}}
