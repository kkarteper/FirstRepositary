package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A 
		 * if the average score >= 70 and <90 → grade=B 
		 * if the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("enter your quiz score");
		double quiz = input.nextDouble();
		System.out.println("enter your mid term score");
		double midTerm = input.nextDouble();
		System.out.println("enter your final score");
		double finalScore = input.nextDouble();
		
		double average;
		System.out.println("Your average score is "+(average = (double) (quiz + midTerm + finalScore) / 3));
		
		if(average>=90) {
			System.out.println("grade A");
		}else if(average>=70 && average<90) {
			System.out.println("grade B");
		}else if(average>=50 && average<70) {
			System.out.println("grade C");
		}else if(average<50 && average>0){
			System.out.println("grade F");
		}
		
	}

}
