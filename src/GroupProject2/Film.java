package GroupProject2;

import java.util.Scanner;

/** created by Ryan
 * NOVEMBER 2019
 * Class to create FIlm Objects
 */
public class Film {

    Scanner keyboard = new Scanner(System.in);

    //Define instance Variable
    private String filmTitle;
    private int runTime;
    private String certification;
    private boolean is3D;
    private String releaseDate;
    public int choice;

    //Define Constructor
    public Film(){
    }//DefaultConstructor

    public Film(String pFilmTitle, int pRunTime, String pCertification, String pReleaseDate) {

        filmTitle = pFilmTitle;
        runTime = pRunTime;
        certification = pCertification;
        is3D = false;
        releaseDate = pReleaseDate;

    }//Alternative Constructor
    public Film(String pFilmTitle, int pRunTime){
        filmTitle = pFilmTitle;
        runTime = pRunTime;
        certification = "Unknown";
        is3D = false;
        releaseDate = "To be Confirmed";
    }//Alternative Constructor

    //Method to Print all movie details
    public void printAllMovieDetails() {

        System.out.println("===================");
        System.out.println("The Film is '" + filmTitle +"'");
        System.out.println("The Film is " + runTime + " minutes long");
        System.out.println("The Film is a certified " + certification);
        if (is3D == false) {
            System.out.println("This film is 2D");
        }//IF
        else {
            System.out.println("This film is 3D");
        }//ELSE
        System.out.println("Release Date: " + releaseDate);
        System.out.println("===================");
    }//printAllMovieDetails

    //method to return filmTitle chosen
    public String toString() {
        return filmTitle;
    }//toString

}//class