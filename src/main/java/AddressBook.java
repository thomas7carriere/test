import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> book;

    public AddressBook() {
        this.book = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        book.add(buddy);
    }

    public ArrayList<BuddyInfo> getBook() {
        return book;
    }

    @Override
    public String toString(){
        String str = "";
        for(BuddyInfo buddy : book){
            str += buddy.toString();
        }
        return str;
    }

    public static void main(String args[]) {
        /*AddressBook book = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Sam", "613-400-4564");
        BuddyInfo buddy2 = new BuddyInfo("Tom", "613-885-4021");
        book.addBuddy(buddy1);
        book.addBuddy(buddy2);
        System.out.println(book.toString());*/
        BuddyInfoPersistenceTest test = new BuddyInfoPersistenceTest();
        test.performJPA();
    }
}
