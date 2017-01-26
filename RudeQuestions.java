import java.util.Scanner;

public class RudeQuestions {
	public static void main (String [] args) {
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner (System.in);

		System.out.print ("Hi, what's your name? " );
		name = keyboard.next ();

		System.out.print ("Hi, " + name + "! How old are you? " );
		age= keyboard.nextInt();

		System.out.println ("So you're " + age + " That's not very old " );
		System.out.print ("How much do you weigh " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println ( weight + " Oh wow!! you better keep that quiet! " );
		System.out.print (" Finally, what's your income " +  name + "?" );
		income = keyboard.nextDouble();

		System.out.print (" Hopefully that's your " + income + " per hour! " );
		System.out.println (" And not per year! " );
		System.out.print (" Well " + name + " thanks for your time " );
		System.out.println (" And thanks for answering all of my rude questions! " );
		System.out.println (name + ".");
		 }
}
