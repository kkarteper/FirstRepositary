package com.syntax.class04;


//shortcut to import Ctrl+shift+o


import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		//in Java scanner class is used for reading in primitive data types like int,double,float etc.and objects of type strings.
		
		int num=80;//declarable part=assignable part
		String str="I am a String";//non primitive code begins upper case like String
		
		Scanner scan=new Scanner(System.in);//take something from console,enable input to the console	
		
		System.out.println("please enter any text");
		String value=scan.nextLine();//waits for your input and once  ypou provided
		
		
		System.out.println("I captured String value = "+value);
		
		
		System.out.println("PLEASE ENTER YOUR NAME");
	    String name=scan.next();
	    System.out.println("nice to meet you "+name);
	
	
	
	
	
	
	}

}
