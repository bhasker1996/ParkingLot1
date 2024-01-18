package ParkingLot.Exception;

public class ParkingSlotNotFoundException extends Throwable {
    public ParkingSlotNotFoundException(){}
    public ParkingSlotNotFoundException(String s) {
        super(s);
    }
}
