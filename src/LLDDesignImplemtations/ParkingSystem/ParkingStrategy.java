package LLDDesignImplemtations.ParkingSystem;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findParkingSpot(List<ParkingSpot> spots);
}
