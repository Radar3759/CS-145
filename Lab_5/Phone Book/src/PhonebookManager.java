import java.util.*;

public class PhonebookManager {
    public static void main(String[] args) {
        LinkedList<phoneBookEntry> list = new phoneBook(); //makes a new phonebook;
        list.add(new PhoneBookEntry("B. Frodo", "The Shire", "Seattle", "333-33-3333")); //adds to the list

        //print the list
        System.out.printf("Phonebook Unsorted: %n%s%n", list);
    }
}
