package Lab2.Company;

/**
 * Created by: Daniel
 * Created on: 15/11/2019
 * Define a Casual Employee Class (extends Employee)
 */

public class CasualEmployee extends Employee {
    private double hourlyPay;

    public CasualEmployee(String empNumber, String empName) {
        super(empNumber, empName);
    }//Constructor

    protected void setHourlyPay(double empHourlyPay) {
        hourlyPay = empHourlyPay;
    }//setHourlyPay

    protected double getHourlyPay(){
        return hourlyPay;
    }//getHourlyPay

    protected double calculateWeeklyPay(int empNoOfHours){
        return empNoOfHours * hourlyPay;
    }//calculateWeeklyPay
}//class


