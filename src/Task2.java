import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*2 - You are DMV representative and you need to ask customer their age. 
		If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
*/
		Scanner input=new Scanner(System.in);
		
		System.out.println("What's your age?");
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("You can get a driver licence");
		}else {
			System.out.println("You should get a learners permit");
		}
		
		
	}

}
