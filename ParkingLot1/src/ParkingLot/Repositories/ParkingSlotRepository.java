package ParkingLot.Repositories;

import ParkingLot.Exception.ParkingSlotNotFoundException;
import ParkingLot.Models.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {

    Map<Integer, ParkingSlot> parkingSlotMap;

    public ParkingSlotRepository()
    {
        parkingSlotMap = new HashMap<>();
    }

    public ParkingSlot get(int parkingSlotid) throws ParkingSlotNotFoundException {
        ParkingSlot parkingSlot = parkingSlotMap.get(parkingSlotid);
        if(parkingSlot == null)
        {
            throw new ParkingSlotNotFoundException("ParkingSlot not found for the ID : "+ parkingSlotid);
        }
        return parkingSlot;
    }

    public ParkingSlot put(ParkingSlot parkingSlot)
    {
        parkingSlotMap.put(parkingSlot.getId(), parkingSlot);
        return parkingSlot;
    }
}
