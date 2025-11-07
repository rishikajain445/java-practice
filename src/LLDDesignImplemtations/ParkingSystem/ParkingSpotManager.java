package LLDDesignImplemtations.ParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    public List<ParkingSpot> spots = new ArrayList<>();
    public ParkingStrategy strategy;

    public ParkingSpotManager(ParkingStrategy strategy)
    {
        this.strategy = strategy;
    }

    public ParkingSpot findParkingSpot()
    {
        return strategy.findParkingSpot(spots);
    }

    public void addSpot(ParkingSpot spot)
    {
        spots.add(spot);
    }

    public void removeSpot(ParkingSpot spot)
    {
        spots.remove(spot);
    }
}

