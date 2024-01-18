package ParkingLot.Repositories;

import ParkingLot.Exception.TicketNotFoundException;
import ParkingLot.Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Integer, Ticket> ticketMap;

    public TicketRepository()
    {
        ticketMap = new HashMap<>();
    }

    public Ticket get(int ticketId) throws TicketNotFoundException {
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null)
        {
            throw new TicketNotFoundException("Ticket Not found for the Id: " + ticketId);
        }
        return ticket;
    }

    public Ticket put(Ticket ticket)
    {
        ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }

}
