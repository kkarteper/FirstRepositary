import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		/* 1-  You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		  If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		
*/
		
		Scanner amount=new Scanner(System.in);
		
		System.out.println("How amount of loan do you need?");
		int loan=amount.nextInt();
		
		if(loan<=200000) {
			System.out.println("I can lend the money");
		}else {
			System.out.println("I am sorry we can not lend the money");
		}
		
		
		
		
		
		
	}

}
