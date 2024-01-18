package ParkingLot.DTOs;

import java.time.LocalDateTime;

public class TicketResponseDTO {
    LocalDateTime entryTime;
    String vehiclenumber;
    int slotnumber;

    public String toString()
    {
        return "TicketResponseDTO{" + " entryTime = ' " +entryTime + '\'' +
                                    ", vehicleNumber = ' " + vehiclenumber + '\'' +
                                    ", slotnumber = " + slotnumber +
                                 '}';
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public int getSlotnumber() {
        return slotnumber;
    }

    public void setSlotnumber(int slotnumber) {
        this.slotnumber = slotnumber;
    }
}
