package ParkingLot.Service.Strategy.SlotAllocationStrategy;

import ParkingLot.Enums.ParkingSlotStatus;
import ParkingLot.Enums.VehicleType;
import ParkingLot.Exception.NoEmptyParkingslotAvailableException;
import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.ParkingSlot;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy
{

    @Override
    public ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) throws NoEmptyParkingslotAvailableException {

        int floorNumber = entryGate.getFloornumber();

        for(ParkingSlot slot :  parkingLot.getParkingFloorList().get(floorNumber).getParkingSlotList())
        {
            if(slot.getVehicleType().equals(vehicleType)   && slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE) )
            {
                return slot;
            }
        }

        int i= floorNumber-1;
        int j = floorNumber + 1;

        while(i >=0 || j<parkingLot.getParkingFloorList().size())
        {
            if(i >=0)
            {
                for(ParkingSlot slot : parkingLot.getParkingFloorList().get(i).getParkingSlotList())
                {
                    if(slot.getVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE))
                    {
                        return slot;
                    }
                }
            }

            if(j < parkingLot.getParkingFloorList().size())
            {
                for(ParkingSlot slot : parkingLot.getParkingFloorList().get(j).getParkingSlotList())
                {
                    if(slot.getVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE))
                    {
                        return slot;
                    }
                }
            }
            i--;
            j++;
        }

        throw new NoEmptyParkingslotAvailableException("No Available parking slot available , so please try again later");
    }
}
