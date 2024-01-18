package ParkingLot.Repositories;
import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.*;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository()
    {
        parkingLotMap = new HashMap<Integer, ParkingLot>();
    }

    public ParkingLot get(int parkingLotId) throws ParkingLotNotFoundException {
        ParkingLot parkinglot = parkingLotMap.get(parkingLotId);
        if(parkinglot == null)
        {
            throw new ParkingLotNotFoundException("Parking lot not found for Id no : " + parkingLotId);
        }

        return parkinglot;
    }

    public ParkingLot put(ParkingLot parkingLot)
    {
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }
}
