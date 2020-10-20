package GroupProject2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Calendar;

/**
 * Created by Everyone
 * Main method. Program to print menus and allow user to select film,
 * day, time, and tickets. Print receipt after selections have been made
 * with option to enter discount code.
 */
public class TestFilm {

    static Scanner keyboard = new Scanner(System.in);
    static Calendar c = Calendar.getInstance();
    static  DecimalFormat df = new DecimalFormat("0.00");


    public static void main(String[] args) {

        //Declare Main class variables
        String filmTitle;
        String screenNo;
        int runTime;
        String certification;
        int choice;
        double discount = 0;
        String movieChoice = "0";
        String movieDecision;
        String dayDecision;
        String chosenFilm = null;
        String chosenTime = null;
        String chosenDay = null;
        String discountCode = "XMAS19";
        String discountEntry = null;

        //Create movie objects
        Film Rocky1 = new Film("Rocky", 120, "PG 13","November 21, 1976" );
        Film DieHard = new Film("Die Hard", 132, "15","July 12, 1988");
        Film HomeAlone = new Film("Home Alone",103 , "PG", "December 1, 1991");
        Film Joker = new Film("Joker",122 , "15", "October 4, 2019");
        Film TheIrishman = new Film("The Irishman",209, "15", "November 27, 2019");
        Film LeMans66 = new Film("Le Mans 66", 152, "12A", "November 15, 2019" );
        Film TerminatorDarkFate = new Film("Terminator: Dark Fate", 128, "15", "October 23, 2019");

        //create day objects
        Day Monday = new Day ("Monday");
        Day Tuesday = new Day ("Tuesday");
        Day Wednesday = new Day ("Wednesday");
        Day Thursday = new Day ("Thursday");
        Day Friday = new Day ("Friday");
        Day Saturday = new Day ("Saturday");
        Day Sunday = new Day ("Sunday");

        //Create time Objects
        time matinee = new time(12.00);
        time earlyAfternoon = new time(4.00);
        time evening = new time(7.00);
        time late = new time(9.00);

        //Create different ticket types as objects
        Ticket adultTicket = new Ticket(7.40);
        Ticket juniorTicket = new Ticket(5);
        Ticket studentTicket = new Ticket(6);
        Ticket oapTicket = new Ticket(5.70);
        Ticket familyTicket = new Ticket(20);


        //display film menu
        do {
            System.out.println("\n1. Rocky");
            System.out.println("2. Die hard");
            System.out.println("3. Home Alone");
            System.out.println("4. Joker");
            System.out.println("5. The Irishman");
            System.out.println("6. Le Mans 66");
            System.out.println("7. Terminator: Dark Fate");
            System.out.println("Please enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You have selected Rocky");
                    Rocky1.printAllMovieDetails();
                    chosenFilm = Rocky1.toString();
                    break;
                case 2:
                    System.out.println("You have selected Die Hard");
                    DieHard.printAllMovieDetails();
                    chosenFilm = DieHard.toString();
                    break;
                case 3:
                    System.out.println("You have selected Home Alone");
                    HomeAlone.printAllMovieDetails();
                    chosenFilm = HomeAlone.toString();
                    break;
                case 4:
                    System.out.println("You have selected Joker");
                    Joker.printAllMovieDetails();
                    chosenFilm = Joker.toString();
                    break;
                case 5:
                    System.out.println("You have selected The Irishman");
                    TheIrishman.printAllMovieDetails();
                    chosenFilm = TheIrishman.toString();
                    break;
                case 6:
                    System.out.println("You have selected Le Mans 66");
                    LeMans66.printAllMovieDetails();
                    chosenFilm = LeMans66.toString();
                    break;
                case 7:
                    System.out.println("You have selected Terminator: Dark Fate");
                    TerminatorDarkFate.printAllMovieDetails();
                    chosenFilm = TerminatorDarkFate.toString();
                    break;
                default:
                    System.out.println("\n Invalid choice");
            }//Switch

            System.out.println("Is this the movie you would like to see? Y/N");
            movieDecision = keyboard.nextLine();
            //If statement to stop random characters that aren't y or n to act as 'Y'.
            if (!movieDecision.equalsIgnoreCase( "n") && !movieDecision.equalsIgnoreCase("y")) {
                System.out.println("Please enter a 'Y' or 'N'");

            }//if
        }//do
           while (!movieDecision.equalsIgnoreCase("y"));



