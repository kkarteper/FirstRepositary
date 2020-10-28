import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*3- Create a Java program that will ask user to input city and temperature. 
		Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __” 
		
		*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please input the temprature");
        int t=input.nextInt();
       
		System.out.println("Please input city");
		String city=input.next();
		System.out.println("The temprature is the city "+city+" is "+ (t-32)/1.8);
		
		
		
	}

}
