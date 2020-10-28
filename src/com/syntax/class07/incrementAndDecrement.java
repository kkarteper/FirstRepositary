package com.syntax.class07;

public class incrementAndDecrement {

	public static void main(String[] args) {
		
		int num=90;
		num=num+1;//90+1=91
		num+=1;//91+1=92... sistem yukardan asagiya dogru calisiyor
		
		System.out.println(num);

		System.out.println("======Increment Operator================");
		
		num++;//increment operator. it means add 1, 92+1=93
		
		System.out.println(num);
		
		System.out.println("=======================================");
		
		int w=100;
		w=w-1;//100-1=99
		w-=1;//99-1=98
		
		System.out.println(w);
		
		System.out.println("==========Decrement Operator============");
		
		w--;//decrement operator//98-1=97
		
		System.out.println(w);
		
		
		
	}

}
