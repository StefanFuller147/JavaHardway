import java.util.Scanner;

public class BMIcategoriesSD2 {
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		double bmi, m , kg;

		System.out.println ("Enter your height in m ");
		m = keyboard.nextDouble();
		System.out.println();

		System.out.println ("Enter your weight in kg ");
		kg = keyboard.nextDouble();
		System.out.println ("Your BMI is: " + kg / (m*m) );
		System.out.println ("Please enter your BMI");
		bmi = keyboard.nextDouble();


		System.out.print ("BMI category: " );
		if (bmi <= 15.0 ){
			System.out.println ("Very Severley underweight " );
		}
		else if (bmi <= 16.0 ){
			System.out.println ("Severley underweight " );
		}
		else if (bmi <= 18.5){
			System.out.println(" underweight " );
		}
	 	else if (bmi < 25.0 ){
			System.out.println (" normal weight " );
		}
		else if (bmi < 30.0){
			System.out.println (" overweight " );
		}
		else if (bmi < 35.0){
			System.out.println (" Moderately obese " );
		}
		else if (bmi < 40.0){
			System.out.println (" Severley obese " );
		}
		else {
			System.out.println (" very Severley /\"morbidly\" obese");
		}
	}
}
