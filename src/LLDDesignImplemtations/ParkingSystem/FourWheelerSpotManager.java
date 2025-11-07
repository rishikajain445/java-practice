package LLDDesignImplemtations.ParkingSystem;

public class FourWheelerSpotManager extends ParkingSpotManager{

    public FourWheelerSpotManager(ParkingStrategy strategy) {
        super(strategy);
        for (int i = 6; i <= 10; i++) spots.add(new ParkingSpot(i, VehicleType.FOUR_WHEELER));
    }
}
