import java.util.ArrayList;
import java.util.Scanner;


public class Runner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IFly airline = new Airline("Jet2");
        Flight flight1= new Flight("New York", 1);
        Flight flight2= new Flight("Venice", 10);
        airline.addFlight(flight1);
        airline.addFlight(flight2);

        System.out.println("Welcome to jet2, let's create a flight! Please input a destination:");
        String destination = scanner.nextLine();
//        airline.createFlight(destination, 5);
        Flight newFlight= new Flight(destination, 5);
        airline.addFlight(newFlight);

        System.out.println("These are the available flights ");
        ArrayList<Flight> flights = airline.displayFlights();
        for (Flight flight : flights) {
            System.out.println("Destination: "+ flight.getDestination() +
                    " |  Flight Number: " + flight.getFlightNumberID());
        }

        System.out.println("Please provide passenger name: ");
        String name = scanner.nextLine();
        System.out.println("Please provide passenger contact Number: ");
        Long contactInfo = scanner.nextLong();
        System.out.println("Please provide passenger's unique ID: ");
        Long uniqueID = scanner.nextLong();
        Passenger passenger = new Passenger(name, contactInfo, uniqueID);
        System.out.println("Name: " + passenger.getName());
        System.out.println("Contact Number: " + passenger.getContactInfo());
        System.out.println("Unique ID: " + passenger.getUniqueID());


        


    }

}
