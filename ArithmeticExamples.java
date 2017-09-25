
public class ArithmeticExamples {

	public static void main(String[] args) {
		// CONCATENITION has a higher precedence than addition
		System.out.println("Adding two integers, 2 and 3 gives : " + 2 + 3);
		System.out.println("Adding two integers, 2 and 3 gives : " + (2 + 3));

		// adding and int and a double
		System.out.println("Adding int and double, 2 + 3.5 : " + (2 + 3.5));

		// multiplying
		System.out.println("Multiply two ints, 2 time 3 : " + (2 * 3));
		System.out.println("Multiply int with double, 2 time 3.5 : " + (2 * 3.5));

		// modulos division
		System.out.println("7 mod 3 gives : " + (7 % 3));
		
		
		//some operations with char data types
		char letter1 = 'A'; //initialize a char with ' ' (single quotes)
		char letter2 = 'B';
		
		System.out.println("trying to concatentate two char variables : "+ letter1 + letter2);
		//this will actually add the ascii value of A and B (65 + 66) 
		System.out.println(letter1 + letter2);
		
		
	}

}
