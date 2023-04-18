package week3;

import java.util.ArrayList;
import java.util.Objects;

public class ContactService {
    //    Array of contacts to test
    private ArrayList<Contact> contacts;

    //  Constructor
    public ContactService() {
        contacts = new ArrayList<>();
    }

    //  Add a Contact
    public boolean add(Contact contact) {
//  Check if contact already exists
        boolean existingContact = false;
        for (Contact c : contacts) {
            if (c.equals(contact)) {
                existingContact = true;
            }
        }
        if (!existingContact) {
            contacts.add(contact);
            System.out.println("Contact created successfully.");
            return true;
        } else {
            System.out.println("This Contact already exists.");
            return false;
        }
    }

    //    Deleting a Contact
    public boolean remove(String contactID) {
        for (Contact c : contacts) {
            if (contactID.equals(c.getContactID())) {
                contacts.remove(c);
                System.out.println("Contact successfully deleted.");
                return true;
            }
        }
        System.out.println("Contact does not exist.");
        return false;
    }

    //  Update Contact Data
    public boolean update(String contactID, String firstName, String lastName, String contactAddress, String phoneNumber) {
        for (Contact c : contacts) {
            if (Objects.equals(c.getContactID(), contactID)) {
                if (!firstName.equals(""))
                    c.setFirstName(firstName);
                if (!lastName.equals(""))
                    c.setLastName(lastName);
                if (!contactAddress.equals(""))
                    c.setContactAddress(contactAddress);
                if (!phoneNumber.equals(""))
                    c.setPhoneNumber(phoneNumber);
                System.out.println("Contact has been updated successfully!");
                return true;
            }
        }
        System.out.println("Contact not found");
        return false;
    }
}