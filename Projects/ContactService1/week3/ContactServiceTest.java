package week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Test to add contact with valid assertions
public class ContactServiceTest {
    @Test
    public void testAddContact() {
        ContactService cs = new ContactService();
        Contact contactOne = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactTwo = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactThree = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        assertTrue(cs.add(contactOne));
        assertTrue(cs.add(contactTwo));
        assertTrue(cs.add(contactThree));
    }
    /* Test to add Contacts, with false assertions */
    @Test
    public void testAddContactFail() {
        ContactService cs = new ContactService();
        Contact contactOne = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactTwo = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactThree = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        assertEquals(true, cs.add(contactOne));
        assertEquals(false, cs.add(contactOne));
        assertEquals(true, cs.add(contactThree));
        assertEquals(true, cs.add(contactTwo));
    }
    /* Test to delete Contacts */
    @Test
    public void testMethodDeletePass() {
        ContactService cs = new ContactService();
        Contact contactOne = new Contact("Test1", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactTwo = new Contact("Test2", "Ryan", "Reynolds", "5555555555",
                        "1235 Laguna Drive Huron Ohio");
        Contact contactThree = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                        "1235 Laguna Drive Huron Ohio");
        assertEquals(true, cs.add(contactOne));
        assertEquals(true, cs.add(contactTwo));
        assertEquals(true, cs.add(contactThree));
        assertEquals(false, cs.remove("Test1"));
        assertEquals(false, cs.remove("Test2"));
    }
    /* Test to delete Contacts, with false parameters */
    @Test
    public void testMethodDeleteFail() {
        ContactService cs = new ContactService();
        Contact contactOne = new Contact("Test1", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactTwo = new Contact("Test2", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactThree = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        assertEquals(true, cs.add(contactOne));
        assertEquals(true, cs.add(contactTwo));
        assertEquals(true, cs.add(contactThree));
        assertEquals(false, cs.remove("Test4"));
        assertEquals(false, cs.remove("Test2"));
    }
    /* Test the update Contacts */
    @Test
    public void testUpdatePass() {
        ContactService cs = new ContactService();
        Contact contactOne = new Contact("Test1", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactTwo = new Contact("TestTwo", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactThree = new Contact("BL43452", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        assertEquals(true, cs.add(contactOne));
        assertEquals(true, cs.add(contactTwo));
        assertEquals(true, cs.add(contactThree));
        assertEquals(false, cs.update("TestTwo", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio"));
        assertEquals(false, cs.update("TestThree", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio"));
    }
    /* Test to update Contacts, with false parameters */
    @Test
    public void testUpdateFail() {
        ContactService cs = new ContactService();
        Contact contactOne = new Contact("TestOne", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactTwo = new Contact("TestTwo", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        Contact contactThree = new Contact("TestThree", "Ryan", "Reynolds", "5555555555",
                "1235 Laguna Drive Huron Ohio");
        assertEquals(true, cs.add(contactOne));
        assertEquals(true, cs.add(contactTwo));
        assertEquals(true, cs.add(contactThree));
        assertEquals(false, cs.update("TestFour", "Bob", "Roopers", "1235 Laguna Drive Huron Ohio",
                "555124568"));
        assertEquals(false, cs.update("TestTwo", "Steve", "Reynolds", "1235 Laguna Drive Huron Ohio",
                "5555551234"));

    }

}