package Lab2;

import java.util.Scanner;

/*
 * Program to test the CardboardBox object
 */

public class TestCardboardBox {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Declare variables
        int width, height, depth, size;
        String colour;

        //Create myBox and print out the details
        CardboardBox myBox = new CardboardBox();
        myBox.showAllDetails();

        //Create yourBox and print out the details
        //Width = 15  Height = 5  Depth = 25
        CardboardBox yourBox = new CardboardBox(15, 5, 25);
        yourBox.showAllDetails();

        //Print out the Top Area, Front Area and Side Area of yourBox
        yourBox.printTopArea();
        yourBox.printFrontArea();
        yourBox.printSideArea();
        System.out.println();

        //Create aBox and print out the details
        //Width = 20  Height = 15  Depth = 10  Colour = brown
        CardboardBox aBox = new CardboardBox(20, 15, 10, "brown");
        aBox.showAllDetails();

        //Print out the Top Area, Front Area and Side Area of aBox
        aBox.printTopArea();
        aBox.printFrontArea();
        aBox.printSideArea();
        System.out.println();

        //Prompt the user for the 4 attributes and assign these
        //using the appropriate set methods to myBox
        System.out.print("What is the width of the box? ");
        width = keyboard.nextInt();
        myBox.setWidth(width);
        System.out.print("What is the height of the box? ");
        height = keyboard.nextInt();
        myBox.setHeight(height);
        System.out.print("What is the depth of the box? ");
        depth = keyboard.nextInt();
        myBox.setDepth(depth);
        keyboard.nextLine();
        System.out.print("What is the colour of the box? ");
        colour = keyboard.nextLine();
        myBox.setColour(colour);
        System.out.println();

        //Print out all the details of myBox
        myBox.showAllDetails();

        //Print out the number of boxes that have been created
        System.out.println("There are " + CardboardBox.numberOfBoxes() + " boxes\n");

        //Test Capacity
        System.out.print("What is the volume of sugar you need stored? ");
        size = keyboard.nextInt();
        System.out.println("What are the dimensions of your boxes? ");
        System.out.print("Width:  ");
        width = keyboard.nextInt();
        System.out.print("Height: ");
        height = keyboard.nextInt();
        System.out.print("Depth:  ");
        depth = keyboard.nextInt();

        CardboardBox testBox = new CardboardBox();
        testBox.setWidth(width);
        testBox.setHeight(height);
        testBox.setDepth(depth);

        System.out.println("You would require " + testBox.requiredBoxes(size) + " boxes");
    }//main
}//class
