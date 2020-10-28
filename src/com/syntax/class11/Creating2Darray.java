package com.syntax.class11;

public class Creating2Darray {

	public static void main(String[] args) {
		
		// create 2d array of food
		/*american
		 * italian
		 * asian
		 * afghani
		 * indian
		 */
		
		String [][] food= {
				
				{"steak","Cheese burger","Hot Dog"},
				{"pizza","pasta"},
				{"sushi","ramen","fried rice","dumplings"},
				{"kebab","manto"},
				{"beriyani","masal","chicken tikka masala"}
				
				
		};		
			System.out.println("========by FOR ENHANCED how can you see the elements in the array===============");	
			
		for(String[] dishes:food) {
			
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
				System.out.println();
		}
		
		System.out.println("=========by FOR LOOP how can you see the elements in the array============================");
				
		for(int i=0;i<food.length;i++) {
			for(int j=0;j<food[i].length;j++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}
		
		
				
		
		
		
	}

}
