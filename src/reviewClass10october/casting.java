package reviewClass10october;

public class casting {

	public static void main(String[] args) {


		byte byteVar=10;
		short shortVar=100;
		char charVar='A';
		int intVar=1000;
		long longVar=100000;
		float floatVar=1000000;
		double doubleVar=1000000000;
		
		shortVar=byteVar;
		System.out.println(shortVar);
		intVar=charVar;//A PC de bir karakter olup sayi olarak 65 olarak yazilir. 
		System.out.println(intVar);
		System.out.println(doubleVar);
		
		floatVar=(float)doubleVar;
		System.out.println(floatVar);
		byteVar=(byte)shortVar;
		System.out.println(byteVar);
		
		
		byte newVar=100;
		short newShortVar=(short) (newVar+10);
		
		int newIntVar=100;
		long newLongVar=2147483648L;
		
		
		
	}

}
