package ArraysPractice;
import java.util.Scanner;

public class CountNumbersInArray2 {
    public static void main (String args []){
        Scanner keyboard = new Scanner(System.in);

        //Declaring variables
        int search;
        int total = 0;

        //Height array
        int [] height = {1,2,3,4,5,6,7,8};

        System.out.println("Please enter search number: ");
        search = keyboard.nextInt();

        //array loop and if sequence to find search number
        for (int index = 0; index < height.length; index++){
            if (height[index] == search){
                total = total+1;
            }//if
        }//for

        System.out.println(search + " occurs " + total + " times.");

    }//main
}//class
