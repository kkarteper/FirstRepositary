import java.util.Scanner;

public class scannerDemo3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name=input.next();// String name=input.nextLine(); da yazabilirdik
		
	
		System.out.println("please enter your age");
		int age=input.nextInt();
		
		System.out.println(age);
		System.out.println("Your name is "+name+" and you are "+ age+ " years old");
		
		
		
	}

}
