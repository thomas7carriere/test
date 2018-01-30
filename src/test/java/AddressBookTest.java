import static org.junit.Assert.*;

public class AddressBookTest {

    @org.junit.Test
    public void addBuddy() {
        AddressBook testBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("SAM", "613");
        assertTrue(testBook.getBook().size() == 0);
        testBook.addBuddy(buddy1);
        assertTrue(testBook.getBook().size() == 1);
    }
}