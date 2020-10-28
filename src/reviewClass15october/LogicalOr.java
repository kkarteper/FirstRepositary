package reviewClass15october;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		
		if(number>=0) {
			if(number<=100) {
			System.out.println("Number is between 0 and 100");
			}else{
			System.out.println("Number is not between 0 and 100");
		}
		
	}else{
			System.out.println("Number is not between 0 and 100");
		}
		
		System.out.println("=====================================");
		
		
		if(number>=0 || number<=100) {
			System.out.println("Number is between 0 and 100");
		}else {
			System.out.println("Number is not between 0 and 100");

		}
		
		
		
		
	}

}
