package Lab3.University;

/*
 * Define a Member Class
 */

abstract public class Member {
   private String name;
   private String email;

   public Member() {
   }//Default Constructor

   public Member(String memberName, String memberEmail) {
      name = memberName;
      email = memberEmail;
   }//Constructor

   protected void setName(String memberName) {
      name = memberName;
   }//setName

   protected String getName() {
      return name;
   }//getName

   protected void setEmail(String memberEmail) {
      email = memberEmail;
   }//setEmail

   protected String getEmail() {
      return email;
   }//getEmail

   public String toString() {
      return "Name:      " + name + "\n" +
              "Email:     " + email + "\n";
   }//toString

   abstract protected String getStatus();
}//class
