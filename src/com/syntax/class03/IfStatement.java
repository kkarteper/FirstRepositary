package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*if(boolean_expression) {true statement} else {false statement}
		
		conditional statements:
		1: if statement
		2.switch case
		
		if(boolean expression) {
		
		code....
		
		}
		
		-----------------------------------------------
		
		if(boolean expression/true) {
		code.....
		}else {//false
		code....
		}
		
		------------------------------------------------
		
		To compare 2 numbers
		
		In Multiple conditions (sayimiz esit olabailir,kucuk olabilir yada buyuk olabilir multiple condition var)
		
		
		if (condition true){
		
				}else if(condition true){
				code....
				}else if(condition true){
				code.....
				}else if(condition true){
				code....
				}else {//if all condition false
				}
		        code....
		
		
		*/
		int num1=180;
		int num2=900;
		
		System.out.println("writing my first if statement");
		
		if (num1>num2) {
			System.out.println("num1 is bigger than num2");// if condition is not right ,so  
		}                                                  //we don't see num1 is bigger than num2 in console
		
		System.out.println("end of if statement");
		
		
		System.out.println("----------------------------");
		
		int temp=70;
		
		if(temp>80) {
			System.out.println("I am going to the beach");
			
		
		}
		
		System.out.println("--------------------------------------");
		
		int temp5=90;
		
		if (temp5>80) {
			System.out.println("i am going to swim");
		}
		
		int temp6=90;
		if(temp6>80) {
		System.out.println("I am going to beach");}else{
			System.out.println("i will go for a walk");
		}
		
		int temp7=60;
		if (temp7>=60) {
			System.out.println("i am going to hawai beach");
		}else {
			System.out.println("I will go jogging");
		}
		
		System.out.println("===================================================");
		
		double expectedHours=15;
		double actualHours=20;
		if (actualHours>expectedHours) {//true
			System.out.println("you will love the course and you will succeed");
		}else {
			
		System.out.println("course will be hard for you");
		}
		// condition is true 20>15 so love the course
		
	}

}
