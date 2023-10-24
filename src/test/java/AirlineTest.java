import org.junit.jupiter.api.BeforeEach;

public class AirlineTest {
    Passenger passenger;
    Flight flight1;
    Flight flight2;

    @BeforeEach
    void setUp(){
        passenger = new Passenger("Ryan",
                07123456111,
                10);
        flight1 = new Flight("Paris", 1);
    }
}
