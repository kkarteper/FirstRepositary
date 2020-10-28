import java.util.Scanner;

public class scannerDemo2 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("please enter boolean value for rain");//write true or false
		
		boolean rain=input.nextBoolean();

		if(rain) {
			System.out.println("please take an umbrella");
		}else {
			System.out.println("it is a nice weather go for a walk");
		}
		
	}

}
