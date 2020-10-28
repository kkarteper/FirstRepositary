package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		//what is the largest number in my array?
		
		
		
		int[] array= {-109,201,0,889,-1,77,1250};
		int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			
		}
		
		System.out.println("Largest number is "+ max);
System.out.println("==========================================================================");


	}

}
