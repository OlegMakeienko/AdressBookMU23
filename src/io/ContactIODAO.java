package io;

import cell.Contact;
import cell.ContactDAO;

import java.util.ArrayList;
import java.util.List;

public class ContactIODAO implements ContactDAO {

    @Override
    public Long addContact(Contact contact) {
        return null;
    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public void deleteContact(Long contactId) {

    }

    @Override
    public Contact getContactWithId(Long contactId) {
        return null;
    }

    @Override
    public ArrayList<Contact> getContactWithFirstname(String firstName) {
        return null;
    }

    @Override
    public Contact getContactWithLastname(String lastName) {
        return null;
    }

    @Override
    public List<Contact> listWithAllContacts() {
        return null;
    }
}
