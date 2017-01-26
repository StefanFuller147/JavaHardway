import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main (String [] args) throws Exception{
    PrintWriter fileout = new PrintWriter("receipt.txt");
    Scanner keyboard = new Scanner (System.in);
    double gallons;
    int price;

    price = 3;
    System.out.println ("How many gallons of gasoline would you like?");
    gallons = keyboard.nextDouble();


    fileout.println("+-----------------------+");
    fileout.println("|                       |");
    fileout.println("|     Corner Store      |");
    fileout.println("|                       |");
    fileout.println("|  2017-01-24 3:21PM    |");
    fileout.println("|                       |");
    fileout.println("|Gallons:    " + gallons +"       |");
    fileout.println("| Price/gallon: $3      |");
    fileout.println("|                       |");
    fileout.println("| Fuel total: " + price*gallons +"      |");
    fileout.println("|                       |");
    fileout.println("+-----------------------+");
    fileout.close();
  }
}
