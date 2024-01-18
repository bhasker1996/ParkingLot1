package ParkingLot.Service;

import ParkingLot.Enums.*;
import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingFloor;
import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Repositories.*;
import ParkingLot.Service.Strategy.BillCalculationStrategy.BillCalculationStrategy;
import ParkingLot.Service.Strategy.BillCalculationStrategy.BillCalculationStrategyFactory;
import ParkingLot.Service.Strategy.SlotAllocationStrategy.SlotAllocationStrategy;
import ParkingLot.Service.Strategy.SlotAllocationStrategy.SlotAllocationStrategyFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitServiceImpl implements InitService{

    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;

    public InitServiceImpl( ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository,
                     ParkingSlotRepository parkingSlotRepository,GateRepository gateRepository, TicketRepository ticketRepository)
    {
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
    }
    @Override
    public void init() {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.setId(1);
        parkingLot.setAddress("Acity, B street, C no");
        parkingLot.setName("ParkingLot 1");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setBillCalculationStrategy(BillCalculationStrategyFactory.getBillCalculationStrategy());
        parkingLot.setSlotAllocationStrategy(SlotAllocationStrategyFactory.getAllocationStrategy());
        parkingLot.setVehicleTypeList(new ArrayList<>(Arrays.asList(VehicleType.BIKE, VehicleType.CAR)) );

        //parkingLotRepository.put(parkingLot);
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            ParkingFloor floor = new ParkingFloor();
            floor.setFloornumber(i);
            floor.setId(i);

            List<ParkingSlot> parkingSlotList = new ArrayList<>();
            for(int j=1;j<=10; j++)
            {
                VehicleType vehicleType = j%2==0 ? VehicleType.BIKE : VehicleType.CAR;

                ParkingSlot parkingSlot = new ParkingSlot(i*100+j ,i*100+j, vehicleType);
                parkingSlot.setId(j);
                parkingSlot.setParkingSlotStatus(ParkingSlotStatus.AVAILABLE);
                parkingSlotList.add(parkingSlot);
                parkingSlotRepository.put(parkingSlot);
            }
            floor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
            floor.setParkingSlotList(parkingSlotList);

            Gate entryGate = new Gate();
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperator("RamPrasad");
            entryGate.setGatenumber(i*10+1);
            entryGate.setFloornumber(i);
            entryGate.setParkingLotid(1);
            entryGate.setId(i*10+1);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId(i*10+2);
            exitGate.setParkingLotid(1);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperator("Shiva");
            exitGate.setGatenumber(i*10+2);
            exitGate.setFloornumber(i);
            exitGate.setGateStatus(GateStatus.OPEN);
            gateRepository.put(exitGate);

            List<Gate> gates = new ArrayList<>(Arrays.asList(entryGate, exitGate) );
            floor.setGateList(gates);
            parkingFloorRepository.put(floor);
            parkingFloors.add(floor);
        }

        parkingLot.setParkingFloorList(parkingFloors);
        parkingLotRepository.put(parkingLot);

    }
}
