package com.syntax.class05;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"*/

		 String word1,word2,Output=null;
		 int int1,int2;
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter two strings");
		 word1=scan.next();
		 word2=scan.next();
		 
		System.out.println("Please enter two numbers");
		int1=scan.nextInt();
		int2=scan.nextInt();
		
		if(int1==int2 && word1.equalsIgnoreCase(word2)) {
			Output="AND";}
		
		else if(int1==int2 || word1==word2) {
				Output="OR";}
			
		else if(int1!=int2 && word1!=word2) {
					Output="NONE";}
				
					System.out.println("Output= "+Output);
				}
			
		
		
		
		
		
		
		
	}


