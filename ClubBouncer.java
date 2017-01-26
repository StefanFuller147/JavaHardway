public class ClubBouncer {
	public static void main (String [] args){
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println( "You are allowed to enter the club. " );
		}

		/*System.out.println ("I have a pony");
		this particular line will not compile because it is not part of the
		"else if" body of code. It interrupts the flow of the program*/
		else {
			System.out.println( "You are not allowed to enter the club. ");
		}
	}
}
