import java.util.ArrayList;

public class Flight {

    protected String destination;
    protected long flightNumberID;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, long flightNumberID, String name){

        this.destination = destination;
        this.flightNumberID = flightNumberID;
        passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getFlightNumberID() {
        return flightNumberID;
    }

    public void setFlightNumberID(long flightNumberID) {
        this.flightNumberID = flightNumberID;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
