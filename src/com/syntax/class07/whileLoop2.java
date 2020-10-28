package com.syntax.class07;

public class whileLoop2 {

	public static void main(String[] args) {

System.out.println("================STRING WHILE===============================");
		String day="Saturday";
		
		if(day.equals("Saturday")) {
			System.out.println("My favorite Java class");//1 executed
		}
		
		
		//   while(day.equals("Saturday")) {
		//	       System.out.println("My favorite Java Class");//infinite executed
		//}
		
		
	System.out.println("========================BOOLEAN WHILE=====================");	
		
	boolean isItBreakTime=true;
	if(isItBreakTime) {
		System.out.println("I will get tea.");//1 TIME EXECUTED
	}

	
	while(isItBreakTime) {
		System.out.println("I will get a cup of coffee");//infinity
	}
	
	
	}

}
