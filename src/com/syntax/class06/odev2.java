package com.syntax.class06;

import java.util.Scanner;

public class odev2 {

	public static void main(String[] args) {
		/*
		we are thinking of going shopping
		
		first we check to have any sale  on store
	 if no sale------no shopping
	 if sale====== we go to shop
	     ask 10>price>50---we give %10 discount
	     50>price>100-----%20 disc.
	     100>price>500----%40 disc.
	     price>500-----%50 disc.
	     
	     calculate final price and discount that you have
	     */

		boolean sale;
		double price,discount=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there any sale?Yes or No");
		sale=scan.nextBoolean();
		
		if(!sale) {
			System.out.println("we do not shop!!!!");
		}else {
			System.out.println("What is the price?");
			price=scan.nextDouble();
			
			if(price>=10 && price <=50) {
				discount=price*0.1;
				
			}else if(price>50 && price<=100) { 
				discount=price*0.2;
					
			}else if(price>100 && price<=500) { 
				discount=price*0.4;
				
			}else if(price>500) {
				discount=price*0.5;}
			
			System.out.println("Your product price is $"+price+" and you get $"+discount+" discount");	
			
		}
	}}
