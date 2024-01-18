package ParkingLot.Service.Strategy.BillCalculationStrategy;

import ParkingLot.Models.Ticket;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    double calculateBillAmount(Ticket ticket, LocalDateTime exitTime);
}
