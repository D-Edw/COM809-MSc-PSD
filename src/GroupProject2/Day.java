package GroupProject2;

/** created by Barry McR
 * NOVEMBER 2019
 * Class  to create day objects
*/

public class Day {

    //declare variable
    private String day;

    //constructors for day objects
    public Day(){
    }//defaultConstructor

    public Day(String pDay){
        day = pDay;
    }//alternateConstructor

    //toString method to return day chosen
    public String toString(){
        return  day;
    }//ToString

}//class
