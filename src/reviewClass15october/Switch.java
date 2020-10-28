package reviewClass15october;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		/*
		 * using scanner class create calculator
		 * allow user to enter numbers and operator (+,/,*,-)
		 * Based on operator provide the result to user
		 */
		 int num1,num2,results;
		 char operation;
		 results=0;//initialize results
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter first two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		System.out.println("Please enter the operation + - / *");
		operation=scan.next().charAt(0);
		
		if(operation=='+') {
			results=num1+num2;
		}else if(operation=='-') {
			results=num1-num2;
		}else if(operation=='*'){
				results=num1*num2;
		}else if(operation=='/') {
			results=num1/num2;
		}else {System.out.println("Invalid operation");
		}
		
		System.out.println(results);
		System.out.println("============SWITCH=====================");
		
		switch(operation) {
		case '+':
			results=num1+num2;
			break;
		case '-':
			results=num1-num2;
			break;
		case '*':
			results=num1*num2;
			break;
		case '/':
			results=num1/num2;
			break;
			default:
				System.out.println("Invalid operation");
		}
		System.out.println(results);
		
		
		
		
		
		
		
		
		
	}
	

}
