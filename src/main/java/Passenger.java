import java.util.HashMap;

public class Passenger{

    private String name;
    private long contactInfo;
    private long uniqueID;

    public Passenger(String name,
                     long contactInfo,
                     long uniqueID){

        this.name = name;
        this.contactInfo = contactInfo;
        this.uniqueID = uniqueID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(long contactInfo) {
        this.contactInfo = contactInfo;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
    }
}
