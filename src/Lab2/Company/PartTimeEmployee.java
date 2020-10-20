package Lab2.Company;

/**
 * Created by: Daniel
 * Created on: 21/11/19
 * Define a part time employee class (extends Employee)
 */

public class PartTimeEmployee extends Employee {
    private int hoursPerMonth;
    private double hourlyPay;

    public PartTimeEmployee(String pnumber, String pname){
        super(pnumber, pname);
    }//constructor

    public PartTimeEmployee(String pnumber, String pname, int phoursPerMonth, double phourlyPay) {
        super(pnumber, pname);
        hoursPerMonth = phoursPerMonth;
        hourlyPay = phourlyPay;
    }//alternateConstructor

    protected void setHourlyPay(double phourlyPay) {
        hourlyPay = phourlyPay;
    }//setHourlyPay

    protected double getHourlyPay() {
        return hourlyPay;
    }//getHourlyPay

    protected void setHoursPerMonth(int phoursPerMonth) {
        hoursPerMonth = phoursPerMonth;
    }//setHoursPerMonth

    protected double getHoursPerMonth() {
        return hoursPerMonth;
    }//getHoursPerMonth

    protected double calculateMonthlyPay() {
        return hoursPerMonth * hourlyPay;
    }//calculateWeeklyPay



}//class
