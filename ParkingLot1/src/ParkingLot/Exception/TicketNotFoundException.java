package ParkingLot.Exception;

public class TicketNotFoundException extends Throwable {

    public TicketNotFoundException()
    {

    }
    public TicketNotFoundException(String s) {
        super(s);
    }
}
