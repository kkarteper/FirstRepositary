package com.syntax.class09;

public class saat1 {

	public static void main(String[] args) {


		for (int h = 00; h < 24; h++) {
			for (int m = 00; m < 60; m++) {
				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (m < 10) {
					System.out.println(h + ":0" + m);
				} else if (h < 10) {
					System.out.println("0" + h + ":" + m);
				} else {
					System.out.println(h + ":" + m);
				}
			}
		}



	}

}
