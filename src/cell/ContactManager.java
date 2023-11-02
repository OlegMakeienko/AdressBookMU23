package cell;

import java.util.ArrayList;
import java.util.List;

public class ContactManager { //Admin
    private ContactDAO dao;

    public ContactManager() {
        dao = ContactDAOFactory.getContactDAO();
    }
    public Long addContact(Contact contact) {
        return dao.addContact(contact);
    }

    public void updateContact(Contact contact) {
        dao.updateContact(contact);
    }

    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }

    public Contact getContactWithID(Long contactId) {
        return dao.getContactWithId(contactId);
    }

    public ArrayList<Contact> getContactWithFirstname(String firstName) {
        return dao.getContactWithFirstname(firstName);
    }

    public Contact getContactWithLastname(String lastName) {
        return dao.getContactWithLastname(lastName);
    }

    public List<Contact> allContacts() {
        return dao.listWithAllContacts();
    }
}