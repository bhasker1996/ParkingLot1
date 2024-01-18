package ParkingLot.Models;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private Ticket ticket;
    private LocalDateTime exittime;
    private Gate gate;
    private int amount;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExittime() {
        return exittime;
    }

    public void setExittime(LocalDateTime exittime) {
        this.exittime = exittime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
