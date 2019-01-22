
package app;
import java.util.Scanner;

public class ApplesAndOranges {

    public static void main(String[] args) {

        //Initialize each variable for apples and oranges, in stock and on hand
        int apples_on_hand;
        int apples_stock;
        int oranges_on_hand;
        int oranges_stock;

        //Initialize fruits-needed variables
        int apples_needed;
        int oranges_needed;

        //Create new scanner for input
        Scanner scnr = new Scanner(System.in);

        //Get user input as integer for each parameter
        System.out.println("Enter the number of apples on hand.");
        apples_on_hand = scnr.nextInt();

        System.out.println("Enter the number of apples that should be in stock.");
        apples_stock = scnr.nextInt();

        System.out.println("Enter the number of oranges on hand.");
        oranges_on_hand = scnr.nextInt();

        System.out.println("Enter the number of oranges that should be in stock.");
        oranges_stock = scnr.nextInt();

        //SUBTRACT apples/oranges on hand from stock to get stock needed
        apples_needed = apples_stock - apples_on_hand;
        oranges_needed = oranges_stock - oranges_on_hand;
        
        if(apples_needed < 0) {
        	apples_needed = 0;
        }
        
        if(oranges_needed < 0) {
        	oranges_needed = 0;
        }

        //Output items needed to maintain stock
        System.out.println(apples_needed + " apples are needed to maintain the apple stock count of " + apples_stock + ".\n" + oranges_needed + " oranges are needed to maintain the orange stock count of " + oranges_stock + ".");

        scnr.close();
    }

}
