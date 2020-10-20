package Lab2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by: Daniel
 * Created on: 21/11/19
 * Program to test CD class
 */

public class TestCD {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Define objects
        CD myCD;
        myCD = new CD("Bob Marley", "Legend", 1980, true);
        myCD.printAllInfo();

        CD yourCD = new CD("Bonnie Raitt", "Nick of Time", 6.25, 11.99, 1989, true);
        yourCD.printAllInfo();

        //Get and print year of myCD
        System.out.println("Year myCD was released: " + myCD.getIssueYear() + "\n");

        //Update cost prices of yourCD
        yourCD.updatePrices(2.50);
        yourCD.printAllInfo();

        //Test the getProfit method
        System.out.println("Profit: " + df.format(yourCD.getProfit()));

    }//main


}//class
