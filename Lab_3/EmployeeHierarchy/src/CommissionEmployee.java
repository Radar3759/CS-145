/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 3 Employee Hierarchy
*/

// private instance variables.
public class CommissionEmployee extends Employee {             
   protected  double grossSales; // gross weekly sales       
   protected  double commissionRate; // commission percentage

   // five-argument constructor, constructors are NOT Inherited
   public CommissionEmployee(
      String firstName, 
      String lastName, 
      String socialSecurityNumber, 
      double grossSales, 
      double commissionRate) {
         
      //call to superclass
      super(firstName, lastName, socialSecurityNumber);

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }
      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() {
      return grossSales;
      
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {
      return commissionRate;
   }

   // calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString() {
      return String.format("%n%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n", 
         "commission employee", firstName, lastName, 
         "social security number", socialSecurityNumber, 
         "gross sales", getGrossSales(),
         "commission rate", getCommissionRate());
   } 
}