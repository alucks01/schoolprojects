//date: 21/09/2017
//purpose: shows examples of both IMPLICIT and EXPLICIT casting.


public class CastingDemo {

	public static void main(String[] args) {
		
		System.out.println("Now doing some IMPLICIT casting examples...");
		
		byte byteNum = 127;
		System.out.println("Value in byteNum is "+byteNum);
		
		//now store this byteNum into a short.
		short shortNum = byteNum;
		System.out.println("Value in shortNum is "+shortNum);
		
		int intNum = shortNum;
		System.out.println("Value in intNum is "+intNum);
		
		long longNum = intNum;
		System.out.println("Value in longNum is "+longNum);
		
		System.out.println("****************\nNow doing some EXPLICIT casting examples...");
		
		longNum = 128;
		System.out.println("Value of longNum is NOW "+longNum);
		
		intNum = (int)longNum;
		System.out.println("Value of intNum is NOW "+intNum);
		
		shortNum = (short)intNum;
		System.out.println("Value of shortNum is NOW "+shortNum);
		
		//NOTE: this will cause and OVERFLOW and wrap-around to -128
		byteNum = (byte)128;
		System.out.println("Value of byteNum is NOW "+byteNum);
	}

}
