package reviewClass10october;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age");
			
		age = scanner.nextInt();
			
			if(age<=18) {
				System.out.println("You should study");
			}else {
				System.out.println("You should work");
			}

	}

}
