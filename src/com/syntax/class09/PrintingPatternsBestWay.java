package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		//make 4 rows * and 6 coloms *
		//     ******
		//     ******
		//     ******
		//     ******
	
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<7;j++) {
				System.out.print("*");//system.out.print yaziyoruz neden * lar sirali yazilsin diye
			}
			System.out.println();//burada println kullaniyoruz inner loop 6 kez sirali * dan sonra 1 line atlasin diye
		}
		System.out.println("==================================");
		
		
		for(int i=7;i>=1;i--) {
			for(int j=0;j<=6;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		for(int c=7;c>=1;c--) {
			for(int j=7;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
