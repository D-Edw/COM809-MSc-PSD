package ArraysPractice;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        // Our array contains 13 elements
        int[] array = {9,  238,  248,  138,  118,  45,  180,  212,  103,  230,  104,  41,  49};

        Arrays.sort(array);

        System.out.print("The result : " + Arrays.toString(array));

    }//main
}//class
