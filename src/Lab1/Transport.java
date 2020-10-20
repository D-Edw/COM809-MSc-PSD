package Lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

    import java.text.DecimalFormat;
import java.util.Scanner;

    /*
     * Program to read in the weights of containers until -1 is
     * entered and
     * calculate the cost of haulage depending on the number of
     * containers and the total weight
     */

    public class Transport {

        static Scanner keyboard = new Scanner(System.in);
        static DecimalFormat df = new DecimalFormat("0.00");

        // Method to read in and return a number
        public static int getWeight(int number) {
            System.out.print("Please enter the weight of container " +
                    number + " (in kg) or -1 to finish: ");
            return keyboard.nextInt();
        }//getWeight

        // Method to calculate and return the cost of transport
        public static double calculateCost(int number, int weight) {

            final double DISCOUNTRATE = 0.25;
            final int LOWWEIGHT = 500, HIGHWEIGHT = 1000;
            final int DISCOUNTNUMBER = 5;
            final int LOWCOST = 400, MIDDLECOST = 750, HIGHCOST = 1200;
            double cost;

            if (weight > HIGHWEIGHT) {
                cost = HIGHCOST;
            }//if
            else {
                if (weight > LOWWEIGHT) {
                    cost = MIDDLECOST;
                }//if
                else {
                    cost = LOWCOST;
                }//else
            }//else
            if (number <= DISCOUNTNUMBER) {
                cost = cost - (cost * DISCOUNTRATE);
            }//if
            return cost;
        }//calculateCost

        public static void main(String[] args) {

            final double TERMINATOR = -1;
            int weight, totalWeight = 0, numberOfContainers = 0;
            double cost;

            // Read in the weight of each container
            weight = getWeight(1);
            while (weight != TERMINATOR) {
                totalWeight = totalWeight + weight;
                numberOfContainers++;
                weight = getWeight(numberOfContainers);
            }//while

            // Calculate haulage
            cost = calculateCost(numberOfContainers, totalWeight);

            // Output results
            System.out.println("\nThe total number of containers is \t\t\t\t" + numberOfContainers);
                    System.out.println("The total weight of the containers is\t\t\t" + totalWeight);
                            System.out.println("The total cost of transport is \t\t\t\t\t" + df.format(cost));

        }//main
    }//class
