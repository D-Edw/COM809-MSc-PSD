package ArraysPractice;
import java.util.Scanner;

public class Reverse2 {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);

        //create array
        int [] numbers = new int [6];

        //loop to read in numbers
        for(int index = 0; index < numbers.length; index++){
            System.out.println("Enter a number: ");
            numbers[index] = keyboard.nextInt();
        }//for

        System.out.println("Numbers in order: " + numbers[0] + "\t" + numbers[1] + "\t" + numbers[2] + "\t" + numbers[3]+ "\t" + numbers[4]+ "\t" + numbers[5]);
        System.out.println("Numbers in reverse: " + numbers[5] + "\t" + numbers[4] + "\t" + numbers[3] + "\t" + numbers[2]+ "\t" + numbers[1]+ "\t" + numbers[0]);


    }//main
}//class
