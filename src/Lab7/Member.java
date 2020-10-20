package Lab7;

/**
 * Program to define an individual Member Class
 */

public class Member {

    // Define instance variables
    private int memberNumber;
    private String memberName;

    public Member(int number, String name) {
        memberNumber = number;
        memberName = name;
    }//Constructor

    public String toString() {
        return (memberNumber + "\t\t" + memberName + "\n");
    }//toString

    //Accessor method to return the membership number
    public int getMembershipNumber(){
        return memberNumber;
    }//getMembershipNumber



}//class
