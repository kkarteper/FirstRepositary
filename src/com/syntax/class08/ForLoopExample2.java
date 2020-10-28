package com.syntax.class08;

import java.util.Scanner;

public class ForLoopExample2 {

	public static void main(String[] args) {
		/*
		 * For you to do: You should input: int end;
		 * 
		 * Write a for loop that will print out a series of numbers starting at 0 and
		 * ending at the doubled value of end(value must be taken from a user),
		 * exclusive.
		 * 
		 * Each number should be on the same line, separated by a space.
		 * 
		 * Example Output: Int: 5 
		 * 0 1 2 3 4 5 6 7 8 9
		 * 
		 * Int: 8 
		 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 * 
		 * In: -5
		 *  (no output)
		 * 
		 */

		Scanner inp;
	    int end;
	    System.out.print("Int:");
	    //write your code below
	    
	    int d;
	    inp=new Scanner(System.in);
	    d=inp.nextInt();
	    
	    if(d>0){
	        for(end=0;end<=(d*2)-1;end++){
	      
	        System.out.print(end+" ");
	        }
	    }else {
	        	System.out.println("(no output)");
	        }
	        
	

}}
