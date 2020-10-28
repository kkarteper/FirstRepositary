package com.syntax.class10;

public class forAndWhile2 {

	public static void main(String[] args) {

		System.out.println("============================");
		
		boolean condition=true;
		while(condition) {
			System.out.println("I am While Loop");
			continue;// bu komut yazilinca skip yapiyor yani size altindaki for loop u yazdirmaz
			//for(int i=1;i<=2;i++) {
				//System.out.println("aman");// burasi unreachable komuttur sebebi continue eklendigi icin bu skip olur ve I am while loop infinity olarak gorunur
			//}
		}
		System.out.println("============================================");
		
		

	}

}
