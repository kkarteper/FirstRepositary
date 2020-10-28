package com.syntax.class12;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.syntax.class10.ArraysAnotherWay;

public class HW4 {

	public static void main(String[] args) {
		// * Maximum and minimum number in the array?
				 
		
		int [] num= {89,-8,-15,5,17,33,88};
		
		int max=num [0];
		int min=num [0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("the max number in Array is "+max);
		System.out.println("the min number in array is "+min);

		System.out.println("=========2nd way========================================");
		
		
		Arrays.sort(num);
		
		System.out.println("Min number is "+num[0]);
		System.out.println("Max number is "+num[num.length-1]);		
		
	}

}
