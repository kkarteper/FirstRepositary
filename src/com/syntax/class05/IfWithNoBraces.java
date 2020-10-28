package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		// ONEMLI*****
		//ornek 1
		
		boolean isSaturday=true;
		
		if(isSaturday) {
			System.out.println("go to beach");
			System.out.println("and sleep late");
		}
			System.out.println("work again");//12-13 ve 15. satir output oluyor
		
			//2.ornek {} kullanmaz isek boolean true ise
			
			boolean isSunday=true;
			
			if(isSunday)
				System.out.println("part22");
			System.out.println("part23");
			System.out.println("part24");
		
			//3. ornek {} kullanmiyoruz ve boolean false ise if den sonraki ilk cumle atlanir digerleri output olur
			
			
			
			boolean isMonday=false;//if den sonraki ilk syso yu almadi digerleri output oldu yani part34 ve part35
			
			if(isMonday)
				System.out.println("part33");
				System.out.println("part34");
				System.out.println("part35");
	}

}
