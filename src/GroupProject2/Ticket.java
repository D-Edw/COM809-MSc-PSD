package GroupProject2;
import java.util.Scanner;

/** Created by: Daniel
 * NOVEMBER 2019
 * Class to create different tickets as objects, set number of tickets for each type
 * and calculate total for each type.
 */

public class Ticket {
    Scanner keyboard = new Scanner(System.in);

    // Declare variables
    private double price;
    protected int noOfTickets = 0;

    // Create constructors for ticket objects
    public Ticket(){
    }//defaultConstructor

    public Ticket(double ticketPrice){
        price = ticketPrice;
    }//alternateConstructor

    //Set number of tickets
    protected void setNoOfTickets() {
        System.out.print("Enter number of tickets: ");
        noOfTickets = keyboard.nextInt();
    }//setTickets

    //Get total cost
    public double getTotal(){
        return price * noOfTickets;
    }//getTotal

}//class