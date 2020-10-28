import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		/*Write a program to find the largest number among three distinct numbers using nested if condition
		Please use Scanner class to take input from users

		Expected Output:
		Please enter 3 distinct numbers
		The largest number is 
		
		*/
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		
		int num1 = userIn.nextInt();
		int num2 = userIn.nextInt();
		int num3 = userIn.nextInt();
		
		if (num1>=num2) {
			if(num1>=num3) {
			System.out.println("The largest number is "+num1);
		}
		}if (num2>=num1) {
			if(num2>=num3) {
			System.out.println("The largest number is  "+num2);
		}
	}if (num3>=num1) {
			if (num3>=num2) {
		       System.out.println("The largest number is "+num3);
			}
	}
	}}
