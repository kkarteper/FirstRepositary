package reviewClass15october;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num1,num2,results;
		 char operation;
		 results=0;//initialize results
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter first two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		System.out.println("Please enter the operation + - / *");
		operation=scan.next().charAt(0);
	

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
