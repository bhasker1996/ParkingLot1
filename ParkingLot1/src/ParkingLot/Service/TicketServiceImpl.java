package ParkingLot.Service;

import ParkingLot.Enums.TicketStatus;
import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.NoEmptyParkingslotAvailableException;
import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.*;
import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.ParkingLotRepository;
import ParkingLot.Repositories.TicketRepository;

import java.time.LocalDateTime;

public class TicketServiceImpl implements TicketService{

    ParkingLotRepository parkingLotRepository;
    GateRepository gateRepository;
    TicketRepository ticketRepository;

    public TicketServiceImpl(ParkingLotRepository parkingLotRepository, GateRepository gateRepository, TicketRepository ticketRepository)
    {
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createticket(Vehicle vehicle, int gateId, int parkingLotId, LocalDateTime entryTime) throws ParkingLotNotFoundException, GateNotFoundException, NoEmptyParkingslotAvailableException {
       //Should get the information from the Respository i.e., database
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        Gate gate = gateRepository.get(gateId);

        ParkingSlot parkingSlot =  parkingLot.getSlotAllocationStrategy().findParkingSlot(vehicle.getVehicleType(),parkingLot, gate);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(entryTime);
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);

        return ticket;

    }
}
