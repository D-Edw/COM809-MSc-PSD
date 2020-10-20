package Lab3.University;
import Lab3.University.Member;

import java.text.DecimalFormat;

/*
 * Define a Student Class (extends Member)
 */

public class Student extends Member {
   DecimalFormat df = new DecimalFormat("00.00");

   private static int nextUniqueID = 1;

   private int studentID;
   private String course;
   private int mark1, mark2, mark3;

   public Student() {
      super();
      nextUniqueID = nextUniqueID + 1;
   }//Default Constructor

   public Student(String studentName, String studentEmail, String studentCourse, int firstMark, int secondMark, int thirdMark) {
      super(studentName, studentEmail);
      studentID = nextUniqueID;
      course = studentCourse;
      mark1 = firstMark;
      mark2 = secondMark;
      mark3 = thirdMark;
      nextUniqueID = nextUniqueID + 1;
   }//Constructor

   public Student(String studentName, String studentEmail, String studentCourse) {
      super(studentName, studentEmail);
      studentID = nextUniqueID;
      course = studentCourse;
      mark1 = 0;
      mark2 = 0;
      mark3 = 0;
      nextUniqueID = nextUniqueID + 1;
   }//Constructor

   protected int getID() {
      return studentID;
   }//getID

   protected void setCourse(String studentCourse) {
      course = studentCourse;
   }//setCourse

   protected String getCourse() {
      return course;
   }//getCourse

   protected void setMark1(int firstMark) {
      mark1 = firstMark;
   }//setMark1

   protected void setMark2(int secondMark) {
      mark2 = secondMark;
   }//setMark2

   protected void setMark3(int thirdMark) {
      mark3 = thirdMark;
   }//setMark3

   protected int getMark1() {
      return mark1;
   }//getMark1

   protected int getMark2() {
      return mark2;
   }//getMark2

   protected int getMark3() {
      return mark3;
   }//getMark3

   protected void setMarks(int firstMark, int secondMark, int thirdMark) {
      mark1 = firstMark;
      mark2 = secondMark;
      mark3 = thirdMark;
   }//setMarks

   private double getAverage() {
      return (double) (mark1 + mark2 + mark3) / 3;
   }//getAverage

   public String toString() {
      double result;
      String message;

      message = "The Student ID is " + studentID + "\n" +
              super.toString() +
              "Course:    " + getCourse() + "\n" +
              "The student's three marks are:\n" +
              "\t\t" + mark1 + "%\n" +
              "\t\t" + mark2 + "%\n" +
              "\t\t" + mark3 + "%\n";
      result = getAverage();
      if (result < 0) {
         message = message + "Average mark not computable\n";
      }//if
      else {
         message = message + "The average mark of the student is "
                 + df.format(result) + "%\n";
      }//else
      return message;
   }//toString

   protected String getStatus() {
      return "Student";
   }//getStatus

   protected static int numberOfStudents() {
      return (nextUniqueID - 1);
   }//numberOfStudents
}//class
