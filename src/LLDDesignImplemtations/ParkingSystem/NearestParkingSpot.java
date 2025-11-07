package LLDDesignImplemtations.ParkingSystem;

import java.util.List;

public class NearestParkingSpot implements ParkingStrategy
{

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> spots) {

        for(ParkingSpot s:spots)
        {
            if(s.isAvailable())
            {
                return s;
            }
        }

        return null;
    }
}
