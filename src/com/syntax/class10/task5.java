package com.syntax.class10;

public class task5 {

	public static void main(String[] args) {
		//Create an array on integers and 
	//	calculate the sum of all elements in an array.

		int[] num= {10,20,30};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];	
		}
		System.out.println(sum);
		
		
	}

}
