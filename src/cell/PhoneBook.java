package cell;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<String> phoneNumbers = new ArrayList<>();

    public List<String> addUsersPhoneNumber (String phoneNumber) {
        phoneNumbers.add(phoneNumber);
        return phoneNumbers;
    }

    public void showAllUsersPhoneNumbers (List<String> phoneNumbers) {
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
