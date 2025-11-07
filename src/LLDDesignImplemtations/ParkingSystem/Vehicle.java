package LLDDesignImplemtations.ParkingSystem;

public class Vehicle {

    private String id;
    private VehicleType type;

    Vehicle(String id , VehicleType v)
    {
        this.id = id;
        this.type = v;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
