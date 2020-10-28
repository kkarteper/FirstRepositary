package reviewClass15october;

public class LogicalOperators {
	
	////// 3 Logical Operators (No,And,Or)=(!,&&,||)

	public static void main(String[] args) {
	
		String day="Sunday";
		if(day.equalsIgnoreCase("Sunday")){
			System.out.println("relaxxxx");
		}else if(day.equalsIgnoreCase("saturday")) {
			System.out.println("relaxxxx");
		}else {
			System.out.println("work again");
		}
		
		System.out.println("==========================================================");
		
		
		if(day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday")){
			System.out.println("relaxxxx");
		}else {
			System.out.println("work again");
		}
		
		
		
		
		
		
		
	}

}
