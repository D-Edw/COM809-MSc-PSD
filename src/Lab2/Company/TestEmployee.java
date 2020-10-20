package Lab2.Company;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Daniel
 * Created on: 15/11/2019
 * Program to test the Employee, FullTimeEmployee
 * and PartTimeEmployee Class
 */

public class TestEmployee {
    static Scanner keyboard = new Scanner(System.in);

    public static String getText(String message) {
        System.out.print(message);
        return keyboard.nextLine();
    }//getText

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0,000.00");

        String number, name;
        double annualSalary, pay;
        int hours;

        System.out.println("Test EMPLOYEE");
        System.out.println("=============");
        number = getText("Employee Number: ");
        name = getText("Employee Name: ");
        Employee employee1 = new Employee(number, name);
        System.out.println("Employee " + employee1.getNumber() + " is called " + employee1.getName() + "\n");

        System.out.println("Test full-time EMPLOYEE");
        System.out.println("=======================");
        number = getText("Employee Number: ");
        name = getText("Employee Name: ");
        FullTimeEmployee employee2 = new FullTimeEmployee(number, name);

        System.out.print("What is " + employee2.getName() + "'s annual salary? £");
        annualSalary = keyboard.nextDouble();
        employee2.setAnnualSalary(annualSalary);
        keyboard.nextLine();
        System.out.println("Employee: " + employee2.getNumber());
        System.out.println("Monthly Pay: £" + df.format(employee2.calculateMonthlyPay()) + "\n");

        System.out.println("Test casual EMPLOYEE");
        System.out.println("======================");
        number = getText("Employee Number: ");
        name = getText("Employee Name: ");
        CasualEmployee employee3 = new CasualEmployee(number, name);
        System.out.print("What is " + employee3.getName() + "'s hourly pay? £");
        pay = keyboard.nextDouble();
        employee3.setHourlyPay(pay);
        System.out.print("How many hours has " + employee3.getName() + " worked this week? ");
        hours = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Employee: " + employee3.getNumber());
        System.out.println("Weekly Pay: £" + df.format(employee3.calculateWeeklyPay(hours)) + "\n");

        System.out.println("Test part-time EMPLOYEE");
        System.out.println("=======================");
        number = getText("Employee Number : ");
        name = getText("Employee Name   : ");
        PartTimeEmployee employee4 = new PartTimeEmployee(number, name);
        System.out.print("What is " + employee4.getName() + "'s hourly pay? £");
        pay = keyboard.nextDouble();
        employee4.setHourlyPay(pay);
        System.out.print("How many hours does " + employee4.getName() + " work each month? ");
        hours = keyboard.nextInt();
        employee4.setHoursPerMonth(hours);
        keyboard.nextLine();
        System.out.println("Employee:    " + employee4.getNumber());
        System.out.println("Monthly Pay: £" + df.format(employee4.calculateMonthlyPay()) + "\n");
    }//main
}//class

