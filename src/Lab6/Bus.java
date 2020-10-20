package Lab6;

import java.util.Scanner;

public class Bus {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //declare variables
        final int SIZE = 5;
        final int REQUIREDBUS = 301;
        boolean found = false;
        int position = 0;

        //parallel arrays
        int[] id = new int[SIZE];
        String[] make = new String[SIZE];
        int[] capacity = new int[SIZE];
        boolean[] automatic = new boolean[SIZE];

        // loop to enter bus info
        for (int index = 0; index < SIZE; index++) {
            System.out.print("Bus " + (index + 1) + " id : ");
            id[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " make : ");
            make[index] = keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " capacity : ");
            capacity[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Is bus " + (index + 1) + " automatic? (TRUE or FALSE): ");
            automatic[index] = keyboard.nextBoolean();
            keyboard.nextLine();
        }//for

        //print output headers
        System.out.println("ID\t\tMake\tCapacity\tAutomatic");

        //loop to print bus info
        for (int index = 0; index < SIZE; index++) {
            System.out.println(id[index] + "\t\t" + make[index] + "\t\t" + capacity[index] + "\t\t\t" + automatic[index]);
        }//for

        //finding bus 301
        while ((!found) && (position < SIZE)) {
            if (REQUIREDBUS == id[position]) {
            found = true;
        }//if
            if (!found) {
                position++;
            }//if
        }//while

        //if 301 is found
            if (found) {
                System.out.println("ID\t\tMake\tCapacity\tAutomatic");
                System.out.println(id[position] + "\t\t" + make[position] + "\t\t" + capacity[position] + "\t\t\t" + automatic[position]);
            }//if
            else {
                System.out.println("Bus " + REQUIREDBUS + " not found");
            }//else

        }//main

    }//class
