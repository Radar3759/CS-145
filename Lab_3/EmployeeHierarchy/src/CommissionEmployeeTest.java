/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 3 Employee Hierarchy
*/

//template Fig 9.7 white book
public class CommissionEmployeeTest {
    public static void main(String[] args) throws Exception {
       //start new employee BasePlusCommissionEmployee object
    CommissionEmployee employee =
        new CommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04);
        //get base salaried commission employee data
        System.out.printf("%nThis is the Commission Employee Test%n");
        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales are", employee.getGrossSales());
        System.out.printf("%s %s%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%n%s: %s%n", "Updated commission employee information obtained by toString", employee.toString());
    }
}
