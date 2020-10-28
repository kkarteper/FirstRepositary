package com.syntax.class11;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		//create an array on double using scanner & calculate the sum of all elements that was stored in an array
		
		Scanner scan;
		double[] num;
		int size;
		double sum=0;
		scan=new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size=scan.nextInt();
		num=new double[size];//Burasi cok onemli kac adet double elementi store yapacagimiz yer num.Declaration
		
		for(int i=0;i<size;i++) {
			System.out.println("please enter double number");
			num[i]=scan.nextDouble();
		}
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];	
		}
		System.out.println(sum);
	}

}
