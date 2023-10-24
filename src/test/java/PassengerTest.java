import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach
    void setUp(){
        passenger = new Passenger("Ryan",
                07123456111,
                10);
    }

    @Test
    void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Ryan");
    }

    @Test
    void canSetName(){
        passenger.setName("Bill");
        assertThat(passenger.getName()).isEqualTo("Bill");
    }

    @Test
    void canGetContactInfo(){
        assertThat(passenger.getContactInfo()).isEqualTo(07123456111);
    }

    @Test
    void canSetContactInfo(){
        passenger.setContactInfo(0123456);
        assertThat(passenger.getContactInfo()).isEqualTo(0123456);
    }

    @Test
    void canGetUniqueID(){
        assertThat(passenger.getUniqueID()).isEqualTo(10);
    }

    @Test
    void canSetUniqueID(){
        passenger.setUniqueID(11);
        assertThat(passenger.getUniqueID()).isEqualTo(11);
    }

}
