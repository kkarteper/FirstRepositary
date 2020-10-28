package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// IT es ask a tester on which browser they would like to use
	
	Scanner scan;
	String browser;
	String message;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter a browser");
	browser=scan.nextLine();
	
	switch (browser) {
	case "safari":
		message="Your code will be executed on safari browser";
		break;
	case"chrome":
		message="Your code will be executed on  chrome browser";
		break;
	case "bing":
		message="Your code will be executed on  bing browser";
		break;
	default:
		message="Entered browser is not supported";	
	}
	System.out.println(message);
	}
	//...................onemli.....................
	//switch cannot work with double float and long
	float f=10.99f;
	double d=10.99;
	long l=10099l;
	

}
