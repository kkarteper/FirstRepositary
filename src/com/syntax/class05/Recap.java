package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner scanner;//type(Scanner,box imiz), variable(scanner,box a koyacagimiz degisken)"declare the vaariable'
			
		scanner=new Scanner(System.in);//assign the variable(bu degiskeni scanner initiualize yapiyoruz)
		
		// I wanna capture sentence
		
		String sentence=scanner.nextLine();//capturing
		
		
		System.out.println("you entered sentence: "+sentence);

	}

}
