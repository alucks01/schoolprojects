/**
 * 
 */

/**
 * @author User
 *purpose: shows how to declare and initialize some primitive data types
 *and also shows what a data literal is.
 */
public class DataTypes2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create some variables
		int numOne  = 2344; //the '2344' is called a date literal in java.
		
		//try to put the value of 3 BILLION into numOne
		//numOne = 3000000000; this throws an error because that number is too large for an int
		
		//let's create a long variable
		//long with lowercase l is 32 bit so we must use an uppercase L for more number capacity
		long longNumber = 3000000000L;
		
		//lets create a float type variable(float is 32 bit double is 64)
		//must put f at end to tell compiler it is a float not a double (double is prefered type for floating point literal).
		float floatNumber = 2.35f;
		
		int hexValue = 0x3A;
		System.out.println(hexValue);

	}

}
