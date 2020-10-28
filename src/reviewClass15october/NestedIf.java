package reviewClass15october;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		String password;//password=pass123 olsun if icerisinde passwordu pass123 olarak girecegiz
		double accountBalance=1000;
		
		Scanner scan=new Scanner(System.in);
		double transferAmount;
		
		System.out.println("Welcome to Syntax please enter your password");
		password=scan.nextLine();
		
		if(password.equals("pass123") || "pass123".equals(password))  {//her iki equals dan birini kullanabilirsiniz
			
			System.out.println("please enter the amount that you want to transfer");
			transferAmount=scan.nextDouble();
			
			if(transferAmount>accountBalance) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("Transfered remaining balance "+ (accountBalance-transferAmount));
			}
			
		}else {
			System.out.println("Sorry try again Invalid credentials");
		}
		
		
		
		
		
		
		
		
		
	}

}
