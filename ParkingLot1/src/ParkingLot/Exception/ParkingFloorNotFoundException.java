package ParkingLot.Exception;

public class ParkingFloorNotFoundException extends Throwable {
    public ParkingFloorNotFoundException() {
    }

    public ParkingFloorNotFoundException(String message)
    {
        super(message);
    }
}
