package Lab5;

/**
 * Created by: Daniel
 * Created on: 2/12/19
 * Program to read and store 8 integers and output the number of odd numbers,
 * the number of even numbers, the sum of the integers, and the average of
 * the integers.
 */

import java.util.Scanner;

public class TestArray {
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        final int MAX = 8;
        int [] myNumbers = new int [MAX];
        int noOfOdd = 0, sum = 0;

        //Read in and store numbers
        for (int index = 0; index < MAX; index++){
            System.out.print("Enter number " + (index + 1) + ": ");
            myNumbers[index] = keyboard.nextInt();
        }//for

        //Calculate number of odd numbers and sum of numbers
        for (int index = 0; index < MAX; index++) {
            if (myNumbers[index] % 2 != 0) {
                noOfOdd++;
            }//if
            sum = sum + myNumbers[index];
        }//for

        //Print out the results
        System.out.println("\nThere are " + noOfOdd + " odd numbers and " + (MAX - noOfOdd) + " even numbers");
        System.out.println("\nThe sum of the integers is " + sum);
        System.out.println("\nThe average of the integers is " + ((double) sum / MAX));

    }//main
}//class
