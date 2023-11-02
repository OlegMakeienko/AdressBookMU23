package cell;

import java.util.ArrayList;
import java.util.List;

public interface ContactDAO {
    Long addContact(Contact contact);
    void updateContact(Contact contact);
    void deleteContact(Long contactId);
    Contact getContactWithId(Long contactId);

    ArrayList<Contact> getContactWithFirstname(String firstName);
    Contact getContactWithLastname(String lastName);

    List<Contact> listWithAllContacts();

}