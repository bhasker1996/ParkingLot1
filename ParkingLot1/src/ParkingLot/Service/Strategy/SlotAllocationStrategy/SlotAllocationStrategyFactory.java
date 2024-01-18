package ParkingLot.Service.Strategy.SlotAllocationStrategy;

public class SlotAllocationStrategyFactory {

    public static SlotAllocationStrategy getAllocationStrategy()
    {
        return new NearestSlotAllocationStrategy();
    }
}
