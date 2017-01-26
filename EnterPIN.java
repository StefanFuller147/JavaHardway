import java.util.Scanner;

public class EnterPIN {
	public static void main ( String [] args) {
		Scanner keyboard = new Scanner (System.in);
		int pin, entry;
		String password;

		pin = 12345;

		System.out.println ( "WELCOME TO THE BANK OF JAVA. " );
		System.out.println ( "PLEASE ENTER YOUR PIN. " );
		entry = keyboard.nextInt();

		while ( entry != pin ) {
			System.out.println ( "\nINCORRECT PIN, PLEASE TRY AGAIN. " );
			System.out.print ( "PLEASE ENTER PIN." ) ;
			entry = keyboard.nextInt();
		}

		System.out.println ( "\nPIN ACCEPTED, YOUR ACCOUNT BALANCE IS $425.17 " );
	}
}