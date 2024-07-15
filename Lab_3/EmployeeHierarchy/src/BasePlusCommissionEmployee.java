/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 3 Employee Hierarchy
*/

//extends CommissionEmployee to get information from that class
public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary; // base salary per week

   // six-argument constructor, constructors are NOT inherited
   public BasePlusCommissionEmployee(
      String firstName, 
      String lastName, 
      String socialSecurityNumber, 
      double grossSales, 
      double commissionRate, 
      double baseSalary) {

      //use explicit call to superclass per fig 9.8 white book
      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
      //if baseSalary is less than 0, throw exception
         if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }
      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base-salaried commission employee's base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   @Override
   // calculate base-salaried commission employee's earnings
   public double earnings() {
      //not allowed: commisonRate and grossSales private in superclass
      return baseSalary + (commissionRate * grossSales);
   } 

      // return String representation of BasePlusCommissionEmployee
      @Override
      public String toString() {
         //not allowed d/t private in superclass
         // return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n", "base-salaried commission employee", 
         // "employee name", firstName, lastName, 
         // "social security number", socialSecurityNumber, 
         // "gross sales", grossSales, 
         // "commission rate", commissionRate 
         // "base salary", getBaseSalary()

         return String.format("%s: %n%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n", 
         "base-salaried commission employee",          
         "name", firstName, lastName, 
         "social security number", socialSecurityNumber, 
         "gross sales", grossSales, 
         "commission rate", commissionRate,
         "base salary", getBaseSalary()
         );
         
      } 
}
