import java.util.Scanner;

public class ThirtyDaysSD {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		int month, days;
		String monthName;

		System.out.print( "Which month? " );
		month = keyboard.nextInt();

		switch(month) {
			case 1: monthName = "January";
			System.out.println (" January");
			case 2: monthName = "February";
			System.out.println (" February");
			case 3: monthName = "March";
			System.out.println (" March");
			case 4: monthName = "April";
			System.out.println (" April");
			case 5: monthName = "May";
			System.out.println (" May");
			case 6: monthName = "June";
			System.out.println (" June");
			case 7: monthName = "July";
			break;
			case 8: monthName = "August";
			break;
			case 9: monthName = "September";
			break;
			case 10: monthName = "October";
			break;
			case 11: monthName = "November";
			break;
			case 12: monthName = "December";
			break;
			default: monthName = "error";
		}

		/* Thirty days hath September April, June and November
		All the rest have thirty-one except the second month alone....


		*/

		switch(month) {
			case 9:
			case 4:
			case 6:
			case 11: days = 30;
			break;
			case 2: days = 28;
			break;
			default: days = 31;
		}

		System.out.println( days + " days hath " + monthName );
	}
}
