package com.syntax.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		
		boolean b=true;
		System.out.println(b);
		
		boolean c=!true;//it must be true but we use ! so it means opposite so False
		System.out.println(c);
		
		boolean anotherBoolean=false;
		System.out.println(anotherBoolean);
		
		boolean isCold=false;
		if(!isCold) {//if condition da true olanlar console da gorunur isCold false idi
						//biz !isCold ile True yaptik boylece console da gorunuyor
			System.out.println("i am going to beach");
		}
		
		
		
	}

}
