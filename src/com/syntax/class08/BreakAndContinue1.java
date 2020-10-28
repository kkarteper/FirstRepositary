package com.syntax.class08;

public class BreakAndContinue1 {

	public static void main(String[] args) {

		// CONTINUE means skip the iteration

		/// write the number between 1 to 5 but except 3

		for (int i = 1; i < 6; i++) {

			if (i == 3) {
				continue;// means skip i=3
			}
			System.out.println(i);// output= 1,2,4,5
		}

		System.out.println("======================================");

/// print number betwee 1 to 20 skip number 5 and 13

		for (int i = 1; i < 21; i++) {
			if (i == 5 || i == 13) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
