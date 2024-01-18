package ParkingLot.Models;

import ParkingLot.Enums.ParkingLotStatus;

import java.util.List;
import ParkingLot.Enums.*;
import ParkingLot.Service.Strategy.BillCalculationStrategy.BillCalculationStrategy;
import ParkingLot.Service.Strategy.SlotAllocationStrategy.SlotAllocationStrategy;
public class ParkingLot extends BaseModel
{
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloorList;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypeList;

    SlotAllocationStrategy slotAllocationStrategy;
    BillCalculationStrategy billCalculationStrategy;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypeList() {
        return vehicleTypeList;
    }

    public void setVehicleTypeList(List<VehicleType> vehicleTypeList) {
        this.vehicleTypeList = vehicleTypeList;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }
}
