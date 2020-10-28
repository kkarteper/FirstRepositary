package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {

/*int[] grades = new int[5];

		// int[] it is a big variable,tell me how many values you are gonna store? 5
		// we are gonna write 5 scores and then calculate the average

		grades[0] = 98;//indexes start with 0
		grades[1] = 80;
		grades[2] = 89;
		grades[3] = 67;
		grades[4] = 77;
 * THIS IS LONG WAY
 */
			String[] names= {"Burju","mike","jack","danielo","bryan"};// isimleri bir kumede topladik
			
			System.out.println(names[3]);//danielo neden index 0 dan basliyor. sirasiyla 3. kisi aslinda 4.kisi yani danielo
										// we have 5 elements
			System.out.println("=========how do i know how many elements i have in the array==================================");
		// how do i know how many elements i have in the array?
			
			int size=names.length;
			
			System.out.println("size of our array is "+size);
			
			System.out.println("==========sondan 2.=================================");
		System.out.println(names[names.length-2]);//names.length=5 5-2=3 names3 so danielo again
		
		int a=2;
		System.out.println(names[a]);//jack
		a+=2;
		System.out.println(names[a]);//bryan
		
		System.out.println("=====================****ONEMLI***====================");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);//index deki tum isimleri yazacak
		}
		
		System.out.println("==================+++onemli+++======================");
		
/*
		for(int i=0;i<=names.length;i++) {
			System.out.println(names[i]);//exception java line 46
		}									//names.length-1 ile duzeltilebilir
		*/
		System.out.println("===========duzeltmesi minus 1==================================");
		
		
		for(int i=0;i<=names.length-1;i++) {
			System.out.println(names[i]);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
