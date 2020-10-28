package com.syntax.class12;

import java.util.Arrays;

public class HW5 {

	public static void main(String[] args) {
		
				 /* Write a java program to find the second largest number in the array?
				 * 1st way is the Best Solution
				 */
		int[] num= {-8,9,10,11,13,-12,13};
		
		int max=num[0];
		int secondMax=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				secondMax=max;
				max=num[i];
			}else if(num[i]>secondMax && num[i]!=max) {
				secondMax=num[i];
			}
		}
		System.out.println("The second largest number is "+secondMax);//class12 1h:25 minute
		
		System.out.println("==========================2ND WAY====================================");
		
		
		int myArray[]={-8,9,10,11,-12,13};
		
		int maxNum=myArray[0];
		int SecMaxNum=0;
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]>maxNum) {
				SecMaxNum=maxNum;
				maxNum=myArray[i];
			}else if(myArray[i]>SecMaxNum) {
				SecMaxNum=myArray[i];
			}
			
		}
		System.out.println("The second largest number is "+SecMaxNum);
		
		
		
		
		
		
		
		
		
		System.out.println("==========================3ND WAY====================================");
		int[] num1= {-8,9,10,11,-12,13};
		
		int length=num1.length;
		
		Arrays.sort(num1);//Arrays.sort(); komutu Array icindeki sayilari kucukten buyuge siralamaktadir.Sondan 2. de en buyuk 2.sayidir. num1[length-2]
		
		System.out.println("The second largest number is "+num1[length-2]);
		
		
		
		
		
		
	}

}
