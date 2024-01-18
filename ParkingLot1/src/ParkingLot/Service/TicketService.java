package ParkingLot.Service;

import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.NoEmptyParkingslotAvailableException;
import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.Ticket;
import ParkingLot.Models.Vehicle;

import java.time.LocalDateTime;

public interface TicketService {
    Ticket createticket(Vehicle vehicle, int gateId, int parkingLotId, LocalDateTime entryTime) throws ParkingLotNotFoundException, GateNotFoundException, NoEmptyParkingslotAvailableException;
}
