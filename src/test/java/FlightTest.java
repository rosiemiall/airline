import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight1;
    Passenger passenger1;

    @BeforeEach
    void setUp(){
        flight1 = new Flight(
                "London",
                28);

        passenger1 = new Passenger(
                "Ryan",
                0123456,
                8);
    }

    @Test
    void canAddPassenger(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        flight1.addPassenger(passenger1);
        assertThat(flight1.getPassengers()).isEqualTo(passengers);
    }

    @Test
    void canRemovePassenger(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        flight1.addPassenger(passenger1);
        flight1.removePassenger(passenger1);
        assertThat(flight1.getPassengers()).isEqualTo(passengers);
    }

    @Test
    void canCancelFlight(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        flight1.addPassenger(passenger1);
        flight1.cancelFlight();
        assertThat(flight1.getPassengers()).isEqualTo(passengers);
    }





}
