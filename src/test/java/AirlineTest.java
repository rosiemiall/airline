import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;
    Passenger passenger;
    Flight flight1;
    Flight flight2;

    @BeforeEach
    void setUp(){
        airline = new Airline("Jet2");
        passenger = new Passenger("Ryan",
                07123456111,
                10);
        flight1 = new Flight("Paris", 1);
    }

    @Test
    void canDisplayFlights(){
        ArrayList<Flight> sampleFlights = new ArrayList<>();
        sampleFlights.add(flight1);
        airline.addFlight(flight1);
        assertThat(airline.displayFlights()).isEqualTo(sampleFlights);
    }

    @Test
    void canBookPassenger(){
        airline.book(passenger, flight1);
        ArrayList<Passenger> samplePassengers = new ArrayList<>();
        samplePassengers.add(passenger);
        assertThat(flight1.getPassengers()).isEqualTo(samplePassengers);
    }

    @Test
    void canRemovePassenger(){
        airline.book(passenger, flight1);
        ArrayList<Passenger> samplePassengers = new ArrayList<>();
        airline.remove(passenger, flight1);
        assertThat(flight1.getPassengers()).isEqualTo(samplePassengers);
    }

    @Test
    void canCancelFlight_Flight_Removed(){
        airline.addFlight(flight1);
        airline.cancel(flight1);
        ArrayList<Flight> sampleFlights = new ArrayList<>();
        assertThat(airline.displayFlights()).isEqualTo(sampleFlights);
    }

    @Test
    void canCancelFlight_Passengers_Removed(){
        airline.addFlight(flight1);
        flight1.addPassenger(passenger);
        airline.cancel(flight1);
        ArrayList<Flight> samplePassengers = new ArrayList<>();
        assertThat(flight1.getPassengers()).isEqualTo(
                samplePassengers);
    }

}
