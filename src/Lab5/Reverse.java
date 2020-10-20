package Lab5;

import java.util.Scanner;

public class Reverse {
    public static void main(String [] args){

    Scanner keyboard = new Scanner(System.in);

    final int MAX = 6;
    int [] number = new int [MAX];

    //Store numbers
        for (int index = 0; index < MAX; index++){
        System.out.print("Enter number " + (index + 1) + ": ");
        number[index] = keyboard.nextInt();
    }//for

        //Print out the contents of the array
        for (int index = 0; index < MAX; index++) {
            System.out.print(number[index] + "\t");
        }//for
        System.out.println();

        //Print out the contents of the array in reverse
        for (int index = MAX - 1; index >= 0; index--) {
            System.out.print(number[index] + "\t");
        }//for
        System.out.println();

    }//main
}//class
