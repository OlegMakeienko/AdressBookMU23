import cell.Contact;
import cell.ContactManager;
import io.GlobalConfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) {

        // I use here ContactSimpleDAO but I must make and use ContactIODAO later

        ContactManager cm = new ContactManager();
        List<String> lineFromData;

        try {
            FileReader fr = GlobalConfig.initGlobalConfig();
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {

                String data = scan.nextLine();

                lineFromData = List.of(data.split(" "));
                cm.addContact(new Contact(lineFromData.get(0),
                        lineFromData.get(1),
                        lineFromData.get(2),
                        lineFromData.get(3)));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Contact> result1 = cm.allContacts();
        for(Contact c : result1) {
            System.out.println(c);
        }
    }
}
