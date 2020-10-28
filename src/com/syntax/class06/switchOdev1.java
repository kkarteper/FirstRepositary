package com.syntax.class06;

import java.util.Scanner;

public class switchOdev1 {

	public static void main(String[] args) {
/*First Output: "Enter name of the instructor"

case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if the user provides any other names --> " Invalid instructor selected"
 * 
 * 
 */
		String instructor;
		String message;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		instructor=scan.nextLine();
		
		switch (instructor) {
			case "Asghar":
			message="Will take care of Java Assignment";
			break;
			case "Moazam":
			message="Will take care of SDLC Assignment";
			break;
			case "Weqas":
			message="Will take care of Selenium Assignment";
			break;
			case "Asel":
			message="Will take care of every Assignment";
			break;
			default:
			message="Invalid instructor selected";
	}
System.out.println(message);
	}}
