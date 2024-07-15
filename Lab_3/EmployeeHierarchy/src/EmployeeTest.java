/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 3 Employee Hierarchy
*/
//template Fig 9.7 white book
public class EmployeeTest {
    public static void main(String[] args) throws Exception {
       //start new employee BasePlusCommissionEmployee object
    Employee employee =
        new Employee("B", "Frodo", "333-33-3333");

        //get base salaried commission employee data
        System.out.printf("%nThis is the Employee Test%n");
        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First name is:", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is:", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security Number is:", employee.getSocialSecurityNumber());

        System.out.printf("%n%s: %s%n", "Updated employee information obtained by toString", employee.toString());
    }
}
