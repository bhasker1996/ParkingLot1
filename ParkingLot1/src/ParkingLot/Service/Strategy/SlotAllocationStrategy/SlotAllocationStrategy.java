package ParkingLot.Service.Strategy.SlotAllocationStrategy;

import ParkingLot.Enums.VehicleType;
import ParkingLot.Exception.NoEmptyParkingslotAvailableException;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Models.Vehicle;
import ParkingLot.Models.*;

public interface SlotAllocationStrategy {
    ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entrygate) throws NoEmptyParkingslotAvailableException;
}
