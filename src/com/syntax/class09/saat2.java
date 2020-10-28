package com.syntax.class09;

public class saat2 {

	public static void main(String[] args) {
		
		// make a clock 24 hours 60 minutes
		
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j <60; j++) {
				String hour="";
				String minutes="";
				if( i<10) {
				 hour= "0"+i;}
				else { hour= ""+i;
				}
				
				if( j <10)
				 minutes= "0"+j;
				
				else{
					  minutes= ""+j;
				}
				System.out.println(""+ hour+":"+ minutes);
			}
		}
			}

	}


