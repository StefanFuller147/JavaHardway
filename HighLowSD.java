import java.util.Scanner;

public class HighLowSD {
	public static void main ( String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;

		secret = 50; /*1 + (int)( 100*Math.random() );*/

		System.out.println ( "I'm thinking of a number between 1-100. " );
		System.out.println ( "Try to guess it! " );
		System.out.print ("> " );
		guess = keyboard.nextInt();

		while ( secret != guess ){
			if ( guess < secret ){
				System.out.print ( "Sorry, your guess is too low. \nTry again! ");
				guess = keyboard.nextInt();
			if ( guess > secret)
			     System.out.print ("Sorry, your guess is too high. \nTry again! ");
				guess = keyboard.nextInt();
			}
		}

		System.out.println ( " You guessed it! what are the odds?!?" );
	}
}
