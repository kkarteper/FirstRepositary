package reviewClass15october;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		double marks;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your mark");
		marks=scan.nextDouble();
		
		
		if(marks>85 && marks<=100) {
			System.out.println("A");
		}else {
			System.out.println("F");
		}

		//non primitive datatypes(String gibi) larda initialize yapmak ici 
		//n=null; primitive(int gibi) lerde =0 kullaniliyor
		
		
		String name=null;
		int number=10;
		if(number==10) {
			name="maria";
		}else {
			name="nothing";
		}
		System.out.println(name);
	}

}
