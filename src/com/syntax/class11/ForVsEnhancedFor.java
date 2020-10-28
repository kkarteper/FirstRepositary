package com.syntax.class11;

public class ForVsEnhancedFor {

	public static void main(String[] args) {

		int[] num = { 2, -3, 5, 8 };// i[0],i[1],i[2],i[3];
		for (int i = num.length - 1; i >= 0; i--) {// num.lenght=4; num.length-1=3; i-- ile output i[3],i[2],i[1],i[0] olarak
													// cikar.
			System.out.print(num[i]+",");
		}

	}

}
