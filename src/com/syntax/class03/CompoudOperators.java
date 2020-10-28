package com.syntax.class03;

public class CompoudOperators {

	public static void main(String[] args) {
		// Assignment Operators  =
		//Arithmetic Operators  * - + % /
		//Compound Operators +=,-=,/=,%=,*=
		// Relational and equality Operators  <, <=, >, >=, == (equal), !=(not equal)

		
		
		/* int num=12;
		 * num+=100;//112 
		 * (you do not write int num+=100; this is error)
		 * 
		 * Always Debug your code
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("======================================");
		int num=100;
		num=num+10;
		System.out.println(num);//110
		
		num=num+200;
		System.out.println(num);//310
		
		//shorter way is:
		System.out.println("============shorter==========================");
		int myNumber=100;
		myNumber+=10;
		
		System.out.println(myNumber);//110
		
		myNumber+=200;
		 System.out.println(myNumber);//310
		 System.out.println("======================================");
		 
		 myNumber-=100;
		 
		 System.out.println(myNumber);//210
		 
		 myNumber/=10;
		 
		 System.out.println(myNumber);//21
		 
		 myNumber*=1000;
		 
		 System.out.println(myNumber);//21000
		 
		 myNumber%=100;
		 
		 System.out.println(myNumber);//0  % bolme isleminde kalan bakiye anlamina geliyor
		 
		 
		 System.out.println("=========================================");
		 
		 
		 int a=12;
		 int b=5;
		 		
		 float result2=a/b;
		 		
		 System.out.println(result2); //2
		 
		 
		 int w=23;
		 int q=7;
		 		
		 double result3=w/q;
		 		
		 System.out.println(result3); //3;  cunku w ve q integer (tamsayi olarak tanimlanmis)
		 
		 //. Declare variable and increase by 100 using shorthand operator
		 //2. Declare variable and decrease by 67 using shorthand operator
		 //3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
		 //4. Declare variable cakePiece=25 and divide cakePiece between 7 people . Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		 
		 
	//	 int numara=48;
		 
	//	 numara+=100;
		 
	//	 System.out.println(numara);//148
		 
	//	 numara-=68;
		 
	//	 System.out.println(numara);//80
		 
	//	 double cakePiece=11;
		 
	//	 cakePiece/=4;
		 
	//	 System.out.println(cakePiece);//2,75
		 
//		 int CakePiece=25;
		 
	//	 cakePiece%=7;
		 
	//	 System.out.println(cakePiece);
		 
		 
		 
		 //cevapp
		 
		//	int number = 10;
		//	int secNum = (number +=100);
		//	secNum -= 67;
		//	int cakePiece =11;
		//	int noOfPeople =4;
		//	cakePiece /= noOfPeople;
		//	int cake = 25;
		///	int people =7;
		//	int cakeLeft = cake%=people;
		//	System.out.println("number of cake left = " + cakeLeft );
			
			// Task 1
		//	int i = 10;
		//	System.out.println(i);
			
		//	i+=100;
	//		System.out.println(i);
	//task 2		
			
	//		float d = 11f;
		//	d/=4;
		//	System.out.println(d);
			
	//task 3
			
			//float cake = 25f;
	//		cake /= 7 ;
	//		System.out.println(cake);
	System.out.println("=============================");
		 double d=12.99;
		 double e=2.5;
		 double div=d/e;
		 System.out.println(div);//5,196
		 
		 int x=12;
		 int y=5;
		 int result1=x/y;
		 System.out.println(result1);//2
		 System.out.println("=======remainder(mod)==========================");
		
		 //12 can divede to 5; 2 times.remainder is 12-10(2*5)=2
		 
		 System.out.println(x%y);
		 System.out.println("=============remainder(mod)=====================");
		 
		 
		 int f=17;
		 int z=4;
		 System.out.println(f%z);//1  remainder is 17-16(4*4)=1.
		 
		 
		 
		 
		 
		
	}

}
