package ArraysPractice;
import java.util.Scanner;

public class FindNumberInArray2 {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);

        //array of numbers
        int [] numbers = {15, 9, 91, 30, 6};

        //declaring variables
        int search;
        int total = 0;
        int index = 0;
        boolean found = false;

        System.out.print("Enter search number: ");
        search = keyboard.nextInt();

        //loop to find number
        while (!(found)){
            if (numbers[index] == search){
                found = true;
                System.out.println(search + " found at location " + index);
            }//if
            index = index + 1;
        }//while

        //if number is not found
        if(!found){
            System.out.println(search + " has not been found.");
        }//if


    }//main
}//class
