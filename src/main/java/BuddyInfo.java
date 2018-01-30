import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    private Integer id = null;

    private String name;
    private String phoneNumber;

    public BuddyInfo(){

    }

    public BuddyInfo(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "Name: " + name + "\nPhone: " + phoneNumber+ "\n";
    }
}
