import java.util.Scanner;

public class ReceiptRevisited2{
  public static void main (String [] args){
    Scanner keyboard = new Scanner (System.in);
    double gallons;
    int price;
    price = 3;

    System.out.println ("How many gallons of gasoline would you like?");
    gallons = keyboard.nextDouble();
    System.out.print (gallons + " gallons at " + price + " per gallon will be ");
    System.out.println (gallons*price + " ");


    System.out.println("+-----------------------+");
    System.out.println("|                       |");
    System.out.println("|     Corner Store      |");
    System.out.println("|                       |");
    System.out.println("|  2017-01-24 3:21PM    |");
    System.out.println("|                       |");
    System.out.println("|Gallons:    " + gallons +"       |");
    System.out.println("| Price/gallon: $3      |");
    System.out.println("|                       |");
    System.out.println("| Fuel total: " + price*gallons +"      |");
    System.out.println("|                       |");
    System.out.println("+-----------------------+");
  }
}
