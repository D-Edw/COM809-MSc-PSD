package Lab2;
import java.util.Scanner;

/**
 * Created by: Daniel
 * Created on: 15/11/2019
 * Program to test the Student Class
 */

public class TestStudent {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        int mark1, mark2, mark3;

        //Student1
        Student student1 = new Student("Peter");
        student1.printAllDetails();

        //Student2
        Student student2 = new Student("Jennifer", 45, 67, 55);
        student2.printAllDetails();

        // Print the next available Student ID
        Student.printNextUniqueID();

        // Student3
        Student student3 = new Student("John");
        System.out.println("What are " + student3.getName() + "'s marks (%):");
        System.out.print("First mark: ");
        mark1 = keyboard.nextInt();
        System.out.print("Second mark: ");
        mark2= keyboard.nextInt();
        System.out.print("Third mark: ");
        mark3 = keyboard.nextInt();
        student3.setMarks(mark1, mark2, mark3);
        student3.printAllDetails();
    }//main
}//class
