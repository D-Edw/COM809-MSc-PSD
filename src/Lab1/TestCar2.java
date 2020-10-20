package Lab1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by: Daniel
 * Created on: 18/11/19
 * Program to test the Car2 class
 */

public class TestCar2 {
    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        int years;
        double number, currentValueOfCar;


        Car2 myCar;
        myCar = new Car2();
        myCar.printCarInfo();

        Car2 sistersCar = new Car2(100, "Ford", "My sister Mary", "Red", 2008, 105, 10995.00 );
        sistersCar.printCarInfo();

        Car2 bossCar = new Car2(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500.00 );
        bossCar.printCarInfo();

        Car2 aCar = new Car2(102, "Ford", "Janet Allison", "Red");
        aCar.printCarInfo();

        Car2 bCar = new Car2(103, "John Smith", 100);
        bCar.printCarInfo();

        // Use of set methods
        bCar.setId(103);
        bCar.setMake("Vauxhall");
        bCar.setOwnerName("Jane Rodgers");
        bCar.setColour(bCar.getColour());
        bCar.setYearOfManufacture(2012);
        bCar.setTopSpeed(100);
        bCar.setCostPrice(10000.00);
        bCar.printCarInfo();

        // 3.6 create new object cCar and use set methods to assign info
        Car2 cCar = new Car2();
        cCar.setId(104);
        cCar.setMake("Toyota");
        cCar.setOwnerName("Robert Smith");
        cCar.setColour("Blue");
        cCar.setYearOfManufacture(2010);
        cCar.setTopSpeed(120);
        cCar.setCostPrice(12000.00);
        cCar.printCarInfo();

        //3.7 use of get methods
        System.out.println("Make of bCar is: " + bCar.getMake());
        System.out.println("Colour of bCar is: " + bCar.getColour());
        System.out.println("Year bCar was made is: " + bCar.getYearOfManufacture());
        System.out.println("==================");

        // Test user-defined method to calculate the age of a car
        System.out.println("Car " + cCar.getId() + " is " +
                cCar.ageOfCar() + " years old\n");
        years = aCar.ageOfCar();
        if ( years == -1){
            System.out.println("Year of manufacture not recorded for Car " + aCar.getId() + "\n");
        }//if
        else{
            System.out.println("Car " + aCar.getId() + " is " +
                    years + " years old\n");
        }//else

        // Test user-defined method to find current value of a car
        System.out.print("What is the yearly percentage depreciation for car " + cCar.getId() + " : ");
        number = keyboard.nextDouble();
        System.out.println("The current value of car " +
                cCar.getId() +  " is £" +
                df.format(cCar.currentValue(number)) + "\n");

        System.out.print("What is the yearly percentage depreciation for car " + aCar.getId() + " : ");
        number = keyboard.nextDouble();
        currentValueOfCar = aCar.currentValue(number);
        if (currentValueOfCar == -1){
            System.out.println("Year of manufacture and/or Cost not recorded for Car " + aCar.getId() + "\n");
        }//if
        else{
            System.out.println("The current value of car " +
                    aCar.getId() +  " is £" +
                    df.format(currentValueOfCar) + "\n");
        }//else






    }//main
}//class
