package HomeWork12;

import HomeWork12.CheckedExceptions.AirportServiceException;
import HomeWork12.CheckedExceptions.BaggageTagPrintException;
import HomeWork12.CheckedExceptions.FlightNotFoundException;
import HomeWork12.CheckedExceptions.OverweightBaggageException;
import HomeWork12.UncheckedExceptions.InvalidBaggageWeightException;
import HomeWork12.UncheckedExceptions.InvalidPassengerNameException;

import java.text.MessageFormat;

public class Main {

    static void main(String[] args) {


        String[] flights = {"SU-123", "TK-777", "KC-909", "AE-404"};
        BaggageDropDesk baggageDropDesk = new BaggageDropDesk(flights);


        try {
//            System.out.println("1. Baggage successfully checked in.");
//
//            BaggageTicket baggageTicket = baggageDropDesk.checkInLuggage
//                    ("Petr", "SU-123", 20);
//
//            System.out.println(baggageTicket.toString());
//
//            System.out.println("2. The flight specified by the passenger does not exist in the database.");
//            BaggageTicket baggageTicketFlightSpecified = baggageDropDesk.checkInLuggage
//                    ("Petr", "SU-999", 20);
//
//            System.out.println("3. The luggage is too heavy.");
//            BaggageTicket baggageTicketLuggageHeavy = baggageDropDesk.checkInLuggage
//                    ("Anna", "TK-777", 24);
//
//            System.out.println("4. Issue with tag printing.");
//            BaggageTicket baggageTicketPrintTag = baggageDropDesk.checkInLuggage
//                    ("Petr", "АЕ-404", 20);

            System.out.println("5. Invalid passenger name.");
            BaggageTicket baggageTicketInvalidPassengerName = baggageDropDesk.checkInLuggage
                    ("", "SU-123", 20);

            BaggageTicket baggageTicketInvalidPassengerNameNull = baggageDropDesk.checkInLuggage
                    (null, "SU-123", 20);

            System.out.println("6. Incorrect baggage weight.");
            BaggageTicket baggageTicketNegativeBaggageWeight = baggageDropDesk.checkInLuggage
                    ("Vas", "SU-123", -20);

            BaggageTicket baggageTicketBaggageWeightZero = baggageDropDesk.checkInLuggage
                    ("Vas", "SU-123", 0);

        } catch (InvalidPassengerNameException | InvalidBaggageWeightException e) {
            System.out.println(MessageFormat.format("Unverifiable error: {0}", e));
        } catch (FlightNotFoundException e) {
            System.out.println("The specified flight is not in the list of available flights.");
        } catch (OverweightBaggageException e) {
            System.out.println("The weight of the luggage cannot exceed 23 kilograms.");
        } catch (BaggageTagPrintException e) {
            System.out.println("A problem occurred while printing the baggage tag.");
        } catch (AirportServiceException e) {
            System.out.println("Unexpected baggage drop-off counter error.");
        }
    }
}
