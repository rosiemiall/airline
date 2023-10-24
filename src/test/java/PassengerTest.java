import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach
    void setUp(){
        passenger = new Passenger("Ryan",
                07123456111,
                10,
                "Paris",
                1);
    }

}
