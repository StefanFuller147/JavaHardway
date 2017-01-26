import java.util.Scanner;

public class doofy {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int age;
	
	System.out.print ( "How old are you? " );
	age = keyboard.nextInt();
	
		System.out.print ( "You are: " );
		if ( age < 13) {
		System.out.println ( "\n\ttoo young to get a Facebook account" );
		if ( age> 13 && age<15 ) {
			System.out.print (" \n\t You're old enough to get a FB account, but not old enough to get a drivers liscene");
		}
	}
}