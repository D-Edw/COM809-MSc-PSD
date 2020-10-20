package ArraysPractice;

public class MoveElements {
    public static void main(String [] args){
        int [] numbers = {23, 24, 25 ,26 ,27};

        for(int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index] + "\t");
        }//for

        System.out.println();

        int temp;

        temp = numbers[2];
        numbers[2] = numbers[4];
        numbers[4] = temp;

        for(int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index] + "\t");
        }//for

    }//main
}//class
