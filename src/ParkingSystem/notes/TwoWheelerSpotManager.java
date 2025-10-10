package ParkingSystem.notes;

public class TwoWheelerSpotManager extends ParkingSpotManager{

    public  TwoWheelerSpotManager(ParkingStrategy strategy)
    {
        super(strategy);
        for(int i=1;i<=5;i++)
        {
            spots.add(new ParkingSpot(i,VehicleType.TWO_WHEELER));
        }
    }
}
