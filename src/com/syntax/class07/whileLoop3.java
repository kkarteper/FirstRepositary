package com.syntax.class07;

public class whileLoop3 {

	public static void main(String[] args) {
		// create a boolean variable workDay and assign true create int variable day and
		// assign it to 1
		// as long as it is workDay print "I need a day off'" and increase the day
		// once day is 6 print "I do not need the day off anymore"

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			if (day < 6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("I do not need the day offf anymore");

				workDay = false;// loop un durmasi icin boolean i false yaptik day =6,7,8,9.... surekli day off
			}                   // anymore gorunmesin diye
			day++; 
		}

	}

}
