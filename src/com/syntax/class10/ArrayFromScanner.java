package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {

		Scanner scan;//userin girecegi verileri scan yapmak icin
		String [] names;//girilen isimler names arrayimize store yapilacak
		int size;//arrayimizde kac element olacak
		
		scan=new Scanner(System.in);
		System.out.println("How many names would you like to store");
		size=scan.nextInt();
		
		names=new String[size];//if user says 6,i will put 6 elements
		
		// WE ARE STORING VALUES INTO AN ARRAY
		for(int i=0;i<size;i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();//next kullandik nextLine hata veriyor sebebi belli degil drive da 01:49 videodan izleyebilirisin
		}
		
		/// arrayimizde hangi isimler var
		
		//WE ARE RETRIEVING VALUES FROM AN ARRAY
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		
	}

}
