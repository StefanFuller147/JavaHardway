import java.util.Scanner;

public class ForgetfulMachine {
	public static void main (String [] args) {

		Scanner keyboard = new Scanner (System.in);

		System.out.println ("What is the capitol of France?");
		keyboard.next ();

		System.out.println ("What is 6 multiplied by 7?");
		keyboard.nextInt ();
		/*If you type in anything other than a number, the progam fails.
		For instance, I typed in the letter, "F" and the program immediately
		died*/

		System.out.println ("Enter a number between 0.0 and 1.0");
		keyboard.nextDouble ();
		/*similarly, if anytihng other than an intiger is typed, the program
		will fail*/
		
		System.out.println ("Is there anything else that you'd like to say?");
		keyboard.next ();
		}
	}
