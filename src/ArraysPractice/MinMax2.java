package ArraysPractice;

public class MinMax2 {
    public static void main(String args[]){

        //create array
        int [] list = {15, 9, 91, 30, 6, 92};

        //declare variables
        final int SIZE = list.length;
        int largest = list[0];
        int smallest = list[0];

        for(int index = 1; index < SIZE; index++){
            if(list[index] > largest){
                largest = list[index];
            }//if
            else{
                if(list[index] < smallest){
                    smallest = list[index];
                }//if
            }//else
        }//for

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);



    }//main
}//class
