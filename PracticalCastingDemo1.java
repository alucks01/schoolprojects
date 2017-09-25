//shows a practical use of casting between datatypes to create a decimal formatter.

public class PracticalCastingDemo1 {
	
	public static void main(String[] args) {
		
		double price = 678.66; //price of TV
		
		final double HST_RATE = 0.13; //ontario HST rate
		
		double taxPayable = price * HST_RATE; //calculate the amount of tax payable
		
		double totalOwing = price + taxPayable;//calculate total owing
		
		System.out.println("Price of TV is $"+price);
		System.out.println("\nSales tax payable is $"+taxPayable);
		System.out.println("\nTotal owing is $"+totalOwing);
		
		//lets do a TRUNCATION OPERATION on the final totalOwing amount and truncate it 
		//to just two decimal places.
		
		//Step 1: multiply the total owing by 100 to move its decimal point two places right.
		totalOwing *= 100;
		
		//Step 2: cast totalOwing to an integer to remove the rest of the decimal numbers
		int temp = (int)totalOwing;
		
		//Step 3: divide by 100 to move the decimal places back to the left.
		totalOwing = (double)temp/100;
		
		System.out.println("Your truncated total owing is $"+totalOwing);
	}

}
