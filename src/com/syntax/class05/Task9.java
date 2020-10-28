package com.syntax.class05;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score>=40 and <50 >
		 * grade=D if the average score<40 → grade=F
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz, midTerm, fscore;
		quiz = scan.nextInt();
		System.out.println("Please enter your mid term score");
		midTerm = scan.nextInt();
		System.out.println("Please enter your Final score");
		fscore = scan.nextInt();

		double avg;
		avg = (quiz + midTerm + fscore) / 3;

		System.out.println("Your average is " + avg);
		char grade;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 70 && avg < 90) {
			grade = 'B';
		} else if (avg >= 50 && avg < 70) {
			grade = 'C';
		} else if (avg >= 40 && avg < 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Your grade is " + grade);

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are a good student");
		} else if (grade == 'C' || grade == 'D') {
			System.out.println("You should study more");
		} else {
			System.out.println("You must study hard");
		}

	}
}
