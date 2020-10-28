package com.syntax.class07;

public class whileVersusDoWhile {

	public static void main(String[] args) {

		System.out.println("================WHILE LOOP==========================");

		/// Wjile Loop: First Check the condition and do something

		int a = 10;

		while (a < 15) {
			System.out.println("hello brother");
			a++;
		}

		System.out.println("======================DO WHILE==========================");

		// Do While Loop : First Do something and then check the condition
		int b = 10;
		do {
			System.out.println("Hi Sister");
			b++;
		} while (b < 15);

		System.out.println("=========difference between while and Do While===========");

		// condition is false (20<15) but do while allows 1 time output if else the
		// condition is false
		// becaude first Do Something and then check the condition

		int c = 20;
		do {
			System.out.println("hello Guysssssss");
			c++;
		} while (c < 15);

		System.out.println("======================================================");

		int i = 10;
		do {
			System.out.println(i);
			i++;
		} while (i < 20);

	}

}
