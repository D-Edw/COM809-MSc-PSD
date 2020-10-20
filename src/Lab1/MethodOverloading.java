package Lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

    /**
     * Program to demonstrate overloading of methods
     */

    public class MethodOverloading {
        static Scanner keyboard = new Scanner(System.in);
        static DecimalFormat df = new DecimalFormat("00.00");

        // Method to calculate the area of an equilateral triangle
        public static double calculateArea(int side) {
            double sum, area;
            sum = (side * 3) / 2;
            area = Math.sqrt(sum * Math.pow((sum - side), 3));
            return area;
        }//calculateArea

        // Method to calculate the area of an isosceles triangle
        public static double calculateArea(int side1, int side2) {
            double sum, area;
            sum = ((side1 + side1 + side2) / 2);
            area = Math.sqrt(sum * (sum - side1) * (sum - side1) * (sum - side2));
            return area;
        }//calculateArea

        // Method to calculate the area of a scalene triangle
        public static double calculateArea(int side1, int side2, int side3) {
            double sum, area;
            sum = ((side1 + side2 + side3) / 2);
            area = Math.sqrt(sum * (sum - side1) * (sum - side2) * (sum - side3));
            return area;
        }//calculateArea

        public static void main(String[] args) {
            int equilateralSide;
            int isoscelesSide1, isoscelesSide2;
            int scaleneSide1, scaleneSide2, scaleneSide3;

            System.out.println("Equilateral Triangle");
            System.out.println("********************");
            System.out.print("Enter the length of the side of the equilateral triangle: ");
            equilateralSide = keyboard.nextInt();
            System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");

            System.out.println("Isosceles Triangle");
            System.out.println("******************");
            System.out.print("Enter length of the two sides which are the same: ");
            isoscelesSide1 = keyboard.nextInt();
            System.out.print("Enter length of the other side of an isosceles triangle: ");
            isoscelesSide2 = keyboard.nextInt();
            System.out.println("The area of the triangle is " + df.format(calculateArea(isoscelesSide1, isoscelesSide2)) + " units squared\n");

            System.out.println("Scalene Triangle");
            System.out.println("****************");
            System.out.print("Enter length of side 1 of the scalene triangle: ");
            scaleneSide1 = keyboard.nextInt();
            System.out.print("Enter length of side 2 of the scalene triangle: ");
            scaleneSide2 = keyboard.nextInt();
            System.out.print("Enter length of side 3 of the scalene triangle: ");
            scaleneSide3 = keyboard.nextInt();
            System.out.println("The area of the triangle is " + df.format(calculateArea(scaleneSide1, scaleneSide2, scaleneSide3)) + " units squared\n");

        }//main
    }//class
