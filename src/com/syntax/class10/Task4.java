package com.syntax.class10;

public class Task4 {

	public static void main(String[] args) {
		
		
		//Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[]cars= {"audi","honda","ford","gmc","Tesla","Kia"};
		for(int i=0;i<cars.length;i++) {
			System.out.print(cars[i]+"- ");
		}
		System.out.println();
		System.out.println("===========================================");
		System.out.println("GETTING VALUES FROM ARRAY USING ENHANCED FOR LOOP");
		
		//for(Type Variable name:name of the array)
		for(String car:cars) {//sag taraf arrayin icindeki tum elemnetler sagindaki ise string car adi altinda tek tek cagiracagim variable
			System.out.println(car);
		}
		
		System.out.println("================Another Enhanced For Loop Example==========================");
		
		int[]numbers= {10,20,89,58,47,5,6};
		for(int numaralarimiz:numbers) {
			System.out.print(numaralarimiz+"**");
		}
		System.out.println();
		System.out.println("================Another Enhanced For Loop Example==========================");
		
		boolean[] boo= {true,false,true,true,false};
		for(boolean boolean123:boo) {
			System.out.println(boolean123);
		}
	}

}
