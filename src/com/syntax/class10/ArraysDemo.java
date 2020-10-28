package com.syntax.class10;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// i have 5 students in the class. i wanna calculate the average score of their exams

		int[] grades = new int[5];

		// int[] it is a big variable,tell me how many values you are gonna store? 5
		// we are gonna write 5 scores and then calculate the average

		grades[0] = 98;//indexes start with 0
		grades[1] = 80;
		grades[2] = 89;
		grades[3] = 67;
		grades[4] = 77;

		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;

		System.out.println("average score is = " + average);
		System.out.println("=================================================================");
		
		int a=10;
		int b;
		b=10;
		
		double[] array;
		array=new double[3];// we have 3 values
		
		array[1]=12.99;
		array[1]=10.89;
		
		System.out.println("value of last element "+array[2]);//array 2 belirtilmemis 3 tane elementimin en sonuncusu,
															  //outputta 0.0 olarak gorunur
		
		System.out.println("=================================================================");
		array[2]=5.99;
		System.out.println(array[2]);
		System.out.println("===================================================================");
		
		array[3]=6.5;
		System.out.println(array[3]);//output: arrayIndezOutOfBoundsException.this is out of your index
										// ArraysDemo.java:43. satirda sorun var demek array[3] bizim indeximiz disinda
	}

}
