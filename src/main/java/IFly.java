import java.util.ArrayList;

public interface IFly {
//    void createFlight(String destination, long flightNumberID);
    ArrayList displayFlights();
    void book(Passenger passenger, Flight flight);
    void remove(Passenger passenger, Flight flight);
    void cancel(Flight flight);
    void addFlight(Flight flight);
}
