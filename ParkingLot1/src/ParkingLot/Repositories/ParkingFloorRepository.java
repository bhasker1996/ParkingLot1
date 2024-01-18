package ParkingLot.Repositories;

import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.ParkingFloorNotFoundException;
import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {

    private HashMap<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository()
    {
        this.parkingFloorMap = new HashMap<Integer, ParkingFloor>();
    }
    private ParkingFloor getFloor(int ParkingFloorId) throws ParkingFloorNotFoundException {

        ParkingFloor parkingFloor = parkingFloorMap.get(ParkingFloorId);

        if(parkingFloor == null)
        {
            throw new ParkingFloorNotFoundException("ParkingFloor not found for Id : " + ParkingFloorId);
        }

        return parkingFloorMap.get(ParkingFloorId);

    }

    public ParkingFloor put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }

}
