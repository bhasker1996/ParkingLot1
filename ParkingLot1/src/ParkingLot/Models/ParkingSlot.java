package ParkingLot.Models;

import ParkingLot.Enums.ParkingSlotStatus;
import ParkingLot.Enums.VehicleType;

public class ParkingSlot extends BaseModel{
    private int slotnumber;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType vehicleType;
    private Vehicle vehicle;

    public ParkingSlot()
    {
        super();
    }

    public ParkingSlot(int id, int slotnumber, VehicleType vehicleType)
    {
        super(id);
        this.slotnumber = slotnumber;
        this.vehicleType = vehicleType;
    }

    public int getSlotnumber() {
        return slotnumber;
    }

    public void setSlotnumber(int slotnumber) {
        this.slotnumber = slotnumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