        //Display day menu
        do {
            System.out.println("---------------------------");
            System.out.println("\nPlease select a day: ");
            System.out.println("1. Monday");
            System.out.println("2. Tuesday");
            System.out.println("3. Wednesday");
            System.out.println("4. Thursday");
            System.out.println("5. Friday");
            System.out.println("6. Saturday");
            System.out.println("7. Sunday");
            System.out.println("---------------------------");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You have selected Monday");
                    chosenDay = Monday.toString();
                    break;
                case 2:
                    System.out.println("You have selected Tuesday");
                    chosenDay = Tuesday.toString();
                    break;
                case 3:
                    System.out.println("You have selected Wednesday");
                    chosenDay = Wednesday.toString();
                    break;
                case 4:
                    System.out.println("You have selected Thursday");
                    chosenDay = Thursday.toString();
                    break;
                case 5:
                    System.out.println("You have selected Friday");
                    chosenDay = Friday.toString();
                    break;
                case 6:
                    System.out.println("You have selected Saturday");
                    chosenDay = Saturday.toString();
                    break;
                case 7:
                    System.out.println("You have selected Sunday");
                    chosenDay = Sunday.toString();
                    break;
                default:
                    System.out.println("\n Invalid choice");
            }//Switch

            System.out.println("Is this the day you would like to choose? Y/N");
            dayDecision = keyboard.nextLine();
            //If statement to error catch characters that do not match 'Y' or 'N'
            if (!dayDecision.equalsIgnoreCase("n") && !dayDecision.equalsIgnoreCase("y")) {
                System.out.println("Please enter a number - '1-7'");

            }//if
        }//do
            while (!dayDecision.equalsIgnoreCase("y")) ;


        //Display Movie Time menu
        String timeChoice;

        do {
            System.out.println("---------------------------");
            System.out.println("Please select a time");
            System.out.println("1. 12:00pm");
            System.out.println("2. 4:00pm");
            System.out.println("3. 7:00pm");
            System.out.println("4. 9:00pm");
            System.out.println("Please enter your choice");
            System.out.println("---------------------------");
            choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("You have selected 12:00pm");
                    chosenTime = matinee.toString();
                    break;
                case 2:
                    System.out.println("You have selected 4:00pm");
                    chosenTime = earlyAfternoon.toString();
                    break;
                case 3:
                    System.out.println("You have selected 7:00pm");
                    chosenTime = evening.toString();
                    break;
                case 4:
                    System.out.println("You have selected 9:00pm");
                    chosenTime = late.toString();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Is this the time you would like to choose? Y/N");
            timeChoice = keyboard.nextLine();
            //If statement to error catch characters that do not match match numbers between 1-4 including
            if (!timeChoice.equalsIgnoreCase("n") && !timeChoice.equalsIgnoreCase("y")) {
                System.out.println("Please enter a number - '1-4'");

            }//if
        }//do
        while (!timeChoice.equalsIgnoreCase("y")) ;

        //Display menu for choice of tickets
        String ticketChoice;
        double total;

        do {
            System.out.println("---------------------------");
            System.out.println("Please select a ticket type");
            System.out.println("1. Adult");
            System.out.println("2. Junior");
            System.out.println("3. Student");
            System.out.println("4. OAP");
            System.out.println("5. Family");
            System.out.println("Please enter your choice");
            System.out.println("---------------------------");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You have selected Adult");
                    adultTicket.setNoOfTickets();
                    break;
                case 2:
                    System.out.println("You have selected Junior");
                    juniorTicket.setNoOfTickets();
                    break;
                case 3:
                    System.out.println("You have selected Student");
                    studentTicket.setNoOfTickets();
                    break;
                case 4:
                    System.out.println("You have selected OAP");
                    oapTicket.setNoOfTickets();
                    break;
                case 5:
                    System.out.println("You have selected Family");
                    familyTicket.setNoOfTickets();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Would you like to purchase more tickets? Y/N ");
            ticketChoice = keyboard.nextLine();
            if (!ticketChoice.equalsIgnoreCase("n") && !ticketChoice.equalsIgnoreCase("y")) {
                System.out.println("Please enter a number - '1-5'");

            }//if
        }//do
        while (!ticketChoice.equalsIgnoreCase("n")) ;

        total = adultTicket.getTotal() + juniorTicket.getTotal()+ studentTicket.getTotal() + oapTicket.getTotal() + familyTicket.getTotal();

        //PrintReceipt
        System.out.println("===============================");
        System.out.println("Title: " + chosenFilm);
        System.out.println("Day/Time: " + chosenDay + " " + chosenTime);
        System.out.println("Total cost: £" + df.format(total));
        System.out.println("The Time and Date of purchase: " + c.getTime());
        System.out.println("=================================");

        //DiscountCode
        discount = (total/100)*20;
        System.out.println("If you have a discount code enter here:");
        discountEntry = keyboard.nextLine();
        if (discountEntry.equals(discountCode)) {
            System.out.println("===============================");
            System.out.println("Title: " + chosenFilm);
            System.out.println("Day/Time: " + chosenDay + " " + chosenTime);
            System.out.println("Total cost: £" + df.format((total-discount)));
            System.out.println("The Time and Date of purchase: " + c.getTime());
            System.out.println("=================================");
        } //if
        else {
            System.out.println("Invalid or no discount code entered");
        }//else

    }//main
}//class
