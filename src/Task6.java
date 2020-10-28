import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*Write a program to take the month number from a user. 
		Provide month name to the corresponding month number
		If a user provides any number that is out of month range, the program should display "Invalid"

		IMPORTANT: use Scanner Class

		Example Output:
		Please enter month number 1
		January

		Example Output:
		Please enter month number 33
		Invalid*/

		 Scanner input=new Scanner(System.in);
	     System.out.println("Please enter month number");
	     int month=input.nextInt();
	     if(month==1){System.out.println("January");}
	     if(month==2){System.out.println("February");}
	     if(month==3){System.out.println("March");}
	     if(month==4){System.out.println("April");}
	     if(month==5){System.out.println("May");}
	     if(month==6){System.out.println("June");}
	     if(month==7){System.out.println("July");}
	     if(month==8){System.out.println("August");}
	     if(month==9){System.out.println("September");}
	     if(month==10){System.out.println("October");}
	     if(month==11){System.out.println("November");}
	     if(month==12){System.out.println("December");}
	     if (month>12){System.out.println("Invalid");
	     
	}

}}
