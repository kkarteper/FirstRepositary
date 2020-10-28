package com.syntax.class08;

import java.util.Scanner;

public class mutiplicationTable {

	public static void main(String[] args) {
		/* multiplication table
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3,,,,
		 * 
		 * 
		 */
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number to multiple till 10");
		number=scan.nextInt();
		
		
		int multiple;
		for(int i=1;i<=10;i++) {
			multiple=i*number;
			System.out.println("The multiple is: "+ i + " * " + number +" = " + multiple);

		}
		
		System.out.println("=========================example multiple 3*1=3....3*10=30....");
		
		int result;
	    for(int i=1;i<=10;i++){
	      result=3*i;
	      System.out.println("3*"+i+"="+result);
	      i++;
	    }
		
	}

}
