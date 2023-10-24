import java.util.ArrayList;

public class Flight {

    protected String destination;
    protected long flightNumberID;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, long flightNumberID){

        this.destination = destination;
        this.flightNumberID = flightNumberID;
        passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }

    public void cancelFlight(){
        passengers.clear();
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
