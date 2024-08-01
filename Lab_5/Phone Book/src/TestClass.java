
public class TestClass {
    public static void main(String[] args){
    //start new phone book entry
    TestClass testClass = 
    new TestClass.add("B. Frodo", "The Shire", "Seattle", "333-33-3333");

    //get phone book entry
    System.out.printf("%nBase Plus Commission Employee information obtained by get methods: %n");
    System.out.printf("%s %s%n", "Name is:", phoneBookEntry.getName());
    // System.out.printf("%s %s%n", "Last name is:", employee.getLastName());
    System.out.printf("%s %s%n", "Address is:", phoneBookEntry.getAddress());
    System.out.printf("%s %.2f%n", "City is:", phoneBookEntry.getCity());
    System.out.printf("%s %.2f%n", "Commission rate is:", phoneBookEntry.getPhoneNum());

    //employee.setBaseSalary(1000);

    System.out.printf("%n%s: %n%n%s%n%n", "Updated employee information obtained by toString", phoneBook.toString());
    }
}
