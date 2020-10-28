package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group.
		 *  Then print your name from that array. (use 2 different ways of creating an array).
		 */

		
			String[]names= {"Kerim","burju","bryan","danilo"};
			System.out.println(names[0]);
			
			System.out.println("======================");
			
			// 2ND WAY
			
			String[] name=new String[4];
			name[0]="Kerim";
			name[1]="burju";
			name[2]="bryan";
			name[3]="danielo";
			
			System.out.println(name[0]);
			
			
	}

}
