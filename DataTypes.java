/**
 * 
 */

/**
 * @author Alex Agla
 * program name: DataTypes.java
 * purpose: shows creation and assignment of values to a byte types variable
 * and also demonstrates what happens if you go past the limit of a data type.
 * THis is called executive overflow
 * Date: Sept 18/2017
 *
 */
public class DataTypes {

	public static void main(String[] args) {
		
		//create some variables
		byte smallNumber = 127;//largest value for a byte
		System.out.println("Current value of small number is "+smallNumber);
		
		//add one to it using the INCREMENT OPERATOR
		smallNumber++;
		System.out.println("Current value after increment is "+smallNumber);
		
		smallNumber++;
		System.out.println("Current value after increment is "+smallNumber);
		
		smallNumber--; //decrement operator (-1 from current value)
		System.out.println("Current value after decrement is "+smallNumber);
		
		smallNumber--; //decrement operator (-1 from current value)
		System.out.println("Current value after decrement is "+smallNumber);
	
		
		
	}//end main

}//end class
