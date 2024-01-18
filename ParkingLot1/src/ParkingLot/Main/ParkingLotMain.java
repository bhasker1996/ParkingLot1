package ParkingLot.Main;

import ParkingLot.Controller.TicketController;
import ParkingLot.DTOs.TicketRequestDTO;
import ParkingLot.DTOs.TicketResponseDTO;
import ParkingLot.Enums.VehicleType;
import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.NoEmptyParkingslotAvailableException;
import ParkingLot.Exception.ParkingLotNotFoundException;
import ParkingLot.Repositories.*;
import ParkingLot.Service.InitService;
import ParkingLot.Service.InitServiceImpl;

public class ParkingLotMain {

    public static void main(String[] args) throws ParkingLotNotFoundException, NoEmptyParkingslotAvailableException, GateNotFoundException {

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitService initService = new InitServiceImpl(parkingLotRepository, parkingFloorRepository,
                                    parkingSlotRepository,gateRepository,ticketRepository);
        initService.init();

        //with the help of below line we are helping the service layer to receive the respective repositories
        TicketController ticketController = new TicketController(parkingLotRepository, gateRepository, ticketRepository);

        TicketRequestDTO ticketRequestDTO = new TicketRequestDTO();
        ticketRequestDTO.setParkingLotId(1);
        ticketRequestDTO.setColor("Blue");
        ticketRequestDTO.setName("Mercedez"); //Vehicle Name
        ticketRequestDTO.setGateId(31);
        ticketRequestDTO.setVehicleType(VehicleType.CAR);
        ticketRequestDTO.setVehicleNumber("TS04 9999");

        TicketResponseDTO ticketResponseDTO = ticketController.createTicket(ticketRequestDTO);
        System.out.println(ticketResponseDTO);

    }

}
