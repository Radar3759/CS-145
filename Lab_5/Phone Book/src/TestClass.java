
public class TestClass {
    public static void main(String[] args){
    //start new phone book entry
    TestClass testClass = new TestClass.add("B. Frodo", "The Shire", "Seattle", "333-33-3333");

    //get phone book entry
    System.out.printf("%nPhonebook test entry: %n");
    System.out.printf("%s %s%n", "Name is:", PhoneBookEntry.getName());
    System.out.printf("%s %s%n", "Address is:", PhoneBookEntry.getAddress());
    System.out.printf("%s %.2f%n", "City is:", PhoneBookEntry.getCity());
    System.out.printf("%s %.2f%n", "Commission rate is:", PhoneBookEntry.getPhoneNum());


    System.out.printf("%n%s: %n%n%s%n%n", "Phonebook entry obtained by toString", PhoneBookEntry.toString());
    }
}
