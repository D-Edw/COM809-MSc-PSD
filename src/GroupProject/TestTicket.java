package GroupProject;
import java.text.DecimalFormat;

/**
 * Created by: Daniel
 * Created on: November 2019
 * Program to test ticket class
 */

public class TestTicket {
    public static void main(String [] args){
        DecimalFormat df = new DecimalFormat("0.00");

        //Create different ticket types as objects
        Ticket adultTicket = new Ticket(7.40);
        Ticket juniorTicket = new Ticket(5);
        Ticket studentTicket = new Ticket(6);
        Ticket oapTicket = new Ticket(5.70);
        Ticket familyTicket = new Ticket(20);

        //Input number of adult tickets and output total cost for adults tickets
        adultTicket.setNoOfTickets();
        System.out.println("Total cost for adults: £" + df.format(adultTicket.getTotal()) + "\n");

        //Input number of junior tickets and output total cost for junior tickets
        juniorTicket.setNoOfTickets();
        System.out.println("Total cost for juniors: £" + df.format(juniorTicket.getTotal()) + "\n");

        //Input number of student tickets and output total cost for student tickets
        studentTicket.setNoOfTickets();
        System.out.println("Total cost for students: £" + df.format(studentTicket.getTotal()) + "\n");

        //Input number of OAP tickets and output total cost for OAP tickets
        oapTicket.setNoOfTickets();
        System.out.println("Total cost for OAPs: £" + df.format(oapTicket.getTotal()) + "\n");

        //Input number of family tickets and output total cost for family tickets
        familyTicket.setNoOfTickets();
        System.out.println("Total cost for family's: £" + df.format(familyTicket.getTotal()) + "\n");

    }//main
}//class
