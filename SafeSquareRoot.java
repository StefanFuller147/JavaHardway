import java.util.Scanner;

public class SafeSquareRoot {
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		double x, y;

		System.out.print ("Give me a number, and I'll find it's square root. " );
		System.out.print ("\n(No negatives pls and thnx) " );
		x = keyboard.nextDouble();

		while ( x < 0 ) {
			System.out.println ( "I SAID! I won't fidn the square root of negative #'s' homie! >:/ " );
			System.out.print ( "\nNew number: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println ( "The square root of " + x +" is " +y);
	}
}