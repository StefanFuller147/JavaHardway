import java.util.Scanner;

public class Sequencing {
	public static void main (String [] args) {
		//THIS CODE IS BROKEN UNTIL YOU FIX IT

		Scanner keyboard = new Scanner (System.in);
		double price = 0, salesTax, total;

		System.out.println( "How much is the purchase price? " );
		price = keyboard.nextDouble();

		System.out.println( "How much is salesTax? " );
		salesTax = keyboard.nextDouble();

		total = price + salesTax;

		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
		}
	}
