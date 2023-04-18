package week3;

//Required Variables
public class Contact {
 private String contactID;
 private String firstName;
 private String lastName;
 private String phoneNumber;
 private String contactAddress;

 // param validations
 public Contact(String contactID, String firstName, String lastName, String phoneNumber, String contactAddress) {
     if (contactID == null || contactID.length() > 10) {
         throw new IllegalArgumentException("Invalid ID");
     }
     if (firstName == null || firstName.length() > 10) {
         throw new IllegalArgumentException("Invalid First Name");
     }
     if (lastName == null || lastName.length() > 10) {
         throw new IllegalArgumentException("Invalid Last Name");
     }
     if (phoneNumber == null || phoneNumber.length() != 10) {
         throw new IllegalArgumentException("Invalid Phone Number");
     }
     if (contactAddress == null || contactAddress.length() > 30) {
         throw new IllegalArgumentException("Invalid Address");
     }

 }

 // Get and Set 
 public String getContactID() {
     return contactID;
 }

 public void setContactID(String contactID) {
     this.contactID = contactID;
 }

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }

 public String getPhoneNumber() {
     return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

 public String getContactAddress() {
     return contactAddress;
 }

 public void setContactAddress(String contactAddress) {
     this.contactAddress = contactAddress;
 }
}
