package com.syntax.class06;

import java.util.Scanner;

public class odev3 {

	public static void main(String[] args) {

/*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
 *  any other grade --> Not Acceptable. 
 *  At the end your program should print which grade was entered by a user with explanation.
 * 
 */
		
		
			Scanner input=new Scanner(System.in);
			
			String grade;
			String message;
			
			System.out.println("Please enter grade as a single letter");
			
			grade=input.nextLine();
			
			
			
			switch (grade) {
				
				case "A": 
					message = "Excellent";
					break;
					
				case "B" :
					message = "Good";
					break;
					
				case "C" :
					message = "Average";
					break;
				case "D" : 
					message= "Bad";
					break;
					
				default :
					message= "Not Acceptable";
					
				
			}
			
			System.out.println("Your grade is "+grade+" your work is "+message);
			
		}
	/*Scanner grade = new Scanner(System.in);
	 * 
    System.out.println(“Please enter your grade?“);
    
    char num = grade.next().charAt(0);
    
    String whichGrade;
    
    switch (num) {
    
    case ‘A’:
      whichGrade = “Excellent”;
      break;
    case ‘B’:
      whichGrade = “Good”;
      break;
    case ‘C’:
      whichGrade = “Average”;
      break;
    case ‘D’:
      whichGrade = “Bad”;
      break;
    default:
      whichGrade = “Not acceptable”;
      break;
    }
    System.out.println(“your grade is “+whichGrade);
  }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
