package cell;

public class Cell {

    private String name;
    private String lastName;
    private int age;
    private Address address;
    private PhoneBook phoneNumbers;

    public Cell(String name, String lastName, int age, Address address, PhoneBook phoneNumbers) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneBook getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneBook phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
