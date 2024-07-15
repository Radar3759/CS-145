/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 3 Employee Hierarchy
*/

//template Fig 9.7 white book
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) throws Exception {
       //start new employee BasePlusCommissionEmployee object
    BasePlusCommissionEmployee employee =
        new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 1000);

        //get base salaried commission employee data
        System.out.printf("%nBase Plus Commission Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First name is:", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is:", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security Number is:", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales are:", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is:", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is:", employee.getBaseSalary());

        //employee.setBaseSalary(1000);

        System.out.printf("%n%s: %n%n%s%n%n", "Updated employee information obtained by toString", employee.toString());
    }
}
