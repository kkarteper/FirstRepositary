package com.syntax.class11;

public class Homework2 {

	public static void main(String[] args) {
		// create an array of countries. while retrieving all values from an array
		// print capital for each country

		String[] countries = { "usa", "ukraine", "canada" };
		String[] capitals = { "dc", "kiev", "ottowa" };
		String capital;
		
		for (String country : countries) {

			switch(country) {
			case "usa" :
				capital = "dc";
				break;
			case "ukraine" :
				capital = "kiev";
				break;
			case "canada" :
				capital = "ottowa";
				break;
			default:
				capital = "I dont know";
			}
			System.out.println("Capital of the " + country + " is " + capital);

		}

	}

}
