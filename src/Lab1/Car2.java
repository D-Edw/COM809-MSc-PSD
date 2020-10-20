package Lab1;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Calendar;

/**
 * Created by: Daniel
 * Created on: 18/11/19
 * Define a car class
 */

public class Car2 {

    static DecimalFormat df = new DecimalFormat("0.00");
    static Calendar rightNow = Calendar.getInstance();



    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;

    public Car2 (){
    }//Default Constructor

    public Car2(int carID, String carMake, String carOwner, String carColour, int year, int speed, double price){
        id = carID;
        make = carMake;
        ownerName = carOwner;
        colour = carColour;
        yearOfManufacture = year;
        topSpeed = speed;
        costPrice = price;
    }//AlternativeConstructor

    public Car2(int carID, String carMake, String carOwner, String carColour){
        id = carID;
        make = carMake;
        ownerName = carOwner;
        colour = carColour;
        yearOfManufacture = 0;
        topSpeed = 0;
        costPrice = 0;
    }//AlternativeConstructor

    public Car2(int carID, String carOwner, int speed){
        id = carID;
        make = "Unknown";
        ownerName = carOwner;
        colour = "Unknown";
        yearOfManufacture = 0;
        topSpeed = speed;
        costPrice = 0;
    }//AlternativeConstructor

    public void setId(int itsID){
        id = itsID;
    }//setId

    public void setMake(String itsMake){
        make = itsMake;
    }//setMake

    public void setOwnerName(String whoOwns){
        ownerName = whoOwns;
    }//setOwnerName

    public void setColour(String itsColour){
        colour = itsColour;
    }//setColour

    public void setYearOfManufacture(int whenBuild){
        yearOfManufacture = whenBuild;
    }//setYearOfManufacture

    public void setTopSpeed(int maxSpeed){
        topSpeed = maxSpeed;
    }//setTopSpeed

    public void setCostPrice(double price){
        costPrice = price;
    }//setCostPrice

    public int getId(){
        return id;
    }//getId

    public String getMake (){
        return make;
    }//getMake

    public String getOwnerName (){
        return ownerName;
    }//getOwnerName

    public String getColour (){
        return colour;
    }//getColour

    public int getYearOfManufacture (){
        return yearOfManufacture;
    }//getYearOfManufacture

    public int getTopSpeed (){
        return topSpeed;
    }//getTopSpeed

    public double getCostPrice (){
        return costPrice;
    }//getCostPrice

    // Method to return the age of a car
    public int ageOfCar() {
        int answer;
        Calendar current = Calendar.getInstance();
        if (yearOfManufacture == 0) {
            answer = -1;
        }//if
        else {
            answer = (current.get(Calendar.YEAR) - yearOfManufacture);
        }//else
        return answer;
    }//ageOfCar

    // Method to return the current value of a car
    public double currentValue(double depreciation) {
        int age;
        double value;
        if (costPrice == 0) {
            value = -1;
        }//if
        else {
            age = ageOfCar();
            if (age == -1) {
                value = -1;
            }//if
            else {
                value = costPrice - (costPrice * (depreciation / 100) * age);
            }//else
        }//else
        return value;
    }//currentValue

    //Method to print out all details of the car
    public void printCarInfo(){
        System.out.println("CAR DETAILS: ");
        System.out.println("Car ID: " + id);
        System.out.println("Make: " + make);
        System.out.println("Owner: " + ownerName);
        System.out.println("Colour: " + colour);
        System.out.println("Year: " + yearOfManufacture);
        System.out.println("Speed: " + topSpeed);
        System.out.println("Cost: " + df.format(costPrice));
        System.out.println("==================");
    }//printCarInfo


}//class
