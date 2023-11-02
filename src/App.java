import cell.Contact;
import cell.ContactManager;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ContactManager cm = new ContactManager();

        Contact c1 = new Contact("Oleg", "Makeienko", "+46-072-129-2213", "molva83@gmail.com");
        Contact c2 = new Contact("Alfred", "Bond", "+46-070-675-5638", "AOhlsson@google.com");
        Contact c3 = new Contact("Oleg", "Malmsdotter", "+46-076-890-1164", "Maire@gmail.com");
        Contact c4 = new Contact("Mark", "Bond", "+46-070-000-1164", "Mark@gmail.com");

        System.out.println("ADD CONTACT ==============");
        Long cId1 = cm.addContact(c1);
        Long cId2 = cm.addContact(c2);
        Long cId3 = cm.addContact(c3);
        Long cId4 = cm.addContact(c4);
        List<Contact> result1 = cm.allContacts();
        for(Contact c : result1) {
            System.out.println(c);
        }

        /*
        System.out.println("UPDATE CONTACT ==============");
        Contact change = new Contact(cId1, "Ulf", "Gorn", "+46-070-890-8888", "golf@gmail.com");
        cm.updateContact(change);
        List<Contact> result2 = cm.allContacts();
        for(Contact c : result2) {
            System.out.println(c);
        }

        System.out.println("DELETE CONTACT ==============");
        cm.deleteContact(cId3);
        List<Contact> result3 = cm.allContacts();
        for(Contact c : result3) {
            System.out.println(c);
        }



        System.out.println("\nGET CONTACT WITH ID =======");
        Contact contact1 = cm.getContactWithID(cId2);
        System.out.println(contact1);

        System.out.println("\nGET CONTACT WITH LAST NAME =======");
        Contact contact3 = cm.getContactWithLastname("Bond");
        System.out.println(contact3);
         */

        System.out.println("\nGET CONTACT WITH FIRST NAME =======");
        System.out.println(cm.getContactWithFirstname("Oleg"));



    }
}
