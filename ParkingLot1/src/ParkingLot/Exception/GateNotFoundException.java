package ParkingLot.Exception;

public class GateNotFoundException extends Throwable {
    public GateNotFoundException()
    {

    }

    public GateNotFoundException(String message)
    {
        super(message);
    }
}
