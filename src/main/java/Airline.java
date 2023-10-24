import java.util.ArrayList;

public class Airline implements IFly{

    private String name;
    private ArrayList<Flight> flights;

    public Airline(String name){
        this.name = name;
        flights = new ArrayList<>();
    }

    public void createFlight(String destination, long flightNumberID){
        Flight flight = new Flight(destination, flightNumberID);
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
}
