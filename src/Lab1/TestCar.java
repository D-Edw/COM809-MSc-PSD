package Lab1;

/**
 * Created by: Daniel
 * Created on: 11/11/19
 * Program to test the Car class
 */

public class TestCar {
    public static void main(String [] args) {
        Car myCar;
        myCar = new Car ();
        myCar.printCarDetails();

        Car someCar = new Car ();
        someCar.printCarDetails();

        Car herCar = new Car("MIA 10", 3);
        herCar.printCarDetails();

        Car hisCar = new Car("HDZ 3434", 4, "blue");
        hisCar.printCarDetails();

        Car janeCar = new Car("blue", "MNZ 6700");
        janeCar.printCarDetails();

        Car johnCar = new Car(3, "PSR 811H");
        johnCar.printCarDetails();

        Car completeCar = new Car("VIA 4091", 5, "yellow", false);
        completeCar.printCarDetails();

        // Use of get methods
        System.out.println("Colour of car " + janeCar.getRegNumber() + " is now" + janeCar.getColour() + "\n");

        myCar.setColour("Blue");
        myCar.setRegNumber("BWF 2341");
        myCar.setNoOfDoors(4);
        myCar.setHasACD(false);
        myCar.printCarDetails();

    }//main
}//class
