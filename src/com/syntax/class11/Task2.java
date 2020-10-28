package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		/*Create an array of cars : american, german, korean, italian. And print all values from a 2D array
		 * 
		 */
		
		
		String [][] cars= {
				{"ford","gmc"},
				{"mercedes","audi"},
				{"kia","hyundai"},
				{"alfaRomeo","maserati"}
				};
		
		for(int  row=0;row<cars.length;row++) {
			for(int col=0;col<cars[row].length;col++) {
				System.out.print(cars[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=================================================");
		
		for(String[] carArray:cars) {
			for(String car:carArray) {
				System.out.print(car+"***");
			}
		}
		
	}

}
