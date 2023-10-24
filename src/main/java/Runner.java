import java.util.ArrayList;
import java.util.Objects;
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

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please input a destination you would like to travel: ");
        String destinationName = scanner1.nextLine();
        if (destinationName.equals(destination)){
            airline.book(passenger, newFlight);
            System.out.println("Passengers on the flight to " + newFlight.getDestination());
            for (Passenger person : newFlight.getPassengers()){
                System.out.println("Passenger name: " + passenger.getName() +
                        " |  Contact number: " + passenger.getContactInfo() +
                        " | Unique ID: " + passenger.getUniqueID());
            }
        } else if (destinationName.equals("New York")) {
            airline.book(passenger, flight1);
            System.out.println("Passengers on the flight to " + flight1.getDestination());
            for (Passenger person : flight1.getPassengers()) {
                System.out.println("Passenger name: " + passenger.getName() +
                        " |  Contact number: " + passenger.getContactInfo() +
                        " | Unique ID: " + passenger.getUniqueID());
            }
        } else {
            airline.book(passenger, flight2);
                System.out.println("Passengers on the flight to " + flight2.getDestination());
                for (Passenger person : flight2.getPassengers()) {
                    System.out.println("Passenger name: " + passenger.getName() +
                            " |  Contact number: " + passenger.getContactInfo() +
                            " | Unique ID: " + passenger.getUniqueID());
                }
        }

        System.out.println("Would you like to be removed from this flight? (Y/N) ");
        String decision = scanner1.nextLine();
        if (decision.equals("Yes")) {
            if (destinationName.equals(destination)) {
                airline.remove(passenger, newFlight);
                System.out.println("You have been successfully removed from the flight");
            } else if (destinationName.equals("New York")) {
                airline.remove(passenger, flight1);
                System.out.println("You have been successfully removed from the flight");
            } else {
                airline.remove(passenger, flight2);
                System.out.println("You have been successfully removed from the flight");
            }
        } else {
            System.out.println("You remain on the flight");
        }

        System.out.println("Which flight would you like to cancel? ");
        String flightCancellation = scanner1.nextLine();
        if (flightCancellation.equals(destinationName)){
            airline.cancel(newFlight);
            System.out.println("The flight has been cancelled");
        } else if (flightCancellation.equals("New York")){
            airline.cancel(flight1);
            System.out.println("The flight has been cancelled");
        } else {
            airline.cancel(flight2);
            System.out.println("The flight has been cancelled");
        }

        System.out.println("These are the available flights ");
        ArrayList<Flight> updatedFlights = airline.displayFlights();
        for (Flight flight : updatedFlights) {
            System.out.println("Destination: "+ flight.getDestination() +
                    " |  Flight Number: " + flight.getFlightNumberID());
        }
    }
}

