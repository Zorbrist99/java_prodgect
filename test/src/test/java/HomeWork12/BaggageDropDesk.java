package HomeWork12;

import HomeWork12.CheckedExceptions.AirportServiceException;
import HomeWork12.CheckedExceptions.BaggageTagPrintException;
import HomeWork12.CheckedExceptions.FlightNotFoundException;
import HomeWork12.CheckedExceptions.OverweightBaggageException;
import HomeWork12.UncheckedExceptions.InvalidBaggageWeightException;
import HomeWork12.UncheckedExceptions.InvalidPassengerNameException;

import java.util.Arrays;

public class BaggageDropDesk {

    private final String[] availableFlights;

    public BaggageDropDesk(String[] availableFlights) {
        this.availableFlights = availableFlights;
    }

    public BaggageTicket checkInLuggage(String namePassenger, String flightNumber, int luggageWeight) throws AirportServiceException {
        // Условия для непроверяемых исключений
        if (namePassenger == null || namePassenger.isEmpty()) {
            throw new InvalidPassengerNameException("The passenger's name is a required field and cannot be left blank.");
        }
        if (luggageWeight <= 0) {
            throw new InvalidBaggageWeightException("Baggage weight cannot be negative or zero.");
        }


        // Условия для проверяемых исключений
        if ("АЕ-404".equals(flightNumber)) {
            throw new BaggageTagPrintException();
        }
        if (!Arrays.asList(this.availableFlights).contains(flightNumber)) {
            throw new FlightNotFoundException();
        }
        if (luggageWeight > 23) {
            throw new OverweightBaggageException();
        }

        System.out.println("You must pay a tax for data entered too correctly.");
        return new BaggageTicket(namePassenger, flightNumber, luggageWeight);
    }

}
