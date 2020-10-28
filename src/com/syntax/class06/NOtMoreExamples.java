package com.syntax.class06;

public class NOtMoreExamples {

	public static void main(String[] args) {
		boolean isJavaEasy=false;
		
		if(!isJavaEasy) {//always if(true) we have to check this line ,if(false) check the ELSE part
			System.out.println("please try to spend more with Java");
		}else {
			System.out.println("back to life");
		}
System.out.println("=======================================================");

		String day="Monday";//good example try to Saturday or Sunday output nothing

			if(!(day.equals("Sunday") || day.equals("Saturday"))) {
				System.out.println("i am going to work");
}
System.out.println("=====================================================");

		String day1="Sunday";//good example try to Saturday or Sunday output nothing

			if(!day1.equals("Sunday") || day1.equals("Saturday")) {
	System.out.println("i am going to work");

	}
System.out.println("====================================================");

	String str="Mohammad";
	String str1="     Mohammad  ";

	/*str.equals(str1);------false
	str.equalsIgnoreCase(str1);--------true
	
	*/
	
	System.out.println("=================================");
/*
	we are thinking of going shopping
	
	first we check to have any sale  on store
 if no sale------no shopping
 if sale====== we go to shop
     ask price>50---we give %10 discount
     50>price>100-----%20 disc.
     100>price>500----%40 disc.
     price>500-----%50 disc.
     
     calculate final price and discount that you have
     */

	
	
	
	
	}}