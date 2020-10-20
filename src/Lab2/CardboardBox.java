package Lab2;

/*
 * Define a Cardboard Box Class
 */

public class CardboardBox {
    private static int noOfBoxes = 0;
    private int width, height, depth;
    private String colour;

    public CardboardBox() {
        noOfBoxes++;
    }//Default Constructor

    public CardboardBox(int boxWidth, int boxHeight, int boxDepth) {
        width = boxWidth;
        height = boxHeight;
        depth = boxDepth;
        colour = "unknown";
        noOfBoxes++;
    }//Alternate Constructor

    public CardboardBox(int boxWidth, int boxHeight, int boxDepth, String boxColour) {
        width = boxWidth;
        height = boxHeight;
        depth = boxDepth;
        colour = boxColour;
        noOfBoxes++;
    }//Alternate Constructor

    public void setHeight(int boxHeight) {
        height = boxHeight;
    }//setHeight

    public void setDepth(int boxDepth) {
        depth = boxDepth;
    }//setDepth

    public void setWidth(int boxWidth) {
        width = boxWidth;
    }//setWidth

    public void setColour(String boxColour) {
        colour = boxColour;
    }//setColour

    public int getWidth() {
        return width;
    }//getWidth

    public int getHeight() {
        return height;
    }//getHeight

    public int getDepth() {
        return depth;
    }//getDepth

    public String getColour() {
        return colour;
    }//getColour

    //Method to print the top area of the CardboardBox object
    public void printTopArea() {
        System.out.println("TOP AREA = " + width * depth);
    }//printTopArea

    //Method to print the front area of the CardboardBox object
    public void printFrontArea() {
        System.out.println("FRONT AREA = " + width * height);
    }//printFrontArea

    //Method to print the side area of the CardboardBox object
    public void printSideArea() {
        System.out.println("SIDE AREA = " + height * depth);
    }//printSideArea

    //Method to calculate the volume of the box
    private int volume() {
        return width * height * depth;
    }//volume

    //Method to calculate the number of boxes required to hold a particular volume
    public int requiredBoxes(int capacity) {
        return (int) Math.ceil((double) capacity / volume());
      /* OR double answer;

      answer = (double)capacity / volume();
      if ((double)capacity % volume() != 0){
         answer = answer + 1;
      }//if
      return (int) answer;*/
    }//requiredBoxes

    //Method to print all details of the CardboardBox object
    public void showAllDetails() {
        System.out.println("*** START ***");
        System.out.println("The WIDTH of the cardboard box is " + width + " units");
        System.out.println("The HEIGHT of the cardboard box is " + height + " units");
        System.out.println("The DEPTH of the cardboard box is " + depth + " units");
        System.out.println("The volume of the cardboard box is " + volume() + " units cubed");
        System.out.println("The colour of the cardboard box is " + colour);
        System.out.println("*** END ***\n");
    }//showAllDetails

    //Method to print the number of boxes
    public static int numberOfBoxes() {
        return noOfBoxes;
    }//printNoOfBoxes

}//class
