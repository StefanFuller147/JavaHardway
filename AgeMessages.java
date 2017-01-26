import java.util.Scanner;

public class AgeMessages {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int age;
	
	System.out.print ( "How old are you? " );
	age = keyboard.nextInt();
	
		System.out.print ( "You are: " );
		if ( age < 13) {
		System.out.println ( "\n\ttoo young to get a Facebook account" );
			
		} 
		else if (age <= 15) {
		System.out.println ( "\n\tYou're old enough to make a Facebook account " );
		} 
		
		if (age < 16 ) {
		System.out.println ( "\n\ttoo young to get a drivers license" );
		} 
		
		else if (age <= 17) {
		System.out.println ( "\n\tYou're old enough to get a drivers license " );
		}
		if (age < 18 ) {
			System.out.println ( "\n\ttoo young to get a tattoo" );
		} 
		
		else if (age <= 20) {
		System.out.println ( "\n\tYou're old enough to get a tattoo! " );
		}
		
		if (age < 21 ) {
		System.out.println ( "\n\ttoo young to drink alcohol" );
		
		}
		
		else if (age <= 34) {
		System.out.println ( "\n\tYou're old enough to drink alcohol! " );
		}
		
		if (age < 35 ) {
		System.out.println ( "\n\ttoo young to run for President of the U.S." );
		}
		
		else if (age <= 64) {
		System.out.println ( "\n\tYou're old enough to be President! HOORAY! " ) ;
			}
		
		if (age == 65 ) {
		System.out.print ( "\n\tCongrats, you're old enough to retire and shortly thereafter, die! " );
		}
		
		else if (age >= 99) {
		System.out.println ( "\n\tOk, one more lap and then hit the showers...you should be dead... " );
			}
		System.out.println ( "\n\t\t(How sad!)" );
		}
	}
		/* When a numeral larger than 35 is entered, the output is null. 
		the reason for this is because the number is larger than any of the current 
		parameters. Therefore, the program has nothing to tell you.*/