package ParkingLot.Controller;

import ParkingLot.DTOs.TicketRequestDTO;
import ParkingLot.DTOs.TicketResponseDTO;
import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.NoEmptyParkingslotAvailableException;
import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Models.Ticket;
import ParkingLot.Models.Vehicle;
import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.ParkingLotRepository;
import ParkingLot.Repositories.TicketRepository;
import ParkingLot.Service.TicketService;
import ParkingLot.Service.TicketServiceImpl;

import java.time.LocalDateTime;

public class TicketController {
    private TicketService ticketService;

    public TicketController(ParkingLotRepository parkingLotRepository, GateRepository gateRepository,
                            TicketRepository ticketRepository)
    {
        this.ticketService = new TicketServiceImpl(parkingLotRepository, gateRepository, ticketRepository);
    }

    public TicketResponseDTO createTicket(TicketRequestDTO ticketRequestDTO) throws ParkingLotNotFoundException, NoEmptyParkingslotAvailableException, GateNotFoundException {
        //Vehicle vehicle = new Vehicle(ticketRequestDTO.getVehicleNumber(), ticketRequestDTO.getName(), ticketRequestDTO.getColor(), ticketRequestDTO.getVehicleType());
        Vehicle vehicle = new Vehicle(ticketRequestDTO.getVehicleNumber(), ticketRequestDTO.getName(),
                                        ticketRequestDTO.getColor(), ticketRequestDTO.getVehicleType());
        Ticket ticket = ticketService.createticket(vehicle, ticketRequestDTO.getGateId(), ticketRequestDTO.getParkingLotId(), LocalDateTime.now());

        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        ticketResponseDTO.setEntryTime(ticket.getEntryTime());
        ticketResponseDTO.setVehiclenumber(ticket.getVehicle().getVehiclenumber());
        ticketResponseDTO.setSlotnumber(ticket.getParkingSlot().getSlotnumber());

        return ticketResponseDTO;

    }
}
