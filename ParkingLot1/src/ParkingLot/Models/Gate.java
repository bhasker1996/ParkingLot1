package ParkingLot.Models;

import ParkingLot.Enums.GateStatus;
import ParkingLot.Enums.GateType;

public class Gate extends BaseModel{
    private int gatenumber;
    private String operator;
    private int floornumber;
    private GateType gateType;
    private GateStatus gateStatus;
    private int ParkingLotid;

    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getGatenumber() {
        return gatenumber;
    }

    public void setGatenumber(int gatenumber) {
        this.gatenumber = gatenumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getParkingLotid() {
        return ParkingLotid;
    }

    public void setParkingLotid(int parkingLotid) {
        ParkingLotid = parkingLotid;
    }
}
