// The phone book node should contain at least name, address, city, and phone number fields in the phonebook node. 

public class PhoneBookEntry {
    private String name;// consider protected if private fails
    private String address;
    private String city;
    private String phoneNum;
    
    

//add getters and setters
//add first and last name if the rest comes together
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.name = address;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.name = city;
}

public String getPhoneNum() {
    return phoneNum;
}

public void setPhoneNum(String phoneNum) {
    this.name = phoneNum;
}

//should this be a constructor? 

//add override and String toString
@Override
public String toString() {
    return String.format("%s %s\n%s: %s\n%s: %s", 
        getName(), 
        "address", getAddress(), 
        "city", getCity(), "phone number", getPhoneNum());
    } 
}

