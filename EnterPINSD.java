import java.util.Scanner;

public class EnterPINSD {
	public static void main ( String [] args) {
		Scanner keyboard = new Scanner (System.in);
		int pin, entry;
		String password, typedPassword;

		password = ("ObieIsDoggo");
		pin = 12345;

		System.out.println ( "PLEASE ENTER YOUR PASSWORD TO CONTINUE. " );
		typedPassword = keyboard.next();
		System.out.println ( typedPassword.equals(password) );


		while ( typedPassword.equals (password) == false ) {
			System.out.println ( "\nINCORRECT PASSWORD, PLEASE TRY AGAIN. " );
			System.out.println ( "PLEASE ENTER PASSWORD. " );
			typedPassword = keyboard.next(); 
		} 

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