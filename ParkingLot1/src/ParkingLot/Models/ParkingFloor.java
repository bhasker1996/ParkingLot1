package ParkingLot.Models;

import ParkingLot.Enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floornumber;

    private List<ParkingSlot> parkingSlotList;
    private List<Gate> gateList;
    private ParkingFloorStatus parkingFloorStatus;

    public int getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }



    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
