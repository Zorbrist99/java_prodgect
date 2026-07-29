package HomeWork12;

import java.text.MessageFormat;

public class BaggageTicket {

    private String namePassenger;
    private String flightNumber;
    private int luggageWeight;

    public BaggageTicket(String namePassenger, String flightNumber, int luggageWeight) {
        this.namePassenger = namePassenger;
        this.flightNumber = flightNumber;
        this.luggageWeight = luggageWeight;
    }

    public String getNamePassenger() {
        return namePassenger;
    }

    public void setNamePassenger(String namePassenger) {
        this.namePassenger = namePassenger;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(int luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    public String toString() {
        return MessageFormat.format
                ("BaggageTicket: {0}, {1}, {2}", this.namePassenger, this.flightNumber, this.luggageWeight);
    }
}
