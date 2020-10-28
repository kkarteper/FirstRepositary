import java.util.Scanner;

public class calismaca {
/*
 * Write a program to take user name, age and mobile number

First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"

Example Output: 
Enter your name
Enter your mobile number
Enter your age
Your name is Weqas, your age is 45 and your mobile number is 571-339-9999

 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=input.next();
		
		System.out.println("Enter your mobile number");
		String number=input.next();
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		System.out.println("Your name is "+name+",your age is "+age+" your mobile number is "+number);

	}

}
