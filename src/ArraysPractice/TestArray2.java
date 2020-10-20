package ArraysPractice;
import java.util.Scanner;

public class TestArray2 {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int count = 0;
        int total = 0;
        int even;
        double average;

        //Declare array capable of holding 8 integer values
        int [] myNumbers = new int [8];

        //Loop to read in integers from keyboard
        for(int index = 0; index < myNumbers.length; index++){
            System.out.println("Enter a number: ");
            myNumbers[index] = keyboard.nextInt();
        }//for

        //loop for number of odd numbers
        for(int index = 0; index < myNumbers.length; index++){
            if(myNumbers[index] % 2 != 0){
                count = count + 1;
            }//if
        }//for

        //number of even numbers
        even = myNumbers.length - count;

        //sum of integers
        for(int index = 0; index < myNumbers.length; index++){
            total = total + myNumbers[index];
        }//for

        //average of integers
        average = (double) total / myNumbers.length;

        System.out.println("Number of odd numbers: " + count);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);




    }//main
}//class
