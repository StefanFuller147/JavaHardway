import java.util.Scanner;

public class BMIcalculator {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in); 
		double m, kg, bmi;
		double inches, pounds;
		
		
		System.out.println ("your height in m " );
		m = keyboard.nextDouble(); 
		
		System.out.println ("your weight in kg " ); 
		kg = keyboard.nextDouble();
		
		inches = m*39.37;
		System.out.println ("inches is " + inches );
		
		pounds = kg*2.205;
		System.out.println ("pounds is " + pounds );
		
		bmi = kg / (m*m); 
		
		System.out.println ("Your BMI is " + bmi );
		
		if(bmi<16.0){
			System.out.println ("dude, you should see a doctor. " );
		}
		if(bmi> 16.0 && bmi< 32.0){
			System.out.println ("You're A-okay buddy! " );
		}
		if (bmi>32.0) { 
		System.out.println ("You should go on a diet " );
		}
		}
	}