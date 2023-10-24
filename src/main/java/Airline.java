import java.util.ArrayList;

public class Airline implements IFly{

    private String name;
    private ArrayList<Flight> flights;

    public Airline(String name){
        this.name = name;
        flights = new ArrayList<>();
    }

//    public void createFlight(String destination, long flightNumberID){
//        Flight flight = new Flight(destination, flightNumberID);
//    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    @Override
    public ArrayList<Flight> displayFlights() {
        return this.flights;
    }

    @Override
    public void book(Passenger passenger, Flight flight) {
        flight.addPassenger(passenger);
    }

    @Override
    public void remove(Passenger passenger, Flight flight) {
        flight.removePassenger(passenger);
    }

    @Override
    public void cancel(Flight flight) {
        flights.remove(flight);
        flight.cancelFlight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
