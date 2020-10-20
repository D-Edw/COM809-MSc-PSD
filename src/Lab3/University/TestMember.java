package Lab3.University;

import java.util.Scanner;

/*
 * Program to test the Member Class
 */

public class TestMember {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      String name, email, job, room;
      double pay;

      // Create staff1
      Staff staff1 = new Staff("George McMullan", "g.mcmullan@ulster.ac.uk", "Lecturer", "F34", 30000);

      // Create staff2
      Staff staff2 = new Staff("James Hollinger", "j.hollinger@ulster.ac.uk");

      // Create staff3
      System.out.println("Enter the details for new member of staff");
      System.out.print("Staff Name : ");
      name = keyboard.nextLine();
      System.out.print("Email      : ");
      email = keyboard.nextLine();
      System.out.print("Job Title  : ");
      job = keyboard.nextLine();
      System.out.print("Room       : ");
      room = keyboard.nextLine();
      System.out.print("Salary     : £");
      pay = keyboard.nextDouble();
      keyboard.nextLine();
      Staff staff3 = new Staff(name, email, job, room, pay);

      // Print out the details for each member of staff
      System.out.println(staff1);
      System.out.println(staff2);
      System.out.println(staff3);

      System.out.println("There are " + Staff.numberOfStaff() + " staff in the University\n");

      // Create student1
      Student student1 = new Student("Fred Johnston", "johnston-f1@email.ulster.ac.uk", "Computing", 56, 67, 44);

      // Create student2
      Student student2 = new Student("Jane Robinson", "robinson-j@email.ulster.ac.uk", "Media Studies");

      // Print out the details for each member of staff
      System.out.println(student1);
      System.out.println(student2);

      System.out.println("There are " + Student.numberOfStudents() + " students in the University\n");

      student2.setMarks(80, 75, 77);
      System.out.println(student2);

      student1.setMark2(76);
      System.out.println(student1);

      staff2.setSalary(45000);
      System.out.println(staff2);

      System.out.println("The status of member " + staff3.getID() + " is " + staff3.getStatus());
   }//main
}//class
