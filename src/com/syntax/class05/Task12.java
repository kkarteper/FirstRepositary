package com.syntax.class05;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 
 * 
 */
		String drink;
		  boolean a,b;
		  
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Are you thirsty?");
		  a=scan.nextBoolean();
		  
		  System.out.println("Are you sleepy?");
		  b=scan.nextBoolean();
		 
		  if(a && b){
		    drink="Coffee";
		  }else if(!a && b){
		    drink="Tea";
		  }else if(a && !b){
		      drink="Water";
		    }else {
		      drink="Nothing";
		    }
		    System.out.println("Looks like you need to drink "+drink);
		    
		  
		  
	

		  }}
