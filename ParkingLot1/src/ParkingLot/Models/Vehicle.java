package ParkingLot.Models;

import ParkingLot.Enums.VehicleType;

public class Vehicle extends BaseModel{
    private String vehiclenumber;
    private String name;
    private String color;
    private VehicleType vehicleType;

    public Vehicle(String vehiclenumber, String name, String color, VehicleType vehicleType) {
        this.vehiclenumber = vehiclenumber;
        this.name = name;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
