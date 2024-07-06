// Exercise 9.3: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee using composition.

public class BasePlusCommissionEmployee {
   private CommissionEmployee commissionEmployee; // composition
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      commissionEmployee = 
         new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

      this.baseSalary = baseSalary;
   }

   // return first name
   public String getFirstName() {
      return commissionEmployee.getFirstName();
   }

   // return last name
   public String getLastName() {
      return commissionEmployee.getLastName();
   } 

   // return social security number
   public String getSocialSecurityNumber() {
      return commissionEmployee.getSocialSecurityNumber();
   } 

   // set commission employee's gross sales amount
   public void setGrossSales(double grossSales) {
      commissionEmployee.setGrossSales(grossSales);
   } 

   // return commission employee's gross sales amount
   public double getGrossSales() {
      return commissionEmployee.getGrossSales();
   } 

   // set commission employee's rate
   public void setCommissionRate(double commissionRate) {
      commissionEmployee.setCommissionRate(commissionRate);
   } 

   // return commission employee's rate
   public double getCommissionRate() {
      return commissionEmployee.getCommissionRate();
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

   // calculate base-salaried commission employee's earnings
   public double earnings() {
      return getBaseSalary() + commissionEmployee.earnings();
   } 

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format("%s %s\n%s: %.2f", "base-salaried", 
         commissionEmployee.toString(), "base salary", getBaseSalary());
   } 
}
