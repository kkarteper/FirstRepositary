package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		/*
		 * variable for alergy -Yes/No if allergy Yes=== we will check pet allergy if
		 * peanut allergy if pollen allergh
		 * 
		 * if no allergy You are lucky
		 */
		System.out.println("=============================================");
		boolean allergy = false;

		if (allergy) {
			System.out.println("Let's do further check");
		} else {
			System.out.println("You are lucky");
		}
		System.out.println("=========example 1=============");

		boolean Allergy = true;
		boolean petAllergy = true;

		if (Allergy) {
			System.out.println("LET'S do further check");
			if (petAllergy) {
				System.out.println("Pls. no cats and dogs in your house");
			}
		} else {
			System.out.println("Yo are lucky");
		}

		System.out.println("===========exm 2=======================");
/*
 * If today is Friday I am gonna watch movie but I'd like to check the date.
 *  if date is 13th, watch to scary movie
 *  and if it is not watching comedy movie
 *  
 *  if today is not friday i am studying
 
 */
		boolean isFriday =true;
		int date=4;
		
		if(isFriday) {
				if(date==13) {
					System.out.println("I will watch Scaryu Movie");
				}else {
					System.out.println("I will watch Comedy Movie");
				}
	
		}else {
				
			System.out.println("Today is not Friday i am studying");
	
	}
	
	System.out.println("=========Example 3=====================");
		
		/*check if assignment is completed
		 * if assignment is completed
		 * 				if score>90--->great job
		 * 				if score>80---->good job
		 *				if score >70---->please study more
		 *
		 *	
	*/
		
	int score=65;
	
	boolean assignment=true;
	
	if(assignment) { // oncelikle 75 satirin elsekismini onceden yazin yani ilk 75 yazildiktan sonra 87 i yaz
		//sonrasinda 75 true ise nestle if leri yaz
			if(score>90) {
				System.out.println("You did a Great Job");
			}else if(score>80) {
				System.out.println("You did a Good Job");
			}else if(score>70) {
				System.out.println("Please study more");
			}else {
				System.out.println("Good for trying but you must study!!!");
			}
	
	}else {
		System.out.println("You should always complete all assignments");
	}
	
	
	
	
	
	
	
}}
