/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 3 Employee Hierarchy
*/
public class Employee extends Object {
   protected final String firstName;                              
   protected final String lastName;                               
   protected final String socialSecurityNumber;                   

   // three-argument constructor
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber) {
   
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      
   } 

   // return first name
   public String getFirstName() {
      return firstName;
   }

   // return last name
   public String getLastName() {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber() {
      return socialSecurityNumber;
   } 

   // return String representation of Employee object
   @Override 
   public String toString() {
      return String.format("%n%s: %s %s %n%s: %s%n", 
         "employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber());
   } 
}