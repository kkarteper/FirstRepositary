package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {

		String name="Olga";
		
		//I'd like to say : My name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		
		//I'd like to print Olga Sorrels
		
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		// Olga lives in Miami
		
		System.out.println(name+" "+"lives in"+" "+city);
		
		System.out.println(name+" lives in "+city);
		
		
		char grade='B';
		
		//olga is B student
		
		System.out.println(name+" is "+grade+" student");
		
		int age=21;
		
		//Olga is 21 years old
		
		System.out.println(name+" is "+age+" years old.");
			/* to attach / concatenate(ard arda baglamak birlestirmek)
			  ANY value (char, int,String,double)
			 * to a string we use +(String concatenation operator)
			 * */
			 
		
		int date=27;
		String month="September";
		System.out.println(date+" "+month);
		System.out.println(date+" "+"month");	 
		
		String state="DC";
		String anotherState=" DC";
		// it's completely different thing "DC" and  " DC"
	// because there is a space	in 2 strings
		// First String has 2 characters "DC"
		// Second Strings has 3 characters "DC "
		
		System.out.println(state);
		System.out.println(anotherState);
		
		
		
		
		
		
		
	}
	

}
