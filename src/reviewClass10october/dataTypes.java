package reviewClass10october;

public class dataTypes {

	public static void main(String[] args) {
		
		int number1=10;
		int number2=20;
		
		System.out.println(number1+number2);
		
		System.out.println("=========STRING====================");
		
		String stringNumber1="10";
		String stringNumber2="20";		
		System.out.println(stringNumber1+stringNumber2);
		
		System.out.println("==========FLOAT====================");
		
		String name="syntax";
		
		//number of data types (1-primitive,2-non primitive data types)
		
		//Numeric data types
		/*
		 we have 6 numeric data types 
		 byte short long int 
		 	 */
		
		float floatNumber=1000000000000000000000000000000000000f;//36 tane 0 var output: 1.0E36
		System.out.println(floatNumber);
		
		float floatNumber2=102000000000000000000000000000000000f;//output: 1.02E35
		System.out.println(floatNumber2);
		
		float floatNumber3=102.01524565115468765435468435468f;//102.01524 (after 102. max 5 or 6 decimal)
		System.out.println(floatNumber3);
		
		System.out.println("===========DOUBLE=========================");
		
		double doubleNumber=102.01524565115468765435468435468;//102.01524565115469 (after 102. max 14 or 15 decimals) 
		System.out.println(doubleNumber);
		
		
		System.out.println("==========CHAR AND  BOOLEAN=========================");
		
		char charVar='C';
		
		System.out.println(charVar);
		
		boolean boolVar=true;
		
		System.out.println(boolVar);
		
		System.out.println("============================================");
		
		double bonus=.08;
		
		int employee1Salary=1020000;
		int employee2Salary=1300000;
		int employee3Salary=1400000;
		int employee4Salary=1500000;
		
		double bonusForEmployee1=employee1Salary*bonus;
		double bonusForEmployee2=employee2Salary*bonus;
		double bonusForEmployee3=employee3Salary*bonus;
		double bonusForEmployee4=employee4Salary*bonus;
		
		System.out.println(bonusForEmployee1);
		System.out.println(bonusForEmployee2);
		System.out.println(bonusForEmployee3);
		System.out.println(bonusForEmployee4);
		
		System.out.println("=================================================");
		
		String firstName="Moneer";
		String surName="Fazly";
		String mobileOrEmail="moneerfazly@gmail.com";
		String password="password";
		int dayOfMonth=1;
		int monthOfYear=1;
		int year=1995;
		char gender1='M';
		char gender2='F';
		
		
		
		
	}

}
