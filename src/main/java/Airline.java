import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Flight> flights;

    public Airline(String name){
        this.name = name;
        flights = new ArrayList<>();
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
