import java.util.Scanner;

public class SafeSquareRootSD {
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		double x, y;
		int ready, yes;

		System.out.print ("In this program we will be focusing on \"protection loops\" " );
		System.out.print (" Are you ready?! 1 = yes 2 = no");
		ready = keyboard.nextInt();


		while ( ready != 1) {
			System.out.println (" I said, are you ready!? " );
			ready = keyboard.nextInt();
		}



		System.out.print ("Give me a number, and I'll find it's square root. " );
		System.out.print ("\n(No negatives pls and txohnx) " );
		x = keyboard.nextDouble();

		while ( x < 0 ) {
			System.out.println ( "I SAID! I won't find the square root of negative #'s' homie! >:/ " );
			System.out.print ( "\nNew number: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println ( "The square root of " + x +" is " +y);
	}
}
