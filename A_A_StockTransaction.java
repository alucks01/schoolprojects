/*author: alex agla
 * purpose: This program takes in information about two stock 
 * transactions; then, calculates and outputs the amount of money 
 * paid for the stock purchase, the amount of money the stock was 
 * sold for, and the profit/loss earned on the transaction. 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class A_A_StockTransaction {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		//declare some variables
		String name;
		String company;
		int sharesPurchased;
		double currentPricePShare;
		String purchaseDate;
		double newPricePShare;
		String saleDate;
		
		System.out.println("***Stock Transaction Report***"
				+ "\n\nThis program will ask you questions"
				+ " about purchasing and selling stock.  \nIt will"
				+ " then generate a formatted stock report.\n");
		
		System.out.print("Enter your full name: ");
		name = input.next();
		input.nextLine();
		
		System.out.print("Enter the company you purchased the stock: ");
		company = input.next();
		input.nextLine();
		
		System.out.print("How many shares did you purchase?: ");
		sharesPurchased = input.nextInt();
		input.nextLine();
		
		System.out.print("What did you pay per share?: $");
		currentPricePShare = input.nextDouble();
		input.nextLine();
		
		System.out.print("When did you purchase these shares?(dd/mm/yyyy): ");
		purchaseDate = input.next();
		input.nextLine();
		
		System.out.print("What did you sell each share for?: $");
		newPricePShare = input.nextDouble();
		input.nextLine();
		
		System.out.print("When did you sell your shares?(dd/mm/yyyy): ");
		saleDate = input.next();
		input.nextLine();
		
		double profit = ((sharesPurchased * newPricePShare)-(sharesPurchased * currentPricePShare));
		double profitP = ((profit / (sharesPurchased * newPricePShare))*100);
		
		System.out.println("\nOn "+purchaseDate+", "+name+" purchased "+sharesPurchased+" shares from "+company+" at a price of $"+df.format(currentPricePShare)+" per share.");
		System.out.println("\nOn "+saleDate+", "+name+" sold "+sharesPurchased+" shares at a price of $"+df.format(newPricePShare)+" per share.");
		System.out.println("\n"+name+" has made a total profit of $"+df.format(profit)+" at a profit percentage of "+df.format(profitP)+"%.");
		
		
		
	}//end main
	
}//end class
