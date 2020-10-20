package Lab2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by: Daniel
 * Created on: 21/11/2019
 * Define a CD class
 */

public class CD {
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    //Declare variables
    private static int cdNumber = 0;
    private String artistName;
    private String albumName;
    private double costPrice;
    private double salePrice;
    private int issueYear;
    private boolean single;

    //Constructor methods
    public CD (){
        cdNumber++;
    }//defaultConstructor

    public CD(String artist, String album, int year, boolean isSingle){
        cdNumber++;
        artistName = artist;
        albumName = album;
        costPrice = 0;
        salePrice = 0;
        issueYear = year;
        single = isSingle;
    }//alternateConstructor

    public CD(String artist, String album, double cost, double sale, int year, boolean isSingle){
        cdNumber++;
        artistName = artist;
        albumName = album;
        costPrice = cost;
        salePrice = sale;
        issueYear = year;
        single = isSingle;
    }//alternateConstructor

    //print all method
    public void printAllInfo(){
        System.out.println("*** START ***");
        System.out.println("CD Number is: " + cdNumber);
        System.out.println("Artist Name is: " + artistName);
        System.out.println("Album Name is: " + albumName);
        System.out.println("Cost price is: " + df.format(costPrice));
        System.out.println("Sale price is: " + df.format(salePrice));
        System.out.println("Issue Year is: " + issueYear);
        if (single) {
            System.out.println("This is a single CD");
        }//if
        else {
            System.out.println("This is a double CD");
        }//else
        System.out.println("*** END ***\n");
    }//printAllInfo

    //Method to get year CD was issued
    public int getIssueYear(){
        return issueYear;
    }//getIssueYear

    //Method to update prices of CDs
    public void updatePrices(double priceUpdate){
       costPrice = costPrice + priceUpdate;
       salePrice = salePrice + (priceUpdate * 2);
    }//updatePrices

    public double getProfit(){
        return salePrice - costPrice;
    }//getProfit








}//class
