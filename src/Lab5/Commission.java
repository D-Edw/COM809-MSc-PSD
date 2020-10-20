package Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by: Daniel
 * Created on: 2/12/19
 * Program to read in and store 10 employee reference numbers who are paid
 * commission on portion of sales that exceeds 2/3 of the average sales of the group.
 * Read in sales of each ten employees and print out the reference numbers of those who
 * qualify for commission, together with the amount that qualify for commission.
 */

public class Commission {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("£0,000.00");

        final int MAX = 10;
        int[] sales = new int[MAX];
        int total = 0;
        double commissionLevel;

        //Read in and store values of sales
        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter sales of Salesman " + (index + 1) + ": ");
            sales[index] = keyboard.nextInt();
        }//for

        //Calculate commission level
        for (int index = 0; index < MAX; index++) {
            total = total + sales[index];
        }//for
        commissionLevel = (double) ((total / MAX) * 2 / 3);

        //Print out the results
        System.out.println("\nThe following Salesmen qualify for Commission");
        System.out.println("Reference No\t\tAmount");
        for (int index = 0; index < MAX; index++) {
            if (sales[index] > commissionLevel) {
                System.out.println("\t" + (index + 1) + "\t\t\t\t" + df.format((sales[index] - commissionLevel)));
            }//if
        }//for





    }//main
}//class
