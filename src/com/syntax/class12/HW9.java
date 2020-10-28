package com.syntax.class12;

public class HW9 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 */

		String[][] countries = { { "USA", "Canada" }, { "Brazil", "Argentina", "Peru" },
				{ "Ukraine", "Italie", "Spain", "France" }, { "Japan", "India", "China" }, { "Kenya", "Nigeria" } };

		int sum = 0;

		for (int i = 0; i < countries.length; i++) {
			sum = sum + countries[i].length;
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("The total element in array is " + sum);

		System.out.println("============2nd way========================");

		int total = 0;
		for (String[] rows : countries) {
			total = total + rows.length;
			for (String elements : rows) {
				System.out.print(elements + ",");
			}
			System.out.println();
		}
		System.out.println("the total emenent in array is " + total);

		System.out.println("=================3rd way=========================");
		
		int sumCountry = 0;

		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + ",");
				sumCountry++; 
			}
			System.out.println();
		}
		System.out.println("The total element in array is " + sumCountry);
	}

}
