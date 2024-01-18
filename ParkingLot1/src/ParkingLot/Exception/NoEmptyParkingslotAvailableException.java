package ParkingLot.Exception;

public class NoEmptyParkingslotAvailableException extends Throwable {
    public NoEmptyParkingslotAvailableException(){}
    public NoEmptyParkingslotAvailableException(String s) {
        super(s);
    }
}
