package Lab3.University;

import Lab3.University.Member;

import java.text.DecimalFormat;

/*
 * Define a Staff Class - extends Member
 */

public class Staff extends Member {
   DecimalFormat df = new DecimalFormat("0,000.00");

   private static int nextUniqueID = 100001;

   private int staffID;
   private String jobTitle;
   private String room;
   private double salary;

   public Staff() {
      super();
      nextUniqueID = nextUniqueID + 1;
   }//Default Constructor

   public Staff(String staffName, String staffEmail, String staffJobTitle, String staffRoom, double staffSalary) {
      super(staffName, staffEmail);
      staffID = nextUniqueID;
      jobTitle = staffJobTitle;
      room = staffRoom;
      salary = staffSalary;
      nextUniqueID = nextUniqueID + 1;
   }//Constructor

   public Staff(String staffName, String staffEmail) {
      super(staffName, staffEmail);
      staffID = nextUniqueID;
      jobTitle = "";
      room = "";
      salary = 0;
      nextUniqueID = nextUniqueID + 1;
   }//Constructor

   protected int getID() {
      return staffID;
   }//getID

   protected void setSalary(int staffSalary) {
      salary = staffSalary;
   }//setSalary

   protected double getSalary() {
      return salary;
   }//getSalary

   protected void setJobTitle(String staffJobTitle) {
      jobTitle = staffJobTitle;
   }//setJobTitle

   protected String getJobTitle() {
      return jobTitle;
   }//getJobTitle

   protected void setRoom(String staffRoom) {
      room = staffRoom;
   }//setRoom

   protected String getRoom() {
      return room;
   }//getRoom

   public String toString() {
      return "The Staff ID is " + staffID + "\n" +
              super.toString() +
              "Job Title: " + jobTitle + "\n" +
              "Room:      " + room + "\n" +
              "Salary:    £" + df.format(salary) + "\n";
   }//toString

   protected String getStatus() {
      return "Staff";
   }//getStatus

   protected static int numberOfStaff() {
      return (nextUniqueID - 100001);
   }//numberOfStaff
}//class
