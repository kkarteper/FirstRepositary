package com.syntax.class11;

public class Task9 {

	public static void main(String[] args) {
		/* Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.*/
		
		String [] [] word= {
				{"Bahamas","Dominica","Canada","Costa Rica"},
				{"Colombia","Peru","Equador"},
				{"Holland","Spain","French","Greek","Italia"},
				{"Korea","Singapore","Nepal","Cyprus"},
				{"Cameroon","Angola","Ghana"}
				
		};
		
		
		System.out.println(word.length);
		
		System.out.println("========by FOR ENHANCED how can you see the elements in the array===============");	
		
		for(String[] countries:word) {
			
			for(String country:countries) {
				System.out.print(country+" ");
			}
				System.out.println();
		}
		
		System.out.println("=========by FOR LOOP how can you see the elements in the array====================");
				
		for(int i=0;i<word.length;i++) {
			for(int j=0;j<word[i].length;j++) {
				System.out.print(word[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//How many total countries are there in your word array?
		
		
		
		/*String [][] countries= {
				{"USA","Canada","Mexico"},
				{"Brazil","Colombia","Argentina"},
				{"France", "Greece","Italy"},	
				{"Thailand","China","Vietnam"},
				{"Nigeria","Egypt","Ethiopia"}
				
				};
		for(String[] country:countries) {
			for(String countryNames:country) {
				System.out.print(countryNames+" ");
			}
			System.out.println();
		}
			
		for(int i=0;i<countries.length;i++) {
			for(int j=0;j<countries[i].length;j++) {
				String country=countries[i][j];
				System.out.print(country+" ");
			}
			System.out.println();
		}
		
	int sum=countries.length;
	int columns=countries[0].length;
	
   System.out.println("Total countries stored = "+(columns*sum));
		 * 
		 */
		
		

	}

}
