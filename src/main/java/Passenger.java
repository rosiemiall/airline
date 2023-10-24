import java.util.HashMap;

public class Passenger extends Flight {

    private String name;
    private HashMap contactInfo;
    private long uniqueID;

    public Passenger(String name,
                     HashMap contactInfo,
                     long uniqueID,
                     String destination,
                     long flightNumberID){
        super(destination, flightNumberID);
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

    public HashMap getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(HashMap contactInfo) {
        this.contactInfo = contactInfo;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
    }
}
