package com.syntax.class07;

import java.util.Scanner;

public class scannerAndLoop {

	public static void main(String[] args) {
		// ask user what his/her name is 5 times

		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		int number=1;
		
		while(number<6) {
		
		System.out.println("What is your name?");;
		name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		System.out.println("--------------------------");
		number++;
		}
		
		System.out.println("====================================================================");
		
		
		
		
		
		
	}

}
