package ParkingLot.Service.Strategy.BillCalculationStrategy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy()
    {
        return new LowBillCalculationStrategy();
    }
}
