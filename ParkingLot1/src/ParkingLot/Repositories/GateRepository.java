package ParkingLot.Repositories;

import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Models.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gatemap;

    public GateRepository()
    {
        this.gatemap = new HashMap<Integer, Gate>();
    }
    public Gate get(int gateId) throws GateNotFoundException {
        Gate gate = gatemap.get(gateId);
        if(gate == null)
        {
            throw new GateNotFoundException("Gate not found for Id : " + gateId);
        }

        return gate;
    }

    public Gate put(Gate gate)
    {
        gatemap.put(gate.getId(), gate);
        return gate;
    }
}
