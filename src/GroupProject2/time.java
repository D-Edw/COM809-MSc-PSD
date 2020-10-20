package GroupProject2;

import java.text.DecimalFormat;
import java.util.Scanner;

/** created by Barry McM
 * NOVEMBER 2019
 * Class for times of movies
 */

public class time {

    //Create objects
    Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("00.00");

    //Variables
    double matinee=12.00;
    double earlyAfternoon=4.00;
    double evening=7.00;
    double late=9.00;
    double time;

    //Create methods
    public time() {
    }//Default Constructor

    public time(double mTime){
        time=mTime;
    }//Alternative Constructor

    //toString method to return time chosen
    public String toString() {
       return df.format(time) + "PM" ;
    }//Alternative Constructor

}//Class


