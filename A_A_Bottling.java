//author: alex agla
//purpose: This program will calculate the number of bottles required to bottle
//		    a batch of home brew.

import java.util.Scanner;


public class A_A_Bottling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int ML_P_L = 1000;//constant for mL to L conversion
		double amtBrewed; //create container for amount brewed (L)
		double bottleSize; //create container for bottle size(ml)
		double leftover; //leftover brew (ml)
		int totalBottles;
		
		System.out.println("This program will calculate the number of bottles required to bottle\r\n" + 
				"a batch of home brew.\r\n" + 
				"");
		//ask user to enter total amount brewed in L
		System.out.println("How many litres did you brew at home?: ");
		amtBrewed = input.nextDouble();
		input.nextLine();//flush
		
		//ask user to enter bottle size in ml
		System.out.println("How many mL can your bottles hold?: ");
		bottleSize = input.nextDouble();
		input.nextLine();//flush
		
		leftover = (amtBrewed * ML_P_L) % bottleSize; //calculate leftover
		totalBottles = (int) ((int)((amtBrewed * ML_P_L)-leftover)/bottleSize); //calculate amt of bottles
		
		

		System.out.println("Thank you!\n\nYou have "+leftover+" mL's leftover!\nYou have a total of "+totalBottles+" bottles!");
	}

}
